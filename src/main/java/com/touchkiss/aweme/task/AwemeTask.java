package com.touchkiss.aweme.task;

import com.douyin.aweme.v1.bean.*;
import com.douyin.aweme.v2.bean.StickerListResponse;
import com.douyin.aweme.v2.bean.UserInfoResponse;
import com.douyin.aweme.v2.services.AwemeServiceV2;
import com.douyin.aweme.web.services.AwemeWebService;
import com.touchkiss.aweme.bean.*;
import com.touchkiss.aweme.constant.RedisConstant;
import com.touchkiss.aweme.services.*;
import com.touchkiss.dy.utils.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created on 2020/12/07 22:38
 *
 * @author Touchkiss
 */
@Service
@Slf4j
public class AwemeTask {
    @Autowired
    private AwemeWebService awemeWebService;
    @Autowired
    private AwemeServiceV2 awemeServiceV2;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private AwemeStickerInfoDaoService awemeStickerInfoDaoService;
    @Autowired
    private AwemeChallengeInfoDaoService awemeChallengeInfoDaoService;
    @Autowired
    private AwemeItemDaoService awemeItemDaoService;
    @Autowired
    private AwemeMusicInfoDaoService awemeMusicInfoDaoService;
    @Autowired
    private AwemeItemChallengeDaoService awemeItemChallengeDaoService;
    @Autowired
    private AwemeUserInfoDaoService awemeUserInfoDaoService;
    @Autowired
    private AwemeItemStatisticsDaoService awemeItemStatisticsDaoService;
    //    正在抓贴纸列表的线程数
    private static volatile int fetchStickerListThreadWorking = 0;
    private ExecutorService fetchStickerListThreadPool = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(100));
    private ExecutorService fetchMusicThreadPool = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(100));
    private ExecutorService fetchChallengeThreadPool = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(100));
    private ExecutorService fetchUserThreadPool = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(100));
    private ExecutorService fetchStickerDetailThreadPool = new ThreadPoolExecutor(5, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(100));
    private static volatile boolean stickerSpiderWorking = false;
    private static volatile boolean awemeItemSpiderWorking = false;

    @Scheduled(cron = "*/2 * * * * ?")
    public void checkWorkingStickerThread() {
        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) fetchStickerListThreadPool);
        if (tpe.getActiveCount() < 10 && stringRedisTemplate.hasKey(RedisConstant.READY_TO_FETCH_STICKER_IDS)) {
            for (int i = 0; i < 10; i++) {
                fetchStickerListThreadPool.execute(() -> {
                    try {
                        String stickerId = stringRedisTemplate.opsForSet().pop(RedisConstant.READY_TO_FETCH_STICKER_IDS);
                        if (StringUtils.isNotBlank(stickerId)) {
                            int id = Integer.parseInt(stickerId);
                            int cursor = 0;
                            while (true) {
                                StickerListResponse stickerListResponse = awemeServiceV2.stickerList(id, cursor, 15);
                                if (stickerListResponse != null && CollectionUtils.isNotEmpty(stickerListResponse.getAweme_list())) {
                                    for (AwemeInfo awemeInfo : stickerListResponse.getAweme_list()) {
                                        saveAwemeItem(id, null, awemeInfo);
                                    }
                                    cursor += 15;
                                } else {
                                    break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        log.error("抓取贴纸列表失败");
                        e.printStackTrace();
                    }

                });
            }
        }
    }

    private void saveAwemeItem(Integer stickerId, Long musicId, AwemeInfo awemeInfo) {
        try {
            long awemeId = Long.parseLong(awemeInfo.getAweme_id());
            AwemeItem awemeItem = awemeItemDaoService.selectByAwemeId(awemeId);
            boolean shouldInsertAwemeItem = false;
            if (awemeItem == null) {
                awemeItem = new AwemeItem();
                shouldInsertAwemeItem = true;
            }

            awemeItem.setAwemeId(awemeId);
            if (awemeInfo.getDuration() != null) {
                awemeItem.setDuration(awemeInfo.getDuration());
            }
            awemeItem.setItemDesc(awemeInfo.getDesc());
            if (awemeInfo.getCreate_time() != null) {
                awemeItem.setCreateTime(awemeInfo.getCreate_time());
            }
            if (StringUtils.isNotBlank(awemeInfo.getGroup_id())) {
                awemeItem.setGroupId(awemeInfo.getGroup_id());
            }
            awemeItem.setAwemeType(awemeInfo.getAweme_type());
            if (awemeInfo.getIs_preview() != null) {
                awemeItem.setIsPreview(awemeInfo.getIs_preview());
            }
            if (stickerId != null) {
                awemeItem.setStickerId(stickerId);
            }
            if (musicId != null) {
                awemeItem.setMid(musicId);
            }
            if (awemeInfo.getVideo() != null) {
                awemeItem.setRatio(awemeInfo.getVideo().getRatio());
                awemeItem.setWidth(awemeInfo.getVideo().getWidth());
                awemeItem.setHeight(awemeInfo.getVideo().getHeight());
                awemeItem.setDuration(awemeInfo.getVideo().getDuration());
            }
            AwemeInfo.MusicBean music = awemeInfo.getMusic();
            if (music != null) {
                try {
                    long mid = Long.parseLong(music.getMid());
                    awemeItem.setMid(mid);
                    saveMusicItem(music, mid);
                } catch (Exception e) {
                    log.error("保存音乐信息失败：{}", music.getMid());
                    e.printStackTrace();
                }
            }
            if (CollectionUtils.isNotEmpty(awemeInfo.getCha_list())) {
                for (AwemeInfo.ChaListBean challenge : awemeInfo.getCha_list()) {
                    try {
                        long cid = Long.parseLong(challenge.getCid());
                        if (awemeChallengeInfoDaoService.selectByCid(cid) == null) {
                            stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_CHALLENGE_IDS, challenge.getCid());
                        }
                        if (CollectionUtils.isEmpty(awemeItemChallengeDaoService.queryAwemeItemChallengeList(new HashMap() {{
                            put("awemeId", awemeInfo.getAweme_id());
                            put("cid", challenge.getCid());
                        }}))) {
                            AwemeItemChallenge awemeItemChallenge = new AwemeItemChallenge();
                            awemeItemChallenge.setAwemeId(awemeId);
                            awemeItemChallenge.setCid(cid);
                            awemeItemChallenge.setFirstFetchTime(System.currentTimeMillis());
                            awemeItemChallenge.setLastFetchTime(System.currentTimeMillis());
                            awemeItemChallengeDaoService.insert(awemeItemChallenge);
                        }
                    } catch (Exception e) {
                        log.error("插入aweme的话题绑定关系失败：awemeId:{}，cid:{}", awemeId, challenge.getCid());
                        e.printStackTrace();
                    }
                }
            }
            UserInfo author = awemeInfo.getAuthor();
            if (author != null) {
                try {
                    long uid = Long.parseLong(author.getUid());
                    awemeItem.setUid(uid);
                    AwemeUserInfo awemeUserInfo = awemeUserInfoDaoService.selectByUid(uid);
                    boolean shouldInsertUser = false;
                    if (awemeUserInfo == null) {
                        awemeUserInfo = new AwemeUserInfo();
                        shouldInsertUser = true;
                    }
                    saveUserInfo(author, uid, awemeUserInfo, shouldInsertUser);
                } catch (Exception err1) {
                    log.error("保存用户信息失败：{}", author.getUid());
                    err1.printStackTrace();
                }
                stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_USER_UIDS, author.getUid());
            }
            AwemeInfo.StatisticsBean statistics = awemeInfo.getStatistics();
            if (statistics != null) {
                AwemeItemStatistics awemeItemStatistics = awemeItemStatisticsDaoService.selectByAwemeId(awemeId);
                boolean shouldInsertAwemeStatistics = false;
                if (awemeItemStatistics == null) {
                    awemeItemStatistics = new AwemeItemStatistics();
                    shouldInsertAwemeStatistics = true;
                }
                awemeItemStatistics.setAwemeId(awemeId);
                if (statistics.getComment_count() != null && statistics.getComment_count() > 0) {
                    awemeItemStatistics.setCommentCount(statistics.getComment_count());
                }
                if (statistics.getDigg_count() != null && statistics.getDigg_count() > 0) {
                    awemeItemStatistics.setDiggCount(statistics.getDigg_count());
                }
                if (statistics.getForward_count() != null && statistics.getForward_count() > 0) {
                    awemeItemStatistics.setForwardCount(statistics.getForward_count());
                }
                if (statistics.getShare_count() != null && statistics.getShare_count() > 0) {
                    awemeItemStatistics.setShareCount(statistics.getShare_count());
                }
                awemeItemStatistics.setLastFetchTime(System.currentTimeMillis());
                if (shouldInsertAwemeStatistics) {
                    awemeItemStatistics.setFirstFetchTime(System.currentTimeMillis());
                    awemeItemStatisticsDaoService.insert(awemeItemStatistics);
                } else {
                    awemeItemStatisticsDaoService.updateSelectiveByAwemeId(awemeItemStatistics, awemeId);
                }
            }
            awemeItem.setLastFetchTime(System.currentTimeMillis());
            if (shouldInsertAwemeItem) {
                awemeItem.setFirstFetchTime(System.currentTimeMillis());
                awemeItemDaoService.insert(awemeItem);
                stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_AWEME_IDS, awemeInfo.getAweme_id());
            } else {
                awemeItemDaoService.updateSelectiveByAwemeId(awemeItem, awemeId);
            }
        } catch (Exception ignore) {
            log.error("保存aweme信息出错：{}", awemeInfo.getAweme_id());
            ignore.printStackTrace();
        }
    }

    private void saveUserInfo(UserInfo author, long uid, AwemeUserInfo awemeUserInfo, boolean shouldInsertUser) {
        awemeUserInfo.setUid(uid);
        if (author.getRate() != null) {
            awemeUserInfo.setRate(author.getRate());
        }
        if (author.getWith_commerce_entry() != null) {
            awemeUserInfo.setWithCommerceEntry(author.getWith_commerce_entry());
        }
        if (author.getFollowing_count() != null && author.getFollowing_count() > 0) {
            awemeUserInfo.setFollowingCount(author.getFollowing_count());
        }
        if (author.getFavoriting_count() != null && author.getFavoriting_count() > 0) {
            awemeUserInfo.setFavoritingCount(author.getFavoriting_count());
        }
        if (author.getWith_shop_entry() != null) {
            awemeUserInfo.setWithShopEntry(author.getWith_shop_entry());
        }
        if (author.getWith_fusion_shop_entry() != null) {
            awemeUserInfo.setWithFusionShopEntry(author.getWith_fusion_shop_entry());
        }
        if (author.getFollower_count() != null && author.getFollower_count() > 0) {
            awemeUserInfo.setFollowerCount(author.getFollower_count());
        }
        if (author.getIs_ad_fake() != null) {
            awemeUserInfo.setIsAdFake(author.getIs_ad_fake());
        }
        if (author.getUser_canceled() != null) {
            awemeUserInfo.setUserCanceled(author.getUser_canceled());
        }
        if (author.getIs_gov_media_vip() != null) {
            awemeUserInfo.setIsGovMediaVip(author.getIs_gov_media_vip());
        }
        if (author.getHas_orders() != null) {
            awemeUserInfo.setHasOrders(author.getHas_orders());
        }
        if (author.getStory_open() != null) {
            awemeUserInfo.setStoryOpen(author.getStory_open());
        }
        if (StringUtils.isNotBlank(author.getRegion())) {
            awemeUserInfo.setRegion(author.getRegion());
        }
        if (author.getAweme_count() != null && author.getAweme_count() > 0) {
            awemeUserInfo.setAwemeCount(author.getAweme_count());
        }
        if (StringUtils.isNotBlank(author.getCustom_verify())) {
            awemeUserInfo.setCustomVerify(author.getCustom_verify());
        }
        if (author.getTotal_favorited() != null && author.getTotal_favorited() > 0) {
            awemeUserInfo.setTotalFavorited(author.getTotal_favorited());
        }
        if (StringUtils.isNotBlank(author.getEnterprise_verify_reason())) {
            awemeUserInfo.setEnterpriseVerifyReason(author.getEnterprise_verify_reason());
        }
        if (author.getSecret() != null) {
            awemeUserInfo.setSecret(author.getSecret());
        }
        if (StringUtils.isNotBlank(author.getSec_uid())) {
            awemeUserInfo.setSecUid(author.getSec_uid());
        }
        awemeUserInfo.setShortId(Long.parseLong(author.getShort_id()));
        awemeUserInfo.setNickname(author.getNickname());
        awemeUserInfo.setSignature(author.getSignature());
        awemeUserInfo.setUniqueId(author.getUnique_id());
        if (author.getAvatar_larger() != null && CollectionUtils.isNotEmpty(author.getAvatar_larger().getUrl_list())) {
            awemeUserInfo.setAvatarLarger(author.getAvatar_larger().getUrl_list().get(0));
        }
        if (author.getVerification_type() != null) {
            awemeUserInfo.setVerificationType(author.getVerification_type());
        }
        awemeUserInfo.setLastFetchTime(System.currentTimeMillis());
        if (shouldInsertUser) {
            awemeUserInfo.setFirstFetchTime(System.currentTimeMillis());
            awemeUserInfoDaoService.insert(awemeUserInfo);
        } else {
            awemeUserInfoDaoService.updateSelectiveByUid(awemeUserInfo, uid);
        }
    }

    private void saveMusicItem(AwemeInfo.MusicBean music_info, long mid) {
        AwemeMusicInfo awemeMusicInfo = awemeMusicInfoDaoService.selectByMid(mid);
        boolean shouldInsertMusic = false;
        if (awemeMusicInfo == null) {
            awemeMusicInfo = new AwemeMusicInfo();
            shouldInsertMusic = true;
            stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_MUSIC_IDS, music_info.getMid());
        }
        awemeMusicInfo.setMid(mid);
        awemeMusicInfo.setId(music_info.getId());
        awemeMusicInfo.setAuditionDuration(music_info.getDuration());
        awemeMusicInfo.setAuthor(music_info.getAuthor());
        awemeMusicInfo.setDuration(music_info.getDuration());
        if (music_info.getCover_hd() != null && CollectionUtils.isNotEmpty(music_info.getCover_hd().getUrl_list())) {
            awemeMusicInfo.setCoverUrl(music_info.getCover_hd().getUrl_list().get(0));
        }
        if (music_info.getPlay_url() != null && CollectionUtils.isNotEmpty(music_info.getPlay_url().getUrl_list())) {
            awemeMusicInfo.setPlayUrl(music_info.getPlay_url().getUrl_list().get(0));
        }
        if (StringUtils.isNotBlank(music_info.getExtra())) {
            try {
                MusicDetailResponse.MusicDetailExtra musicDetailExtra = GsonUtil.fromJson(music_info.getExtra(), MusicDetailResponse.MusicDetailExtra.class);
                if (musicDetailExtra != null) {
                    awemeMusicInfo.setOwnerId(musicDetailExtra.getOwner_id());
                }
            } catch (Exception ignore) {
                log.error("解析音乐信息出错:{}", music_info.getExtra());
                ignore.printStackTrace();
            }
        }
        awemeMusicInfo.setStatus(music_info.getStatus());
        awemeMusicInfo.setTitle(music_info.getTitle());
        awemeMusicInfo.setLastFetchTime(System.currentTimeMillis());
        if (shouldInsertMusic) {
            awemeMusicInfo.setFirstFetchTime(System.currentTimeMillis());
            awemeMusicInfoDaoService.insert(awemeMusicInfo);
        } else {
            awemeMusicInfoDaoService.updateSelectiveByMid(awemeMusicInfo, mid);
        }
    }

    @Scheduled(cron = "*/2 * * * * ?")
    public void fetchSticker() {

        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) fetchStickerDetailThreadPool);
        if (tpe.getActiveCount() < 5 && stringRedisTemplate.hasKey(RedisConstant.LAST_STICKER_ID)) {
            for (int i = 0; i < 5; i++) {
                int sticker_id = Integer.parseInt(stringRedisTemplate.opsForValue().get(RedisConstant.LAST_STICKER_ID));
                if (sticker_id>700000){
                    return;
                }
                String sticker_ids = IntStream.range(sticker_id + 1, sticker_id + 11).mapToObj(Integer::toString).collect(Collectors.joining(","));
                stringRedisTemplate.opsForValue().set(RedisConstant.LAST_STICKER_ID, String.valueOf(sticker_id + 10));
                fetchStickerDetailThreadPool.execute(() -> {
                    StickerDetailResponse stickerDetailResponse = awemeServiceV2.stickerDetail(sticker_ids);
                    if (stickerDetailResponse != null && CollectionUtils.isNotEmpty(stickerDetailResponse.getSticker_infos())) {
                        for (StickerDetailResponse.StickerInfosBean sticker_info : stickerDetailResponse.getSticker_infos()) {
                            try {
                                long id = Long.parseLong(sticker_info.getId());
                                if (awemeStickerInfoDaoService.selectById(id) == null) {
                                    AwemeStickerInfo awemeStickerInfo = new AwemeStickerInfo();
                                    awemeStickerInfo.setId(id);
                                    awemeStickerInfo.setEffectId(StringUtils.isNotBlank(sticker_info.getEffect_id()) ? Long.parseLong(sticker_info.getEffect_id()) : null);
                                    awemeStickerInfo.setIconUrl((sticker_info.getIcon_url() != null && CollectionUtils.isNotEmpty(sticker_info.getIcon_url().getUrl_list())) ? sticker_info.getIcon_url().getUrl_list().get(0) : null);
                                    awemeStickerInfo.setStickerName(sticker_info.getName());
                                    awemeStickerInfo.setStickerDesc(sticker_info.getDesc());
                                    awemeStickerInfo.setOwnerId(StringUtils.isNotBlank(sticker_info.getOwner_id()) ? Long.parseLong(sticker_info.getOwner_id()) : null);
                                    awemeStickerInfo.setOwnerNickname(sticker_info.getOwner_nickname());
                                    awemeStickerInfo.setUserCount(sticker_info.getUser_count());
                                    awemeStickerInfo.setVvCount(Long.parseLong(String.valueOf(sticker_info.getVv_count())));
                                    awemeStickerInfo.setFirstFetchTime(System.currentTimeMillis());
                                    awemeStickerInfo.setLastFetchTime(System.currentTimeMillis());
                                    awemeStickerInfoDaoService.insert(awemeStickerInfo);
                                    if (CollectionUtils.isNotEmpty(sticker_info.getTags())) {
                                        for (String tag : sticker_info.getTags()) {
                                            if (tag.startsWith("challenge:")) {
                                                try {
                                                    long challengeId = Long.parseLong(tag.substring(10));
                                                    if (awemeChallengeInfoDaoService.selectByCid(challengeId) == null) {
                                                        stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_CHALLENGE_IDS, String.valueOf(challengeId));
                                                    }
                                                } catch (Exception ignore) {
                                                    log.error("待抓取话题信息出错:tag:{}", tag);
                                                    ignore.printStackTrace();
                                                }
                                            }
                                        }
                                    }
                                }
                                stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_STICKER_IDS, sticker_info.getId());
                            } catch (Exception err) {
                                log.error("保存贴纸信息出错sticker_id:{}", sticker_info.getId());
                                err.printStackTrace();
                            }
                        }
                    }
                });
            }
        }
    }

    @Scheduled(cron = "*/2 * * * * ?")
    public void fetchMusic() {
        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) fetchMusicThreadPool);
        if (tpe.getActiveCount() < 10 && stringRedisTemplate.hasKey(RedisConstant.READY_TO_FETCH_MUSIC_IDS)) {
            for (int i = 0; i < 10; i++) {
                fetchMusicThreadPool.execute(() -> {
                    try {
                        String musicId = stringRedisTemplate.opsForSet().pop(RedisConstant.READY_TO_FETCH_MUSIC_IDS);
                        if (StringUtils.isNotBlank(musicId)) {
                            long mid = Long.parseLong(musicId);
                            try {
                                MusicDetailResponse musicDetailResponse = awemeServiceV2.musicInfo(mid);
                                if (musicDetailResponse != null && musicDetailResponse.getMusic_info() != null) {
                                    AwemeInfo.MusicBean music_info = musicDetailResponse.getMusic_info();
                                    saveMusicItem(music_info, mid);
                                }
                            } catch (Exception musicDetailErr) {
                                log.error("抓取音乐详情信息出错");
                                musicDetailErr.printStackTrace();
                            }
                            try {
                                int cursor = 0, count = 9;
                                while (true) {
                                    MusicAwemeListResponse musicAwemeListResponse = awemeServiceV2.musicListAweme(mid, count, cursor);
                                    if (musicAwemeListResponse != null && CollectionUtils.isNotEmpty(musicAwemeListResponse.getAweme_list())) {
                                        for (AwemeInfo awemeInfo : musicAwemeListResponse.getAweme_list()) {
                                            saveAwemeItem(null, mid, awemeInfo);
                                        }
                                        cursor += count;
                                    } else {
                                        break;
                                    }
                                }
                            } catch (Exception musicListErr) {
                                log.error("抓取音乐详情列表信息出错");
                                musicListErr.printStackTrace();
                            }
                        }
                    } catch (Exception err) {
                        log.error("抓取音乐信息出错");
                        err.printStackTrace();
                    }
                });
            }
        }
    }


    @Scheduled(cron = "*/2 * * * * ?")
    public void fetchChallenge() {

        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) fetchChallengeThreadPool);
        if (tpe.getActiveCount() < 10 && stringRedisTemplate.hasKey(RedisConstant.READY_TO_FETCH_CHALLENGE_IDS)) {
            for (int i = 0; i < 10; i++) {
                fetchChallengeThreadPool.execute(() -> {
                    try {
                        String challengeId = stringRedisTemplate.opsForSet().pop(RedisConstant.READY_TO_FETCH_CHALLENGE_IDS);
                        if (StringUtils.isNotBlank(challengeId)) {
                            long cid = Long.parseLong(challengeId);
                            try {
                                ChallengeDetailResponse challengeDetailResponse = awemeServiceV2.challengeDetail(cid);
                                if (challengeDetailResponse != null && challengeDetailResponse.getCh_info() != null) {
                                    ChallengeDetailResponse.ChInfoBean ch_info = challengeDetailResponse.getCh_info();
                                    AwemeChallengeInfo awemeChallengeInfo = awemeChallengeInfoDaoService.selectByCid(cid);
                                    boolean shouldInsertChallenge = false;
                                    if (awemeChallengeInfo == null) {
                                        shouldInsertChallenge = true;
                                        awemeChallengeInfo = new AwemeChallengeInfo();
                                    }
                                    awemeChallengeInfo.setCid(cid);
                                    awemeChallengeInfo.setChaName(ch_info.getCha_name());
                                    awemeChallengeInfo.setChaDesc(ch_info.getDesc());
                                    awemeChallengeInfo.setChaType(ch_info.getType());
                                    awemeChallengeInfo.setUserCount(ch_info.getUser_count());
                                    awemeChallengeInfo.setViewCount(ch_info.getView_count());
                                    if (ch_info.getSub_type() != null) {
                                        awemeChallengeInfo.setSubType(ch_info.getSub_type());
                                    }
                                    if (ch_info.getAuthor() != null && StringUtils.isNotBlank(ch_info.getAuthor().getUid())) {
                                        awemeChallengeInfo.setUid(Long.parseLong(ch_info.getAuthor().getUid()));
                                    }
                                    awemeChallengeInfo.setLastFetchTime(System.currentTimeMillis());
                                    if (shouldInsertChallenge) {
                                        awemeChallengeInfo.setFirstFetchTime(System.currentTimeMillis());
                                        awemeChallengeInfoDaoService.insert(awemeChallengeInfo);
                                    } else {
                                        awemeChallengeInfoDaoService.updateSelectiveByCid(awemeChallengeInfo, cid);
                                    }
                                }
                            } catch (Exception musicDetailErr) {
                                log.error("抓取话题详情信息出错");
                                musicDetailErr.printStackTrace();
                            }
                            try {
                                int cursor = 0, count = 9;
                                while (true) {
                                    ChallengeAwemeResponse challengeAwemeResponse = awemeServiceV2.challengeAweme(cid, count, cursor);
                                    if (challengeAwemeResponse != null && CollectionUtils.isNotEmpty(challengeAwemeResponse.getAweme_list())) {
                                        for (AwemeInfo awemeInfo : challengeAwemeResponse.getAweme_list()) {
                                            saveAwemeItem(null, null, awemeInfo);
                                        }
                                        cursor += count;
                                    } else {
                                        break;
                                    }
                                }
                            } catch (Exception musicListErr) {
                                log.error("抓取话题详情列表信息出错");
                                musicListErr.printStackTrace();
                            }
                        }
                    } catch (Exception err) {
                        log.error("抓取话题信息出错");
                        err.printStackTrace();
                    }
                });
            }
        }
    }

//    @Scheduled(cron = "*/2 * * * * ?")
    public void fetchUserPost() {
        ThreadPoolExecutor tpe = ((ThreadPoolExecutor) fetchUserThreadPool);
        if (tpe.getActiveCount() < 10 && stringRedisTemplate.hasKey(RedisConstant.READY_TO_FETCH_USER_UIDS)) {
            for (int i = 0; i < 5; i++) {
                fetchUserThreadPool.execute(() -> {
                    try {
                        String userId = stringRedisTemplate.opsForSet().pop(RedisConstant.READY_TO_FETCH_USER_UIDS);
                        if (StringUtils.isNotBlank(userId)) {
                            long uid = Long.parseLong(userId);
                            AwemeUserInfo awemeUserInfo = awemeUserInfoDaoService.selectByUid(uid);
                            if (awemeUserInfo != null && StringUtils.isNotBlank(awemeUserInfo.getSecUid())) {
                                String secUid = awemeUserInfo.getSecUid();
                                UserInfoResponse userInfoResponse = awemeServiceV2.userInfo(secUid);
                                if (userInfoResponse != null && userInfoResponse.getUser_info() != null) {
                                    saveUserInfo(userInfoResponse.getUser_info(), uid, awemeUserInfo, false);
                                }
                                long max_cursor = 0l;
                                int errtimes = 0;
                                int maxRetryTimes = 5;
                                while (errtimes < maxRetryTimes) {
                                    for (errtimes = 0; errtimes < maxRetryTimes; errtimes++) {
                                        AwemePostResponse awemePostResponse = awemeServiceV2.userPost(secUid, 15, max_cursor);
                                        if (awemePostResponse != null && CollectionUtils.isNotEmpty(awemePostResponse.getAweme_list())) {
                                            for (AwemeInfo awemeInfo : awemePostResponse.getAweme_list()) {
                                                saveAwemeItem(null, null, awemeInfo);
                                            }
                                            max_cursor = awemePostResponse.getMax_cursor();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception ignore) {
                        log.error("抓取用户详情列表失败");
                        ignore.printStackTrace();
                    }
                });
            }
        }
    }
}

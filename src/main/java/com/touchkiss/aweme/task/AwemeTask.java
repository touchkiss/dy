package com.touchkiss.aweme.task;

import com.douyin.aweme.v1.bean.AwemeInfo;
import com.douyin.aweme.v1.bean.StickerDetailResponse;
import com.douyin.aweme.v1.bean.UserInfo;
import com.douyin.aweme.v2.bean.StickerListResponse;
import com.douyin.aweme.v2.services.AwemeServiceV2;
import com.douyin.aweme.web.services.AwemeWebService;
import com.touchkiss.aweme.bean.*;
import com.touchkiss.aweme.constant.RedisConstant;
import com.touchkiss.aweme.services.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    private static volatile boolean stickerSpiderWorking = false;
    private static volatile boolean awemeItemSpiderWorking = false;


    @Scheduled(cron = "*/2 * * * * ?")
    public void fetchSticker() {
        if (!stickerSpiderWorking) {
            stickerSpiderWorking = true;
            int sticker_id = 0;
            if (stringRedisTemplate.hasKey(RedisConstant.LAST_STICKER_ID)) {
                try {
                    sticker_id = Integer.parseInt(stringRedisTemplate.opsForValue().get(RedisConstant.LAST_STICKER_ID));
                } catch (Exception ignore) {
                    log.error("读取LAST_STICKER_ID失败");
                }
            }
            String sticker_ids = IntStream.range(sticker_id + 1, sticker_id + 10).mapToObj(Integer::toString).collect(Collectors.joining(","));
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
                        int cursor = 0;
                        while (true) {
                            StickerListResponse stickerListResponse = awemeServiceV2.stickerList((int) id, cursor, 15);
                            if (stickerListResponse != null && CollectionUtils.isNotEmpty(stickerListResponse.getAweme_list())) {
                                for (AwemeInfo awemeInfo : stickerListResponse.getAweme_list()) {
                                    try {
                                        long awemeId = Long.parseLong(awemeInfo.getAweme_id());
                                        if (awemeItemDaoService.selectByAwemeId(awemeId) == null) {
                                            AwemeItem awemeItem = new AwemeItem();
                                            awemeItem.setAwemeId(awemeId);
                                            awemeItem.setDuration(awemeInfo.getDuration());
                                            awemeItem.setItemDesc(awemeInfo.getDesc());
                                            awemeItem.setCreateTime(awemeInfo.getCreate_time());
                                            awemeItem.setGroupId(awemeInfo.getGroup_id());
                                            awemeItem.setAwemeType(awemeInfo.getAweme_type());
                                            awemeItem.setIsPreview(awemeInfo.getIs_preview());
                                            awemeItem.setStickerId(sticker_id);
                                            if (awemeInfo.getVideo() != null) {
                                                awemeItem.setRatio(awemeInfo.getVideo().getRatio());
                                                awemeItem.setWidth(awemeInfo.getVideo().getWidth());
                                                awemeItem.setHeight(awemeInfo.getVideo().getHeight());
                                            }
                                            AwemeInfo.MusicBean music = awemeInfo.getMusic();
                                            if (music != null) {
                                                long mid = Long.parseLong(music.getMid());
                                                awemeItem.setMid(mid);
                                                if (awemeMusicInfoDaoService.selectByMid(mid) == null) {
                                                    try {
                                                        AwemeMusicInfo awemeMusicInfo = new AwemeMusicInfo();
                                                        awemeMusicInfo.setMid(mid);
                                                        awemeMusicInfo.setId(music.getId());
                                                        awemeMusicInfo.setAuditionDuration(music.getDuration());
                                                        awemeMusicInfo.setAuthor(music.getAuthor());
                                                        awemeMusicInfo.setCoverUrl(music.getCover_hd() != null && CollectionUtils.isNotEmpty(music.getCover_hd().getUrl_list()) ? music.getCover_hd().getUrl_list().get(0) : null);
                                                        awemeMusicInfo.setDuration(music.getDuration());
                                                        awemeMusicInfo.setPlayUrl(music.getPlay_url() != null && CollectionUtils.isNotEmpty(music.getPlay_url().getUrl_list()) ? music.getPlay_url().getUrl_list().get(0) : null);
                                                        awemeMusicInfo.setStatus(music.getStatus());
                                                        awemeMusicInfo.setTitle(music.getTitle());
                                                        awemeMusicInfo.setFirstFetchTime(System.currentTimeMillis());
                                                        awemeMusicInfo.setLastFetchTime(System.currentTimeMillis());
                                                        awemeMusicInfoDaoService.insert(awemeMusicInfo);
                                                    }catch (Exception e){
                                                        log.error("保存音乐信息失败：{}",mid);
                                                        e.printStackTrace();
                                                    }
                                                    stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_MUSIC_IDS, music.getMid());
                                                }
                                            }
                                            if (CollectionUtils.isNotEmpty(awemeInfo.getCha_list())) {
                                                for (AwemeInfo.ChaListBean challenge : awemeInfo.getCha_list()) {
                                                    try {
                                                        long cid = Long.parseLong(challenge.getCid());
                                                        if (awemeChallengeInfoDaoService.selectByCid(cid) == null) {
                                                            stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_CHALLENGE_IDS, String.valueOf(challenge.getCid()));
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
                                                long uid = Long.parseLong(author.getUid());
                                                awemeItem.setUid(uid);
                                                if (awemeUserInfoDaoService.selectByUid(uid) == null) {
                                                    try {
                                                        AwemeUserInfo awemeUserInfo = new AwemeUserInfo();
                                                        awemeUserInfo.setUid(uid);
                                                        awemeUserInfo.setShortId(Long.parseLong(author.getShort_id()));
                                                        awemeUserInfo.setNickname(author.getNickname());
                                                        awemeUserInfo.setSignature(author.getSignature());
                                                        awemeUserInfo.setUniqueId(author.getUnique_id());
                                                        awemeUserInfo.setAvatarLarger(author.getAvatar_larger() != null && CollectionUtils.isNotEmpty(author.getAvatar_larger().getUrl_list()) ? author.getAvatar_larger().getUrl_list().get(0) : null);
                                                        awemeUserInfo.setFirstFetchTime(System.currentTimeMillis());
                                                        awemeUserInfo.setLastFetchTime(System.currentTimeMillis());
                                                        awemeUserInfoDaoService.insert(awemeUserInfo);
                                                    }catch (Exception err1){
                                                        log.error("保存用户信息失败：{}",uid);
                                                        err1.printStackTrace();
                                                    }
                                                    stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_USER_UIDS, author.getUid());
                                                }
                                            }
                                            awemeItem.setFirstFetchTime(System.currentTimeMillis());
                                            awemeItem.setLastFetchTime(System.currentTimeMillis());
                                            awemeItemDaoService.insert(awemeItem);
                                            stringRedisTemplate.opsForSet().add(RedisConstant.READY_TO_FETCH_AWEME_IDS, awemeInfo.getAweme_id());
                                        }
                                    } catch (Exception ignore) {
                                        log.error("保存aweme信息出错：{}", awemeInfo.getAweme_id());
                                        ignore.printStackTrace();
                                    }
                                }
                                cursor += 15;
                            } else {
                                break;
                            }
                        }
                    } catch (Exception err) {
                        log.error("保存贴纸信息出错sticker_id:{}", sticker_info.getId());
                        err.printStackTrace();
                    }
                }
            }
            stringRedisTemplate.opsForValue().set(RedisConstant.LAST_STICKER_ID, String.valueOf(sticker_id + 10));
            stickerSpiderWorking=false;
        }
    }
}

package com.douyin.aweme.v2.services.impl;

import cn.hutool.http.HttpUtil;
import com.douyin.aweme.v1.bean.ChallengeAwemeResponse;
import com.douyin.aweme.v1.bean.ChallengeDetailResponse;
import com.douyin.aweme.v1.bean.StickerAwemeResponse;
import com.douyin.aweme.v1.bean.StickerDetailResponse;
import com.douyin.aweme.v2.bean.AwemeIteminfoResponse;
import com.douyin.aweme.v2.bean.UserInfoResponse;
import com.douyin.aweme.v2.services.AwemeServiceV2;
import com.touchkiss.dy.utils.GsonUtil;
import org.springframework.stereotype.Service;

/**
 * Created on 2020/12/01 17:05
 *
 * @author Touchkiss
 */
@Service
public class AwemeServiceV2Impl implements AwemeServiceV2 {
    @Override
    public UserInfoResponse userInfo(String sec_uid) {
        return GsonUtil.fromJson(HttpUtil.get("https://www.iesdouyin.com/web/api/v2/user/info/?sec_uid=" + sec_uid), UserInfoResponse.class);
    }

    @Override
    public AwemeIteminfoResponse awemeIteminfo(String item_ids) {
        return GsonUtil.fromJson(HttpUtil.get("https://www.iesdouyin.com/web/api/v2/aweme/iteminfo/?item_ids=" + item_ids), AwemeIteminfoResponse.class);
    }

    @Override
    public ChallengeAwemeResponse challengeAweme(String ch_id, int count, int cursor) {
        return GsonUtil.fromJson(HttpUtil.get("https://www.iesdouyin.com/web/api/v2/challenge/aweme/?ch_id=" + ch_id + "&count=" + count + "&cursor=" + cursor), ChallengeAwemeResponse.class);
    }

    @Override
    public ChallengeDetailResponse challengeDetail(String ch_id) {
        return GsonUtil.fromJson(HttpUtil.get("https://www.iesdouyin.com/web/api/v2/challenge/info/?ch_id=" + ch_id), ChallengeDetailResponse.class);
    }

    @Override
    public StickerDetailResponse stickerDetail(String sticker_ids) {
        return GsonUtil.fromJson(HttpUtil.get("https://www.iesdouyin.com/web/api/v2/sticker/detail/?sticker_ids=" + sticker_ids), StickerDetailResponse.class);
    }

    @Override
    public StickerAwemeResponse stickerList(int sticker_id, int cursor, int count) {
        return GsonUtil.fromJson(HttpUtil.get("https://www.iesdouyin.com/web/api/v2/sticker/list/?cursor=" + cursor + "&sticker_id=" + sticker_id + "&count=" + count), StickerAwemeResponse.class);
    }
}

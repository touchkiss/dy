package com.douyin.aweme.v2.services;

import com.douyin.aweme.v1.bean.ChallengeAwemeResponse;
import com.douyin.aweme.v1.bean.ChallengeDetailResponse;
import com.douyin.aweme.v1.bean.StickerAwemeResponse;
import com.douyin.aweme.v1.bean.StickerDetailResponse;
import com.douyin.aweme.v2.bean.AwemeIteminfoResponse;
import com.douyin.aweme.v2.bean.UserInfoResponse;

/**
 * Created on 2020/12/01 17:18
 *
 * @author Touchkiss
 */
public interface AwemeServiceV2 {
    /**
     * 网页获取用户信息
     * 仅限sec_uid
     *
     * @param sec_uid
     * @return
     */
    UserInfoResponse userInfo(String sec_uid);

    /**
     * 网页获取视频信息
     * https://www.douyin.com/share/video/6898649371500383492
     * 多个id用逗号隔开
     *
     * @param item_ids
     * @return
     */
    AwemeIteminfoResponse awemeIteminfo(String item_ids);

    /**
     * 网页获取话题下作品列表
     *
     * @param ch_id
     * @param count
     * @param cursor
     * @return
     */
    ChallengeAwemeResponse challengeAweme(String ch_id, int count, int cursor);

    /**
     * 网页获取话题详情
     *
     * @param ch_id
     * @return
     */
    ChallengeDetailResponse challengeDetail(String ch_id);

    /**
     * 网页获取贴纸详情
     * https://www.iesdouyin.com/share/sticker/detail/645185/?schema_type=17&object_id=645185
     *
     * @param sticker_ids
     * @return
     */
    StickerDetailResponse stickerDetail(String sticker_ids);

    /**
     * 网页获取使用贴纸的视频
     * @param sticker_id
     * @param cursor
     * @param count
     * @return
     */
    StickerAwemeResponse stickerList(int sticker_id,int cursor,int count);
}

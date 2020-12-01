package com.douyin.aweme.v2.services;

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
}

package com.douyin.aweme.v2.services.impl;

import cn.hutool.http.HttpUtil;
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
}

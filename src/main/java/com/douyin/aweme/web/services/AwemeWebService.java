package com.douyin.aweme.web.services;

import cn.hutool.http.HttpUtil;
import com.douyin.aweme.web.bean.ShareBillboardResponse;
import com.touchkiss.dy.utils.GsonUtil;
import org.springframework.stereotype.Service;

/**
 * Created on 2020/12/01 18:06
 *
 * @author Touchkiss
 */
@Service
public class AwemeWebService {
    /**
     * 网页端获取抖音热点接口
     *
     * @return
     */
    public ShareBillboardResponse shareBillboard() {
        return GsonUtil.fromJson(HttpUtil.get("https://www.iesdouyin.com/web/api/v2/hotsearch/billboard/word/"), ShareBillboardResponse.class);
    }
}

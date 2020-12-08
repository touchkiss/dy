package com.douyin.aweme.web.services;

import com.douyin.aweme.v1.bean.MixAwemeResponse;
import com.douyin.aweme.v1.bean.MixDetailResponse;
import com.douyin.aweme.web.bean.ShareBillboardResponse;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HutoolHttpUtilWithProxy;
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
        return GsonUtil.fromJson(HutoolHttpUtilWithProxy.get("https://www.iesdouyin.com/web/api/v2/hotsearch/billboard/word/"), ShareBillboardResponse.class);
    }

    /**
     * 网页端获取合集详情
     *
     * @param mix_id
     * @return
     */
    public MixDetailResponse mixDetail(String mix_id) {
        return GsonUtil.fromJson(HutoolHttpUtilWithProxy.get("https://www.iesdouyin.com/web/api/mix/detail/?mix_id=" + mix_id), MixDetailResponse.class);
    }

    /**
     * 网页获取合集列表
     *
     * @param mix_id
     * @param count
     * @param cursor
     * @return
     */
    public MixAwemeResponse mixAweme(String mix_id, int count, int cursor) {
        return GsonUtil.fromJson(HutoolHttpUtilWithProxy.get("https://www.iesdouyin.com/web/api/mix/item/list/?mix_id=" + mix_id + "&count=" + count + "&cursor=" + cursor), MixAwemeResponse.class);
    }
}

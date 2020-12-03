package com.huoshan.services;

import cn.hutool.http.HttpUtil;
import com.huoshan.bean.response.ItemInfoResponse;
import com.touchkiss.dy.utils.GsonUtil;
import org.springframework.stereotype.Service;

/**
 * Created on 2020/12/01 17:43
 *
 * @author Touchkiss
 */
@Service
public class HuoshanService {
    /**
     * 抖音火山版
     * 网页端根据视频id获得用户的sec_id和视频地址
     *
     * @param item_id
     * @return
     */
    public ItemInfoResponse itemInfo(String item_id) {
        return GsonUtil.fromJson(HttpUtil.get("https://share.huoshan.com/api/item/info?item_id=" + item_id), ItemInfoResponse.class);
    }
}

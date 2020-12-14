package com.huoshan.services;

import com.huoshan.bean.response.ItemInfoResponse;
import com.huoshan.bean.response.UserInfoResponse;
import com.huoshan.bean.response.UserVideoResponse;
import com.touchkiss.dy.utils.GsonUtil;
import com.touchkiss.dy.utils.HutoolHttpUtilWithProxy;
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
        return GsonUtil.fromJson(HutoolHttpUtilWithProxy.get("https://share.huoshan.com/api/item/info?item_id=" + item_id), ItemInfoResponse.class);
    }

    public UserVideoResponse userVideo(String sec_uid, int offset, int count) {
        return GsonUtil.fromJson(HutoolHttpUtilWithProxy.get("https://share.huoshan.com/api/user/video?encrypted_id=" + sec_uid + "&offset=" + offset + "&count=" + count), UserVideoResponse.class);
    }

    public UserInfoResponse userInfo(String sec_uid) {
        return GsonUtil.fromJson(HutoolHttpUtilWithProxy.get("https://share.huoshan.com/api/user/info?encrypted_id" + sec_uid), UserInfoResponse.class);
    }
}

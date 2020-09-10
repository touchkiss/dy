package com.huoshan.hotsoon.item.profile;

import com.huoshan.bean.response.BaseResponse;
import com.huoshan.bean.response.ItemInfo;

import java.util.List;

/**
 * Created on 2020/09/08 21:31
 *
 * @author Touchkiss
 */
@lombok.NoArgsConstructor
@lombok.Data
public class PublishedListResponse extends BaseResponse<List<PublishedListResponse.DataBeanX>> {

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class DataBeanX {
        private ItemInfo data;
        private String rid;
        //        private List<Object>tags;
        private Integer type;
    }
}

package com.huoshan.bean.response;

import java.util.List;

/**
 * Created on 2020/09/08 21:31
 * 火山 用户作品列表
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

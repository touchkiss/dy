package com.huoshan.hotsoon.general_search;

import com.huoshan.bean.response.BaseResponse;
import com.huoshan.bean.response.ItemInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/08 17:17
 *
 * @author Touchkiss
 */
@lombok.NoArgsConstructor
@lombok.Data
public class SearchResponse extends BaseResponse<List<SearchResponse.DataBean>> {
    @lombok.NoArgsConstructor
    @lombok.Data
    public static class DataBean {

        private ItemResultBean item_result;
        private Integer type;

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class ItemResultBean {

            private java.util.List<ItemsBean> items;

            @NoArgsConstructor
            @Data
            public static class ItemsBean {
                private List<String> highlight;
                private ItemInfo item;
            }
        }
    }
}

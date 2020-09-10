package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/09 11:37
 * <p>
 * 根据视频itemid获取加密的userid
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ItemInfoResponse {
    private Integer status_code;
    private DataBean data;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        private UserInfoBean user_info;
        private ItemInfoBean item_info;

        @NoArgsConstructor
        @Data
        public static class UserInfoBean {
            /**
             * encrypted_id : MS4wLjABAAAAKktjl7kAAUBN_M4HStRcZcu9BXtdCeYMmJUq2jGRDRE
             */

            private String encrypted_id;
        }

        @NoArgsConstructor
        @Data
        public static class ItemInfoBean {
            private String item_id;
            private String cover;
            private String url;
        }
    }
}

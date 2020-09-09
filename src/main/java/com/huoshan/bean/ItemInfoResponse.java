package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/09 11:37
 *
 * 根据视频itemid获取加密的userid
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ItemInfoResponse {

    /**
     * status_code : 0
     * data : {"user_info":{"encrypted_id":"MS4wLjABAAAAKktjl7kAAUBN_M4HStRcZcu9BXtdCeYMmJUq2jGRDRE"},"item_info":{"item_id":"6867427050211314952","cover":"http://p1-hs.byteimg.com/img/tos-cn-p-0015/76cd6ca0d2184ea0a5774631dcd416c2_1598947470~tplv-hs-large.jpg","url":"https://api.huoshan.com/hotsoon/item/video/_reflow/?video_id=v0300f8c0000bt6vvvvqvq6ulbadc4mg&line=0&app_id=0&vquality=normal&watermark=2&long_video=0&sf=5&ts=1599622595&item_id=6867427050211314952"}}
     */

    private int status_code;
    private DataBean data;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * user_info : {"encrypted_id":"MS4wLjABAAAAKktjl7kAAUBN_M4HStRcZcu9BXtdCeYMmJUq2jGRDRE"}
         * item_info : {"item_id":"6867427050211314952","cover":"http://p1-hs.byteimg.com/img/tos-cn-p-0015/76cd6ca0d2184ea0a5774631dcd416c2_1598947470~tplv-hs-large.jpg","url":"https://api.huoshan.com/hotsoon/item/video/_reflow/?video_id=v0300f8c0000bt6vvvvqvq6ulbadc4mg&line=0&app_id=0&vquality=normal&watermark=2&long_video=0&sf=5&ts=1599622595&item_id=6867427050211314952"}
         */

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
            /**
             * item_id : 6867427050211314952
             * cover : http://p1-hs.byteimg.com/img/tos-cn-p-0015/76cd6ca0d2184ea0a5774631dcd416c2_1598947470~tplv-hs-large.jpg
             * url : https://api.huoshan.com/hotsoon/item/video/_reflow/?video_id=v0300f8c0000bt6vvvvqvq6ulbadc4mg&line=0&app_id=0&vquality=normal&watermark=2&long_video=0&sf=5&ts=1599622595&item_id=6867427050211314952
             */

            private String item_id;
            private String cover;
            private String url;
        }
    }
}

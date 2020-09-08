package com.huoshan.hotsoon.general_search;

import com.huoshan.bean.*;
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
public class SearchResponse {

    private Integer status_code;
    private ExtraBean extra;
    private java.util.List<DataBean> data;

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
                private ItemBean item;

                @NoArgsConstructor
                @Data
                public static class ItemBean {

                    /**
                     * allow_comment : true
                     * allow_dislike : true
                     * allow_display_comments : true
                     * allow_download : false
                     * allow_share : true
                     */

                    private Boolean allow_comment;
                    private Boolean allow_dislike;
                    private Boolean allow_display_comments;
                    private Boolean allow_download;
                    private Boolean allow_share;
                    private List<AtUser> at_users;
                    private Author author;
                    //                    private Object author_location;
//                    private Object author_top_fans;
                    private Integer comment_delay;
                    //                    private Object comment_info;
//                    private Object commerce;
                    private Long create_time;
                    private String create_time_tag;
                    private String description;
                    private Boolean disable_watermark;
                    private FrameInfo frame_info;
                    private Boolean follow_display;
                    private String follow_status_tag;
                    //                    private Object friend_action_list;
                    private List<GoodsInfo> goods_infos;
                    private Long id;
                    private String id_str;
                    private String item_log_extra;
                    private String location;
                    private Integer media_type;
                    private MiscInfo misc_info;
                    //                    private Object out_show_comments;
                    private Boolean prefetch_comment;
                    private Boolean prefetch_profile;
                    private Integer private_status;
                    private String share_description;
                    private Boolean share_enable;
                    private String share_prompts;
                    private Integer share_strong_guide;
                    private String share_title;
                    private String share_url;
                    private Boolean show_user_video_widget;
                    //                    private Object song;
                    private Stats stats;
                    private Integer status;
                    private String tips;
                    private String tips_url;
                    private String title;
                    private Integer user_bury;
                    private Integer user_digg;
                    private Long user_id;
                    private VideoInfo video;
                    private String weibo_share_title;


                    @NoArgsConstructor
                    @Data
                    public static class MiscInfo {

                        /**
                         * ocr_location :
                         * source : 2
                         */

                        private String ocr_location;
                        private Integer source;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class GoodsInfo {

                        /**
                         * coupon_title : 立减5元
                         * id : 3309255170806962546
                         * id_str : 3309255170806962546
                         * image : {"uri":"cmp-ecom-alliance/FpXBKEdpStohxC9phDd8_WzOAvYY.jpg","url_list":["http://p1-hs.byteimg.com/img/cmp-ecom-alliance/FpXBKEdpStohxC9phDd8_WzOAvYY.jpg~720x720.webp","http://p3-hs.byteimg.com/img/cmp-ecom-alliance/FpXBKEdpStohxC9phDd8_WzOAvYY.jpg~720x720.webp"]}
                         * market_price : 8990
                         * price : 5990
                         * promotion_source : 7
                         * sales : 5302
                         * schema_url : https://uland.taobao.com/ccoupon/edetail?e=CPWwijKpCskGQASttHIRqcN4kOwoW9tJMuDbJPbhC7o92EfUkuSrhcPJR%2Fe21Q%2BpB87mdTQeAxnp2VyeYZH3Iem9uhgRF1OTXiq81YKxIKhezKZ8CK1oGQvCU0X9%2BIYmWUhbEoHQO%2FXZ7tLp0IPlxrmykeWYbo0f%2B9AVZ6pYAmKo6ugjpoUgQedth9k8bqqSHKTgBzHkoM7XTQC0vfau6E%2F9Zk7cDx8UHWt32Au%2FrGKDMlzOg%2FzIlHui%2Fn%2FQ7Z5VAjFMyWlPrz8Cn5vCjwCiqA%3D%3D&traceId=0bb625ec15992918369568975e9031&union_lens=lensId:TAPI@1599291836@0b8476a4_bb2c_1745d38ca31_9eb9@01
                         * short_title : 视频同款麦片
                         * title : 【刘涛同款】王饱饱酸奶果然多烘焙燕麦片早餐代餐水果即食400g
                         * type : 1
                         */

                        private String coupon_title;
                        private long id;
                        private String id_str;
                        private CoverBean image;
                        private int market_price;
                        private int price;
                        private int promotion_source;
                        private int sales;
                        private String schema_url;
                        private String short_title;
                        private String title;
                        private int type;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class FrameInfo {

                        /**
                         * fans_count : 22
                         * top_contributors : [{"avatar_medium":{"uri":"hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b","url_list":["http://p3-hs.byteimg.com/img/hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b~720x720.webp","http://p1-hs.byteimg.com/img/hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b~720x720.webp"]},"encrypted_id":"MS4wLjABAAAAhP1oVq2BXKMd9WkX2YuFmgMkwHayGh1cU0JuRA3kdCbE9bVefhnGSqtt-dXZ67u_","id":4503674519805517,"nickname":"柠小檬i"},{"avatar_medium":{"uri":"mosaic-legacy/2d04e000516de42309d10","url_list":["http://p3-hs.byteimg.com/img/mosaic-legacy/2d04e000516de42309d10~720x720.webp","http://p1-hs.byteimg.com/img/mosaic-legacy/2d04e000516de42309d10~720x720.webp"]},"encrypted_id":"MS4wLjABAAAA1BBFpek9US2WjiXGhnp-THXPQEMi_0yq90k5oM6WmEM","id":259096213730590,"nickname":"用户98086541"},{"avatar_medium":{"uri":"hotsoon-avatar/2145005ec7b448f7b0f2ac2b42f5f736","url_list":["http://p3-hs.byteimg.com/img/hotsoon-avatar/2145005ec7b448f7b0f2ac2b42f5f736~720x720.webp","http://p1-hs.byteimg.com/img/hotsoon-avatar/2145005ec7b448f7b0f2ac2b42f5f736~720x720.webp"]},"encrypted_id":"MS4wLjABAAAAPv5_JRY23vrnJx1LmF0skksZAL3Cj2gX60p5xW2fIR05EGlopO3w3uzIGYtlXpOC","id":1895208246054996,"nickname":"用户29792444"},{"avatar_medium":{"uri":"hotsoon-avatar/70cef3921eb64ea5b09cd981ad564a7f","url_list":["http://p3-hs.byteimg.com/img/hotsoon-avatar/70cef3921eb64ea5b09cd981ad564a7f~720x720.webp","http://p1-hs.byteimg.com/img/hotsoon-avatar/70cef3921eb64ea5b09cd981ad564a7f~720x720.webp"]},"encrypted_id":"MS4wLjABAAAARozc4ZqT0Cf5UVT-8M--mv61nYQMeDSg03Dk6tSYHEU","id":95906073191,"nickname":"星辞"}]
                         */

                        private int fans_count;
                        private List<TopContributorsBean> top_contributors;

                        @NoArgsConstructor
                        @Data
                        public static class TopContributorsBean {
                            /**
                             * avatar_medium : {"uri":"hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b","url_list":["http://p3-hs.byteimg.com/img/hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b~720x720.webp","http://p1-hs.byteimg.com/img/hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b~720x720.webp"]}
                             * encrypted_id : MS4wLjABAAAAhP1oVq2BXKMd9WkX2YuFmgMkwHayGh1cU0JuRA3kdCbE9bVefhnGSqtt-dXZ67u_
                             * id : 4503674519805517
                             * nickname : 柠小檬i
                             */

                            private CoverBean avatar_medium;
                            private String encrypted_id;
                            private long id;
                            private String nickname;
                        }
                    }
                }
            }
        }
    }
}

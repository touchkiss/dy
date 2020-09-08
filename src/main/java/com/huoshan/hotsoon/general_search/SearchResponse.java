package com.huoshan.hotsoon.general_search;

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
                    private Video video;
                    private String weibo_share_title;

                    @NoArgsConstructor
                    @Data
                    public static class Video {

                        /**
                         * allow_cache : true
                         * cover : {"avg_color":"#B1CCA3","uri":"tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4","url_list":["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-large.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-large.webp"]}
                         * cover_360p : {"avg_color":"#FFEBF8","uri":"tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4","url_list":["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-360p.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-360p.webp"]}
                         * cover_animated : null
                         * cover_medium : {"avg_color":"#D6D6D6","uri":"tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4","url_list":["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-medium.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-medium.webp"]}
                         * cover_normal : {"avg_color":"#7A6053","uri":"tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4","url_list":["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:720:1280.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:720:1280.webp"]}
                         * cover_thumb : {"avg_color":"#B8B8B8","uri":"tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4","url_list":["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:100:100.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:100:100.webp"]}
                         * download_url : ["https://api-lq.huoshan.com/hotsoon/item/video/_source/?video_id=v0200ff10000bomide4m7fifvi2645bg&line=0&app_id=1112&vquality=normal&watermark=0&long_video=0&sf=4&ts=1599557040&item_id=6786122108414987534","https://api-lq.huoshan.com/hotsoon/item/video/_source/?video_id=v0200ff10000bomide4m7fifvi2645bg&line=1&app_id=1112&vquality=normal&watermark=0&long_video=0&sf=4&ts=1599557040&item_id=6786122108414987534"]
                         * duration : 95.445
                         * first_frame : {"uri":"tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439","url_list":["http://p1-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-large.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-large.webp"]}
                         * first_frame_360p : {"uri":"tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439","url_list":["http://p1-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-360p.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-360p.webp"]}
                         * gear_name : 720p-adapt-h265_hvc1
                         * h265_uri : 52bc9621a6c1be783f02a87666d6a8d7
                         * h265_url : ["http://v29-hs.ixigua.com/cc5d495f71952252347f885432eddbea/5f575c1f/video/tos/hxsy/tos-hxsy-ve-0015/3cc7b4e5b0534bb2b0d70aec5c6dc38d/?a=1112&br=3204&bt=801&cr=2&cs=2&cv=1&dr=3&ds=3&er=&l=202009081723590101281410190E5A3FA7&lr=&mime_type=video_mp4&qs=11&rc=ajg5bGlpcGhscjMzNGkzM0ApZDY1ZzxmPGVpNzhpaDllOWdfMS9zZjQxYWpfLS1jLS9zczFhYDJeYDI0MWJfMjIvMDM6Yw%3D%3D&vl=&vr=","http://v3-hs.ixigua.com/edb2e23d7a6dd2467a118956d5bbf1e1/5f575c1f/video/tos/hxsy/tos-hxsy-ve-0015/3cc7b4e5b0534bb2b0d70aec5c6dc38d/?a=1112&br=3204&bt=801&cr=2&cs=2&cv=1&dr=3&ds=3&er=&l=202009081723590101281410190E5A3FA7&lr=&mime_type=video_mp4&qs=11&rc=ajg5bGlpcGhscjMzNGkzM0ApZDY1ZzxmPGVpNzhpaDllOWdfMS9zZjQxYWpfLS1jLS9zczFhYDJeYDI0MWJfMjIvMDM6Yw%3D%3D&vl=&vr=","https://api-lq.huoshan.com/hotsoon/item/video/_source/?video_id=v0200ff10000bomide4m7fifvi2645bg&line=0&app_id=1112&vquality=adapt&quality=720p&codec=h265&sf=4&origin=0&ts=1599557040"]
                         * h265_url_expire : 1599560735
                         * height : 1920
                         * preload_size : 375000
                         * uri : v0200ff10000bomide4m7fifvi2645bg
                         * url_list : ["https://api-lq.huoshan.com/hotsoon/item/video/_source/?video_id=v0200ff10000bomide4m7fifvi2645bg&line=0&app_id=1112&vquality=normal&watermark=0&long_video=0&sf=4&ts=1599557040&item_id=6786122108414987534","https://api-lq.huoshan.com/hotsoon/item/video/_source/?video_id=v0200ff10000bomide4m7fifvi2645bg&line=1&app_id=1112&vquality=normal&watermark=0&long_video=0&sf=4&ts=1599557040&item_id=6786122108414987534"]
                         * url_list_expire : 0
                         * video_id : v0200ff10000bomide4m7fifvi2645bg
                         * watermark : false
                         * width : 1080
                         */

                        private Boolean allow_cache;
                        private CoverBean cover;
                        private Cover360pBean cover_360p;
                        private Object cover_animated;
                        private CoverMediumBean cover_medium;
                        private CoverNormalBean cover_normal;
                        private CoverThumbBean cover_thumb;
                        private double duration;
                        private FirstFrameBean first_frame;
                        private FirstFrame360pBean first_frame_360p;
                        private String gear_name;
                        private String h265_uri;
                        private Integer h265_url_expire;
                        private Integer height;
                        private Integer preload_size;
                        private String uri;
                        private Integer url_list_expire;
                        private String video_id;
                        private Boolean watermark;
                        private Integer width;
                        private List<String> download_url;
                        private List<String> h265_url;
                        private List<String> url_list;

                        @NoArgsConstructor
                        @Data
                        public static class CoverBean {
                            /**
                             * avg_color : #B1CCA3
                             * uri : tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4
                             * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-large.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-large.webp"]
                             */

                            private String avg_color;
                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class Cover360pBean {
                            /**
                             * avg_color : #FFEBF8
                             * uri : tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4
                             * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-360p.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-360p.webp"]
                             */

                            private String avg_color;
                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class CoverMediumBean {
                            /**
                             * avg_color : #D6D6D6
                             * uri : tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4
                             * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-medium.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-medium.webp"]
                             */

                            private String avg_color;
                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class CoverNormalBean {
                            /**
                             * avg_color : #7A6053
                             * uri : tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4
                             * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:720:1280.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:720:1280.webp"]
                             */

                            private String avg_color;
                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class CoverThumbBean {
                            /**
                             * avg_color : #B8B8B8
                             * uri : tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4
                             * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:100:100.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-live:100:100.webp"]
                             */

                            private String avg_color;
                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class FirstFrameBean {
                            /**
                             * uri : tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439
                             * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-large.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-large.webp"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class FirstFrame360pBean {
                            /**
                             * uri : tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439
                             * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-360p.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/204b1880fe8a4db48f6fe4049cb6e7d1_1580017439~tplv-hs-360p.webp"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }
                    }

                    @NoArgsConstructor
                    @Data
                    public static class Stats {

                        /**
                         * comment_count : 13869
                         * digg_count : 1695974
                         * flame_sender_count : 194349
                         * play_count : 0
                         * share_count : 5478
                         */

                        private Integer comment_count;
                        private Integer digg_count;
                        private Integer flame_sender_count;
                        private Integer play_count;
                        private Integer share_count;
                    }


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
                        private ImageBean image;
                        private int market_price;
                        private int price;
                        private int promotion_source;
                        private int sales;
                        private String schema_url;
                        private String short_title;
                        private String title;
                        private int type;

                        @NoArgsConstructor
                        @Data
                        public static class ImageBean {
                            /**
                             * uri : cmp-ecom-alliance/FpXBKEdpStohxC9phDd8_WzOAvYY.jpg
                             * url_list : ["http://p1-hs.byteimg.com/img/cmp-ecom-alliance/FpXBKEdpStohxC9phDd8_WzOAvYY.jpg~720x720.webp","http://p3-hs.byteimg.com/img/cmp-ecom-alliance/FpXBKEdpStohxC9phDd8_WzOAvYY.jpg~720x720.webp"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }
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

                            private AvatarMediumBean avatar_medium;
                            private String encrypted_id;
                            private long id;
                            private String nickname;

                            @NoArgsConstructor
                            @Data
                            public static class AvatarMediumBean {
                                /**
                                 * uri : hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b
                                 * url_list : ["http://p3-hs.byteimg.com/img/hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b~720x720.webp","http://p1-hs.byteimg.com/img/hotsoon-avatar/26b22b209e6c4888be76c4bfa59f997b~720x720.webp"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }
                        }
                    }

                    @NoArgsConstructor
                    @Data
                    public static class Author {

                        /**
                         * account_type : 0
                         * allow_be_located : true
                         * allow_others_download_video : true
                         * allow_others_download_when_sharing_video : true
                         * allow_show_follow_fans_list : true
                         * allow_show_vcd_grant : false
                         * allow_strange_comment : true
                         * allow_unfollower_comment : true
                         * avatar_jpg : {"uri":"mosaic-legacy/2e60f00001f61ba5f90c1","url_list":["http://p9-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~100x100.jpg","http://p3-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~100x100.jpg"]}
                         * avatar_large : {"uri":"mosaic-legacy/2e60f00001f61ba5f90c1","url_list":["http://p9-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~1080x1080.webp","http://p3-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~1080x1080.webp"]}
                         * avatar_medium : {"uri":"mosaic-legacy/2e60f00001f61ba5f90c1","url_list":["http://p9-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~720x720.webp","http://p3-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~720x720.webp"]}
                         * avatar_thumb : {"uri":"mosaic-legacy/2e60f00001f61ba5f90c1","url_list":["http://p9-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~100x100.webp","http://p3-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~100x100.webp"]}
                         * bg_img_url :
                         * birthday : 0
                         * birthday_description : 95后
                         * birthday_valid : true
                         * block_rpc_success : false
                         * block_status : 0
                         * blocked_by_status : 0
                         * city :
                         * comment_restrict : 1
                         * commerce_info : {}
                         * constellation :
                         * disable_ichat : 1
                         * encrypted_id : MS4wLjABAAAAjVocn5B2KaVZX7O3N4CJxPXlHAFVFkBpMIRs99SJ6KYQZnCsJ2L3LOFjvgj9xuaD
                         * exp : 0
                         * fan_ticket_count : 717869
                         * flame_exp_info : {"receive_flame_disabled":false,"send_flame_disabled":false}
                         * flash_rank_detail : null
                         * fold_stranger_chat : false
                         * follow_status : 0
                         * force_follow_feed_time_order : false
                         * gender : 2
                         * has_circle_item : false
                         * hotsoon_verified : false
                         * hotsoon_verified_reason :
                         * ichat_restrict_type : 1
                         * id : 1754419881327491
                         * id_str : 1754419881327491
                         * income_share_percent : 0
                         * is_city_near_by : false
                         * is_follower : false
                         * is_following : false
                         * is_money_tree_user : false
                         * level : 0
                         * level_info : {"icon":{"uri":"hotsoon-resource/userlevel_hs_11.png","url_list":["http://p9-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_11.png","http://p3-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_11.png"]},"level":11,"schema_url":"sslocal://webview?url=https%3A%2F%2Fhotsoon.snssdk.com%2Ffalcon%2Flive_inapp%2Fpage%2Fuser_level%2Findex.html&hide_more=1"}
                         * live_noble : null
                         * need_profile_guide : true
                         * nickname : 姜十七9.8今晚6点直播
                         * original_encrypted_id : MS4wLjABAAAAjVocn5B2KaVZX7O3N4CJxPXlHAFVFkBpMIRs99SJ6KYQZnCsJ2L3LOFjvgj9xuaD
                         * original_user_id : 1754419881327491
                         * pay_grade : {"diamond_icon":{"uri":"12400003aba3dd42e213","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]},"grade_banner":"7级可获房间展示升级通告","grade_describe":"当前无等级，消费1钻石即可升级获勋章","grade_icon_list":[{"icon":{"uri":"3b60000a6308f74aec4e","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image"]},"icon_diamond":0,"level":0,"level_str":"暂无"},{"icon":{"uri":"3b65000678af61a99a1b","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678af61a99a1b~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678af61a99a1b~tplv-obj.image"]},"icon_diamond":0,"level":0,"level_str":"Lv.0"},{"icon":{"uri":"3b620006b1e388185513","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b620006b1e388185513~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b620006b1e388185513~tplv-obj.image"]},"icon_diamond":1,"level":1,"level_str":"Lv.1"}],"icon":{"uri":"f2100085e55a62833b1","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085e55a62833b1~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085e55a62833b1~tplv-obj.image"]},"im_icon":{"uri":"2ea8000962099e965ff0","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image"]},"level":0,"live_icon":{"uri":"30ee0007ccef28b99639","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image"]},"name":"暂无","new_live_icon":{"uri":"78a10056e336cb6eb911","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image"]},"new_nav_live_icon":null,"next_diamond":1,"next_icon":{"uri":"30eb0000a12588d9bb3e","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a12588d9bb3e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a12588d9bb3e~tplv-obj.image"]},"next_name":"树苗","now_diamond":0,"pay_diamond_bak":0,"profile_dialog_bg":{"uri":"hotsoon-resource/user_level_1.1_3x.png","url_list":["http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image"]},"profile_dialog_bg_back":{"uri":"hotsoon-resource/user_level_1.2_3x.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image"]},"screen_chat_type":1,"this_grade_max_diamond":0,"this_grade_min_diamond":0,"total_diamond_count":4,"upgrade_need_consume":1}
                         * pay_scores : 0
                         * profile_guide_prompts : 完善个人资料，有助于收到别人的回复~
                         * secret : 0
                         * short_id : 1944778582
                         * short_id_str : Jiang.17
                         * signature : 不惹事不怕事
                         * 合作vx: ysdd_001（备注来意）
                         * 🧣围脖：-姜十七-
                         * type_a1 : 1
                         * user_flame_info : null
                         * verified : false
                         * verified_mobile : false
                         * verified_reason :
                         */

                        private int account_type;
                        private Boolean allow_be_located;
                        private Boolean allow_others_download_video;
                        private Boolean allow_others_download_when_sharing_video;
                        private Boolean allow_show_follow_fans_list;
                        private Boolean allow_show_vcd_grant;
                        private Boolean allow_strange_comment;
                        private Boolean allow_unfollower_comment;
                        private AvatarJpgBean avatar_jpg;
                        private AvatarLargeBean avatar_large;
                        private AvatarMediumBean avatar_medium;
                        private AvatarThumbBean avatar_thumb;
                        private String bg_img_url;
                        private int birthday;
                        private String birthday_description;
                        private Boolean birthday_valid;
                        private Boolean block_rpc_success;
                        private int block_status;
                        private int blocked_by_status;
                        private String city;
                        private int comment_restrict;
                        private CommerceInfoBean commerce_info;
                        private String constellation;
                        private int disable_ichat;
                        private String encrypted_id;
                        private int exp;
                        private int fan_ticket_count;
                        private FlameExpInfoBean flame_exp_info;
                        private Object flash_rank_detail;
                        private Boolean fold_stranger_chat;
                        private int follow_status;
                        private Boolean force_follow_feed_time_order;
                        private int gender;
                        private Boolean has_circle_item;
                        private Boolean hotsoon_verified;
                        private String hotsoon_verified_reason;
                        private int ichat_restrict_type;
                        private long id;
                        private String id_str;
                        private int income_share_percent;
                        private Boolean is_city_near_by;
                        private Boolean is_follower;
                        private Boolean is_following;
                        private Boolean is_money_tree_user;
                        private int level;
                        private LevelInfoBean level_info;
                        private Object live_noble;
                        private Boolean need_profile_guide;
                        private String nickname;
                        private String original_encrypted_id;
                        private long original_user_id;
                        private PayGradeBean pay_grade;
                        private int pay_scores;
                        private String profile_guide_prompts;
                        private int secret;
                        private int short_id;
                        private String short_id_str;
                        private String signature;
                        private int type_a1;
                        private Object user_flame_info;
                        private Boolean verified;
                        private Boolean verified_mobile;
                        private String verified_reason;

                        @NoArgsConstructor
                        @Data
                        public static class AvatarJpgBean {
                            /**
                             * uri : mosaic-legacy/2e60f00001f61ba5f90c1
                             * url_list : ["http://p9-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~100x100.jpg","http://p3-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~100x100.jpg"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class AvatarLargeBean {
                            /**
                             * uri : mosaic-legacy/2e60f00001f61ba5f90c1
                             * url_list : ["http://p9-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~1080x1080.webp","http://p3-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~1080x1080.webp"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class AvatarMediumBean {
                            /**
                             * uri : mosaic-legacy/2e60f00001f61ba5f90c1
                             * url_list : ["http://p9-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~720x720.webp","http://p3-hs.byteimg.com/img/mosaic-legacy/2e60f00001f61ba5f90c1~720x720.webp"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class AvatarThumbBean {
                        }

                        @NoArgsConstructor
                        @Data
                        public static class CommerceInfoBean {
                        }

                        @NoArgsConstructor
                        @Data
                        public static class FlameExpInfoBean {
                            /**
                             * receive_flame_disabled : false
                             * send_flame_disabled : false
                             */

                            private Boolean receive_flame_disabled;
                            private Boolean send_flame_disabled;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class LevelInfoBean {
                            /**
                             * icon : {"uri":"hotsoon-resource/userlevel_hs_11.png","url_list":["http://p9-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_11.png","http://p3-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_11.png"]}
                             * level : 11
                             * schema_url : sslocal://webview?url=https%3A%2F%2Fhotsoon.snssdk.com%2Ffalcon%2Flive_inapp%2Fpage%2Fuser_level%2Findex.html&hide_more=1
                             */

                            private IconBean icon;
                            private int level;
                            private String schema_url;

                            @NoArgsConstructor
                            @Data
                            public static class IconBean {
                                /**
                                 * uri : hotsoon-resource/userlevel_hs_11.png
                                 * url_list : ["http://p9-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_11.png","http://p3-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_11.png"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }
                        }

                        @NoArgsConstructor
                        @Data
                        public static class PayGradeBean {
                            /**
                             * diamond_icon : {"uri":"12400003aba3dd42e213","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]}
                             * grade_banner : 7级可获房间展示升级通告
                             * grade_describe : 当前无等级，消费1钻石即可升级获勋章
                             * grade_icon_list : [{"icon":{"uri":"3b60000a6308f74aec4e","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image"]},"icon_diamond":0,"level":0,"level_str":"暂无"},{"icon":{"uri":"3b65000678af61a99a1b","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678af61a99a1b~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678af61a99a1b~tplv-obj.image"]},"icon_diamond":0,"level":0,"level_str":"Lv.0"},{"icon":{"uri":"3b620006b1e388185513","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b620006b1e388185513~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b620006b1e388185513~tplv-obj.image"]},"icon_diamond":1,"level":1,"level_str":"Lv.1"}]
                             * icon : {"uri":"f2100085e55a62833b1","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085e55a62833b1~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085e55a62833b1~tplv-obj.image"]}
                             * im_icon : {"uri":"2ea8000962099e965ff0","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image"]}
                             * level : 0
                             * live_icon : {"uri":"30ee0007ccef28b99639","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image"]}
                             * name : 暂无
                             * new_live_icon : {"uri":"78a10056e336cb6eb911","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image"]}
                             * new_nav_live_icon : null
                             * next_diamond : 1
                             * next_icon : {"uri":"30eb0000a12588d9bb3e","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a12588d9bb3e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a12588d9bb3e~tplv-obj.image"]}
                             * next_name : 树苗
                             * now_diamond : 0
                             * pay_diamond_bak : 0
                             * profile_dialog_bg : {"uri":"hotsoon-resource/user_level_1.1_3x.png","url_list":["http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image"]}
                             * profile_dialog_bg_back : {"uri":"hotsoon-resource/user_level_1.2_3x.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image"]}
                             * screen_chat_type : 1
                             * this_grade_max_diamond : 0
                             * this_grade_min_diamond : 0
                             * total_diamond_count : 4
                             * upgrade_need_consume : 1
                             */

                            private DiamondIconBean diamond_icon;
                            private String grade_banner;
                            private String grade_describe;
                            private IconBeanX icon;
                            private ImIconBean im_icon;
                            private int level;
                            private LiveIconBean live_icon;
                            private String name;
                            private NewLiveIconBean new_live_icon;
                            private Object new_nav_live_icon;
                            private int next_diamond;
                            private NextIconBean next_icon;
                            private String next_name;
                            private int now_diamond;
                            private int pay_diamond_bak;
                            private ProfileDialogBgBean profile_dialog_bg;
                            private ProfileDialogBgBackBean profile_dialog_bg_back;
                            private int screen_chat_type;
                            private int this_grade_max_diamond;
                            private int this_grade_min_diamond;
                            private int total_diamond_count;
                            private int upgrade_need_consume;
                            private List<GradeIconListBean> grade_icon_list;

                            @NoArgsConstructor
                            @Data
                            public static class DiamondIconBean {
                                /**
                                 * uri : 12400003aba3dd42e213
                                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class IconBeanX {
                                /**
                                 * uri : f2100085e55a62833b1
                                 * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085e55a62833b1~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085e55a62833b1~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class ImIconBean {
                                /**
                                 * uri : 2ea8000962099e965ff0
                                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class LiveIconBean {
                                /**
                                 * uri : 30ee0007ccef28b99639
                                 * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class NewLiveIconBean {
                                /**
                                 * uri : 78a10056e336cb6eb911
                                 * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class NextIconBean {
                                /**
                                 * uri : 30eb0000a12588d9bb3e
                                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a12588d9bb3e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a12588d9bb3e~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class ProfileDialogBgBean {
                                /**
                                 * uri : hotsoon-resource/user_level_1.1_3x.png
                                 * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class ProfileDialogBgBackBean {
                                /**
                                 * uri : hotsoon-resource/user_level_1.2_3x.png
                                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }

                            @NoArgsConstructor
                            @Data
                            public static class GradeIconListBean {
                                /**
                                 * icon : {"uri":"3b60000a6308f74aec4e","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image"]}
                                 * icon_diamond : 0
                                 * level : 0
                                 * level_str : 暂无
                                 */

                                private IconBeanXX icon;
                                private int icon_diamond;
                                private int level;
                                private String level_str;

                                @NoArgsConstructor
                                @Data
                                public static class IconBeanXX {
                                    /**
                                     * uri : 3b60000a6308f74aec4e
                                     * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image"]
                                     */

                                    private String uri;
                                    private List<String> url_list;
                                }
                            }
                        }
                    }


                    @NoArgsConstructor
                    @Data
                    public static class AtUser {

                        /**
                         * at_from : aweme_sync
                         * encrypt_user_id : MS4wLjABAAAACm9CH6gxyUf8LO5q-jbwVYiihs53QgDi_7_uW3Eq6uA
                         * end : 29
                         * start : 24
                         * user_id : 888026444866144
                         * user_id_str : 888026444866144
                         * user_type : 0
                         */

                        private String at_from;
                        private String encrypt_user_id;
                        private int end;
                        private int start;
                        private long user_id;
                        private String user_id_str;
                        private int user_type;
                    }
                }
            }
        }
    }

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class ExtraBean {
        /**
         * fatal_ids : []
         * has_more : true
         * now : 1599556589908
         * offset : 10
         * query : 十七
         * query_id : 0
         * req_id : 20200908171629010129021155008520F9
         * search_id : 20200908171629010129021155008520F9
         * total : 0
         */

        private Boolean has_more;
        private long now;
        private int offset;
        private String query;
        private int query_id;
        private String req_id;
        private String search_id;
        private int total;
        private java.util.List<?> fatal_ids;
    }
}

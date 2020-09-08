package com.huoshan.user.profile;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/08 20:51
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ProfileResponse {

    private DataBean data;
    private ExtraBeanX extra;
    private Integer status_code;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        private Integer account_type;
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
        private Integer birthday;
        private String birthday_description;
        private Boolean birthday_valid;
        private Boolean block_rpc_success;
        private Integer block_status;
        private Integer blocked_by_status;
        private String city;
        private String click_follow_fans_toast;
        private Integer cluster_follower_count;
        private Integer comment_restrict;
        private CommerceInfoBean commerce_info;
        private String constellation;
        private Integer disable_ichat;
        private String encrypted_id;
        private Integer exp;
        private Integer fan_ticket_count;
        private FavoriteCircleListBean favorite_circle_list;
        private Integer favorite_permission;
        private FlameExpInfoBean flame_exp_info;
        private FlameInfoBean flame_info;
        private Object flash_rank_detail;
        private Boolean fold_stranger_chat;
        private Integer follow_status;
        private Boolean force_follow_feed_time_order;
        private Integer gender;
        private Boolean has_circle_item;
        private Boolean hotsoon_verified;
        private String hotsoon_verified_reason;
        private Integer ichat_restrict_type;
        private Long id;
        private String id_str;
        private Integer income_share_percent;
        private Boolean is_city_near_by;
        private Boolean is_follower;
        private Boolean is_following;
        private Boolean is_money_tree_user;
        private Integer last_live_seconds_from_now;
        private Integer last_live_time;
        private Integer level;
        private LevelInfoBean level_info;
        private Object live_noble;
        private Boolean need_profile_guide;
        private Boolean need_remind;
        private String nickname;
        private String original_encrypted_id;
        private Long original_user_id;
        private PayGradeBeanXX pay_grade;
        private String pay_grade_detail_url;
        private Integer pay_scores;
        private String profile_guide_prompts;
        private String profile_location_edit;
        private Integer secret;
        private String share_desc;
        private String share_title;
        private String share_url;
        private Long short_id;
        private String short_id_str;
        private String signature;
        private StatsBean stats;
        private Integer total_fans_count;
        private ToutiaoInfoBean toutiao_info;
        private Integer type_a1;
        private UserCoverBean user_cover;
        private Object user_flame_info;
        private Boolean verified;
        private Boolean verified_mobile;
        private String verified_reason;
        private List<LatestRoomsBean> latest_rooms;
        private List<TopFansBean> top_fans;
        private List<TopFansWeeklyBean> top_fans_weekly;

        @NoArgsConstructor
        @Data
        public static class AvatarJpgBean {
            /**
             * uri : mosaic-legacy/1caf9000471232a5eaae5
             * url_list : ["http://p9-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~100x100.jpg","http://p1-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~100x100.jpg"]
             */

            private String uri;
            private List<String> url_list;
        }

        @NoArgsConstructor
        @Data
        public static class AvatarLargeBean {
            /**
             * uri : mosaic-legacy/1caf9000471232a5eaae5
             * url_list : ["http://p9-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~1080x1080.webp","http://p1-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~1080x1080.webp"]
             */

            private String uri;
            private List<String> url_list;
        }

        @NoArgsConstructor
        @Data
        public static class AvatarMediumBean {
            /**
             * uri : mosaic-legacy/1caf9000471232a5eaae5
             * url_list : ["http://p9-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~720x720.webp","http://p1-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~720x720.webp"]
             */

            private String uri;
            private List<String> url_list;
        }

        @NoArgsConstructor
        @Data
        public static class AvatarThumbBean {
            /**
             * uri : mosaic-legacy/1caf9000471232a5eaae5
             * url_list : ["http://p9-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~100x100.webp","http://p1-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~100x100.webp"]
             */

            private String uri;
            private List<String> url_list;
        }

        @NoArgsConstructor
        @Data
        public static class CommerceInfoBean {
            /**
             * ecommerce_shop : {"title":"TA的火山铺子","schema_url":"sslocal://webview?hide_more=1&url=https%3A%2F%2Fhotsoon.snssdk.com%2Ffalcon%2Flive_inapp%2Fpage%2Fguest_shop%2Findex.html%3Fuid%3D97867615298%26username%3DOne%25F0%259F%2592%259B%25E7%25BE%258E%25E9%25A3%259F","icon":{"url_list":["http://p3-hs.byteimg.com/obj/hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png","http://p1-hs.byteimg.com/obj/hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png"],"uri":"hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png"},"goods_count":57,"promotions_info":"立即购买"}
             */

            private EcommerceShopBean ecommerce_shop;

            @NoArgsConstructor
            @Data
            public static class EcommerceShopBean {
                /**
                 * title : TA的火山铺子
                 * schema_url : sslocal://webview?hide_more=1&url=https%3A%2F%2Fhotsoon.snssdk.com%2Ffalcon%2Flive_inapp%2Fpage%2Fguest_shop%2Findex.html%3Fuid%3D97867615298%26username%3DOne%25F0%259F%2592%259B%25E7%25BE%258E%25E9%25A3%259F
                 * icon : {"url_list":["http://p3-hs.byteimg.com/obj/hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png","http://p1-hs.byteimg.com/obj/hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png"],"uri":"hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png"}
                 * goods_count : 57
                 * promotions_info : 立即购买
                 */

                private String title;
                private String schema_url;
                private IconBean icon;
                private Integer goods_count;
                private String promotions_info;

                @NoArgsConstructor
                @Data
                public static class IconBean {
                    /**
                     * url_list : ["http://p3-hs.byteimg.com/obj/hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png","http://p1-hs.byteimg.com/obj/hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png"]
                     * uri : hotsoon-resource/hotsoon_user_profile_shop_icon_3x.png
                     */

                    private String uri;
                    private List<String> url_list;
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class FavoriteCircleListBean {
            /**
             * circle_list : null
             * total : 0
             */

            private Object circle_list;
            private Integer total;
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
        public static class FlameInfoBean {

            private String title;
            private String title_flame;
            private String description;
            private Integer flame_sum;
            private Integer fans_count;
            private String title_fans;
            private Object banner;
            private List<TopContributorsBean> top_contributors;

            @NoArgsConstructor
            @Data
            public static class TopContributorsBean {
                private Long id;
                private String id_str;
                private PackedUserBean packed_user;
                private Long short_id;
                private String nickname;
                private Integer gender;
                private String signature;
                private Boolean birthday_valid;
                private Integer birthday;
                private String birthday_description;
                private String constellation;
                private AvatarThumbBeanXX avatar_thumb;
                private AvatarMediumBeanXX avatar_medium;
                private AvatarLargeBeanXX avatar_large;
                private AvatarJpgBeanXX avatar_jpg;
                private Integer follow_status;
                private Integer block_status;
                private String city;
                private Integer level;
                private Integer fan_ticket_count;
                private Object top_fans;
                private Object top_fans_weekly;
                private Boolean allow_others_download_video;
                private Boolean need_profile_guide;
                private Boolean fold_stranger_chat;
                private Integer ichat_restrict_type;
                private Integer ichat_block_status;
                private Integer disable_ichat;
                private Boolean allow_strange_comment;
                private Boolean allow_unfollower_comment;
                private Integer comment_restrict;
                private Boolean hotsoon_verified;
                private String hotsoon_verified_reason;
                private Boolean verified;
                private String verified_reason;
                private Boolean allow_others_download_when_sharing_video;
                private PayGradeBeanX pay_grade;
                private Integer pay_scores;
                private Integer income_share_percent;
                private String balance;
                private String avatar_meta;
                private Integer type_a1;
                private Integer exp;
                private Boolean allow_be_located;
                private Boolean verified_mobile;
                private Integer enable_ichat_img;
                private Boolean is_follower;
                private Boolean is_following;
                private String bg_img_url;
                private String profile_guide_prompts;

                @NoArgsConstructor
                @Data
                public static class PackedUserBean {
                    private Integer account_type;
                    private Boolean allow_be_located;
                    private Boolean allow_others_download_video;
                    private Boolean allow_others_download_when_sharing_video;
                    private Boolean allow_show_follow_fans_list;
                    private Boolean allow_show_vcd_grant;
                    private Boolean allow_strange_comment;
                    private Boolean allow_unfollower_comment;
                    private AvatarJpgBeanX avatar_jpg;
                    private AvatarLargeBeanX avatar_large;
                    private AvatarMediumBeanX avatar_medium;
                    private AvatarThumbBeanX avatar_thumb;
                    private String bg_img_url;
                    private Integer birthday;
                    private String birthday_description;
                    private Boolean birthday_valid;
                    private Boolean block_rpc_success;
                    private Integer block_status;
                    private Integer blocked_by_status;
                    private String city;
                    private Integer comment_restrict;
                    private CommerceInfoBeanX commerce_info;
                    private String constellation;
                    private Integer disable_ichat;
                    private Integer enable_ichat_img;
                    private String encrypted_id;
                    private Integer exp;
                    private Integer fan_ticket_count;
                    private FlameExpInfoBean flame_exp_info;
                    private Object flash_rank_detail;
                    private Boolean fold_stranger_chat;
                    private Integer follow_status;
                    private Boolean force_follow_feed_time_order;
                    private Integer gender;
                    private Boolean has_circle_item;
                    private Boolean hotsoon_verified;
                    private String hotsoon_verified_reason;
                    private Integer ichat_restrict_type;
                    private Long id;
                    private String id_str;
                    private Integer income_share_percent;
                    private Boolean is_city_near_by;
                    private Boolean is_follower;
                    private Boolean is_following;
                    private Boolean is_money_tree_user;
                    private Integer level;
                    private Object live_noble;
                    private Boolean need_profile_guide;
                    private String nickname;
                    private String original_encrypted_id;
                    private Long original_user_id;
                    private PayGradeBean pay_grade;
                    private Integer pay_scores;
                    private Integer secret;
                    private Long short_id;
                    private String short_id_str;
                    private String signature;
                    private Integer type_a1;
                    private Object user_flame_info;
                    private Boolean verified;
                    private Boolean verified_mobile;
                    private String verified_reason;
                    private Boolean with_gossip_tab;

                    @NoArgsConstructor
                    @Data
                    public static class AvatarJpgBeanX {
                        /**
                         * uri : hotsoon-avatar/b2a3b11549c64b52aebad724382039a8
                         * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~100x100.jpg","http://p3-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~100x100.jpg"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class AvatarLargeBeanX {
                        /**
                         * uri : hotsoon-avatar/b2a3b11549c64b52aebad724382039a8
                         * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~1080x1080.webp","http://p3-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~1080x1080.webp"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class AvatarMediumBeanX {
                        /**
                         * uri : hotsoon-avatar/b2a3b11549c64b52aebad724382039a8
                         * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~720x720.webp","http://p3-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~720x720.webp"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class AvatarThumbBeanX {
                    }

                    @NoArgsConstructor
                    @Data
                    public static class CommerceInfoBeanX {
                    }

                    @NoArgsConstructor
                    @Data
                    public static class PayGradeBean {

                        private DiamondIconBean diamond_icon;
                        private String grade_banner;
                        private String grade_describe;
                        private IconBeanX icon;
                        private ImIconBean im_icon;
                        private ImIconWithLevelBean im_icon_with_level;
                        private Integer level;
                        private LiveIconBean live_icon;
                        private String name;
                        private NewImIconWithLevelBean new_im_icon_with_level;
                        private NewLiveIconBean new_live_icon;
                        private NewNavLiveIconBean new_nav_live_icon;
                        private Integer next_diamond;
                        private NextIconBean next_icon;
                        private String next_name;
                        private Integer now_diamond;
                        private Integer pay_diamond_bak;
                        private ProfileDialogBgBean profile_dialog_bg;
                        private ProfileDialogBgBackBean profile_dialog_bg_back;
                        private Integer screen_chat_type;
                        private Integer this_grade_max_diamond;
                        private Integer this_grade_min_diamond;
                        private Integer total_diamond_count;
                        private Integer upgrade_need_consume;
                        private List<GradeIconListBean> grade_icon_list;

                        @NoArgsConstructor
                        @Data
                        public static class DiamondIconBean {
                            /**
                             * uri : 12400003aba3dd42e213
                             * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class IconBeanX {
                            /**
                             * uri : 30eb0000a101d40eea0c
                             * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class ImIconBean {
                            /**
                             * uri : 2ea8000962099e965ff0
                             * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class ImIconWithLevelBean {
                            /**
                             * uri : 78a8004c1b5cfac8bc3b
                             * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5cfac8bc3b~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5cfac8bc3b~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class LiveIconBean {
                            /**
                             * uri : 30ee0007ccef28b99639
                             * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class NewImIconWithLevelBean {
                            /**
                             * uri : webcast/hotsoon_paygrade_new_icon_level_3.png
                             * url_list : ["http://p9-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_3.png","http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_3.png"]
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
                        public static class NewNavLiveIconBean {
                            /**
                             * uri : hotsoon-resource/new_nva_level_icon_3.png
                             * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_3.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_3.png~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class NextIconBean {
                            /**
                             * uri : 12400003aae89daccd69
                             * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class ProfileDialogBgBean {
                            /**
                             * uri : hotsoon-resource/user_level_1.1_3x.png
                             * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class ProfileDialogBgBackBean {
                            /**
                             * uri : hotsoon-resource/user_level_1.2_3x.png
                             * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }

                        @NoArgsConstructor
                        @Data
                        public static class GradeIconListBean {
                            /**
                             * icon : {"uri":"3b65000678eac77af1d9","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"]}
                             * icon_diamond : 7
                             * level : 2
                             * level_str : Lv.2
                             */

                            private IconBeanXX icon;
                            private Integer icon_diamond;
                            private Integer level;
                            private String level_str;

                            @NoArgsConstructor
                            @Data
                            public static class IconBeanXX {
                                /**
                                 * uri : 3b65000678eac77af1d9
                                 * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"]
                                 */

                                private String uri;
                                private List<String> url_list;
                            }
                        }
                    }
                }

                @NoArgsConstructor
                @Data
                public static class AvatarThumbBeanXX {
                    /**
                     * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~100x100.webp","http://p3-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~100x100.webp"]
                     * uri : hotsoon-avatar/b2a3b11549c64b52aebad724382039a8
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarMediumBeanXX {
                    /**
                     * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~720x720.webp","http://p3-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~720x720.webp"]
                     * uri : hotsoon-avatar/b2a3b11549c64b52aebad724382039a8
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarLargeBeanXX {
                    /**
                     * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~1080x1080.webp","http://p3-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~1080x1080.webp"]
                     * uri : hotsoon-avatar/b2a3b11549c64b52aebad724382039a8
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarJpgBeanXX {
                    /**
                     * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~100x100.jpg","http://p3-hs.byteimg.com/img/hotsoon-avatar/b2a3b11549c64b52aebad724382039a8~100x100.jpg"]
                     * uri : hotsoon-avatar/b2a3b11549c64b52aebad724382039a8
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class PayGradeBeanX {
                    private Integer total_diamond_count;
                    private DiamondIconBeanX diamond_icon;
                    private String name;
                    private IconBeanXXX icon;
                    private String next_name;
                    private Integer level;
                    private NextIconBeanX next_icon;
                    private Integer next_diamond;
                    private Integer now_diamond;
                    private Integer this_grade_min_diamond;
                    private Integer this_grade_max_diamond;
                    private Integer pay_diamond_bak;
                    private String grade_describe;
                    private Integer screen_chat_type;
                    private ImIconBeanX im_icon;
                    private ImIconWithLevelBeanX im_icon_with_level;
                    private LiveIconBeanX live_icon;
                    private NewImIconWithLevelBeanX new_im_icon_with_level;
                    private NewLiveIconBeanX new_live_icon;
                    private Integer upgrade_need_consume;
                    private String grade_banner;
                    private ProfileDialogBgBeanX profile_dialog_bg;
                    private ProfileDialogBgBackBeanX profile_dialog_bg_back;
                    private List<GradeIconListBeanX> grade_icon_list;

                    @NoArgsConstructor
                    @Data
                    public static class DiamondIconBeanX {
                        /**
                         * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]
                         * uri : 12400003aba3dd42e213
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class IconBeanXXX {
                        /**
                         * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image"]
                         * uri : 30eb0000a101d40eea0c
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NextIconBeanX {
                        /**
                         * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image"]
                         * uri : 12400003aae89daccd69
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ImIconBeanX {
                        /**
                         * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image"]
                         * uri : 2ea8000962099e965ff0
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ImIconWithLevelBeanX {
                        /**
                         * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5cfac8bc3b~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5cfac8bc3b~tplv-obj.image"]
                         * uri : 78a8004c1b5cfac8bc3b
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class LiveIconBeanX {
                        /**
                         * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image"]
                         * uri : 30ee0007ccef28b99639
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NewImIconWithLevelBeanX {
                        /**
                         * url_list : ["http://p9-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_3.png","http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_3.png"]
                         * uri : webcast/hotsoon_paygrade_new_icon_level_3.png
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NewLiveIconBeanX {
                        /**
                         * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image"]
                         * uri : 78a10056e336cb6eb911
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ProfileDialogBgBeanX {
                        /**
                         * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image"]
                         * uri : hotsoon-resource/user_level_1.1_3x.png
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ProfileDialogBgBackBeanX {
                        /**
                         * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image"]
                         * uri : hotsoon-resource/user_level_1.2_3x.png
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class GradeIconListBeanX {
                        /**
                         * icon : {"url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"],"uri":"3b65000678eac77af1d9"}
                         * icon_diamond : 7
                         * level : 2
                         * level_str : Lv.2
                         */

                        private IconBeanXXXX icon;
                        private Integer icon_diamond;
                        private Integer level;
                        private String level_str;

                        @NoArgsConstructor
                        @Data
                        public static class IconBeanXXXX {
                            /**
                             * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"]
                             * uri : 3b65000678eac77af1d9
                             */

                            private String uri;
                            private List<String> url_list;
                        }
                    }
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class LevelInfoBean {
            /**
             * icon : {"uri":"hotsoon-resource/userlevel_hs_10.png","url_list":["http://p9-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_10.png","http://p1-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_10.png"]}
             * level : 10
             * schema_url : sslocal://webview?url=https%3A%2F%2Fhotsoon.snssdk.com%2Ffalcon%2Flive_inapp%2Fpage%2Fuser_level%2Findex.html&hide_more=1
             */

            private IconBeanXXXXX icon;
            private Integer level;
            private String schema_url;

            @NoArgsConstructor
            @Data
            public static class IconBeanXXXXX {
                /**
                 * uri : hotsoon-resource/userlevel_hs_10.png
                 * url_list : ["http://p9-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_10.png","http://p1-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_10.png"]
                 */

                private String uri;
                private List<String> url_list;
            }
        }

        @NoArgsConstructor
        @Data
        public static class PayGradeBeanXX {
            /**
             * diamond_icon : {"uri":"12400003aba3dd42e213","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]}
             * grade_banner : 28级可开启豪华入场
             * grade_describe : 距升级还需消费2钻
             * grade_icon_list : [{"icon":{"uri":"3b60000a640891b867f1","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]},"icon_diamond":960,"level":15,"level_str":"Lv.15"},{"icon":{"uri":"3b60000a640891b867f1","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]},"icon_diamond":1300,"level":16,"level_str":"Lv.16"},{"icon":{"uri":"3b610006ba95674b9685","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b610006ba95674b9685~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b610006ba95674b9685~tplv-obj.image"]},"icon_diamond":1700,"level":17,"level_str":"Lv.17"}]
             * icon : {"uri":"123f0003aa5848faf9bf","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image"]}
             * im_icon : {"uri":"12400003f44d82c0b065","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image"]}
             * im_icon_with_level : {"uri":"78a4006ffdb7b710867a","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image"]}
             * level : 16
             * live_icon : {"uri":"12400003f44ccd336efa","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image"]}
             * name : 树叶
             * new_im_icon_with_level : {"uri":"webcast/hotsoon_paygrade_new_icon_level_16.png","url_list":["http://p9-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png","http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png"]}
             * new_live_icon : {"uri":"78a10056e3395911c1e1","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image"]}
             * new_nav_live_icon : {"uri":"hotsoon-resource/new_nva_level_icon_16.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image"]}
             * next_diamond : 3800
             * next_icon : {"uri":"f2100085ca16b81ed6a","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image"]}
             * next_name : 星星
             * now_diamond : 1698
             * pay_diamond_bak : 0
             * profile_dialog_bg : {"uri":"hotsoon-resource/user_level_2.1_3x.png","url_list":["http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image"]}
             * profile_dialog_bg_back : {"uri":"hotsoon-resource/user_level_2.2_3x.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image"]}
             * screen_chat_type : 2
             * this_grade_max_diamond : 1699
             * this_grade_min_diamond : 1300
             * total_diamond_count : 1954
             * upgrade_need_consume : 2
             */

            private DiamondIconBeanXX diamond_icon;
            private String grade_banner;
            private String grade_describe;
            private IconBeanXXXXXX icon;
            private ImIconBeanXX im_icon;
            private ImIconWithLevelBeanXX im_icon_with_level;
            private Integer level;
            private LiveIconBeanXX live_icon;
            private String name;
            private NewImIconWithLevelBeanXX new_im_icon_with_level;
            private NewLiveIconBeanXX new_live_icon;
            private NewNavLiveIconBeanX new_nav_live_icon;
            private Integer next_diamond;
            private NextIconBeanXX next_icon;
            private String next_name;
            private Integer now_diamond;
            private Integer pay_diamond_bak;
            private ProfileDialogBgBeanXX profile_dialog_bg;
            private ProfileDialogBgBackBeanXX profile_dialog_bg_back;
            private Integer screen_chat_type;
            private Integer this_grade_max_diamond;
            private Integer this_grade_min_diamond;
            private Integer total_diamond_count;
            private Integer upgrade_need_consume;
            private List<GradeIconListBeanXX> grade_icon_list;

            @NoArgsConstructor
            @Data
            public static class DiamondIconBeanXX {
                /**
                 * uri : 12400003aba3dd42e213
                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class IconBeanXXXXXX {
                /**
                 * uri : 123f0003aa5848faf9bf
                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class ImIconBeanXX {
                /**
                 * uri : 12400003f44d82c0b065
                 * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class ImIconWithLevelBeanXX {
                /**
                 * uri : 78a4006ffdb7b710867a
                 * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class LiveIconBeanXX {
                /**
                 * uri : 12400003f44ccd336efa
                 * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class NewImIconWithLevelBeanXX {
                /**
                 * uri : webcast/hotsoon_paygrade_new_icon_level_16.png
                 * url_list : ["http://p9-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png","http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class NewLiveIconBeanXX {
                /**
                 * uri : 78a10056e3395911c1e1
                 * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class NewNavLiveIconBeanX {
                /**
                 * uri : hotsoon-resource/new_nva_level_icon_16.png
                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class NextIconBeanXX {
                /**
                 * uri : f2100085ca16b81ed6a
                 * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class ProfileDialogBgBeanXX {
                /**
                 * uri : hotsoon-resource/user_level_2.1_3x.png
                 * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class ProfileDialogBgBackBeanXX {
                /**
                 * uri : hotsoon-resource/user_level_2.2_3x.png
                 * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class GradeIconListBeanXX {
                /**
                 * icon : {"uri":"3b60000a640891b867f1","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]}
                 * icon_diamond : 960
                 * level : 15
                 * level_str : Lv.15
                 */

                private IconBeanXXXXXXX icon;
                private Integer icon_diamond;
                private Integer level;
                private String level_str;

                @NoArgsConstructor
                @Data
                public static class IconBeanXXXXXXX {
                    /**
                     * uri : 3b60000a640891b867f1
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class StatsBean {
            /**
             * id : 97867615298
             * id_str : 97867615298
             * following_count : 110
             * follower_count : 7825514
             * record_count : 115
             * total_duration : 0
             * daily_fan_ticket_count : 0
             * daily_income : 0
             * item_count : 515
             * favorite_item_count : 1508
             * diamond_count : 1698
             * diamond_consumed_count : 1698
             * tuwen_item_count : 0
             * circle_item_count : 0
             */

            private Long id;
            private String id_str;
            private Integer following_count;
            private Integer follower_count;
            private Integer record_count;
            private Integer total_duration;
            private Integer daily_fan_ticket_count;
            private Integer daily_income;
            private Integer item_count;
            private Integer favorite_item_count;
            private Integer diamond_count;
            private Integer diamond_consumed_count;
            private Integer tuwen_item_count;
            private Integer circle_item_count;
        }

        @NoArgsConstructor
        @Data
        public static class ToutiaoInfoBean {
            /**
             * description : 头条号
             * schema_url : sslocal://ttopen?android_pkg_name=com.ss.android.article.news&app_name=%E4%BB%8A%E6%97%A5%E5%A4%B4%E6%9D%A1&android_open_schema=snssdk143%3A%2F%2Fprofile%3Fuid%3D105179397044&wap_url=http%3A%2F%2Fm.toutiao.com%2Fprofile%2F105179397044%2F
             * type : 2
             */

            private String description;
            private String schema_url;
            private Integer type;
        }

        @NoArgsConstructor
        @Data
        public static class UserCoverBean {
            /**
             * uri : hotsoon-resource/default_cover_image.png
             * url_list : ["http://p9-hs.byteimg.com/img/hotsoon-resource/default_cover_image.png~1280x720.webp","http://p3-hs.byteimg.com/img/hotsoon-resource/default_cover_image.png~1280x720.webp"]
             */

            private String uri;
            private List<String> url_list;
        }

        @NoArgsConstructor
        @Data
        public static class LatestRoomsBean {
            private String anchor_share_text;
            private Integer cell_style;
            private Integer client_version;
            private String common_label_list;
            private CoverBean cover;
            private Integer create_time;
            private Object dynamic_cover;
            private Object dynamic_cover_low;
            private Boolean enable_room_perspective;
            private Integer finish_time;
            private Long id;
            private String id_str;
            private Integer layout;
            private Integer linkmic_layout;
            private Integer live_id;
            private Boolean live_type_normal;
            private Integer luckymoney_num;
            private Integer mosaic_status;
            private Integer os_type;
            private OwnerBean owner;
            private Long owner_user_id;
            private RoomAuthBean room_auth;
            private String share_url;
            private StatsBeanX stats;
            private Integer status;
            private Long stream_id;
            private String stream_id_str;
            private StreamUrlBean stream_url;
            private String title;
            private Integer user_count;
            private String user_share_text;
            private Boolean with_linkmic;

            @NoArgsConstructor
            @Data
            public static class CoverBean {
                /**
                 * height : 650
                 * uri : webcast/6869733454481918733
                 * url_list : ["http://p1-hs.byteimg.com/obj/webcast/6869733454481918733","http://p3-hs.byteimg.com/obj/webcast/6869733454481918733","http://p3-hs.byteimg.com/obj/webcast/6869733454481918733"]
                 * width : 650
                 */

                private Integer height;
                private String uri;
                private Integer width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class OwnerBean {
                private Integer account_type;
                private Boolean allow_be_located;
                private Boolean allow_others_download_video;
                private Boolean allow_others_download_when_sharing_video;
                private Boolean allow_show_follow_fans_list;
                private Boolean allow_show_vcd_grant;
                private Boolean allow_strange_comment;
                private Boolean allow_unfollower_comment;
                private AvatarJpgBeanXXX avatar_jpg;
                private AvatarLargeBeanXXX avatar_large;
                private AvatarMediumBeanXXX avatar_medium;
                private AvatarThumbBeanXXX avatar_thumb;
                private String bg_img_url;
                private Integer birthday;
                private String birthday_description;
                private Boolean birthday_valid;
                private Boolean block_rpc_success;
                private Integer block_status;
                private Integer blocked_by_status;
                private String city;
                private Integer comment_restrict;
                private CommerceInfoBeanXX commerce_info;
                private String constellation;
                private Integer disable_ichat;
                private String encrypted_id;
                private Integer exp;
                private Integer fan_ticket_count;
                private Object flame_exp_info;
                private Object flash_rank_detail;
                private Boolean fold_stranger_chat;
                private Integer follow_status;
                private Boolean force_follow_feed_time_order;
                private Integer gender;
                private Boolean has_circle_item;
                private Boolean hotsoon_verified;
                private String hotsoon_verified_reason;
                private Integer ichat_restrict_type;
                private Long id;
                private String id_str;
                private Integer income_share_percent;
                private Boolean is_city_near_by;
                private Boolean is_follower;
                private Boolean is_following;
                private Boolean is_money_tree_user;
                private Integer level;
                private Object live_noble;
                private Boolean need_profile_guide;
                private String nickname;
                private String original_encrypted_id;
                private Long original_user_id;
                private PayGradeBeanXXX pay_grade;
                private Integer pay_scores;
                private String profile_guide_prompts;
                private Integer secret;
                private Long short_id;
                private String short_id_str;
                private String signature;
                private StatsBean stats;
                private Integer type_a1;
                private Object user_flame_info;
                private Boolean verified;
                private Boolean verified_mobile;
                private String verified_reason;

                @NoArgsConstructor
                @Data
                public static class AvatarJpgBeanXXX {
                    /**
                     * uri : mosaic-legacy/1caf9000471232a5eaae5
                     * url_list : ["http://p3-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~100x100.jpg","http://p1-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~100x100.jpg"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarLargeBeanXXX {
                    /**
                     * uri : mosaic-legacy/1caf9000471232a5eaae5
                     * url_list : ["http://p3-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~1080x1080.webp","http://p1-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~1080x1080.webp"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarMediumBeanXXX {
                    /**
                     * uri : mosaic-legacy/1caf9000471232a5eaae5
                     * url_list : ["http://p3-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~720x720.webp","http://p1-hs.byteimg.com/img/mosaic-legacy/1caf9000471232a5eaae5~720x720.webp"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarThumbBeanXXX {
                }

                @NoArgsConstructor
                @Data
                public static class CommerceInfoBeanXX {
                }

                @NoArgsConstructor
                @Data
                public static class PayGradeBeanXXX {
                    /**
                     * diamond_icon : {"uri":"12400003aba3dd42e213","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]}
                     * grade_banner : 28级可开启豪华入场
                     * grade_describe : 距升级还需消费2钻
                     * grade_icon_list : [{"icon":{"uri":"3b60000a640891b867f1","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]},"icon_diamond":960,"level":15,"level_str":"Lv.15"},{"icon":{"uri":"3b60000a640891b867f1","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]},"icon_diamond":1300,"level":16,"level_str":"Lv.16"},{"icon":{"uri":"3b610006ba95674b9685","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b610006ba95674b9685~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b610006ba95674b9685~tplv-obj.image"]},"icon_diamond":1700,"level":17,"level_str":"Lv.17"}]
                     * icon : {"uri":"123f0003aa5848faf9bf","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image"]}
                     * im_icon : {"uri":"12400003f44d82c0b065","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image"]}
                     * im_icon_with_level : {"uri":"78a4006ffdb7b710867a","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image"]}
                     * level : 16
                     * live_icon : {"uri":"12400003f44ccd336efa","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image"]}
                     * name : 树叶
                     * new_im_icon_with_level : {"uri":"webcast/hotsoon_paygrade_new_icon_level_16.png","url_list":["http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png","http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png"]}
                     * new_live_icon : {"uri":"78a10056e3395911c1e1","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image"]}
                     * new_nav_live_icon : {"uri":"hotsoon-resource/new_nva_level_icon_16.png","url_list":["http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image"]}
                     * next_diamond : 3800
                     * next_icon : {"uri":"f2100085ca16b81ed6a","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image"]}
                     * next_name : 星星
                     * now_diamond : 1698
                     * pay_diamond_bak : 0
                     * profile_dialog_bg : {"uri":"hotsoon-resource/user_level_2.1_3x.png","url_list":["http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image"]}
                     * profile_dialog_bg_back : {"uri":"hotsoon-resource/user_level_2.2_3x.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image"]}
                     * screen_chat_type : 2
                     * this_grade_max_diamond : 1699
                     * this_grade_min_diamond : 1300
                     * total_diamond_count : 1954
                     * upgrade_need_consume : 2
                     */

                    private DiamondIconBeanXXX diamond_icon;
                    private String grade_banner;
                    private String grade_describe;
                    private IconBeanXXXXXXXX icon;
                    private ImIconBeanXXX im_icon;
                    private ImIconWithLevelBeanXXX im_icon_with_level;
                    private Integer level;
                    private LiveIconBeanXXX live_icon;
                    private String name;
                    private NewImIconWithLevelBeanXXX new_im_icon_with_level;
                    private NewLiveIconBeanXXX new_live_icon;
                    private NewNavLiveIconBeanXX new_nav_live_icon;
                    private Integer next_diamond;
                    private NextIconBeanXXX next_icon;
                    private String next_name;
                    private Integer now_diamond;
                    private Integer pay_diamond_bak;
                    private ProfileDialogBgBeanXXX profile_dialog_bg;
                    private ProfileDialogBgBackBeanXXX profile_dialog_bg_back;
                    private Integer screen_chat_type;
                    private Integer this_grade_max_diamond;
                    private Integer this_grade_min_diamond;
                    private Integer total_diamond_count;
                    private Integer upgrade_need_consume;
                    private List<GradeIconListBeanXXX> grade_icon_list;

                    @NoArgsConstructor
                    @Data
                    public static class DiamondIconBeanXXX {
                        /**
                         * uri : 12400003aba3dd42e213
                         * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class IconBeanXXXXXXXX {
                        /**
                         * uri : 123f0003aa5848faf9bf
                         * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ImIconBeanXXX {
                        /**
                         * uri : 12400003f44d82c0b065
                         * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ImIconWithLevelBeanXXX {
                        /**
                         * uri : 78a4006ffdb7b710867a
                         * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a4006ffdb7b710867a~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class LiveIconBeanXXX {
                        /**
                         * uri : 12400003f44ccd336efa
                         * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NewImIconWithLevelBeanXXX {
                        /**
                         * uri : webcast/hotsoon_paygrade_new_icon_level_16.png
                         * url_list : ["http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png","http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_16.png"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NewLiveIconBeanXXX {
                        /**
                         * uri : 78a10056e3395911c1e1
                         * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NewNavLiveIconBeanXX {
                        /**
                         * uri : hotsoon-resource/new_nva_level_icon_16.png
                         * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_16.png~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NextIconBeanXXX {
                        /**
                         * uri : f2100085ca16b81ed6a
                         * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ProfileDialogBgBeanXXX {
                        /**
                         * uri : hotsoon-resource/user_level_2.1_3x.png
                         * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class ProfileDialogBgBackBeanXXX {
                        /**
                         * uri : hotsoon-resource/user_level_2.2_3x.png
                         * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class GradeIconListBeanXXX {
                        /**
                         * icon : {"uri":"3b60000a640891b867f1","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]}
                         * icon_diamond : 960
                         * level : 15
                         * level_str : Lv.15
                         */

                        private IconBeanXXXXXXXXX icon;
                        private Integer icon_diamond;
                        private Integer level;
                        private String level_str;

                        @NoArgsConstructor
                        @Data
                        public static class IconBeanXXXXXXXXX {
                            /**
                             * uri : 3b60000a640891b867f1
                             * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]
                             */

                            private String uri;
                            private List<String> url_list;
                        }
                    }
                }
            }

            @NoArgsConstructor
            @Data
            public static class RoomAuthBean {
                /**
                 * Chat : true
                 * Danmaku : true
                 * Digg : true
                 * Gift : true
                 * LuckyMoney : true
                 * RoomContributor : true
                 */

                private Boolean Chat;
                private Boolean Danmaku;
                private Boolean Digg;
                private Boolean Gift;
                private Boolean LuckyMoney;
                private Boolean RoomContributor;
            }

            @NoArgsConstructor
            @Data
            public static class StatsBeanX {
                /**
                 * fan_ticket : 0
                 * follow_count : 41
                 * gift_uv_count : 17
                 * id : 6869737171042568967
                 * id_str : 6869737171042568967
                 * money : 0
                 * total_user : 24252
                 * user_count_composition : {"city":0.001237266465954551,"video_detail":0.010393038314018228}
                 */

                private Integer fan_ticket;
                private Integer follow_count;
                private Integer gift_uv_count;
                private Long id;
                private String id_str;
                private Integer money;
                private Integer total_user;
                private UserCountCompositionBean user_count_composition;

                @NoArgsConstructor
                @Data
                public static class UserCountCompositionBean {
                    /**
                     * city : 0.001237266465954551
                     * video_detail : 0.010393038314018228
                     */

                    private double city;
                    private double video_detail;
                }
            }

            @NoArgsConstructor
            @Data
            public static class StreamUrlBean {
                /**
                 * candidate_resolution : []
                 * default_resolution : FULL_HD1
                 * extra : {"anchor_interact_profile":0,"audience_interact_profile":0,"default_bitrate":800,"fps":15,"height":1280,"max_bitrate":1333,"min_bitrate":512,"width":720}
                 * flv_pull_url : {}
                 * id : 107339638649389522
                 * id_str : 107339638649389522
                 * provider : 1
                 * resolution_name : {"FULL_HD1":"超清","HD1":"高清","SD1":"标清","SD2":"标清"}
                 * rtmp_pull_url : http://pull-flv-f6.douyincdn.com/stagereplay/stream-107339638649389522.flv
                 */

                private String default_resolution;
                private ExtraBean extra;
                private FlvPullUrlBean flv_pull_url;
                private Long id;
                private String id_str;
                private Integer provider;
                private ResolutionNameBean resolution_name;
                private String rtmp_pull_url;
                private List<?> candidate_resolution;

                @NoArgsConstructor
                @Data
                public static class ExtraBean {
                }

                @NoArgsConstructor
                @Data
                public static class FlvPullUrlBean {
                }

                @NoArgsConstructor
                @Data
                public static class ResolutionNameBean {
                    /**
                     * FULL_HD1 : 超清
                     * HD1 : 高清
                     * SD1 : 标清
                     * SD2 : 标清
                     */

                    private String FULL_HD1;
                    private String HD1;
                    private String SD1;
                    private String SD2;
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class TopFansBean {

            private Integer account_type;
            private Boolean allow_be_located;
            private Boolean allow_others_download_video;
            private Boolean allow_others_download_when_sharing_video;
            private Boolean allow_show_follow_fans_list;
            private Boolean allow_show_vcd_grant;
            private Boolean allow_strange_comment;
            private Boolean allow_unfollower_comment;
            private AvatarJpgBeanXXXX avatar_jpg;
            private AvatarLargeBeanXXXX avatar_large;
            private AvatarMediumBeanXXXX avatar_medium;
            private AvatarThumbBeanXXXX avatar_thumb;
            private String bg_img_url;
            private Integer birthday;
            private String birthday_description;
            private Boolean birthday_valid;
            private Boolean block_rpc_success;
            private Integer block_status;
            private Integer blocked_by_status;
            private String city;
            private Integer comment_restrict;
            private CommerceInfoBeanXXX commerce_info;
            private String constellation;
            private Integer disable_ichat;
            private String encrypted_id;
            private Integer exp;
            private Integer fan_ticket_count;
            private FlameExpInfoBean flame_exp_info;
            private Object flash_rank_detail;
            private Boolean fold_stranger_chat;
            private Integer follow_status;
            private Boolean force_follow_feed_time_order;
            private Integer gender;
            private Boolean has_circle_item;
            private Boolean hotsoon_verified;
            private String hotsoon_verified_reason;
            private Integer ichat_restrict_type;
            private Long id;
            private String id_str;
            private Integer income_share_percent;
            private Boolean is_city_near_by;
            private Boolean is_follower;
            private Boolean is_following;
            private Boolean is_money_tree_user;
            private Integer level;
            private LevelInfoBeanX level_info;
            private Object live_noble;
            private Boolean need_profile_guide;
            private String nickname;
            private String original_encrypted_id;
            private Long original_user_id;
            private PayGradeBeanXXXX pay_grade;
            private Integer pay_scores;
            private String profile_guide_prompts;
            private Integer secret;
            private String share_desc;
            private String share_title;
            private String share_url;
            private Long short_id;
            private String short_id_str;
            private String signature;
            private StatsBean stats;
            private Integer type_a1;
            private Object user_flame_info;
            private Boolean verified;
            private Boolean verified_mobile;
            private String verified_reason;
            private EnterpriseInfoBean enterprise_info;
            private HeaderImageBean header_image;

            @NoArgsConstructor
            @Data
            public static class AvatarJpgBeanXXXX {
                /**
                 * uri : mosaic-legacy/31b4e000020c149bb3ef7
                 * url_list : ["http://p1-hs.byteimg.com/img/mosaic-legacy/31b4e000020c149bb3ef7~100x100.jpg","http://p3-hs.byteimg.com/img/mosaic-legacy/31b4e000020c149bb3ef7~100x100.jpg"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarLargeBeanXXXX {
                /**
                 * uri : mosaic-legacy/31b4e000020c149bb3ef7
                 * url_list : ["http://p1-hs.byteimg.com/img/mosaic-legacy/31b4e000020c149bb3ef7~1080x1080.webp","http://p3-hs.byteimg.com/img/mosaic-legacy/31b4e000020c149bb3ef7~1080x1080.webp"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarMediumBeanXXXX {
                /**
                 * uri : mosaic-legacy/31b4e000020c149bb3ef7
                 * url_list : ["http://p1-hs.byteimg.com/img/mosaic-legacy/31b4e000020c149bb3ef7~720x720.webp","http://p3-hs.byteimg.com/img/mosaic-legacy/31b4e000020c149bb3ef7~720x720.webp"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarThumbBeanXXXX {
            }

            @NoArgsConstructor
            @Data
            public static class CommerceInfoBeanXXX {
            }

            @NoArgsConstructor
            @Data
            public static class LevelInfoBeanX {
                /**
                 * icon : {"uri":"hotsoon-resource/userlevel_hs_3.png","url_list":["http://p1-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_3.png","http://p3-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_3.png"]}
                 * level : 3
                 * schema_url : sslocal://webview?url=https%3A%2F%2Fhotsoon.snssdk.com%2Ffalcon%2Flive_inapp%2Fpage%2Fuser_level%2Findex.html&hide_more=1
                 */

                private IconBeanXXXXXXXXXX icon;
                private Integer level;
                private String schema_url;

                @NoArgsConstructor
                @Data
                public static class IconBeanXXXXXXXXXX {
                    /**
                     * uri : hotsoon-resource/userlevel_hs_3.png
                     * url_list : ["http://p1-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_3.png","http://p3-hs.byteimg.com/obj/hotsoon-resource/userlevel_hs_3.png"]
                     */

                    private String uri;
                    private List<String> url_list;
                }
            }

            @NoArgsConstructor
            @Data
            public static class PayGradeBeanXXXX {
                /**
                 * diamond_icon : {"uri":"12400003aba3dd42e213","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]}
                 * grade_banner : 28级可开启豪华入场
                 * grade_describe : 距升级还需消费331钻
                 * grade_icon_list : [{"icon":{"uri":"3b60000a640891b867f1","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]},"icon_diamond":1300,"level":16,"level_str":"Lv.16"},{"icon":{"uri":"3b60000a640891b867f1","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]},"icon_diamond":1700,"level":17,"level_str":"Lv.17"},{"icon":{"uri":"3b610006ba95674b9685","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b610006ba95674b9685~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b610006ba95674b9685~tplv-obj.image"]},"icon_diamond":2200,"level":18,"level_str":"Lv.18"}]
                 * icon : {"uri":"123f0003aa5848faf9bf","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image"]}
                 * im_icon : {"uri":"12400003f44d82c0b065","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image"]}
                 * im_icon_with_level : {"uri":"78a8004c1b5daeee8ace","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5daeee8ace~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5daeee8ace~tplv-obj.image"]}
                 * level : 17
                 * live_icon : {"uri":"12400003f44ccd336efa","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image"]}
                 * name : 树叶
                 * new_im_icon_with_level : {"uri":"webcast/hotsoon_paygrade_new_icon_level_17.png","url_list":["http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_17.png","http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_17.png"]}
                 * new_live_icon : {"uri":"78a10056e3395911c1e1","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image"]}
                 * new_nav_live_icon : {"uri":"hotsoon-resource/new_nva_level_icon_17.png","url_list":["http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_17.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_17.png~tplv-obj.image"]}
                 * next_diamond : 3800
                 * next_icon : {"uri":"f2100085ca16b81ed6a","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image"]}
                 * next_name : 星星
                 * now_diamond : 1869
                 * pay_diamond_bak : 0
                 * profile_dialog_bg : {"uri":"hotsoon-resource/user_level_2.1_3x.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image"]}
                 * profile_dialog_bg_back : {"uri":"hotsoon-resource/user_level_2.2_3x.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image"]}
                 * screen_chat_type : 2
                 * this_grade_max_diamond : 2199
                 * this_grade_min_diamond : 1700
                 * total_diamond_count : 1949
                 * upgrade_need_consume : 331
                 */

                private DiamondIconBeanXXXX diamond_icon;
                private String grade_banner;
                private String grade_describe;
                private IconBeanXXXXXXXXXXX icon;
                private ImIconBeanXXXX im_icon;
                private ImIconWithLevelBeanXXXX im_icon_with_level;
                private Integer level;
                private LiveIconBeanXXXX live_icon;
                private String name;
                private NewImIconWithLevelBeanXXXX new_im_icon_with_level;
                private NewLiveIconBeanXXXX new_live_icon;
                private NewNavLiveIconBeanXXX new_nav_live_icon;
                private Integer next_diamond;
                private NextIconBeanXXXX next_icon;
                private String next_name;
                private Integer now_diamond;
                private Integer pay_diamond_bak;
                private ProfileDialogBgBeanXXXX profile_dialog_bg;
                private ProfileDialogBgBackBeanXXXX profile_dialog_bg_back;
                private Integer screen_chat_type;
                private Integer this_grade_max_diamond;
                private Integer this_grade_min_diamond;
                private Integer total_diamond_count;
                private Integer upgrade_need_consume;
                private List<GradeIconListBeanXXXX> grade_icon_list;

                @NoArgsConstructor
                @Data
                public static class DiamondIconBeanXXXX {
                    /**
                     * uri : 12400003aba3dd42e213
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class IconBeanXXXXXXXXXXX {
                    /**
                     * uri : 123f0003aa5848faf9bf
                     * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/123f0003aa5848faf9bf~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ImIconBeanXXXX {
                    /**
                     * uri : 12400003f44d82c0b065
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44d82c0b065~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ImIconWithLevelBeanXXXX {
                    /**
                     * uri : 78a8004c1b5daeee8ace
                     * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5daeee8ace~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a8004c1b5daeee8ace~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class LiveIconBeanXXXX {
                    /**
                     * uri : 12400003f44ccd336efa
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003f44ccd336efa~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NewImIconWithLevelBeanXXXX {
                    /**
                     * uri : webcast/hotsoon_paygrade_new_icon_level_17.png
                     * url_list : ["http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_17.png","http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_17.png"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NewLiveIconBeanXXXX {
                    /**
                     * uri : 78a10056e3395911c1e1
                     * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e3395911c1e1~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NewNavLiveIconBeanXXX {
                    /**
                     * uri : hotsoon-resource/new_nva_level_icon_17.png
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_17.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_17.png~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NextIconBeanXXXX {
                    /**
                     * uri : f2100085ca16b81ed6a
                     * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/f2100085ca16b81ed6a~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ProfileDialogBgBeanXXXX {
                    /**
                     * uri : hotsoon-resource/user_level_2.1_3x.png
                     * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.1_3x.png~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ProfileDialogBgBackBeanXXXX {
                    /**
                     * uri : hotsoon-resource/user_level_2.2_3x.png
                     * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_2.2_3x.png~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class GradeIconListBeanXXXX {
                    /**
                     * icon : {"uri":"3b60000a640891b867f1","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]}
                     * icon_diamond : 1300
                     * level : 16
                     * level_str : Lv.16
                     */

                    private IconBeanXXXXXXXXXXXX icon;
                    private Integer icon_diamond;
                    private Integer level;
                    private String level_str;

                    @NoArgsConstructor
                    @Data
                    public static class IconBeanXXXXXXXXXXXX {
                        /**
                         * uri : 3b60000a640891b867f1
                         * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a640891b867f1~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }
                }
            }

            @NoArgsConstructor
            @Data
            public static class EnterpriseInfoBean {
                /**
                 * name :
                 * sign_up_link : sslocal://webview?url=https%3A%2F%2Fhotsoon.snssdk.com%2Fmagic%2Fruntime%2F%3Fid%3D1887&hide_more=1
                 * type : 3
                 */

                private String name;
                private String sign_up_link;
                private Integer type;
            }

            @NoArgsConstructor
            @Data
            public static class HeaderImageBean {
                /**
                 * uri : ies.fe.mis/64b163deb863f92f78c318ce70d2b33b.png
                 * url_list : ["http://p1-hs.byteimg.com/img/ies.fe.mis/64b163deb863f92f78c318ce70d2b33b.png~1280x720.webp","http://p3-hs.byteimg.com/img/ies.fe.mis/64b163deb863f92f78c318ce70d2b33b.png~1280x720.webp"]
                 */

                private String uri;
                private List<String> url_list;
            }
        }

        @NoArgsConstructor
        @Data
        public static class TopFansWeeklyBean {
            private Integer account_type;
            private Boolean allow_be_located;
            private Boolean allow_others_download_video;
            private Boolean allow_others_download_when_sharing_video;
            private Boolean allow_show_follow_fans_list;
            private Boolean allow_show_vcd_grant;
            private Boolean allow_strange_comment;
            private Boolean allow_unfollower_comment;
            private AvatarJpgBeanXXXXX avatar_jpg;
            private AvatarLargeBeanXXXXX avatar_large;
            private AvatarMediumBeanXXXXX avatar_medium;
            private AvatarThumbBeanXXXXX avatar_thumb;
            private String bg_img_url;
            private Integer birthday;
            private String birthday_description;
            private Boolean birthday_valid;
            private Boolean block_rpc_success;
            private Integer block_status;
            private Integer blocked_by_status;
            private String city;
            private Integer comment_restrict;
            private CommerceInfoBeanXXXX commerce_info;
            private String constellation;
            private Integer disable_ichat;
            private String encrypted_id;
            private Integer exp;
            private Integer fan_ticket_count;
            private FlameExpInfoBean flame_exp_info;
            private Object flash_rank_detail;
            private Boolean fold_stranger_chat;
            private Integer follow_status;
            private Boolean force_follow_feed_time_order;
            private Integer gender;
            private Boolean has_circle_item;
            private Boolean hotsoon_verified;
            private String hotsoon_verified_reason;
            private Integer ichat_restrict_type;
            private Long id;
            private String id_str;
            private Integer income_share_percent;
            private Boolean is_city_near_by;
            private Boolean is_follower;
            private Boolean is_following;
            private Boolean is_money_tree_user;
            private Integer level;
            private Object live_noble;
            private Boolean need_profile_guide;
            private String nickname;
            private String original_encrypted_id;
            private Long original_user_id;
            private PayGradeBeanXXXXX pay_grade;
            private Integer pay_scores;
            private String profile_guide_prompts;
            private Integer secret;
            private String share_desc;
            private String share_title;
            private String share_url;
            private Long short_id;
            private String short_id_str;
            private String signature;
            private StatsBean stats;
            private Integer type_a1;
            private Object user_flame_info;
            private Boolean verified;
            private Boolean verified_mobile;
            private String verified_reason;
            private EnterpriseInfoBean enterprise_info;
            private HeaderImageBeanX header_image;

            @NoArgsConstructor
            @Data
            public static class EnterpriseInfoBean{

                /**
                 * name : 商丘市元亨食品有限责任公司
                 * sign_up_link : sslocal://webview?url=https%3A%2F%2Fhotsoon.snssdk.com%2Fmagic%2Fruntime%2F%3Fid%3D1887&hide_more=1
                 * type : 1
                 */

                private String name;
                private String sign_up_link;
                private Integer type;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarJpgBeanXXXXX {
                /**
                 * uri : tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847
                 * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847~100x100.jpg","http://p3-hs.byteimg.com/img/tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847~100x100.jpg"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarLargeBeanXXXXX {
                /**
                 * uri : tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847
                 * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847~1080x1080.webp","http://p3-hs.byteimg.com/img/tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847~1080x1080.webp"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarMediumBeanXXXXX {
                /**
                 * uri : tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847
                 * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847~720x720.webp","http://p3-hs.byteimg.com/img/tos-cn-i-0813/344f096c3f8e4532893abc41b13d5847~720x720.webp"]
                 */

                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarThumbBeanXXXXX {
            }

            @NoArgsConstructor
            @Data
            public static class CommerceInfoBeanXXXX {
            }

            @NoArgsConstructor
            @Data
            public static class PayGradeBeanXXXXX {
                /**
                 * diamond_icon : {"uri":"12400003aba3dd42e213","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]}
                 * grade_banner : 7级可获房间展示升级通告
                 * grade_describe : 距升级还需消费2钻
                 * grade_icon_list : [{"icon":{"uri":"3b65000678eac77af1d9","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"]},"icon_diamond":45,"level":5,"level_str":"Lv.5"},{"icon":{"uri":"3b65000678eac77af1d9","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"]},"icon_diamond":65,"level":6,"level_str":"Lv.6"},{"icon":{"uri":"3b620006b1e388185513","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b620006b1e388185513~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b620006b1e388185513~tplv-obj.image"]},"icon_diamond":90,"level":7,"level_str":"Lv.7"}]
                 * icon : {"uri":"30eb0000a101d40eea0c","url_list":["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image"]}
                 * im_icon : {"uri":"2ea8000962099e965ff0","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image"]}
                 * im_icon_with_level : {"uri":"78a30076591d3cd2dc07","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a30076591d3cd2dc07~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a30076591d3cd2dc07~tplv-obj.image"]}
                 * level : 6
                 * live_icon : {"uri":"30ee0007ccef28b99639","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image"]}
                 * name : 树苗
                 * new_im_icon_with_level : {"uri":"webcast/hotsoon_paygrade_new_icon_level_6.png","url_list":["http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_6.png","http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_6.png"]}
                 * new_live_icon : {"uri":"78a10056e336cb6eb911","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image"]}
                 * new_nav_live_icon : {"uri":"hotsoon-resource/new_nva_level_icon_6.png","url_list":["http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_6.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_6.png~tplv-obj.image"]}
                 * next_diamond : 230
                 * next_icon : {"uri":"12400003aae89daccd69","url_list":["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image"]}
                 * next_name : 树叶
                 * now_diamond : 88
                 * pay_diamond_bak : 0
                 * profile_dialog_bg : {"uri":"hotsoon-resource/user_level_1.1_3x.png","url_list":["http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image"]}
                 * profile_dialog_bg_back : {"uri":"hotsoon-resource/user_level_1.2_3x.png","url_list":["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image"]}
                 * screen_chat_type : 2
                 * this_grade_max_diamond : 89
                 * this_grade_min_diamond : 65
                 * total_diamond_count : 88
                 * upgrade_need_consume : 2
                 */

                private DiamondIconBeanXXXXX diamond_icon;
                private String grade_banner;
                private String grade_describe;
                private IconBeanXXXXXXXXXXXXX icon;
                private ImIconBeanXXXXX im_icon;
                private ImIconWithLevelBeanXXXXX im_icon_with_level;
                private Integer level;
                private LiveIconBeanXXXXX live_icon;
                private String name;
                private NewImIconWithLevelBeanXXXXX new_im_icon_with_level;
                private NewLiveIconBeanXXXXX new_live_icon;
                private NewNavLiveIconBeanXXXX new_nav_live_icon;
                private Integer next_diamond;
                private NextIconBeanXXXXX next_icon;
                private String next_name;
                private Integer now_diamond;
                private Integer pay_diamond_bak;
                private ProfileDialogBgBeanXXXXX profile_dialog_bg;
                private ProfileDialogBgBackBeanXXXXX profile_dialog_bg_back;
                private Integer screen_chat_type;
                private Integer this_grade_max_diamond;
                private Integer this_grade_min_diamond;
                private Integer total_diamond_count;
                private Integer upgrade_need_consume;
                private List<GradeIconListBeanXXXXX> grade_icon_list;

                @NoArgsConstructor
                @Data
                public static class DiamondIconBeanXXXXX {
                    /**
                     * uri : 12400003aba3dd42e213
                     * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aba3dd42e213~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class IconBeanXXXXXXXXXXXXX {
                    /**
                     * uri : 30eb0000a101d40eea0c
                     * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image","http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/30eb0000a101d40eea0c~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ImIconBeanXXXXX {
                    /**
                     * uri : 2ea8000962099e965ff0
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/2ea8000962099e965ff0~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ImIconWithLevelBeanXXXXX {
                    /**
                     * uri : 78a30076591d3cd2dc07
                     * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a30076591d3cd2dc07~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a30076591d3cd2dc07~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class LiveIconBeanXXXXX {
                    /**
                     * uri : 30ee0007ccef28b99639
                     * url_list : ["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/30ee0007ccef28b99639~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NewImIconWithLevelBeanXXXXX {
                    /**
                     * uri : webcast/hotsoon_paygrade_new_icon_level_6.png
                     * url_list : ["http://p1-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_6.png","http://p3-hs.byteimg.com/obj/webcast/hotsoon_paygrade_new_icon_level_6.png"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NewLiveIconBeanXXXXX {
                    /**
                     * uri : 78a10056e336cb6eb911
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/78a10056e336cb6eb911~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NewNavLiveIconBeanXXXX {
                    /**
                     * uri : hotsoon-resource/new_nva_level_icon_6.png
                     * url_list : ["http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_6.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/new_nva_level_icon_6.png~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class NextIconBeanXXXXX {
                    /**
                     * uri : 12400003aae89daccd69
                     * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image","http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/12400003aae89daccd69~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ProfileDialogBgBeanXXXXX {
                    /**
                     * uri : hotsoon-resource/user_level_1.1_3x.png
                     * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image","http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.1_3x.png~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ProfileDialogBgBackBeanXXXXX {
                    /**
                     * uri : hotsoon-resource/user_level_1.2_3x.png
                     * url_list : ["http://p6-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/hotsoon-resource/user_level_1.2_3x.png~tplv-obj.image"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class GradeIconListBeanXXXXX {
                    /**
                     * icon : {"uri":"3b65000678eac77af1d9","url_list":["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"]}
                     * icon_diamond : 45
                     * level : 5
                     * level_str : Lv.5
                     */

                    private IconBeanXXXXXXXXXXXXXX icon;
                    private Integer icon_diamond;
                    private Integer level;
                    private String level_str;

                    @NoArgsConstructor
                    @Data
                    public static class IconBeanXXXXXXXXXXXXXX {
                        /**
                         * uri : 3b65000678eac77af1d9
                         * url_list : ["http://p3-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b65000678eac77af1d9~tplv-obj.image"]
                         */

                        private String uri;
                        private List<String> url_list;
                    }
                }
            }

            @NoArgsConstructor
            @Data
            public static class HeaderImageBeanX {
                /**
                 * uri : ies.fe.mis/64b163deb863f92f78c318ce70d2b33b.png
                 * url_list : ["http://p1-hs.byteimg.com/img/ies.fe.mis/64b163deb863f92f78c318ce70d2b33b.png~1280x720.webp","http://p3-hs.byteimg.com/img/ies.fe.mis/64b163deb863f92f78c318ce70d2b33b.png~1280x720.webp"]
                 */

                private String uri;
                private List<String> url_list;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class ExtraBeanX {
        /**
         * now : 1599569383400
         */

        private Long now;
    }
}

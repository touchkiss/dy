package com.douyin.webcast.ranklist.hot;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/08/28 15:36
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ListResponse {

    private DataBeanX data;
    private ExtraBean extra;
    private int status_code;

    @NoArgsConstructor
    @Data
    public static class DataBeanX {
        private String top_image_url;
        private int updated_at;
        private List<RanksBean> ranks;

        @NoArgsConstructor
        @Data
        public static class RanksBean {

            private String gap_description;
            private String label;
            private int rank;
            private RoomBean room;
            private int score;
            private UserBean user;

            @NoArgsConstructor
            @Data
            public static class RoomBean {
                /**
                 * challenge_info :
                 * content_label : {"avg_color":"#524037","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_cover_redPackage_webcast_3_2.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image"],"width":0}
                 * cover : {"avg_color":"#DCF4FA","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/6794395117043206926","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/6794395117043206926~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/6794395117043206926~tplv-obj.image"],"width":0}
                 * id : 6865901132342889216
                 * id_str : 6865901132342889216
                 * title :
                 * user_count : 44450
                 */

                private String challenge_info;
                private ContentLabelBean content_label;
                private CoverBean cover;
                private long id;
                private String id_str;
                private String title;
                private int user_count;

                @NoArgsConstructor
                @Data
                public static class ContentLabelBean {
                    /**
                     * avg_color : #524037
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : webcast/aweme_cover_redPackage_webcast_3_2.png
                     * url_list : ["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class CoverBean {
                    /**
                     * avg_color : #DCF4FA
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : webcast/6794395117043206926
                     * url_list : ["http://p3-webcast-dycdn.byteimg.com/img/webcast/6794395117043206926~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/6794395117043206926~tplv-obj.image"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }
            }

            @NoArgsConstructor
            @Data
            public static class UserBean {
                /**
                 * adversary_authorization_info : 3
                 * adversary_user_status : 0
                 * allow_be_located : false
                 * allow_find_by_contacts : false
                 * allow_others_download_video : false
                 * allow_others_download_when_sharing_video : false
                 * allow_share_show_profile : false
                 * allow_show_in_gossip : false
                 * allow_show_my_action : false
                 * allow_strange_comment : false
                 * allow_unfollower_comment : false
                 * allow_use_linkmic : false
                 * authorization_info : 3
                 * avatar_large : {"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"1080x1080/171de000582ba89417336","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/171de000582ba89417336.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/1080x1080/171de000582ba89417336.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/171de000582ba89417336.jpeg?from=4010531038"],"width":0}
                 * avatar_medium : {"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"720x720/171de000582ba89417336","url_list":["https://p26-dy.byteimg.com/aweme/720x720/171de000582ba89417336.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/720x720/171de000582ba89417336.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/720x720/171de000582ba89417336.jpeg?from=4010531038"],"width":0}
                 * avatar_thumb : {"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"100x100/171de000582ba89417336","url_list":["https://p9-dy.byteimg.com/aweme/100x100/171de000582ba89417336.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/100x100/171de000582ba89417336.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/aweme/100x100/171de000582ba89417336.jpeg?from=4010531038"],"width":0}
                 * badge_image_list : [{"avg_color":"","height":16,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_honor_level_icon_new_35.png","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image"],"width":32}]
                 * bg_img_url :
                 * birthday : 0
                 * birthday_description :
                 * birthday_valid : false
                 * block_status : 0
                 * border : {"icon":{"avg_color":"","height":64,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/frisbee_wangpaizhubo_common.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/frisbee_wangpaizhubo_common.png~tplv-obj.png","http://p1-webcast-dycdn.byteimg.com/img/webcast/frisbee_wangpaizhubo_common.png~tplv-obj.png"],"width":64},"level":0}
                 * city :
                 * comment_restrict : 0
                 * commerce_webcast_config_ids : []
                 * constellation :
                 * create_time : 0
                 * disable_ichat : 0
                 * display_id : 176050357
                 * enable_ichat_img : 0
                 * exp : 0
                 * experience : 0
                 * fan_ticket_count : 0
                 * fans_club : {"data":{"anchor_id":0,"available_gift_ids":[],"badge":{"icons":{"0":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"","url_list":[],"width":0}},"title":""},"club_name":"","level":0,"user_fans_club_status":0},"prefer_data":{}}
                 * fold_stranger_chat : false
                 * follow_info : {"follow_status":0,"follower_count":15624800,"following_count":431,"push_status":0}
                 * follow_status : 0
                 * gender : 2
                 * hotsoon_verified : false
                 * hotsoon_verified_reason :
                 * ichat_restrict_type : 0
                 * id : 83268382282
                 * id_str : 83268382282
                 * income_share_percent : 0
                 * is_follower : false
                 * is_following : false
                 * level : 1
                 * link_mic_stats : 0
                 * media_badge_image_list : []
                 * modify_time : 1598599898
                 * need_profile_guide : false
                 * new_real_time_icons : []
                 * nickname : 陳婷mm
                 * own_room : {"room_ids":[6865901132342889216],"room_ids_str":["6865901132342889216"]}
                 * pay_grade : {"grade_banner":"","grade_describe":"距离36级还差5.5w抖币","grade_icon_list":[],"level":35,"name":"","new_im_icon_with_level":{"avg_color":"","height":16,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_honor_level_icon_new_35.png","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image"],"width":32},"new_live_icon":{"avg_color":"","height":12,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_pay_grade_2x_35_39.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_35_39.png~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_35_39.png~tplv-obj.image"],"width":12},"next_diamond":0,"next_name":"","next_privileges":"","now_diamond":0,"pay_diamond_bak":0,"score":245072,"screen_chat_type":0,"this_grade_max_diamond":300000,"this_grade_min_diamond":230000,"total_diamond_count":245072,"upgrade_need_consume":0}
                 * pay_score : 245072
                 * pay_scores : 0
                 * push_comment_status : false
                 * push_digg : false
                 * push_follow : false
                 * push_friend_action : false
                 * push_ichat : false
                 * push_status : false
                 * push_video_post : false
                 * push_video_recommend : false
                 * real_time_icons : []
                 * sec_uid : MS4wLjABAAAAQ6vRg2EBep91EAMop0QrzYBaw9atgpqutpyabIXojWg
                 * secret : 0
                 * share_qrcode_uri : 530700311463ddf80d73
                 * short_id : 176050357
                 * signature : 今天13：00开播 记得过来！
                 * special_id :
                 * status : 1
                 * telephone :
                 * ticket_count : 7724672
                 * top_fans : []
                 * top_vip_no : 0
                 * total_recharge_diamond_count : 0
                 * user_attr : {"is_admin":false,"is_muted":false,"is_super_admin":false}
                 * user_role : 0
                 * verified : true
                 * verified_content :
                 * verified_mobile : false
                 * verified_reason :
                 * with_car_management_permission : false
                 * with_commerce_permission : true
                 * with_fusion_shop_entry : true
                 */

                private int adversary_authorization_info;
                private int adversary_user_status;
                private boolean allow_be_located;
                private boolean allow_find_by_contacts;
                private boolean allow_others_download_video;
                private boolean allow_others_download_when_sharing_video;
                private boolean allow_share_show_profile;
                private boolean allow_show_in_gossip;
                private boolean allow_show_my_action;
                private boolean allow_strange_comment;
                private boolean allow_unfollower_comment;
                private boolean allow_use_linkmic;
                private int authorization_info;
                private AvatarLargeBean avatar_large;
                private AvatarMediumBean avatar_medium;
                private AvatarThumbBean avatar_thumb;
                private String bg_img_url;
                private int birthday;
                private String birthday_description;
                private boolean birthday_valid;
                private int block_status;
                private BorderBean border;
                private String city;
                private int comment_restrict;
                private String constellation;
                private int create_time;
                private int disable_ichat;
                private String display_id;
                private int enable_ichat_img;
                private int exp;
                private int experience;
                private int fan_ticket_count;
                private FansClubBean fans_club;
                private boolean fold_stranger_chat;
                private FollowInfoBean follow_info;
                private int follow_status;
                private int gender;
                private boolean hotsoon_verified;
                private String hotsoon_verified_reason;
                private int ichat_restrict_type;
                private long id;
                private String id_str;
                private int income_share_percent;
                private boolean is_follower;
                private boolean is_following;
                private int level;
                private int link_mic_stats;
                private int modify_time;
                private boolean need_profile_guide;
                private String nickname;
                private OwnRoomBean own_room;
                private PayGradeBean pay_grade;
                private int pay_score;
                private int pay_scores;
                private boolean push_comment_status;
                private boolean push_digg;
                private boolean push_follow;
                private boolean push_friend_action;
                private boolean push_ichat;
                private boolean push_status;
                private boolean push_video_post;
                private boolean push_video_recommend;
                private String sec_uid;
                private int secret;
                private String share_qrcode_uri;
                private int short_id;
                private String signature;
                private String special_id;
                private int status;
                private String telephone;
                private int ticket_count;
                private int top_vip_no;
                private int total_recharge_diamond_count;
                private UserAttrBean user_attr;
                private int user_role;
                private boolean verified;
                private String verified_content;
                private boolean verified_mobile;
                private String verified_reason;
                private boolean with_car_management_permission;
                private boolean with_commerce_permission;
                private boolean with_fusion_shop_entry;
                private List<BadgeImageListBean> badge_image_list;
                private List<?> commerce_webcast_config_ids;
                private List<?> media_badge_image_list;
                private List<?> new_real_time_icons;
                private List<?> real_time_icons;
                private List<?> top_fans;

                @NoArgsConstructor
                @Data
                public static class AvatarLargeBean {
                    /**
                     * avg_color :
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : 1080x1080/171de000582ba89417336
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/171de000582ba89417336.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/1080x1080/171de000582ba89417336.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/171de000582ba89417336.jpeg?from=4010531038"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarMediumBean {
                    /**
                     * avg_color :
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : 720x720/171de000582ba89417336
                     * url_list : ["https://p26-dy.byteimg.com/aweme/720x720/171de000582ba89417336.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/720x720/171de000582ba89417336.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/720x720/171de000582ba89417336.jpeg?from=4010531038"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AvatarThumbBean {
                    /**
                     * avg_color :
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : 100x100/171de000582ba89417336
                     * url_list : ["https://p9-dy.byteimg.com/aweme/100x100/171de000582ba89417336.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/100x100/171de000582ba89417336.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/aweme/100x100/171de000582ba89417336.jpeg?from=4010531038"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class BorderBean {
                    /**
                     * icon : {"avg_color":"","height":64,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/frisbee_wangpaizhubo_common.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/frisbee_wangpaizhubo_common.png~tplv-obj.png","http://p1-webcast-dycdn.byteimg.com/img/webcast/frisbee_wangpaizhubo_common.png~tplv-obj.png"],"width":64}
                     * level : 0
                     */

                    private IconBean icon;
                    private int level;

                    @NoArgsConstructor
                    @Data
                    public static class IconBean {
                        /**
                         * avg_color :
                         * height : 64
                         * image_type : 0
                         * is_animated : false
                         * open_web_url :
                         * uri : webcast/frisbee_wangpaizhubo_common.png
                         * url_list : ["http://p6-webcast-dycdn.byteimg.com/img/webcast/frisbee_wangpaizhubo_common.png~tplv-obj.png","http://p1-webcast-dycdn.byteimg.com/img/webcast/frisbee_wangpaizhubo_common.png~tplv-obj.png"]
                         * width : 64
                         */

                        private String avg_color;
                        private int height;
                        private int image_type;
                        private boolean is_animated;
                        private String open_web_url;
                        private String uri;
                        private int width;
                        private List<String> url_list;
                    }
                }

                @NoArgsConstructor
                @Data
                public static class FansClubBean {
                    /**
                     * data : {"anchor_id":0,"available_gift_ids":[],"badge":{"icons":{"0":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"","url_list":[],"width":0}},"title":""},"club_name":"","level":0,"user_fans_club_status":0}
                     * prefer_data : {}
                     */

                    private DataBean data;
                    private PreferDataBean prefer_data;

                    @NoArgsConstructor
                    @Data
                    public static class DataBean {
                        @NoArgsConstructor
                        @Data
                        public static class BadgeBean {
                            @NoArgsConstructor
                            @Data
                            public static class IconsBean {
                                @NoArgsConstructor
                                @Data
                                public static class _$0Bean {
                                }
                            }
                        }
                    }

                    @NoArgsConstructor
                    @Data
                    public static class PreferDataBean {
                    }
                }

                @NoArgsConstructor
                @Data
                public static class FollowInfoBean {
                    /**
                     * follow_status : 0
                     * follower_count : 15624800
                     * following_count : 431
                     * push_status : 0
                     */

                    private int follow_status;
                    private int follower_count;
                    private int following_count;
                    private int push_status;
                }

                @NoArgsConstructor
                @Data
                public static class OwnRoomBean {
                    private List<Long> room_ids;
                    private List<String> room_ids_str;
                }

                @NoArgsConstructor
                @Data
                public static class PayGradeBean {
                    /**
                     * grade_banner :
                     * grade_describe : 距离36级还差5.5w抖币
                     * grade_icon_list : []
                     * level : 35
                     * name :
                     * new_im_icon_with_level : {"avg_color":"","height":16,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_honor_level_icon_new_35.png","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image"],"width":32}
                     * new_live_icon : {"avg_color":"","height":12,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_pay_grade_2x_35_39.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_35_39.png~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_35_39.png~tplv-obj.image"],"width":12}
                     * next_diamond : 0
                     * next_name :
                     * next_privileges :
                     * now_diamond : 0
                     * pay_diamond_bak : 0
                     * score : 245072
                     * screen_chat_type : 0
                     * this_grade_max_diamond : 300000
                     * this_grade_min_diamond : 230000
                     * total_diamond_count : 245072
                     * upgrade_need_consume : 0
                     */

                    private String grade_banner;
                    private String grade_describe;
                    private int level;
                    private String name;
                    private NewImIconWithLevelBean new_im_icon_with_level;
                    private NewLiveIconBean new_live_icon;
                    private int next_diamond;
                    private String next_name;
                    private String next_privileges;
                    private int now_diamond;
                    private int pay_diamond_bak;
                    private int score;
                    private int screen_chat_type;
                    private int this_grade_max_diamond;
                    private int this_grade_min_diamond;
                    private int total_diamond_count;
                    private int upgrade_need_consume;
                    private List<?> grade_icon_list;

                    @NoArgsConstructor
                    @Data
                    public static class NewImIconWithLevelBean {
                        /**
                         * avg_color :
                         * height : 16
                         * image_type : 1
                         * is_animated : false
                         * open_web_url :
                         * uri : webcast/aweme_honor_level_icon_new_35.png
                         * url_list : ["http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image"]
                         * width : 32
                         */

                        private String avg_color;
                        private int height;
                        private int image_type;
                        private boolean is_animated;
                        private String open_web_url;
                        private String uri;
                        private int width;
                        private List<String> url_list;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class NewLiveIconBean {
                        /**
                         * avg_color :
                         * height : 12
                         * image_type : 1
                         * is_animated : false
                         * open_web_url :
                         * uri : webcast/aweme_pay_grade_2x_35_39.png
                         * url_list : ["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_35_39.png~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_35_39.png~tplv-obj.image"]
                         * width : 12
                         */

                        private String avg_color;
                        private int height;
                        private int image_type;
                        private boolean is_animated;
                        private String open_web_url;
                        private String uri;
                        private int width;
                        private List<String> url_list;
                    }
                }

                @NoArgsConstructor
                @Data
                public static class UserAttrBean {
                    /**
                     * is_admin : false
                     * is_muted : false
                     * is_super_admin : false
                     */

                    private boolean is_admin;
                    private boolean is_muted;
                    private boolean is_super_admin;
                }

                @NoArgsConstructor
                @Data
                public static class BadgeImageListBean {
                    /**
                     * avg_color :
                     * height : 16
                     * image_type : 1
                     * is_animated : false
                     * open_web_url :
                     * uri : webcast/aweme_honor_level_icon_new_35.png
                     * url_list : ["http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_35.png~tplv-obj.image"]
                     * width : 32
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class ExtraBean {
        /**
         * now : 1598600078186
         */

        private long now;
    }
}

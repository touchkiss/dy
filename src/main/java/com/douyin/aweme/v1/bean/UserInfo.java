package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class UserInfo {
    private Boolean accept_private_policy;
    private String account_region;
    private Object ad_cover_url;
    private Long apple_account;
    private Long authority_status;
    private CoverBean avatar_168x168;
    private CoverBean avatar_300x300;
    private CoverBean avatar_larger;
    private CoverBean avatar_medium;
    private CoverBean avatar_thumb;
    private Long aweme_count;
    private String birthday;
    private Long birthday_hide_level;
    private Object cha_list;
    private String city;
    private Long comment_filter_status;
    private Long comment_setting;
    private CommerceInfoBean commerce_info;
    private CommerceUserInfoBean commerce_user_info;
    private Long commerce_user_level;
    private String country;
    private List<CoverBean> cover_url;
    private String custom_verify;
    private String district;
    //        动态数量
    private Long dongtai_count;
    private Long download_setting;
    private Long duet_setting;
    private String enterprise_user_info;
    private String enterprise_verify_reason;
    private Long favoriting_count;
    private Long follow_status;
    private Long follower_count;
    private Long follower_status;
    private List<FollowersDetailBean> followers_detail;
    private Long following_count;
    private Long forward_count;
    private Long gender;
    private GeneralPermissionBean general_permission;
    private boolean has_unread_story;
    private boolean hide_location;
    private String ins_id;
    private boolean is_activity_user;
    private boolean is_ad_fake;
    private boolean is_block;
    private boolean is_blocked;
    private boolean is_discipline_member;
    private boolean is_effect_artist;
    private boolean is_gov_media_vip;
    private boolean is_mix_user;
    private boolean is_star;
    private boolean is_verified;
    private String iso_country_code;
    private boolean live_commerce;
    private String language;
    private String location;
    private boolean message_chat_entry;
    //        全平台粉丝数
    private Long mplatform_followers_count;
    private String nickname;
    private OriginalMusicianBean original_musician;
    private boolean prevent_download;
    private ProfileStoryBean profile_story;
    private Long profile_tab_type;
    private String province;
    //    private RFansGroupInfoBean r_fans_group_info;
    private String recommend_reason_relation;
    private Long recommend_user_reason_source;
    private Object relative_users;
    private String region;
    private Long room_id;
    private String school_name;
    private String sec_uid;
    private Long secret;
    private ShareInfoBean share_info;
    private String shop_micro_app;
    private String short_id;
    private boolean show_favorite_list;
    private String signature;
    private String signature_language;
    private Long stitch_setting;
    private Long story_count;
    private Long sync_to_toutiao;
    //    private TabSettingsBean tab_settings;
    private Long total_favorited;
    private String twitter_id;
    private String twitter_name;
    private String uid;
    private String unique_id;
    private UrgeDetailBean urge_detail;
    private Long verification_type;
    private String verify_info;
    private CoverBean video_cover;
    private CoverBean video_icon;
    private boolean watch_status;
    private List<CoverBean> white_cover_url;
    private boolean with_commerce_entry;
    private boolean with_commerce_enterprise_tab_entry;
    private boolean with_new_goods;
    private boolean with_fusion_shop_entry;
    private String youtube_channel_id;
    private String youtube_channel_title;
    private Boolean is_pro_account;
    private Integer youtube_last_refresh_time;
    private Boolean dp_level;
    private String school_poi_id;
    private String cover_colour;
    private Object need_points;
    private Integer reflow_page_gid;
    private Boolean can_set_geofencing;
    private Boolean star_use_new_download;
    private Integer aweme_hotsoon_auth;
    private Integer count_status;
    private String weibo_url;
    private Boolean has_insights;
    private Integer show_secret_banner;
    private Integer special_lock;
    private Object type_label;
    private Boolean with_luban_entry;
    private Integer content_language_already_popup;
    private Boolean story_open;
    private Boolean show_image_bubble;
    private Object homepage_bottom_toast;
    private String weibo_verify;
    private Boolean with_shop_entry;
    private TabSettingsBean tab_settings;
    private Integer user_period;
    private ActivityBean activity;
    private Integer normal_top_comment_permission;
    private Boolean with_stick_entry;
    private WxInfoBean wx_info;
    private Boolean user_canceled;
    private String weibo_schema;
    private Integer school_auth;
    private String avatar_uri;
    private String video_icon_virtual_URI;
    private String share_qrcode_uri;
    private Integer user_story_count;
    private Integer wx_tag;
    private Integer latest_order_time;
    private Object user_tags;
    private Integer im_age_stage;
    private Object new_story_cover;
    private Boolean has_story;
    private Boolean ever_over_1k_follower;
    private Integer ky_only_predict;
    private Integer react_setting;
    private Integer unique_id_modify_time;
    private Integer download_prompt_ts;
    private AwemeControlBean aweme_control;
    private Object item_list;
    private Integer user_mode;
    private RFansGroupInfoBean r_fans_group_info;
    private Integer reflow_page_uid;
    private Boolean show_user_ban_dialog;
    private String bind_phone;
    private Object platform_sync_info;
    private Integer constellation;
    private Boolean has_activity_medal;
    private Boolean douplus_old_user;
    private Integer hide_following_follower_list;
    private Boolean enable_nearby_visible;
    private List<?> geofencing;
    private List<?> ban_user_functions;

    @NoArgsConstructor
    @Data
    public static class OriginalMusicianBean {
        /**
         * music_count : 0
         * music_used_count : 0
         * digg_count : 0
         */

        private Long music_count;
        private Long music_used_count;
        private Long digg_count;
    }

    @NoArgsConstructor
    @Data
    public static class GeneralPermissionBean {
        /**
         * following_follower_list_toast : 1
         */

        private Long following_follower_list_toast;
    }

    @NoArgsConstructor
    @Data
    public static class UrgeDetailBean {
        /**
         * user_urged : 0
         */

        private Long user_urged;
    }

//    @NoArgsConstructor
//    @Data
//    public static class TabSettingsBean {
//        @NoArgsConstructor
//        @Data
//        public static class PrivateTabBean {
//        }
//    }
//
//    @NoArgsConstructor
//    @Data
//    public static class RFansGroupInfoBean {
//    }

    @NoArgsConstructor
    @Data
    public static class CommerceUserInfoBean {
        /**
         * star_atlas : 1
         * show_star_atlas_cooperation : false
         * has_ads_entry : false
         * ad_revenue_rits : null
         */

        private Long star_atlas;
        private boolean show_star_atlas_cooperation;
        private boolean has_ads_entry;
        private Object ad_revenue_rits;
    }

    @NoArgsConstructor
    @Data
    public static class ShareInfoBean {
        /**
         * share_title : 快来加入抖音，让你发现最有趣的我！
         * share_qrcode_url : {"uri":"8d6800144d0705f5aa18","url_list":["https://p3-dy-ipv6.byteimg.com/obj/8d6800144d0705f5aa18","https://p6-dy-ipv6.byteimg.com/obj/8d6800144d0705f5aa18","https://p9-dy.byteimg.com/obj/8d6800144d0705f5aa18"]}
         * share_image_url : {"url_list":null}
         * bool_persist : 1
         * share_url : www.iesdouyin.com/share/user/99721845672?sec_uid=MS4wLjABAAAACYlBnPi3Yy7yNWX-R6I7XQ3igz2QpXMTDm6eHCIHKF0
         * share_weibo_desc : 在抖音，记录美好生活！
         * share_desc : 在抖音，记录美好生活！
         */

        private String share_title;
        private CoverBean share_qrcode_url;
        private CoverBean share_image_url;
        private Long bool_persist;
        private String share_url;
        private String share_weibo_desc;
        private String share_desc;
    }

    @NoArgsConstructor
    @Data
    public static class ProfileStoryBean {
        /**
         * unread_story_ids : null
         * ttl_story_status : 0
         */

        private Object unread_story_ids;
        private Long ttl_story_status;
    }

    @NoArgsConstructor
    @Data
    public static class CommerceInfoBean {
        /**
         * challenge_list : []
         * task_list : null
         * head_image_list : null
         * smart_phone_list : null
         * offline_info_list : []
         */

        private Object task_list;
        private Object head_image_list;
        private Object smart_phone_list;
        private List<?> challenge_list;
        private List<?> offline_info_list;
    }

    @NoArgsConstructor
    @Data
    public static class FollowersDetailBean {
        /**
         * app_name : aweme
         * name : 抖音
         * icon : http://p3.pstatp.com/origin/50ec00079b64de2050dc
         * fans_count : 12514935
         * open_url : snssdk1128://user/profile/99721845672?
         * apple_id : 1142110895
         * download_url : https://d.douyin.com/JsvN/
         * package_name : com.ss.android.ugc.aweme
         */

        private String app_name;
        private String name;
        private String icon;
        private Long fans_count;
        private String open_url;
        private String apple_id;
        private String download_url;
        private String package_name;
    }

    @NoArgsConstructor
    @Data
    public static class TabSettingsBean {
        /**
         * private_tab : {"show_private_tab":false,"private_tab_style":1}
         */

        private PrivateTabBean private_tab;

        @NoArgsConstructor
        @Data
        public static class PrivateTabBean {
            /**
             * show_private_tab : false
             * private_tab_style : 1
             */

            private Boolean show_private_tab;
            private Integer private_tab_style;
        }
    }

    @NoArgsConstructor
    @Data
    public static class ActivityBean {
        /**
         * use_music_count : 0
         * digg_count : 0
         */

        private Integer use_music_count;
        private Integer digg_count;
    }

    @NoArgsConstructor
    @Data
    public static class WxInfoBean {
        /**
         * wx_nickname_replace : Demon刘明达♪
         * replaced : false
         * wx_avatar_replace : {"uri":"1b47a0002f4a1cb22a676","url_list":["https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.webp?from=2956013662","https://p26-dy.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.webp?from=2956013662","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.jpeg?from=2956013662"]}
         */

        private String wx_nickname_replace;
        private Boolean replaced;
        private WxAvatarReplaceBean wx_avatar_replace;

        @NoArgsConstructor
        @Data
        public static class WxAvatarReplaceBean {
            /**
             * uri : 1b47a0002f4a1cb22a676
             * url_list : ["https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.webp?from=2956013662","https://p26-dy.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.webp?from=2956013662","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/1b47a0002f4a1cb22a676.jpeg?from=2956013662"]
             */

            private String uri;
            private List<String> url_list;
        }
    }

    @NoArgsConstructor
    @Data
    public static class VideoIconBean {
        /**
         * uri :
         * url_list : []
         * width : 720
         * height : 720
         */

        private String uri;
        private Integer width;
        private Integer height;
        private List<?> url_list;
    }

    @NoArgsConstructor
    @Data
    public static class AwemeControlBean {
    }

    @NoArgsConstructor
    @Data
    public static class RFansGroupInfoBean {
    }
}

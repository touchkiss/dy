package com.douyin.aweme.v1.user.profile;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class UserInfo {

    private Object ad_cover_url;
    private int apple_account;
    private int authority_status;
    private CoverBean avatar_168x168;
    private CoverBean avatar_300x300;
    private CoverBean avatar_larger;
    private CoverBean avatar_medium;
    private CoverBean avatar_thumb;
    private int aweme_count;
    private String birthday;
    private int birthday_hide_level;
    private Object cha_list;
    private String city;
    private int comment_filter_status;
    private int comment_setting;
    private CommerceInfoBean commerce_info;
    private CommerceUserInfoBean commerce_user_info;
    private int commerce_user_level;
    private String country;
    private List<CoverBean> cover_url;
    private String custom_verify;
    private String district;
    //        动态数量
    private int dongtai_count;
    private int download_setting;
    private int duet_setting;
    private String enterprise_user_info;
    private String enterprise_verify_reason;
    private int favoriting_count;
    private int follow_status;
    private int follower_count;
    private int follower_status;
    private List<FollowersDetailBean> followers_detail;
    private int following_count;
    private int forward_count;
    private int gender;
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
    private int mplatform_followers_count;
    private String nickname;
    private OriginalMusicianBean original_musician;
    private boolean prevent_download;
    private ProfileStoryBean profile_story;
    private int profile_tab_type;
    private String province;
    private RFansGroupInfoBean r_fans_group_info;
    private String recommend_reason_relation;
    private int recommend_user_reason_source;
    private Object relative_users;
    private String region;
    private int room_id;
    private String school_name;
    private String sec_uid;
    private int secret;
    private ShareInfoBean share_info;
    private String shop_micro_app;
    private String short_id;
    private boolean show_favorite_list;
    private String signature;
    private String signature_language;
    private int stitch_setting;
    private int story_count;
    private int sync_to_toutiao;
    private TabSettingsBean tab_settings;
    private int total_favorited;
    private String twitter_id;
    private String twitter_name;
    private String uid;
    private String unique_id;
    private UrgeDetailBean urge_detail;
    private int verification_type;
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

    @NoArgsConstructor
    @Data
    public static class OriginalMusicianBean {
        /**
         * music_count : 0
         * music_used_count : 0
         * digg_count : 0
         */

        private int music_count;
        private int music_used_count;
        private int digg_count;
    }

    @NoArgsConstructor
    @Data
    public static class GeneralPermissionBean {
        /**
         * following_follower_list_toast : 1
         */

        private int following_follower_list_toast;
    }

    @NoArgsConstructor
    @Data
    public static class UrgeDetailBean {
        /**
         * user_urged : 0
         */

        private int user_urged;
    }

    @NoArgsConstructor
    @Data
    public static class TabSettingsBean {
        @NoArgsConstructor
        @Data
        public static class PrivateTabBean {
        }
    }

    @NoArgsConstructor
    @Data
    public static class RFansGroupInfoBean {
    }

    @NoArgsConstructor
    @Data
    public static class CommerceUserInfoBean {
        /**
         * star_atlas : 1
         * show_star_atlas_cooperation : false
         * has_ads_entry : false
         * ad_revenue_rits : null
         */

        private int star_atlas;
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
        private int bool_persist;
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
        private int ttl_story_status;
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
        private int fans_count;
        private String open_url;
        private String apple_id;
        private String download_url;
        private String package_name;
    }
}

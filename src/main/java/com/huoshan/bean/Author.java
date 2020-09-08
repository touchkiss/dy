package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Author {
    private int account_type;
    private Boolean allow_be_located;
    private Boolean allow_others_download_video;
    private Boolean allow_others_download_when_sharing_video;
    private Boolean allow_show_follow_fans_list;
    private Boolean allow_show_vcd_grant;
    private Boolean allow_strange_comment;
    private Boolean allow_unfollower_comment;
    private CoverBean avatar_jpg;
    private CoverBean avatar_large;
    private CoverBean avatar_medium;
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

        private CoverBean icon;
        private int level;
        private String schema_url;
    }

    @NoArgsConstructor
    @Data
    public static class PayGradeBean {

        private CoverBean diamond_icon;
        private String grade_banner;
        private String grade_describe;
        private CoverBean icon;
        private CoverBean im_icon;
        private int level;
        private CoverBean live_icon;
        private String name;
        private CoverBean new_live_icon;
        private Object new_nav_live_icon;
        private int next_diamond;
        private CoverBean next_icon;
        private String next_name;
        private int now_diamond;
        private int pay_diamond_bak;
        private CoverBean profile_dialog_bg;
        private CoverBean profile_dialog_bg_back;
        private int screen_chat_type;
        private int this_grade_max_diamond;
        private int this_grade_min_diamond;
        private int total_diamond_count;
        private int upgrade_need_consume;
        private List<GradeIconListBean> grade_icon_list;


        @NoArgsConstructor
        @Data
        public static class GradeIconListBean {
            /**
             * icon : {"uri":"3b60000a6308f74aec4e","url_list":["http://p1-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image","http://p9-webcast-hscdn.byteimg.com/img/mosaic-legacy/3b60000a6308f74aec4e~tplv-obj.image"]}
             * icon_diamond : 0
             * level : 0
             * level_str : 暂无
             */

            private CoverBean icon;
            private int icon_diamond;
            private int level;
            private String level_str;
        }
    }
}

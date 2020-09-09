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
    private AnchorLevelBean anchor_level;
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
    private String click_follow_fans_toast;
    private Integer cluster_follower_count;
    private int comment_restrict;
    private CommerceInfoBean commerce_info;
    private String constellation;
    private int disable_ichat;
    private int enable_ichat_img;
    private String encrypted_id;
    private int exp;
    private int fan_ticket_count;
    private FavoriteCircleListBean favorite_circle_list;
    private Integer favorite_permission;
    private FlameExpInfoBean flame_exp_info;
    private FlameInfoBean flame_info;
    private Object flash_rank_detail;
    private Boolean fold_stranger_chat;
    private int follow_status;
    private Boolean force_follow_feed_time_order;
    private int gender;
    private Boolean has_circle_item;
    private boolean has_hashtag_item;
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
    private Integer last_live_seconds_from_now;
    private Integer last_live_time;
    private int level;
    private LevelInfoBean level_info;
    private Object live_noble;
    private Boolean need_profile_guide;
    private Boolean need_remind;
    private String nickname;
    private String original_encrypted_id;
    private long original_user_id;
    private Author packed_user;
    private PayGradeBean pay_grade;
    private String pay_grade_detail_url;
    private int pay_scores;
    private String profile_guide_prompts;
    private String profile_location_edit;
    private int secret;
    private String share_desc;
    private String share_title;
    private String share_url;
    private int short_id;
    private String short_id_str;
    private String signature;
    private Stats stats;
    private Integer total_fans_count;
    private ToutiaoInfoBean toutiao_info;
    private int type_a1;
    private CoverBean user_cover;
    private Object user_flame_info;
    private Boolean verified;
    private Boolean verified_mobile;
    private String verified_reason;
    private EnterpriseInfoBean enterprise_info;
    private CoverBean header_image;
    private boolean with_gossip_tab;
    private List<LatestRoomsBean> latest_rooms;
    private List<Author> top_fans;
    private List<Author> top_fans_weekly;

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
        private List<Author> top_contributors;
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
}

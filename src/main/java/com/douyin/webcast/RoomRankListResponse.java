package com.douyin.webcast;

import com.douyin.aweme.v1.bean.BaseResponse;
import com.douyin.aweme.v1.bean.UserInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/21 18:07
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class RoomRankListResponse extends BaseResponse {
    private DataBeanX data;

    @NoArgsConstructor
    @Data
    public static class DataBeanX {
        private String currency;
        private boolean has_more;
        private boolean has_once_live;
        private String music_wave;
        private String rules_url;
        private SelfInfoBean self_info;
        private int total;
        private List<RanksBean> ranks;
        private List<?> seats;

        @NoArgsConstructor
        @Data
        public static class SelfInfoBean {
            /**
             * delta : 0
             * first_gift : false
             * gap_description : 距离上榜还差
             2音浪
             * rank : 0
             * score : 0
             */

            private int delta;
            private boolean first_gift;
            private String gap_description;
            private int rank;
            private int score;
        }

        @NoArgsConstructor
        @Data
        public static class RanksBean {
            /**
             * delta : 0
             * first_gift : false
             * gap_description : 2.0万
             * rank : 1
             * score : 20002
             * user : {"adversary_authorization_info":0,"adversary_user_status":0,"allow_be_located":false,"allow_find_by_contacts":false,"allow_others_download_video":false,"allow_others_download_when_sharing_video":false,"allow_share_show_profile":false,"allow_show_in_gossip":false,"allow_show_my_action":false,"allow_strange_comment":false,"allow_unfollower_comment":false,"allow_use_linkmic":false,"authorization_info":3,"avatar_thumb":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"100x100/tos-cn-avt-0015/27562444833c8a623405722f904f8a93","url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/27562444833c8a623405722f904f8a93~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/27562444833c8a623405722f904f8a93~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/27562444833c8a623405722f904f8a93~c5_100x100.jpeg?from=4010531038"],"width":0},"badge_image_list":[],"bg_img_url":"","birthday":0,"birthday_description":"","birthday_valid":false,"block_status":0,"city":"","comment_restrict":0,"commerce_webcast_config_ids":[],"constellation":"","create_time":0,"disable_ichat":0,"display_id":"SX22227777","enable_ichat_img":0,"exp":0,"experience":0,"fan_ticket_count":0,"fans_club":{"data":{"anchor_id":0,"available_gift_ids":[],"badge":{"icons":{"0":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"","url_list":[],"width":0}},"title":""},"club_name":"","level":0,"user_fans_club_status":0},"prefer_data":{}},"fold_stranger_chat":false,"follow_info":{"follow_status":0,"follower_count":0,"following_count":0,"push_status":0},"follow_status":0,"gender":2,"hotsoon_verified":false,"hotsoon_verified_reason":"","ichat_restrict_type":0,"id":109284732763,"id_str":"109284732763","income_share_percent":0,"is_follower":false,"is_following":false,"level":0,"link_mic_stats":0,"media_badge_image_list":[],"modify_time":0,"need_profile_guide":false,"new_real_time_icons":[],"nickname":"橙子（尊师爱雨)","pay_grade":{"grade_banner":"","grade_describe":"距离45级还差78.9w抖币","grade_icon_list":[],"level":44,"name":"","new_im_icon_with_level":{"avg_color":"","height":16,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_honor_level_icon_new_44.png","url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_44.png~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_44.png~tplv-obj.image"],"width":32},"new_live_icon":{"avg_color":"","height":12,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_pay_grade_2x_40_44.png","url_list":["http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_40_44.png~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_40_44.png~tplv-obj.image"],"width":12},"next_diamond":0,"next_name":"","next_privileges":"","now_diamond":0,"pay_diamond_bak":0,"score":2610678,"screen_chat_type":0,"this_grade_max_diamond":3400000,"this_grade_min_diamond":2600000,"total_diamond_count":2610678,"upgrade_need_consume":0},"pay_score":0,"pay_scores":0,"push_comment_status":false,"push_digg":false,"push_follow":false,"push_friend_action":false,"push_ichat":false,"push_status":false,"push_video_post":false,"push_video_recommend":false,"real_time_icons":[],"sec_uid":"MS4wLjABAAAAz0UbABesY75-jrZNlhNJsosRKQ4kFxH5cyLw4v2hWbQ","secret":0,"share_qrcode_uri":"","short_id":2313074811,"signature":"","special_id":"","status":0,"telephone":"","ticket_count":0,"top_fans":[],"top_vip_no":0,"total_recharge_diamond_count":0,"user_role":0,"verified":false,"verified_content":"","verified_mobile":false,"verified_reason":"","with_car_management_permission":false,"with_commerce_permission":false,"with_fusion_shop_entry":false}
             */

            private int delta;
            private boolean first_gift;
            private String gap_description;
            private int rank;
            private int score;
            private UserInfo user;
        }
    }
}

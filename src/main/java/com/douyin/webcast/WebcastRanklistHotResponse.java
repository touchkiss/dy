package com.douyin.webcast;

import com.douyin.aweme.v1.bean.BaseResponse;
import com.douyin.aweme.v1.bean.UserInfo;
import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 19:52
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class WebcastRanklistHotResponse extends BaseResponse {

    private DataBeanX data;

    @NoArgsConstructor
    @Data
    public static class DataBeanX {
        private int updated_at;
        private String top_image_url;
        private List<RanksBean> ranks;

        @NoArgsConstructor
        @Data
        public static class RanksBean {
            private UserInfo user;
            private int score;
            private int rank;
            private String gap_description;
            private String raw_ad_data;
            private RoomBean room;
            private String label;
            @NoArgsConstructor
            @Data
            public static class RoomBean {
                /**
                 * id : 6902736546944781056
                 * id_str : 6902736546944781056
                 * title : 利哥回归参战年度
                 * user_count : 48429
                 * cover : {"url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/6761401118741711620~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/6761401118741711620~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/6761401118741711620~tplv-obj.image"],"uri":"webcast/6761401118741711620","height":0,"width":0,"avg_color":"#A3897C","image_type":0,"open_web_url":"","is_animated":false}
                 * challenge_info : {"cid":"1682952782600200","cha_name":"2020抖音直播年度盛典","desc":"2020抖音直播年度盛典，当打之年开启！\n2020.11.27-12.25，五大赛段，抖音和抖音火山版全力开打，群雄争霸，多个冠军席位等你来战！\n2021.1.16，2020抖音直播年度盛典-绽放之夜海口盛大开启，实时直播晚会现场，明星主播嗨翻全场！\n活动期间开直播or发视频带话题#2020抖音直播年度盛典，即有机会获得Dou+奖励！\n37手游《云上城之歌》邀您共同开启盛典之旅。\n【本活动与Apple.inc无关】","schema":"aweme://aweme/challenge/detail?cid=1682952782600200","author":{"uid":"4424087276363096","short_id":"3899826408","nickname":"抖音直播年度盛典","gender":0,"signature":"2020抖音直播年度盛典，11月27日燃爆开启！\n2020.11.27-12.25  五大赛区，抖音和抖音火山版全力开打，群雄争霸，多个冠军席位等你来战！\n2021.1.16  抖音直播年度盛典—绽放之夜将在海口盛大举行，实时直播晚会现场，群星主播嗨翻全场！","avatar_larger":{"uri":"tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_1080x1080.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_1080x1080.jpeg?from=4010531038"],"width":720,"height":720},"avatar_thumb":{"uri":"tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da","url_list":["https://p29-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_100x100.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_100x100.jpeg?from=4010531038"],"width":720,"height":720},"avatar_medium":{"uri":"tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_720x720.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_720x720.jpeg?from=4010531038"],"width":720,"height":720},"birthday":"","is_verified":true,"follow_status":0,"aweme_count":0,"following_count":0,"follower_count":0,"favoriting_count":0,"total_favorited":0,"is_block":false,"hide_search":false,"constellation":10,"location":"","hide_location":false,"weibo_verify":"","custom_verify":"","unique_id":"zhiboshengdian","bind_phone":"","special_lock":1,"need_recommend":0,"is_binded_weibo":false,"weibo_name":"","weibo_schema":"","weibo_url":"","story_open":false,"story_count":0,"has_facebook_token":false,"has_twitter_token":false,"fb_expire_time":0,"tw_expire_time":0,"has_youtube_token":false,"youtube_expire_time":0,"room_id":0,"live_verify":0,"authority_status":0,"verify_info":"","shield_follow_notice":0,"shield_digg_notice":0,"shield_comment_notice":0,"school_name":"","school_poi_id":"","school_type":0,"with_commerce_entry":false,"verification_type":1,"enterprise_verify_reason":"抖音直播年度盛典官方账号","is_ad_fake":false,"followers_detail":null,"region":"CN","account_region":"","sync_to_toutiao":0,"commerce_user_level":1,"live_agreement":0,"platform_sync_info":null,"with_shop_entry":false,"is_discipline_member":false,"secret":0,"has_orders":false,"prevent_download":false,"show_image_bubble":false,"geofencing":[],"unique_id_modify_time":1607168920,"video_icon":{"uri":"","url_list":[],"width":720,"height":720},"ins_id":"","google_account":"","youtube_channel_id":"","youtube_channel_title":"","apple_account":0,"with_dou_entry":false,"with_fusion_shop_entry":false,"is_phone_binded":false,"accept_private_policy":false,"twitter_id":"","twitter_name":"","user_canceled":false,"has_email":false,"is_gov_media_vip":false,"live_agreement_time":0,"status":1,"create_time":0,"avatar_uri":"tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da","follower_status":0,"neiguang_shield":0,"comment_setting":0,"duet_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"user_rate":1,"download_setting":-1,"download_prompt_ts":0,"react_setting":0,"live_commerce":false,"cover_url":[{"uri":"c8510002be9a3a61aad2","url_list":["https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=273881474","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=273881474","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=273881474"],"width":720,"height":720}],"language":"zh-Hans","has_insights":false,"item_list":null,"user_mode":0,"user_period":0,"has_unread_story":false,"new_story_cover":null,"is_star":false,"cv_level":"","type_label":null,"ad_cover_url":null,"comment_filter_status":0,"avatar_168x168":{"uri":"tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_168x168.webp?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_168x168.webp?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_168x168.webp?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_168x168.jpeg?from=4010531038"],"width":720,"height":720},"avatar_300x300":{"uri":"tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_300x300.webp?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_300x300.webp?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_300x300.webp?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-i-0813/cadc5710c7d64e09b92a3afcc9d8d2da~c5_300x300.jpeg?from=4010531038"],"width":720,"height":720},"relative_users":null,"cha_list":null,"sec_uid":"MS4wLjABAAAAKu5hXhMhIbBfC1qvr96moWhYay8tMI9vqQ7QmTWuU2gmrF7Na8n-smVQA5xPnH7L","need_points":null,"homepage_bottom_toast":null,"aweme_hotsoon_auth":1,"aweme_hotsoon_auth_relation":1,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null,"stitch_setting":0,"is_mix_user":true,"enable_nearby_visible":true,"ban_user_functions":[],"aweme_control":{"can_forward":true,"can_share":true,"can_comment":true,"can_show_comment":true},"ky_only_predict":0},"user_count":3769,"share_info":{"share_url":"","share_weibo_desc":"我在抖音参加#2020抖音直播年度盛典 ","share_desc":"","share_title":"我在抖音参加#2020抖音直播年度盛典 ","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"我在抖音参加#2020抖音直播年度盛典 "},"connect_music":[],"type":1,"sub_type":0,"is_pgcshow":false,"collect_stat":0,"is_challenge":0,"view_count":259605880,"is_commerce":false,"hashtag_profile":"douyin-admin-obj/584e1da74b353162caebba9193630595","cha_attrs":null,"banner_list":null,"extra_attr":{"is_live":true},"show_items":null}
                 * content_label : {"url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image"],"uri":"webcast/aweme_cover_redPackage_webcast_3_2.png","height":0,"width":0,"avg_color":"#405237","image_type":0,"open_web_url":"","is_animated":false}
                 */

                private long id;
                private String id_str;
                private String title;
                private int user_count;
                private CoverBean cover;
                private String challenge_info;
                private CoverBean content_label;
            }
        }
    }
}

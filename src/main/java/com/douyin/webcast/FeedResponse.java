package com.douyin.webcast;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/21 16:26
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class FeedResponse {
    private ExtraBean extra;
    private int status_code;
    private List<DataBeanXX> data;

    @NoArgsConstructor
    @Data
    public static class ExtraBean {
        /**
         * banner : {"banners":[{"avg_color":"#FFEBEB","banner_type":0,"height":200,"id":2720,"log_extra":{},"schema_url":"sslocal://webcast_webview?url=https%3A%2F%2Fsf3-scmcdn-tos.pstatp.com%2Fgoofy%2Fecommerce%2Ffe_ecommerce_activity%2Fpages%2Fseptember19_promotion%2Fviews%2Fmiddletail_anchor%2Findex.html%3Fstatus_bar_color%3Dblack%26status_bar_bg_color%3Dwhite%26enter_from%3D12%26type%3Dfullscreen%26gravity%3Dbottom%26hide_nav_bar%3D1%26web_bg_color%3D912cdb%26height_percent%3D100%26__live_platform__%3Dwebcast%26from_live%3Dtrue%26show_back%3D1%26hide_more%3D1%26hide_nav_bar%3D1%26hide_status_bar%3D1%26web_bg_color%3Dundefined&show_back=1&type=fullscreen&title=undefined&hide_more=1&hide_nav_bar=1&hide_status_bar=1","tab_types":[],"title":"919电商","uri":"webcast/583c022a247f67dbe2b929f0edda4afd.jpeg","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/583c022a247f67dbe2b929f0edda4afd.jpeg~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/583c022a247f67dbe2b929f0edda4afd.jpeg~tplv-obj.image"],"width":750},{"avg_color":"#E0C8BC","banner_type":0,"height":200,"id":2862,"log_extra":{},"schema_url":"sslocal://webcast_official_channel_live?user_id=55872310059&enable_feed_drawer=1&enter_from_merge=live_merge_banner","tab_types":[],"title":"抖音才艺麦序房轮播频道","uri":"webcast/2e0bbf071fa09df64edc3099c8d2badd.jpeg","url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/2e0bbf071fa09df64edc3099c8d2badd.jpeg~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/2e0bbf071fa09df64edc3099c8d2badd.jpeg~tplv-obj.image"],"width":750}],"banners_type":0,"switch_type":0,"title":"","total":2}
         * cost : 553
         * has_more : true
         * is_backup : 0
         * log_pb : {"impr_id":"202009211620200101310340742D657405"}
         * max_time : 1600676420717
         * min_time : 0
         * now : 1600676420722
         * style : 3
         * total : 3
         * unread_extra : {"channel_id":21,"req_from":"enter_auto_feed_draw_refresh","gen_time":1600676420}
         */

        private BannerBean banner;
        private int cost;
        private boolean has_more;
        private int is_backup;
        private LogPbBean log_pb;
        private long max_time;
        private int min_time;
        private long now;
        private int style;
        private int total;
        private String unread_extra;

        @NoArgsConstructor
        @Data
        public static class BannerBean {
            /**
             * banners : [{"avg_color":"#FFEBEB","banner_type":0,"height":200,"id":2720,"log_extra":{},"schema_url":"sslocal://webcast_webview?url=https%3A%2F%2Fsf3-scmcdn-tos.pstatp.com%2Fgoofy%2Fecommerce%2Ffe_ecommerce_activity%2Fpages%2Fseptember19_promotion%2Fviews%2Fmiddletail_anchor%2Findex.html%3Fstatus_bar_color%3Dblack%26status_bar_bg_color%3Dwhite%26enter_from%3D12%26type%3Dfullscreen%26gravity%3Dbottom%26hide_nav_bar%3D1%26web_bg_color%3D912cdb%26height_percent%3D100%26__live_platform__%3Dwebcast%26from_live%3Dtrue%26show_back%3D1%26hide_more%3D1%26hide_nav_bar%3D1%26hide_status_bar%3D1%26web_bg_color%3Dundefined&show_back=1&type=fullscreen&title=undefined&hide_more=1&hide_nav_bar=1&hide_status_bar=1","tab_types":[],"title":"919电商","uri":"webcast/583c022a247f67dbe2b929f0edda4afd.jpeg","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/583c022a247f67dbe2b929f0edda4afd.jpeg~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/583c022a247f67dbe2b929f0edda4afd.jpeg~tplv-obj.image"],"width":750},{"avg_color":"#E0C8BC","banner_type":0,"height":200,"id":2862,"log_extra":{},"schema_url":"sslocal://webcast_official_channel_live?user_id=55872310059&enable_feed_drawer=1&enter_from_merge=live_merge_banner","tab_types":[],"title":"抖音才艺麦序房轮播频道","uri":"webcast/2e0bbf071fa09df64edc3099c8d2badd.jpeg","url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/2e0bbf071fa09df64edc3099c8d2badd.jpeg~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/2e0bbf071fa09df64edc3099c8d2badd.jpeg~tplv-obj.image"],"width":750}]
             * banners_type : 0
             * switch_type : 0
             * title :
             * total : 2
             */

            private int banners_type;
            private int switch_type;
            private String title;
            private int total;
            private List<BannersBean> banners;

            @NoArgsConstructor
            @Data
            public static class BannersBean {
                /**
                 * avg_color : #FFEBEB
                 * banner_type : 0
                 * height : 200
                 * id : 2720
                 * log_extra : {}
                 * schema_url : sslocal://webcast_webview?url=https%3A%2F%2Fsf3-scmcdn-tos.pstatp.com%2Fgoofy%2Fecommerce%2Ffe_ecommerce_activity%2Fpages%2Fseptember19_promotion%2Fviews%2Fmiddletail_anchor%2Findex.html%3Fstatus_bar_color%3Dblack%26status_bar_bg_color%3Dwhite%26enter_from%3D12%26type%3Dfullscreen%26gravity%3Dbottom%26hide_nav_bar%3D1%26web_bg_color%3D912cdb%26height_percent%3D100%26__live_platform__%3Dwebcast%26from_live%3Dtrue%26show_back%3D1%26hide_more%3D1%26hide_nav_bar%3D1%26hide_status_bar%3D1%26web_bg_color%3Dundefined&show_back=1&type=fullscreen&title=undefined&hide_more=1&hide_nav_bar=1&hide_status_bar=1
                 * tab_types : []
                 * title : 919电商
                 * uri : webcast/583c022a247f67dbe2b929f0edda4afd.jpeg
                 * url_list : ["http://p3-webcast-dycdn.byteimg.com/img/webcast/583c022a247f67dbe2b929f0edda4afd.jpeg~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/583c022a247f67dbe2b929f0edda4afd.jpeg~tplv-obj.image"]
                 * width : 750
                 */

                private String avg_color;
                private int banner_type;
                private int height;
                private int id;
                private LogExtraBean log_extra;
                private String schema_url;
                private String title;
                private String uri;
                private int width;
                private List<?> tab_types;
                private List<String> url_list;

                @NoArgsConstructor
                @Data
                public static class LogExtraBean {
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class LogPbBean {
            /**
             * impr_id : 202009211620200101310340742D657405
             */

            private String impr_id;
        }
    }

    @NoArgsConstructor
    @Data
    public static class DataBeanXX {
        private String ad;
        private DataBeanX data;
        private boolean is_pseudo_living;
        private boolean is_recommend_card;
        private String live_reason;
        private String rid;
        private int type;
        private List<?> tabs;
        private List<?> tags;

        @NoArgsConstructor
        @Data
        public static class DataBeanX {
            /**
             * admin_user_ids : []
             * anchor_scheduled_time_text :
             * anchor_share_text : #在抖音，记录美好生活#【知慧情感主播】正在直播，来和我一起支持TA吧。复制下方链接，打开【抖音短视频】，直接观看直播！
             * anchor_tab_type : 0
             * app_id : 0
             * auto_cover : 0
             * base_category : 0
             * book_end_time : 0
             * book_time : 0
             * business_live : 0
             * category : 0
             * cell_style : 3
             * challenge_info : {"cid":"1677448373270536","cha_name":"直播人气粉丝团","desc":"海量资源加持，你就是直播未来人气主播！人气周榜为代表主播热度和粉丝团支持度的榜单，本周9月13日20:30开启-9月20日20:30结榜，Top10主播和TA的粉丝团赢得人气团称号并获得奖励","schema":"aweme://aweme/challenge/detail?cid=1677448373270536","author":{"uid":"6796248446","short_id":"52","nickname":"抖音小助手","gender":1,"signature":"本宝宝暂时还没想到个性签名","avatar_larger":{"uri":"312f4000941e3f5577e3c","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/312f4000941e3f5577e3c.jpeg?from=4010531038","https://p29-dy.byteimg.com/aweme/1080x1080/312f4000941e3f5577e3c.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/312f4000941e3f5577e3c.jpeg?from=4010531038"],"width":720,"height":720},"avatar_thumb":{"uri":"312f4000941e3f5577e3c","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/312f4000941e3f5577e3c.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/100x100/312f4000941e3f5577e3c.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/aweme/100x100/312f4000941e3f5577e3c.jpeg?from=4010531038"],"width":720,"height":720},"avatar_medium":{"uri":"312f4000941e3f5577e3c","url_list":["https://p29-dy.byteimg.com/aweme/720x720/312f4000941e3f5577e3c.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/aweme/720x720/312f4000941e3f5577e3c.jpeg?from=4010531038","https://p9-dy.byteimg.com/aweme/720x720/312f4000941e3f5577e3c.jpeg?from=4010531038"],"width":720,"height":720},"birthday":"","is_verified":true,"follow_status":0,"aweme_count":0,"following_count":0,"follower_count":0,"favoriting_count":0,"total_favorited":0,"is_block":false,"hide_search":true,"constellation":6,"location":"","hide_location":false,"weibo_verify":"","custom_verify":"","unique_id":"douyin","bind_phone":"","special_lock":0,"need_recommend":0,"is_binded_weibo":false,"weibo_name":"","weibo_schema":"","weibo_url":"","story_open":false,"story_count":0,"has_facebook_token":false,"has_twitter_token":false,"fb_expire_time":0,"tw_expire_time":0,"has_youtube_token":false,"youtube_expire_time":0,"room_id":0,"live_verify":0,"authority_status":0,"verify_info":"","shield_follow_notice":0,"shield_digg_notice":0,"shield_comment_notice":0,"school_name":"","school_poi_id":"","school_type":0,"with_commerce_entry":false,"verification_type":1,"enterprise_verify_reason":"抖音短视频官方账号","is_ad_fake":false,"followers_detail":null,"region":"CN","account_region":"","sync_to_toutiao":0,"commerce_user_level":1,"live_agreement":0,"platform_sync_info":null,"with_shop_entry":false,"is_discipline_member":false,"secret":0,"has_orders":false,"prevent_download":false,"show_image_bubble":false,"geofencing":[],"unique_id_modify_time":1600676420,"video_icon":{"uri":"","url_list":[],"width":720,"height":720},"ins_id":"","google_account":"","youtube_channel_id":"","youtube_channel_title":"","apple_account":0,"with_dou_entry":false,"with_fusion_shop_entry":false,"is_phone_binded":false,"accept_private_policy":false,"twitter_id":"","twitter_name":"","user_canceled":false,"has_email":false,"is_gov_media_vip":false,"live_agreement_time":0,"status":1,"create_time":0,"avatar_uri":"312f4000941e3f5577e3c","follower_status":0,"neiguang_shield":0,"comment_setting":0,"duet_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"user_rate":1,"download_setting":-1,"download_prompt_ts":0,"react_setting":0,"live_commerce":false,"cover_url":[{"uri":"c8510002be9a3a61aad2","url_list":["https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=273881474","https://p1-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=273881474","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=273881474"],"width":720,"height":720}],"language":"zh-Hans","has_insights":false,"item_list":null,"user_mode":0,"user_period":0,"has_unread_story":false,"new_story_cover":null,"is_star":false,"cv_level":"","type_label":null,"ad_cover_url":null,"comment_filter_status":0,"avatar_168x168":{"uri":"312f4000941e3f5577e3c","url_list":["https://p29-dy.byteimg.com/img/312f4000941e3f5577e3c~c5_168x168.webp?from=4010531038","https://p26-dy.byteimg.com/img/312f4000941e3f5577e3c~c5_168x168.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/312f4000941e3f5577e3c~c5_168x168.webp?from=4010531038"],"width":720,"height":720},"avatar_300x300":{"uri":"312f4000941e3f5577e3c","url_list":["https://p26-dy.byteimg.com/img/312f4000941e3f5577e3c~c5_300x300.webp?from=4010531038","https://p9-dy.byteimg.com/img/312f4000941e3f5577e3c~c5_300x300.webp?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/312f4000941e3f5577e3c~c5_300x300.webp?from=4010531038"],"width":720,"height":720},"relative_users":null,"cha_list":null,"sec_uid":"MS4wLjABAAAAGA9bHrExvrQmowuVfRZxjG4s07M7EUjf1PlaHRHqdls","need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null,"stitch_setting":0,"enable_nearby_visible":true},"user_count":3201,"share_info":{"share_url":"https://www.iesdouyin.com/share/challenge/1677448373270536/?u_code=0","share_weibo_desc":"我在抖音参加#直播人气粉丝团 ","share_desc":"海量资源加持，你就是直播未来人气主播！人气周榜为代表主播热度和粉丝团支持度的榜单，本周9月13日20:30开启-9月20日20:30结榜，Top10主播和TA的粉丝团赢得人气团称号并获得奖励","share_title":"我在抖音参加#直播人气粉丝团 ","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"我在抖音参加#直播人气粉丝团 "},"connect_music":[],"type":2,"sub_type":0,"is_pgcshow":false,"collect_stat":0,"is_challenge":0,"view_count":232269386,"is_commerce":false,"hashtag_profile":"douyin-admin-obj/8c7cfa97cceef6c0d233577e675fc0b2","cha_attrs":null,"banner_list":null,"extra_attr":{"is_live":true},"show_items":null}
             * client_version : 120800
             * comment_box : {"placeholder":"说点什么..."}
             * comment_name_mode : 0
             * common_label_list :
             * content_label : {"avg_color":"#FFFFFF","height":0,"image_type":20,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_cover_redPackage_webcast_1_2.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_1_2.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_1_2.png~tplv-obj.image"],"width":0}
             * content_tag : 语音互动
             * cover : {"avg_color":"#A37C96","height":400,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/6872991428411476739","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/6872991428411476739~tplv-resize:400:400.webp","http://p3-webcast-dycdn.byteimg.com/img/webcast/6872991428411476739~tplv-resize:400:400.webp"],"width":400}
             * create_time : 1600675319
             * deco_list : []
             * distance :
             * distance_city :
             * distance_km :
             * dynamic_cover_dict : {}
             * dynamic_cover_uri :
             * enable_room_perspective : false
             * fansclub_msg_style : 0
             * fcdn_appid : 0
             * feed_room_label : {"avg_color":"#F0F0F0","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/2ea90002aca1159b5c67","url_list":["http://p9-webcast-dycdn.byteimg.com/img/webcast/2ea90002aca1159b5c67~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/2ea90002aca1159b5c67~tplv-obj.image"],"width":0}
             * finish_reason : 0
             * finish_time : 1600676415
             * finish_url :
             * follow_msg_style : 0
             * forum_extra_data :
             * gift_msg_style : 0
             * group_id : 0
             * group_source : 22
             * guide_button : {"avg_color":"#7A5353","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_button_togather_3x.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_button_togather_3x.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_button_togather_3x.png~tplv-obj.image"],"width":0}
             * has_commerce_goods : true
             * hot_sentence_info :
             * id : 6874848145021340420
             * id_str : 6874848145021340420
             * introduction :
             * is_replay : false
             * is_show_inquiry_ball : false
             * is_show_user_card_switch : true
             * last_ping_time : 0
             * layout : 0
             * like_count : 150755
             * linker_map : {}
             * linkmic_layout : 1
             * live_distribution : []
             * live_id : 1
             * live_type_audio : false
             * live_type_linkmic : false
             * live_type_normal : true
             * live_type_official : false
             * live_type_sandbox : false
             * live_type_screenshot : false
             * live_type_third_party : false
             * location :
             * lottery_finish_time : 0
             * luckymoney_num : 2
             * mosaic_status : 0
             * mosaic_tip :
             * orientation : 0
             * os_type : 2
             * owner : {"adversary_authorization_info":3,"adversary_user_status":0,"allow_be_located":false,"allow_find_by_contacts":false,"allow_others_download_video":false,"allow_others_download_when_sharing_video":false,"allow_share_show_profile":false,"allow_show_in_gossip":false,"allow_show_my_action":false,"allow_strange_comment":false,"allow_unfollower_comment":false,"allow_use_linkmic":false,"authorization_info":3,"avatar_large":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"1080x1080/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512","url_list":["https://p9-dy.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_1080x1080.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_1080x1080.jpeg?from=4010531038","https://p26-dy.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_1080x1080.jpeg?from=4010531038"],"width":0},"avatar_medium":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"720x720/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512","url_list":["https://p26-dy.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_720x720.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_720x720.jpeg?from=4010531038"],"width":0},"avatar_thumb":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"100x100/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512","url_list":["https://p29-dy.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_100x100.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_100x100.jpeg?from=4010531038","https://p6-dy-ipv6.byteimg.com/img/tos-cn-i-0813/506005c414f641fd8e7d15cf05405512~c5_100x100.jpeg?from=4010531038"],"width":0},"badge_image_list":[{"avg_color":"","height":16,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_honor_level_icon_new_21.png","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_21.png~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_21.png~tplv-obj.image"],"width":32}],"bg_img_url":"","birthday":0,"birthday_description":"","birthday_valid":false,"block_status":0,"city":"","comment_restrict":0,"commerce_webcast_config_ids":[],"constellation":"","create_time":0,"disable_ichat":0,"display_id":"zhuihui869","enable_ichat_img":0,"exp":0,"experience":0,"fan_ticket_count":0,"fans_club":{"data":{"anchor_id":0,"available_gift_ids":[],"badge":{"icons":{"0":{"avg_color":"","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"","url_list":[],"width":0}},"title":""},"club_name":"","level":0,"user_fans_club_status":0},"prefer_data":{}},"fold_stranger_chat":false,"follow_info":{"follow_status":0,"follower_count":236792,"following_count":885,"push_status":0},"follow_status":0,"gender":2,"hotsoon_verified":false,"hotsoon_verified_reason":"","ichat_restrict_type":0,"id":69240559170,"id_str":"69240559170","income_share_percent":0,"is_follower":false,"is_following":false,"level":0,"link_mic_stats":1,"media_badge_image_list":[],"modify_time":1600676301,"need_profile_guide":false,"new_real_time_icons":[],"nickname":"知慧情感主播","own_room":{"room_ids":[6874848145021340420],"room_ids_str":["6874848145021340420"]},"pay_grade":{"grade_banner":"","grade_describe":"距离22级还差1184抖币","grade_icon_list":[],"level":21,"name":"","new_im_icon_with_level":{"avg_color":"","height":16,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_honor_level_icon_new_21.png","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_21.png~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/aweme_honor_level_icon_new_21.png~tplv-obj.image"],"width":32},"new_live_icon":{"avg_color":"","height":12,"image_type":1,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_pay_grade_2x_20_24.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_20_24.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/aweme_pay_grade_2x_20_24.png~tplv-obj.image"],"width":12},"next_diamond":0,"next_name":"","next_privileges":"","now_diamond":0,"pay_diamond_bak":0,"score":5416,"screen_chat_type":0,"this_grade_max_diamond":6600,"this_grade_min_diamond":5000,"total_diamond_count":5416,"upgrade_need_consume":0},"pay_score":5416,"pay_scores":0,"push_comment_status":false,"push_digg":false,"push_follow":false,"push_friend_action":false,"push_ichat":false,"push_status":false,"push_video_post":false,"push_video_recommend":false,"real_time_icons":[],"sec_uid":"MS4wLjABAAAA3P7wKEZuT1x8gW_C9pkfw1m_HA43A89tcXtsxcSZDoY","secret":0,"share_qrcode_uri":"88730000b20281defd21","short_id":986321005,"signature":"💓情感连麦v📲zhihui_69\n💓我叫知慧，一名情感咨询师\n💓如果你有婚姻、情感的困惑、\n烦心事、无法与他人交流，\n请走进我的直播间，\n连麦诉说心声，\n用中立的角度帮你分析\n💓直播时间\n上午11点-2点\n下午4点-7点\n商务合作dongdongqiang68","special_id":"","status":1,"telephone":"","ticket_count":600033,"top_fans":[],"top_vip_no":0,"total_recharge_diamond_count":0,"user_attr":{"is_admin":false,"is_muted":false,"is_super_admin":false},"user_role":0,"verified":true,"verified_content":"","verified_mobile":false,"verified_reason":"","with_car_management_permission":false,"with_commerce_permission":true,"with_fusion_shop_entry":true}
             * owner_device_id : 0
             * owner_user_id : 69240559170
             * popularity : 0
             * popularity_str :
             * pre_enter_time : 0
             * preview_copy : 世界很大，但我们很有缘~
             * preview_flow_tag : 0
             * private_info :
             * ranklist_audience_type : 0
             * real_distance :
             * relation_tag :
             * replay : false
             * replay_location : 0
             * room_audit_status : 0
             * room_auth : {"AudioChat":0,"Banner":1,"Chat":true,"CommerceCard":1,"Danmaku":false,"DanmakuDefault":1,"Digg":true,"DonationSticker":2,"Gift":true,"GiftAnchorMt":1,"HourRank":0,"Landscape":1,"LandscapeChat":1,"LuckMoney":true,"MoreAnchor":1,"POI":true,"Props":true,"PublicScreen":1,"RecordScreen":1,"RoomContributor":true,"Share":1,"UserCard":true,"UserCorner":1}
             * room_create_ab_param :
             * room_layout : 0
             * room_tabs : []
             * room_tag : 0
             * scroll_config :
             * search_id : 0
             * sell_goods : false
             * share_msg_style : 0
             * share_url : https://webcast.amemv.com/webcast/reflow/6874848145021340420
             * short_title :
             * short_touch_area_config : {"elements":{"1":{"priority":0,"type":1},"10":{"priority":2,"type":10},"12":{"priority":2,"type":12},"2":{"priority":0,"type":2},"3":{"priority":0,"type":3},"4":{"priority":2,"type":4},"5":{"priority":3,"type":5},"6":{"priority":2,"type":6},"7":{"priority":2,"type":7},"8":{"priority":2,"type":8},"9":{"priority":2,"type":9}}}
             * stamps :
             * start_time : 0
             * stats : {"digg_count":0,"dou_plus_promotion":"","enter_count":0,"fan_ticket":18524,"follow_count":1059,"gift_uv_count":219,"id":6874848145021340420,"id_str":"6874848145021340420","like_count":0,"money":0,"total_user":133963,"total_user_desp":"","user_count_composition":{"city":0,"my_follow":0.01,"other":0.81,"video_detail":0.17},"watermelon":0}
             * status : 2
             * stream_close_time : 0
             * stream_id : 395649870391410789
             * stream_id_str : 395649870391410789
             * stream_provider : 0
             * stream_url : {"candidate_resolution":[],"complete_push_urls":[],"default_resolution":"ORIGION","extra":{"anchor_interact_profile":0,"audience_interact_profile":0,"bframe_enable":false,"bitrate_adapt_strategy":0,"bytevc1_enable":false,"default_bitrate":800,"fps":15,"gop_sec":0,"h265_enable":false,"hardware_encode":false,"height":864,"max_bitrate":900,"min_bitrate":300,"roi":false,"sw_roi":false,"video_profile":0,"width":480},"flv_pull_url":{},"flv_pull_url_params":{},"hls_pull_url":"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.m3u8","hls_pull_url_map":{},"hls_pull_url_params":"{\"VCodec\":\"h264\"}","id":395649870391410789,"id_str":"395649870391410789","live_core_sdk_data":{"pull_data":{"options":{"default_quality":{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""},"qualities":[{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""}]},"stream_data":"{\"common\":{\"session_id\":\"037-202009211620200101310340742D657405\"},\"data\":{\"origin\":{\"main\":{\"flv\":\"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.flv\",\"hls\":\"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.m3u8\",\"cmaf\":\"\",\"dash\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"gop\\\":4,\\\"resolution\\\":\\\"or4\\\",\\\"vbitrate\\\":0}\"}}}}"}},"provider":0,"push_urls":[],"resolution_name":{"FULL_HD1":"蓝光","HD1":"超清","ORIGION":"原画","SD1":"标清","SD2":"高清"},"rtmp_pull_url":"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.flv","rtmp_pull_url_params":"{\"VCodec\":\"h264\"}","rtmp_push_url":"","rtmp_push_url_params":"","stream_control_type":0}
             * sun_daily_icon_content :
             * tags : []
             * title : 现任打前妻为何
             * top_fans : []
             * use_filter : false
             * user_count : 20951
             * user_share_text : #在抖音，记录美好生活#【知慧情感主播】正在直播，来和我一起支持TA吧。复制下方链接，打开【抖音短视频】，直接观看直播！
             * vertical_cover_uri :
             * vid :
             * video_feed_tag : 直播中
             * wait_copy : 认识一个人靠缘分，了解一个人靠耐心
             * web_count : 0
             * webcast_comment_tcs : 0
             * webcast_sdk_version : 0
             * with_draw_something : false
             * with_ktv : false
             * with_linkmic : false
             */

            private String anchor_scheduled_time_text;
            private String anchor_share_text;
            private int anchor_tab_type;
            private int app_id;
            private int auto_cover;
            private int base_category;
            private int book_end_time;
            private int book_time;
            private int business_live;
            private int category;
            private int cell_style;
            private String challenge_info;
            private int client_version;
            private CommentBoxBean comment_box;
            private int comment_name_mode;
            private String common_label_list;
            private CoverBean content_label;
            private String content_tag;
            private CoverBean cover;
            private int create_time;
            private String distance;
            private String distance_city;
            private String distance_km;
            private CoverBean dynamic_cover_dict;
            private String dynamic_cover_uri;
            private boolean enable_room_perspective;
            private int fansclub_msg_style;
            private int fcdn_appid;
            private CoverBean feed_room_label;
            private int finish_reason;
            private int finish_time;
            private String finish_url;
            private int follow_msg_style;
            private String forum_extra_data;
            private int gift_msg_style;
            private int group_id;
            private int group_source;
            private GuideButtonBean guide_button;
            private boolean has_commerce_goods;
            private String hot_sentence_info;
            private long id;
            private String id_str;
            private String introduction;
            private boolean is_replay;
            private boolean is_show_inquiry_ball;
            private boolean is_show_user_card_switch;
            private int last_ping_time;
            private int layout;
            private int like_count;
            private LinkerMapBean linker_map;
            private int linkmic_layout;
            private int live_id;
            private boolean live_type_audio;
            private boolean live_type_linkmic;
            private boolean live_type_normal;
            private boolean live_type_official;
            private boolean live_type_sandbox;
            private boolean live_type_screenshot;
            private boolean live_type_third_party;
            private String location;
            private int lottery_finish_time;
            private int luckymoney_num;
            private int mosaic_status;
            private String mosaic_tip;
            private int orientation;
            private int os_type;
            private CoverBean owner;
            private int owner_device_id;
            private long owner_user_id;
            private int popularity;
            private String popularity_str;
            private int pre_enter_time;
            private String preview_copy;
            private int preview_flow_tag;
            private String private_info;
            private int ranklist_audience_type;
            private String real_distance;
            private String relation_tag;
            private boolean replay;
            private int replay_location;
            private int room_audit_status;
            private RoomAuthBean room_auth;
            private String room_create_ab_param;
            private int room_layout;
            private int room_tag;
            private String scroll_config;
            private int search_id;
            private boolean sell_goods;
            private int share_msg_style;
            private String share_url;
            private String short_title;
            private ShortTouchAreaConfigBean short_touch_area_config;
            private String stamps;
            private int start_time;
            private StatsBean stats;
            private int status;
            private int stream_close_time;
            private long stream_id;
            private String stream_id_str;
            private int stream_provider;
            private StreamUrlBean stream_url;
            private String sun_daily_icon_content;
            private String title;
            private boolean use_filter;
            private int user_count;
            private String user_share_text;
            private String vertical_cover_uri;
            private String vid;
            private String video_feed_tag;
            private String wait_copy;
            private int web_count;
            private int webcast_comment_tcs;
            private int webcast_sdk_version;
            private boolean with_draw_something;
            private boolean with_ktv;
            private boolean with_linkmic;
            private List<?> admin_user_ids;
            private List<?> deco_list;
            private List<?> live_distribution;
            private List<?> room_tabs;
            private List<?> tags;
            private List<?> top_fans;

            @NoArgsConstructor
            @Data
            public static class CommentBoxBean {
                /**
                 * placeholder : 说点什么...
                 */

                private String placeholder;
            }

            @NoArgsConstructor
            @Data
            public static class GuideButtonBean {
            }

            @NoArgsConstructor
            @Data
            public static class LinkerMapBean {
            }

            @NoArgsConstructor
            @Data
            public static class RoomAuthBean {
                /**
                 * AudioChat : 0
                 * Banner : 1
                 * Chat : true
                 * CommerceCard : 1
                 * Danmaku : false
                 * DanmakuDefault : 1
                 * Digg : true
                 * DonationSticker : 2
                 * Gift : true
                 * GiftAnchorMt : 1
                 * HourRank : 0
                 * Landscape : 1
                 * LandscapeChat : 1
                 * LuckMoney : true
                 * MoreAnchor : 1
                 * POI : true
                 * Props : true
                 * PublicScreen : 1
                 * RecordScreen : 1
                 * RoomContributor : true
                 * Share : 1
                 * UserCard : true
                 * UserCorner : 1
                 */

                private int AudioChat;
                private int Banner;
                private boolean Chat;
                private int CommerceCard;
                private boolean Danmaku;
                private int DanmakuDefault;
                private boolean Digg;
                private int DonationSticker;
                private boolean Gift;
                private int GiftAnchorMt;
                private int HourRank;
                private int Landscape;
                private int LandscapeChat;
                private boolean LuckMoney;
                private int MoreAnchor;
                private boolean POI;
                private boolean Props;
                private int PublicScreen;
                private int RecordScreen;
                private boolean RoomContributor;
                private int Share;
                private boolean UserCard;
                private int UserCorner;
            }

            @NoArgsConstructor
            @Data
            public static class ShortTouchAreaConfigBean {
                /**
                 * elements : {"1":{"priority":0,"type":1},"10":{"priority":2,"type":10},"12":{"priority":2,"type":12},"2":{"priority":0,"type":2},"3":{"priority":0,"type":3},"4":{"priority":2,"type":4},"5":{"priority":3,"type":5},"6":{"priority":2,"type":6},"7":{"priority":2,"type":7},"8":{"priority":2,"type":8},"9":{"priority":2,"type":9}}
                 */

                private ElementsBean elements;

                @NoArgsConstructor
                @Data
                public static class ElementsBean {
                    /**
                     * 1 : {"priority":0,"type":1}
                     * 10 : {"priority":2,"type":10}
                     * 12 : {"priority":2,"type":12}
                     * 2 : {"priority":0,"type":2}
                     * 3 : {"priority":0,"type":3}
                     * 4 : {"priority":2,"type":4}
                     * 5 : {"priority":3,"type":5}
                     * 6 : {"priority":2,"type":6}
                     * 7 : {"priority":2,"type":7}
                     * 8 : {"priority":2,"type":8}
                     * 9 : {"priority":2,"type":9}
                     */

                    private _$1Bean _$1;
                    private _$1Bean _$10;
                    private _$1Bean _$12;
                    private _$1Bean _$2;
                    private _$1Bean _$3;
                    private _$1Bean _$4;
                    private _$1Bean _$5;
                    private _$1Bean _$6;
                    private _$1Bean _$7;
                    private _$1Bean _$8;
                    private _$1Bean _$9;

                    @NoArgsConstructor
                    @Data
                    public static class _$1Bean {
                        /**
                         * priority : 0
                         * type : 1
                         */

                        private int priority;
                        private int type;
                    }
                }
            }

            @NoArgsConstructor
            @Data
            public static class StatsBean {
                /**
                 * digg_count : 0
                 * dou_plus_promotion :
                 * enter_count : 0
                 * fan_ticket : 18524
                 * follow_count : 1059
                 * gift_uv_count : 219
                 * id : 6874848145021340420
                 * id_str : 6874848145021340420
                 * like_count : 0
                 * money : 0
                 * total_user : 133963
                 * total_user_desp :
                 * user_count_composition : {"city":0,"my_follow":0.01,"other":0.81,"video_detail":0.17}
                 * watermelon : 0
                 */

                private int digg_count;
                private String dou_plus_promotion;
                private int enter_count;
                private int fan_ticket;
                private int follow_count;
                private int gift_uv_count;
                private long id;
                private String id_str;
                private int like_count;
                private int money;
                private int total_user;
                private String total_user_desp;
                private UserCountCompositionBean user_count_composition;
                private int watermelon;

                @NoArgsConstructor
                @Data
                public static class UserCountCompositionBean {
                    /**
                     * city : 0
                     * my_follow : 0.01
                     * other : 0.81
                     * video_detail : 0.17
                     */

                    private double city;
                    private double my_follow;
                    private double other;
                    private double video_detail;
                }
            }

            @NoArgsConstructor
            @Data
            public static class StreamUrlBean {
                /**
                 * candidate_resolution : []
                 * complete_push_urls : []
                 * default_resolution : ORIGION
                 * extra : {"anchor_interact_profile":0,"audience_interact_profile":0,"bframe_enable":false,"bitrate_adapt_strategy":0,"bytevc1_enable":false,"default_bitrate":800,"fps":15,"gop_sec":0,"h265_enable":false,"hardware_encode":false,"height":864,"max_bitrate":900,"min_bitrate":300,"roi":false,"sw_roi":false,"video_profile":0,"width":480}
                 * flv_pull_url : {}
                 * flv_pull_url_params : {}
                 * hls_pull_url : http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.m3u8
                 * hls_pull_url_map : {}
                 * hls_pull_url_params : {"VCodec":"h264"}
                 * id : 395649870391410789
                 * id_str : 395649870391410789
                 * live_core_sdk_data : {"pull_data":{"options":{"default_quality":{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""},"qualities":[{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""}]},"stream_data":"{\"common\":{\"session_id\":\"037-202009211620200101310340742D657405\"},\"data\":{\"origin\":{\"main\":{\"flv\":\"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.flv\",\"hls\":\"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.m3u8\",\"cmaf\":\"\",\"dash\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"gop\\\":4,\\\"resolution\\\":\\\"or4\\\",\\\"vbitrate\\\":0}\"}}}}"}}
                 * provider : 0
                 * push_urls : []
                 * resolution_name : {"FULL_HD1":"蓝光","HD1":"超清","ORIGION":"原画","SD1":"标清","SD2":"高清"}
                 * rtmp_pull_url : http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.flv
                 * rtmp_pull_url_params : {"VCodec":"h264"}
                 * rtmp_push_url :
                 * rtmp_push_url_params :
                 * stream_control_type : 0
                 */

                private String default_resolution;
                private ExtraBeanX extra;
                private FlvPullUrlBean flv_pull_url;
                private FlvPullUrlParamsBean flv_pull_url_params;
                private String hls_pull_url;
                private HlsPullUrlMapBean hls_pull_url_map;
                private String hls_pull_url_params;
                private long id;
                private String id_str;
                private LiveCoreSdkDataBean live_core_sdk_data;
                private int provider;
                private ResolutionNameBean resolution_name;
                private String rtmp_pull_url;
                private String rtmp_pull_url_params;
                private String rtmp_push_url;
                private String rtmp_push_url_params;
                private int stream_control_type;
                private List<?> candidate_resolution;
                private List<?> complete_push_urls;
                private List<?> push_urls;

                @NoArgsConstructor
                @Data
                public static class ExtraBeanX {
                }

                @NoArgsConstructor
                @Data
                public static class FlvPullUrlBean {
                }

                @NoArgsConstructor
                @Data
                public static class FlvPullUrlParamsBean {
                }

                @NoArgsConstructor
                @Data
                public static class HlsPullUrlMapBean {
                }

                @NoArgsConstructor
                @Data
                public static class LiveCoreSdkDataBean {
                    /**
                     * pull_data : {"options":{"default_quality":{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""},"qualities":[{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""}]},"stream_data":"{\"common\":{\"session_id\":\"037-202009211620200101310340742D657405\"},\"data\":{\"origin\":{\"main\":{\"flv\":\"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.flv\",\"hls\":\"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.m3u8\",\"cmaf\":\"\",\"dash\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"gop\\\":4,\\\"resolution\\\":\\\"or4\\\",\\\"vbitrate\\\":0}\"}}}}"}
                     */

                    private PullDataBean pull_data;

                    @NoArgsConstructor
                    @Data
                    public static class PullDataBean {
                        /**
                         * options : {"default_quality":{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""},"qualities":[{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""}]}
                         * stream_data : {"common":{"session_id":"037-202009211620200101310340742D657405"},"data":{"origin":{"main":{"flv":"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.flv","hls":"http://pull-f3.douyincdn.com/stage/stream-395649870391410789_or4.m3u8","cmaf":"","dash":"","sdk_params":"{\"VCodec\":\"h264\",\"gop\":4,\"resolution\":\"or4\",\"vbitrate\":0}"}}}}
                         */

                        private OptionsBean options;
                        private String stream_data;

                        @NoArgsConstructor
                        @Data
                        public static class OptionsBean {
                            /**
                             * default_quality : {"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""}
                             * qualities : [{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""}]
                             */

                            private DefaultQualityBean default_quality;
                            private List<DefaultQualityBean> qualities;

                            @NoArgsConstructor
                            @Data
                            public static class DefaultQualityBean {
                                /**
                                 * level : 0
                                 * name : 原画
                                 * resolution :
                                 * sdk_key : origin
                                 * v_codec :
                                 */

                                private int level;
                                private String name;
                                private String resolution;
                                private String sdk_key;
                                private String v_codec;
                            }
                        }
                    }
                }

                @NoArgsConstructor
                @Data
                public static class ResolutionNameBean {
                    /**
                     * FULL_HD1 : 蓝光
                     * HD1 : 超清
                     * ORIGION : 原画
                     * SD1 : 标清
                     * SD2 : 高清
                     */

                    private String FULL_HD1;
                    private String HD1;
                    private String ORIGION;
                    private String SD1;
                    private String SD2;
                }
            }
        }
    }
}

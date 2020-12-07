package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 23:20
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class PoiAwemeResponse extends BaseResponse{
    private int cursor;
    private int has_more;
    private PoiInfoBean poi_info;
    private String self_pub_aweme_id;
    private List<AwemeInfo> aweme_list;

    @NoArgsConstructor
    @Data
    public static class PoiInfoBean {
        /**
         * icon_on_map : {"uri":"9b92001171754afde148","url_list":["https://p26-dy.byteimg.com/obj/9b92001171754afde148?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/9b92001171754afde148?from=1551292344","https://p9-dy.byteimg.com/obj/9b92001171754afde148?from=1551292344"]}
         * poi_type : 0
         * type_code : 110000
         * cover_thumb : {"url_list":["https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p26-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"],"uri":"42dd001cf2907be11106"}
         * voucher_release_areas : []
         * cover_medium : {"uri":"42dd001cf2907be11106","url_list":["https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p26-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]}
         * poi_voucher :
         * icon_on_entry : {"uri":"2d5d9000661d50bb52ae3","url_list":["https://p1-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344"]}
         * poi_backend_type : {"code":"180101","name":"游玩;景点;风景名胜"}
         * is_admin_area : false
         * effect_ids : null
         * cover_hd : {"uri":"42dd001cf2907be11106","url_list":["https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]}
         * poi_latitude : 38.793988
         * distance :
         * collect_stat : 0
         * poi_id : 6679538858037725191
         * share_info : {"share_url":"https://www.iesdouyin.com/share/poilist/?id=6679538858037725191","share_weibo_desc":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","share_title":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","bool_persist":0}
         * collected_count : 26593
         * item_count : 16083
         * poi_longitude : 115.014636
         * icon_type : 8
         * user_count : 257754
         * cover_large : {"uri":"42dd001cf2907be11106","url_list":["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p26-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]}
         * show_type : 1
         * expand_type : 1
         * icon_on_info : {"uri":"98a10025d47fd79cb0aa","url_list":["https://p9-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344","https://p26-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344"]}
         * poi_frontend_type : [{"code":"180101","name":"游玩;景点;风景名胜"}]
         * view_count : 31460801
         * icon_service_type_list : null
         * poi_detail_tags : null
         * poi_name : 庆都山旅游度假区唐尧古镇
         * address_info : {"city":"保定市","district":"唐县","address":"庆都山","simple_addr":"河北省保定市唐县庆都山","city_code":"130600","province":"河北省"}
         */

        private CoverBean icon_on_map;
        private int poi_type;
        private String type_code;
        private CoverBean cover_thumb;
        private CoverBean cover_medium;
        private String poi_voucher;
        private CoverBean icon_on_entry;
        private PoiBackendTypeBean poi_backend_type;
        private boolean is_admin_area;
        private Object effect_ids;
        private CoverBean cover_hd;
        private double poi_latitude;
        private String distance;
        private int collect_stat;
        private String poi_id;
        private ShareInfoBean share_info;
        private String collected_count;
        private int item_count;
        private double poi_longitude;
        private int icon_type;
        private int user_count;
        private CoverBean cover_large;
        private int show_type;
        private int expand_type;
        private CoverBean icon_on_info;
        private String view_count;
        private Object icon_service_type_list;
        private Object poi_detail_tags;
        private String poi_name;
        private AddressInfoBean address_info;
        private List<?> voucher_release_areas;
        private List<PoiBackendTypeBean> poi_frontend_type;

        @NoArgsConstructor
        @Data
        public static class PoiBackendTypeBean {
            /**
             * code : 180101
             * name : 游玩;景点;风景名胜
             */

            private String code;
            private String name;
        }

        @NoArgsConstructor
        @Data
        public static class ShareInfoBean {
            /**
             * share_url : https://www.iesdouyin.com/share/poilist/?id=6679538858037725191
             * share_weibo_desc : 庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里
             * share_title : 庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里
             * bool_persist : 0
             */

            private String share_url;
            private String share_weibo_desc;
            private String share_title;
            private int bool_persist;
        }

        @NoArgsConstructor
        @Data
        public static class AddressInfoBean {
            /**
             * city : 保定市
             * district : 唐县
             * address : 庆都山
             * simple_addr : 河北省保定市唐县庆都山
             * city_code : 130600
             * province : 河北省
             */

            private String city;
            private String district;
            private String address;
            private String simple_addr;
            private String city_code;
            private String province;
        }
    }

    @NoArgsConstructor
    @Data
    public static class AwemeListBean {
        /**
         * long_video : null
         * nearby_level : 0
         * share_info : {"share_quote":"","share_signature_desc":"","share_title":"从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山","share_title_myself":"","share_weibo_desc":"#在抖音，记录美好生活#从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山","share_link_desc":"从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山  %s 复制此链接，打开抖音搜索，直接观看视频！","share_desc":"在抖音，记录美好生活","share_desc_info":"#在抖音，记录美好生活#从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山","share_signature_url":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/video/6891966187299785995/?region=CN&mid=6865468019271863048&u_code=166gl01b5mfa&titleType=title&did=1213500227850904&iid=3007906155084360","bool_persist":0}
         * share_url : https://www.iesdouyin.com/share/video/6891966187299785995/?region=CN&mid=6865468019271863048&u_code=166gl01b5mfa&titleType=title&did=1213500227850904&iid=3007906155084360
         * text_extra : [{"end":45,"hashtag_id":"1665397887645703","hashtag_name":"唐尧古镇","is_commerce":false,"start":40,"type":1},{"end":50,"hashtag_id":"1624818016803854","hashtag_name":"庆都山","is_commerce":false,"start":46,"type":1}]
         * uniqid_position : null
         * bodydance_score : 0
         * is_preview : 0
         * is_top : 0
         * item_react : 0
         * create_time : 1604660928
         * is_hash_tag : 1
         * item_comment_settings : 0
         * poi_patch_info : {"item_patch_poi_prompt_mark":0}
         * author_user_id : 59416769587
         * duration : 17439
         * hybrid_label : null
         * interaction_stickers : null
         * is_pgcshow : false
         * is_vr : false
         * collect_stat : 0
         * distance :
         * geofencing : []
         * is_story : 0
         * story_ttl : 0
         * video_text : []
         * challenge_position : null
         * cmt_swt : false
         * group_id : 6891966187299785995
         * image_infos : null
         * region : CN
         * video_control : {"allow_download":true,"allow_react":true,"prevent_download_type":0,"share_type":1,"show_progress_bar":0,"allow_duet":true,"allow_dynamic_wallpaper":true,"allow_music":true,"allow_stitch":true,"draft_progress_bar":0,"timer_status":1}
         * cha_list : [{"author":{"platform_sync_info":null,"relative_users":null,"cha_list":null,"cover_url":null,"homepage_bottom_toast":null,"need_points":null,"user_tags":null,"white_cover_url":null,"ad_cover_url":null,"ban_user_functions":null,"geofencing":null,"item_list":null,"new_story_cover":null,"type_label":null,"can_set_geofencing":null,"followers_detail":null},"extra_attr":{"is_live":false},"is_commerce":false,"schema":"aweme://aweme/challenge/detail?cid=1665397887645703","show_items":null,"sub_type":0,"banner_list":null,"cid":"1665397887645703","is_challenge":0,"type":1,"user_count":0,"cha_attrs":null,"cha_name":"唐尧古镇","collect_stat":0,"view_count":0,"connect_music":[],"desc":"","hashtag_profile":"image-cut-tos/fb38aa3497e4af85ddf9373ce357317e.jpg","is_pgcshow":false,"share_info":{"share_desc":"在抖音，记录美好生活","share_signature_desc":"","share_title":"我在抖音参加#唐尧古镇 ","share_url":"https://www.iesdouyin.com/share/challenge/1665397887645703/?u_code=166gl01b5mfa","bool_persist":0,"share_desc_info":"我在抖音参加#唐尧古镇 ","share_quote":"","share_signature_url":"","share_title_myself":"","share_title_other":"","share_weibo_desc":"我在抖音参加#唐尧古镇 "}}]
         * desc_language : zh
         * is_relieve : false
         * rate : 12
         * sort_label :
         * user_digged : 0
         * anchors : null
         * aweme_control : {"can_show_comment":true,"can_comment":true,"can_forward":true,"can_share":true}
         * aweme_id : 6891966187299785995
         * city : 131000
         * have_dashboard : false
         * without_watermark : false
         * commerce_config_data : null
         * distribute_type : 1
         * poi_info : {"collected_count":"26593","is_admin_area":false,"poi_longitude":115.014636,"user_count":257754,"cover_medium":{"url_list":["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"],"width":720,"height":720,"uri":"42dd001cf2907be11106"},"distance":"","share_info":{"share_title_other":"","share_url":"https://www.iesdouyin.com/share/poilist/?id=B0FFKHP3OS","share_weibo_desc":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","bool_persist":0,"share_desc":"","share_desc_info":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","share_title":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","share_title_myself":""},"voucher_release_areas":null,"icon_on_map":{"height":720,"uri":"9b92001171754afde148","url_list":["https://p6-dy-ipv6.byteimg.com/obj/9b92001171754afde148?from=2563711402","https://p26-dy.byteimg.com/obj/9b92001171754afde148?from=2563711402","https://p29-dy.byteimg.com/obj/9b92001171754afde148?from=2563711402"],"width":720},"item_count":16083,"poi_frontend_type":null,"poi_latitude":38.793988,"view_count":"31460801","cover_large":{"width":720,"height":720,"uri":"42dd001cf2907be11106","url_list":["https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]},"cover_thumb":{"uri":"42dd001cf2907be11106","url_list":["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"],"width":720,"height":720},"show_type":1,"poi_subtitle":"在你附近的景点","poi_subtitle_type":4,"address_info":{"province":"河北省","simple_addr":"保定市唐县庆都山","city_code":"130600","country_code":"CN","district":"唐县","city_code_v2":"130600","country":"中国","ad_code_v2":"130627","address":"庆都山","city":"保定市"},"collect_stat":0,"effect_ids":null,"icon_service_type_list":null,"icon_type":8,"poi_id":"6679538858037725191","poi_backend_type":{"name":"游玩;景点;风景名胜","code":"180101"},"cover_hd":{"width":720,"height":720,"uri":"42dd001cf2907be11106","url_list":["https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]},"ext_json":"{\"item_ext\":{\"sub_type\":\"风景名胜\"}}","icon_on_entry":{"width":720,"height":720,"uri":"2d5d9000661d50bb52ae3","url_list":["https://p3-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402","https://p9-dy.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402"]},"poi_name":"庆都山旅游度假区唐尧古镇","type_code":"110000","expand_type":1,"icon_on_info":{"height":720,"uri":"98a10025d47fd79cb0aa","url_list":["https://p9-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402","https://p26-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402","https://p29-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402"],"width":720},"poi_detail_tags":null}
         * cover_labels : null
         * report_action : false
         * aweme_type : 0
         * is_in_scope : false
         * item_duet : 0
         * video : {"cdn_url_expired":0,"duration":17439,"height":576,"play_addr_lowbr":{"data_size":3144452,"file_cs":"c:0-19905-b795","height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_h264_540p_1442491","url_list":["http://v27-dy.ixigua.com/53731e58005ebe431a723a21b398714d/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/5fbba07c95fedf39f45265b5d5322785/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME"],"width":720},"use_static_cover":false,"download_addr":{"data_size":4784429,"height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_list":["http://v27-dy.ixigua.com/5ba4ce1df520670e8fd8e2a24912eca1/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/dba4880d8ba47db5f1aab3abf3e94fb3/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME"],"width":720},"has_download_suffix_logo_addr":true,"is_bytevc1":0,"need_set_token":false,"play_addr":{"url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_h264_540p_1442491","url_list":["http://v27-dy.ixigua.com/53731e58005ebe431a723a21b398714d/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/5fbba07c95fedf39f45265b5d5322785/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME"],"width":720,"data_size":3144452,"file_cs":"c:0-19905-b795","height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg"},"play_addr_265":{"data_size":2614304,"file_cs":"c:0-20096-938b","height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_bytevc1_540p_1199290","url_list":["http://v27-dy.ixigua.com/f5f1bad76db3e0881b888c693a44f445/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/e7662faa5c0c06b081aab3f22739b787/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME"],"width":720},"big_thumbs":null,"download_suffix_logo_addr":{"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_list":["http://v27-dy.ixigua.com/5ba4ce1df520670e8fd8e2a24912eca1/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/dba4880d8ba47db5f1aab3abf3e94fb3/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME"],"width":720,"data_size":4784429,"height":720},"dynamic_cover":{"height":720,"uri":"tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929","url_list":["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929?from=2563711402_large","https://p29-dy.byteimg.com/obj/tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929?from=2563711402_large"],"width":720},"origin_cover":{"uri":"tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929","url_list":["https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929~tplv-dy-360p.jpeg?from=2563711402","https://p1-dy-ipv6.byteimg.com/tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929~tplv-dy-360p.jpeg?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929~tplv-dy-360p.jpeg?from=2563711402"],"width":720,"height":720},"play_addr_h264":{"url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_h264_540p_1442491","url_list":["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_POI_AWEME"],"width":720,"data_size":3144452,"file_cs":"c:0-19905-b795","height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg"},"ratio":"540p","width":1020,"bit_rate":[{"bit_rate":1255384,"gear_name":"adapt_lowest_720","is_bytevc1":1,"is_h265":1,"play_addr":{"url_list":["http://v27-dy.ixigua.com/9ba0710af1f6ef66e71ec9c39f5b0aca/5fcbb2f8/video/tos/cn/tos-cn-ve-15/ea5805cf8048446aa3dd53b0d5b5b702/?a=1128&br=3675&bt=1225&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=15&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzc6OmVoPDtlN2Y3Ozo1N2dnYWdnZmZxcGZfLS0yLTBzczJeY2FjNF81MDMwL14tXzI6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/c90b1243ddf4071f19b7e88302e678af/5fcbb2f8/video/tos/cn/tos-cn-ve-15/ea5805cf8048446aa3dd53b0d5b5b702/?a=1128&br=3675&bt=1225&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=15&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzc6OmVoPDtlN2Y3Ozo1N2dnYWdnZmZxcGZfLS0yLTBzczJeY2FjNF81MDMwL14tXzI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_POI_AWEME"],"width":720,"data_size":2736581,"file_cs":"c:0-20096-bbf7","height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_bytevc1_720p_1255384"},"play_addr_265":{"url_list":["http://v27-dy.ixigua.com/9ba0710af1f6ef66e71ec9c39f5b0aca/5fcbb2f8/video/tos/cn/tos-cn-ve-15/ea5805cf8048446aa3dd53b0d5b5b702/?a=1128&br=3675&bt=1225&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=15&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzc6OmVoPDtlN2Y3Ozo1N2dnYWdnZmZxcGZfLS0yLTBzczJeY2FjNF81MDMwL14tXzI6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/c90b1243ddf4071f19b7e88302e678af/5fcbb2f8/video/tos/cn/tos-cn-ve-15/ea5805cf8048446aa3dd53b0d5b5b702/?a=1128&br=3675&bt=1225&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=15&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzc6OmVoPDtlN2Y3Ozo1N2dnYWdnZmZxcGZfLS0yLTBzczJeY2FjNF81MDMwL14tXzI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_POI_AWEME"],"width":720,"data_size":2736581,"file_cs":"c:0-20096-bbf7","height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_bytevc1_720p_1255384"},"quality_type":15},{"bit_rate":1199290,"gear_name":"adapt_540","is_bytevc1":1,"is_h265":1,"play_addr":{"height":720,"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_bytevc1_540p_1199290","url_list":["http://v27-dy.ixigua.com/f5f1bad76db3e0881b888c693a44f445/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/e7662faa5c0c06b081aab3f22739b787/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME"],"width":720,"data_size":2614304,"file_cs":"c:0-20096-938b"},"play_addr_265":{"uri":"v0300f5a0000buiisrtoiaikjdjud3jg","url_key":"v0300f5a0000buiisrtoiaikjdjud3jg_bytevc1_540p_1199290","url_list":["http://v27-dy.ixigua.com/f5f1bad76db3e0881b888c693a44f445/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/e7662faa5c0c06b081aab3f22739b787/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME"],"width":720,"data_size":2614304,"file_cs":"c:0-20096-938b","height":720},"quality_type":28}],"cover":{"height":720,"uri":"tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a","url_list":["https://p9-dy.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.webp?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.webp?from=2563711402_large","https://p5-dy-ipv6.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.webp?from=2563711402_large","https://p9-dy.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.jpeg?from=2563711402_large"],"width":720},"has_watermark":true,"is_callback":true,"is_h265":0,"tags":null}
         * commerce_info : {}
         * misc_info : {"is_teen_video":0,"ocr_location":"{\"x_max\":0.7130721003134797,\"x_min\":0.2845297805642633,\"y_max\":0.9018055555555555,\"y_min\":0.7952777777777779}"}
         * status : {"dont_share_status":0,"is_private":false,"allow_comment":true,"download_status":0,"is_prohibited":false,"reviewed":1,"self_see":false,"is_delete":false,"private_status":0,"review_result":{"review_status":0},"with_fusion_goods":false,"allow_share":true,"aweme_id":"6891966187299785995","in_reviewing":false,"video_hide_search":0,"with_goods":false}
         * vr_type : 0
         * is_fantasy : false
         * is_first_video : false
         * item_stitch : 0
         * music : {"duration":204,"is_original_sound":true,"lyric_short_position":null,"cover_hd":{"height":720,"uri":"1080x1080/31af00000ec3f88ae6cd0","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720},"cover_large":{"height":720,"uri":"1080x1080/31af00000ec3f88ae6cd0","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720},"music_chart_ranks":null,"schema_url":"","author_deleted":false,"author_position":null,"avatar_thumb":{"height":720,"uri":"100x100/31af00000ec3f88ae6cd0","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720},"avatar_medium":{"width":720,"height":720,"uri":"720x720/31af00000ec3f88ae6cd0","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]},"id":6865468019271863048,"owner_handle":"dyol9ffqj01b","position":null,"can_background_play":true,"cover_medium":{"height":720,"uri":"720x720/31af00000ec3f88ae6cd0","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720},"is_matched_metadata":false,"offline_desc":"","avatar_large":{"url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720,"height":720,"uri":"1080x1080/31af00000ec3f88ae6cd0"},"id_str":"6865468019271863048","preview_start_time":0,"reason_type":0,"redirect":false,"dmv_auto_show":false,"start_time":0,"is_pgc":false,"source_platform":23,"tag_list":null,"binded_challenge_id":0,"is_commerce_music":false,"prevent_download":false,"strong_beat_url":{"uri":"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076","url_list":["https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076","https://sf9-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076"],"width":720,"height":720},"author":"抖音好音乐","external_song_info":[],"extra":"{\"aggregate_exempt_conf\":[],\"review_unshelve_reason\":0,\"beats\":{\"energy_trace\":\"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339746488331\",\"merged_beats\":\"https://sf9-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339777649667\",\"audio_effect_onset\":\"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339746582532\",\"beats_tracker\":\"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339777612803\"},\"douyin_beats_info\":{},\"hotsoon_review_time\":-1,\"music_label_id\":null,\"has_edited\":0,\"reviewed\":1,\"schedule_search_time\":0}","is_video_self_see":false,"mid":"6865468019271863048","owner_id":"1675300213891155","play_url":{"height":720,"uri":"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3","url_list":["https://sf1-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3","https://sf9-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3"],"width":720},"title":"@抖音好音乐创作的原声","artists":[],"is_original":false,"owner_nickname":"抖音好音乐","album":"","collect_stat":0,"is_audio_url_with_cookie":false,"is_restricted":false,"shoot_duration":204,"audition_duration":204,"prevent_item_download_status":0,"unshelve_countries":null,"cover_thumb":{"height":720,"uri":"100x100/31af00000ec3f88ae6cd0","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720},"end_time":0,"is_del_video":false,"mute_share":false,"preview_end_time":0,"sec_uid":"MS4wLjABAAAArjb6u7g4lZvYk8Zs-aZrFvpNaCX-jPjgjEz4nvKnWj2wYzZXHgaSUimJ9R672kMA","status":1,"user_count":0}
         * prevent_download : false
         * with_promotional_music : false
         * video_labels : null
         * xigua_task : {"is_xigua_task":false}
         * comment_list : null
         * label_top_text : null
         * position : null
         * promotions : []
         * risk_infos : {"content":"","risk_sink":false,"type":0,"vote":false,"warn":false}
         * statistics : {"forward_count":7,"lose_comment_count":0,"play_count":0,"share_count":845,"whatsapp_share_count":0,"digest":"","download_count":706,"digg_count":5872,"exposure_count":0,"lose_count":0,"aweme_id":"6891966187299785995","comment_count":877}
         * author : {"cha_list":null,"download_prompt_ts":0,"has_insights":false,"language":"zh-Hans","twitter_id":"","authority_status":0,"has_unread_story":false,"reflow_page_uid":0,"avatar_thumb":{"height":720,"uri":"100x100/2d2710002273e47a56eee","url_list":["https://p29-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.jpeg?from=2563711402"],"width":720},"aweme_hotsoon_auth":1,"has_facebook_token":false,"school_type":0,"shield_follow_notice":0,"ad_cover_url":null,"avatar_168x168":{"height":720,"uri":"168x168/2d2710002273e47a56eee","url_list":["https://p5-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.jpeg?from=2563711402"],"width":720},"item_list":null,"verify_info":"","special_lock":1,"follow_status":0,"is_gov_media_vip":false,"live_commerce":false,"prevent_download":false,"unique_id_modify_time":1607181527,"user_rate":1,"avatar_uri":"2d2710002273e47a56eee","fb_expire_time":0,"avatar_medium":{"height":720,"uri":"720x720/2d2710002273e47a56eee","url_list":["https://p29-dy.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/720x720/2d2710002273e47a56eee.jpeg?from=2563711402"],"width":720},"can_set_geofencing":null,"need_points":null,"total_favorited":0,"enterprise_verify_reason":"","google_account":"","room_id":0,"tw_expire_time":0,"bind_phone":"","favoriting_count":0,"accept_private_policy":false,"new_story_cover":null,"relative_users":null,"create_time":0,"follower_count":0,"has_twitter_token":false,"twitter_name":"","type_label":null,"youtube_channel_title":"","school_name":"","sync_to_toutiao":0,"user_period":0,"has_orders":false,"sec_uid":"MS4wLjABAAAAuNSQzCFBpeGl0KfYW3xevVrkj6BR2VLLyJwC5cF0KHQ","signature":"","cover_url":[{"width":720,"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"]}],"shield_digg_notice":0,"weibo_url":"","aweme_count":0,"location":"","with_dou_entry":false,"birthday":"1995-01-01","user_tags":null,"hide_location":false,"neiguang_shield":0,"school_poi_id":"","shield_comment_notice":0,"constellation":6,"duet_setting":0,"is_verified":true,"youtube_expire_time":0,"comment_setting":0,"followers_detail":null,"homepage_bottom_toast":null,"ins_id":"","is_binded_weibo":false,"share_info":{"share_desc_info":"","share_qrcode_url":{"url_list":["https://p9-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p29-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402"],"width":720,"height":720,"uri":"24a20022bf0288d794b9"},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":"","share_desc":""},"story_count":0,"weibo_verify":"","white_cover_url":null,"apple_account":0,"custom_verify":"","hide_search":false,"is_block":false,"status":1,"geofencing":[],"has_youtube_token":false,"platform_sync_info":null,"story_open":false,"user_canceled":false,"verification_type":1,"download_setting":-1,"following_count":0,"unique_id":"","is_discipline_member":false,"is_mix_user":false,"ky_only_predict":0,"live_agreement":0,"secret":0,"share_qrcode_uri":"24a20022bf0288d794b9","youtube_channel_id":"","is_star":false,"cv_level":"","follower_status":0,"gender":2,"is_ad_fake":false,"weibo_schema":"","nickname":"『0.2°C』","short_id":"10366464","video_icon":{"width":720,"height":720,"uri":"","url_list":[]},"with_commerce_entry":false,"comment_filter_status":0,"need_recommend":0,"show_image_bubble":false,"avatar_larger":{"height":720,"uri":"1080x1080/2d2710002273e47a56eee","url_list":["https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.jpeg?from=2563711402"],"width":720},"commerce_user_level":0,"enable_nearby_visible":true,"react_setting":0,"user_mode":0,"ban_user_functions":[],"live_agreement_time":0,"region":"CN","weibo_name":"","with_fusion_shop_entry":false,"with_shop_entry":false,"account_region":"","avatar_300x300":{"width":720,"height":720,"uri":"300x300/2d2710002273e47a56eee","url_list":["https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.jpeg?from=2563711402"]},"aweme_control":{"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true},"has_email":false,"is_phone_binded":false,"live_verify":0,"reflow_page_gid":0,"stitch_setting":0,"uid":"59416769587"}
         * desc : 从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山
         * geofencing_regions : null
         * nickname_position : null
         * origin_comment_ids : null
         * descendants : {"notify_msg":"头条","platforms":["toutiao"]}
         * mix_info : {"mix_type":0,"share_info":{"share_desc":"在抖音，记录美好生活","share_desc_info":"这么有趣的合集，不能只有我一个人知道吧","share_title":"这么有趣的合集，不能只有我一个人知道吧","share_title_myself":"","share_title_other":"","share_url":"https://www.iesdouyin.com/share/mix/detail/6892375869046654983/?schema_type=24&object_id=6892375869046654983","share_weibo_desc":"这么有趣的合集，不能只有我一个人知道吧"},"update_time":1604841789,"cover_url":{"height":720,"uri":"tos-cn-i-0813/4be086d1b4ce4bc6855e331132341794","url_list":["https://p5-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/4be086d1b4ce4bc6855e331132341794?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-i-0813/4be086d1b4ce4bc6855e331132341794?from=2563711402","https://p9-dy.byteimg.com/obj/tos-cn-i-0813/4be086d1b4ce4bc6855e331132341794?from=2563711402"],"width":720},"create_time":1604756310,"desc":"边走边拍的美好时光","extra":"{\"first_reviewed\":1,\"is_quality_mix\":0,\"next_info\":{\"cover\":\"tos-cn-i-0813/4be086d1b4ce4bc6855e331132341794\",\"desc\":\"边走边拍的美好时光\",\"name\":\"保定最值得旅行的美景\"}}","mix_name":"保定最值得旅行的美景","ids":null,"mix_id":"6892375869046654983","statis":{"collect_vv":0,"current_episode":8,"play_vv":0,"updated_to_episode":40},"status":{"is_collected":0,"status":2}}
         */

        private Object long_video;
        private int nearby_level;
        private ShareInfoBeanX share_info;
        private String share_url;
        private Object uniqid_position;
        private int bodydance_score;
        private int is_preview;
        private int is_top;
        private int item_react;
        private int create_time;
        private int is_hash_tag;
        private int item_comment_settings;
        private PoiPatchInfoBean poi_patch_info;
        private long author_user_id;
        private int duration;
        private Object hybrid_label;
        private Object interaction_stickers;
        private boolean is_pgcshow;
        private boolean is_vr;
        private int collect_stat;
        private String distance;
        private int is_story;
        private int story_ttl;
        private Object challenge_position;
        private boolean cmt_swt;
        private String group_id;
        private Object image_infos;
        private String region;
        private VideoControlBean video_control;
        private String desc_language;
        private boolean is_relieve;
        private int rate;
        private String sort_label;
        private int user_digged;
        private Object anchors;
        private AwemeControlBean aweme_control;
        private String aweme_id;
        private String city;
        private boolean have_dashboard;
        private boolean without_watermark;
        private Object commerce_config_data;
        private int distribute_type;
        private PoiInfoBeanX poi_info;
        private Object cover_labels;
        private boolean report_action;
        private int aweme_type;
        private boolean is_in_scope;
        private int item_duet;
        private VideoBean video;
        private CommerceInfoBean commerce_info;
        private String misc_info;
        private StatusBean status;
        private int vr_type;
        private boolean is_fantasy;
        private boolean is_first_video;
        private int item_stitch;
        private MusicBean music;
        private boolean prevent_download;
        private boolean with_promotional_music;
        private Object video_labels;
        private XiguaTaskBean xigua_task;
        private Object comment_list;
        private Object label_top_text;
        private Object position;
        private RiskInfosBean risk_infos;
        private StatisticsBean statistics;
        private AuthorBean author;
        private String desc;
        private Object geofencing_regions;
        private Object nickname_position;
        private Object origin_comment_ids;
        private DescendantsBean descendants;
        private MixDetailResponse.MixInfoBean mix_info;
        private List<TextExtraBean> text_extra;
        private List<?> geofencing;
        private List<?> video_text;
        private List<ChaListBean> cha_list;
        private List<?> promotions;

        @NoArgsConstructor
        @Data
        public static class ShareInfoBeanX {
            /**
             * share_quote :
             * share_signature_desc :
             * share_title : 从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山
             * share_title_myself :
             * share_weibo_desc : #在抖音，记录美好生活#从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山
             * share_link_desc : 从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山  %s 复制此链接，打开抖音搜索，直接观看视频！
             * share_desc : 在抖音，记录美好生活
             * share_desc_info : #在抖音，记录美好生活#从霸州出发2个小时，爬山25分钟，下山15分钟，有美食，有日落，有夜景，不枉此行#唐尧古镇 #庆都山
             * share_signature_url :
             * share_title_other :
             * share_url : https://www.iesdouyin.com/share/video/6891966187299785995/?region=CN&mid=6865468019271863048&u_code=166gl01b5mfa&titleType=title&did=1213500227850904&iid=3007906155084360
             * bool_persist : 0
             */

            private String share_quote;
            private String share_signature_desc;
            private String share_title;
            private String share_title_myself;
            private String share_weibo_desc;
            private String share_link_desc;
            private String share_desc;
            private String share_desc_info;
            private String share_signature_url;
            private String share_title_other;
            private String share_url;
            private int bool_persist;
        }

        @NoArgsConstructor
        @Data
        public static class PoiPatchInfoBean {
            /**
             * item_patch_poi_prompt_mark : 0
             */

            private int item_patch_poi_prompt_mark;
        }

        @NoArgsConstructor
        @Data
        public static class VideoControlBean {
            /**
             * allow_download : true
             * allow_react : true
             * prevent_download_type : 0
             * share_type : 1
             * show_progress_bar : 0
             * allow_duet : true
             * allow_dynamic_wallpaper : true
             * allow_music : true
             * allow_stitch : true
             * draft_progress_bar : 0
             * timer_status : 1
             */

            private boolean allow_download;
            private boolean allow_react;
            private int prevent_download_type;
            private int share_type;
            private int show_progress_bar;
            private boolean allow_duet;
            private boolean allow_dynamic_wallpaper;
            private boolean allow_music;
            private boolean allow_stitch;
            private int draft_progress_bar;
            private int timer_status;
        }

        @NoArgsConstructor
        @Data
        public static class AwemeControlBean {
            /**
             * can_show_comment : true
             * can_comment : true
             * can_forward : true
             * can_share : true
             */

            private boolean can_show_comment;
            private boolean can_comment;
            private boolean can_forward;
            private boolean can_share;
        }

        @NoArgsConstructor
        @Data
        public static class PoiInfoBeanX {
            /**
             * collected_count : 26593
             * is_admin_area : false
             * poi_longitude : 115.014636
             * user_count : 257754
             * cover_medium : {"url_list":["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"],"width":720,"height":720,"uri":"42dd001cf2907be11106"}
             * distance :
             * share_info : {"share_title_other":"","share_url":"https://www.iesdouyin.com/share/poilist/?id=B0FFKHP3OS","share_weibo_desc":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","bool_persist":0,"share_desc":"","share_desc_info":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","share_title":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","share_title_myself":""}
             * voucher_release_areas : null
             * icon_on_map : {"height":720,"uri":"9b92001171754afde148","url_list":["https://p6-dy-ipv6.byteimg.com/obj/9b92001171754afde148?from=2563711402","https://p26-dy.byteimg.com/obj/9b92001171754afde148?from=2563711402","https://p29-dy.byteimg.com/obj/9b92001171754afde148?from=2563711402"],"width":720}
             * item_count : 16083
             * poi_frontend_type : null
             * poi_latitude : 38.793988
             * view_count : 31460801
             * cover_large : {"width":720,"height":720,"uri":"42dd001cf2907be11106","url_list":["https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]}
             * cover_thumb : {"uri":"42dd001cf2907be11106","url_list":["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"],"width":720,"height":720}
             * show_type : 1
             * poi_subtitle : 在你附近的景点
             * poi_subtitle_type : 4
             * address_info : {"province":"河北省","simple_addr":"保定市唐县庆都山","city_code":"130600","country_code":"CN","district":"唐县","city_code_v2":"130600","country":"中国","ad_code_v2":"130627","address":"庆都山","city":"保定市"}
             * collect_stat : 0
             * effect_ids : null
             * icon_service_type_list : null
             * icon_type : 8
             * poi_id : 6679538858037725191
             * poi_backend_type : {"name":"游玩;景点;风景名胜","code":"180101"}
             * cover_hd : {"width":720,"height":720,"uri":"42dd001cf2907be11106","url_list":["https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]}
             * ext_json : {"item_ext":{"sub_type":"风景名胜"}}
             * icon_on_entry : {"width":720,"height":720,"uri":"2d5d9000661d50bb52ae3","url_list":["https://p3-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402","https://p9-dy.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402"]}
             * poi_name : 庆都山旅游度假区唐尧古镇
             * type_code : 110000
             * expand_type : 1
             * icon_on_info : {"height":720,"uri":"98a10025d47fd79cb0aa","url_list":["https://p9-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402","https://p26-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402","https://p29-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402"],"width":720}
             * poi_detail_tags : null
             */

            private String collected_count;
            private boolean is_admin_area;
            private double poi_longitude;
            private int user_count;
            private CoverMediumBeanX cover_medium;
            private String distance;
            private ShareInfoBeanX share_info;
            private Object voucher_release_areas;
            private IconOnMapBeanX icon_on_map;
            private int item_count;
            private Object poi_frontend_type;
            private double poi_latitude;
            private String view_count;
            private CoverLargeBeanX cover_large;
            private CoverThumbBeanX cover_thumb;
            private int show_type;
            private String poi_subtitle;
            private int poi_subtitle_type;
            private AddressInfoBeanX address_info;
            private int collect_stat;
            private Object effect_ids;
            private Object icon_service_type_list;
            private int icon_type;
            private String poi_id;
            private CoverBean poi_backend_type;
            private CoverHdBeanX cover_hd;
            private String ext_json;
            private IconOnEntryBeanX icon_on_entry;
            private String poi_name;
            private String type_code;
            private int expand_type;
            private IconOnInfoBeanX icon_on_info;
            private Object poi_detail_tags;

            @NoArgsConstructor
            @Data
            public static class CoverMediumBeanX {
                /**
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]
                 * width : 720
                 * height : 720
                 * uri : 42dd001cf2907be11106
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class IconOnMapBeanX {
                /**
                 * height : 720
                 * uri : 9b92001171754afde148
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/obj/9b92001171754afde148?from=2563711402","https://p26-dy.byteimg.com/obj/9b92001171754afde148?from=2563711402","https://p29-dy.byteimg.com/obj/9b92001171754afde148?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class CoverLargeBeanX {
                /**
                 * width : 720
                 * height : 720
                 * uri : 42dd001cf2907be11106
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class CoverThumbBeanX {
                /**
                 * uri : 42dd001cf2907be11106
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AddressInfoBeanX {
                /**
                 * province : 河北省
                 * simple_addr : 保定市唐县庆都山
                 * city_code : 130600
                 * country_code : CN
                 * district : 唐县
                 * city_code_v2 : 130600
                 * country : 中国
                 * ad_code_v2 : 130627
                 * address : 庆都山
                 * city : 保定市
                 */

                private String province;
                private String simple_addr;
                private String city_code;
                private String country_code;
                private String district;
                private String city_code_v2;
                private String country;
                private String ad_code_v2;
                private String address;
                private String city;
            }

            @NoArgsConstructor
            @Data
            public static class CoverHdBeanX {
                /**
                 * width : 720
                 * height : 720
                 * uri : 42dd001cf2907be11106
                 * url_list : ["https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=2563711402","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=2563711402"]
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class IconOnEntryBeanX {
                /**
                 * width : 720
                 * height : 720
                 * uri : 2d5d9000661d50bb52ae3
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402","https://p1-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402","https://p9-dy.byteimg.com/obj/2d5d9000661d50bb52ae3?from=2563711402"]
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class IconOnInfoBeanX {
                /**
                 * height : 720
                 * uri : 98a10025d47fd79cb0aa
                 * url_list : ["https://p9-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402","https://p26-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402","https://p29-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }
        }

        @NoArgsConstructor
        @Data
        public static class VideoBean {
            @NoArgsConstructor
            @Data
            public static class PlayAddrLowbrBean {
                /**
                 * data_size : 3144452
                 * file_cs : c:0-19905-b795
                 * height : 720
                 * uri : v0300f5a0000buiisrtoiaikjdjud3jg
                 * url_key : v0300f5a0000buiisrtoiaikjdjud3jg_h264_540p_1442491
                 * url_list : ["http://v27-dy.ixigua.com/53731e58005ebe431a723a21b398714d/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/5fbba07c95fedf39f45265b5d5322785/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME"]
                 * width : 720
                 */

                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class DownloadAddrBean {
                /**
                 * data_size : 4784429
                 * height : 720
                 * uri : v0300f5a0000buiisrtoiaikjdjud3jg
                 * url_list : ["http://v27-dy.ixigua.com/5ba4ce1df520670e8fd8e2a24912eca1/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/dba4880d8ba47db5f1aab3abf3e94fb3/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME"]
                 * width : 720
                 */

                private int data_size;
                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class PlayAddrBean {
                /**
                 * url_key : v0300f5a0000buiisrtoiaikjdjud3jg_h264_540p_1442491
                 * url_list : ["http://v27-dy.ixigua.com/53731e58005ebe431a723a21b398714d/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/5fbba07c95fedf39f45265b5d5322785/5fcbb2f8/video/tos/cn/tos-cn-ve-15/a0ddfa3988ed436ab6dc0fee726aded8/?a=1128&br=4224&bt=1408&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzszM2k8ZDs8NzxlZWhpO2dnYWdnZmZxcGZfLS0yLTBzczYvYTBjNV8tMjQuMS5eXjI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_POI_AWEME"]
                 * width : 720
                 * data_size : 3144452
                 * file_cs : c:0-19905-b795
                 * height : 720
                 * uri : v0300f5a0000buiisrtoiaikjdjud3jg
                 */

                private String url_key;
                private int width;
                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class PlayAddr265Bean {
                /**
                 * data_size : 2614304
                 * file_cs : c:0-20096-938b
                 * height : 720
                 * uri : v0300f5a0000buiisrtoiaikjdjud3jg
                 * url_key : v0300f5a0000buiisrtoiaikjdjud3jg_bytevc1_540p_1199290
                 * url_list : ["http://v27-dy.ixigua.com/f5f1bad76db3e0881b888c693a44f445/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/e7662faa5c0c06b081aab3f22739b787/5fcbb2f8/video/tos/cn/tos-cn-ve-15/1c2df04f121d466ebf55cd0123d15c74/?a=1128&br=4684&bt=1171&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=6&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=11&rc=ajZ4Z25kcnVseDMzZGkzM0ApOmhpOjY8ZztmNzs1aDVoNGdnYWdnZmZxcGZfLS0yLTBzc2EwMDMyYzMuLjA2MmM1Li46Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_POI_AWEME"]
                 * width : 720
                 */

                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private String url_key;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class DownloadSuffixLogoAddrBean {
                /**
                 * uri : v0300f5a0000buiisrtoiaikjdjud3jg
                 * url_list : ["http://v27-dy.ixigua.com/5ba4ce1df520670e8fd8e2a24912eca1/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/dba4880d8ba47db5f1aab3abf3e94fb3/5fcbb2f8/video/tos/cn/tos-cn-ve-15/420d57621e88443581c66c12a55e829c/?a=1128&br=5481&bt=1827&cd=0%7C0%7C0&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=0&rc=ajZ4Z25kcnVseDMzZGkzM0ApZTQzZzhnO2Q0Nzo7ZTNlaWdnYWdnZmZxcGZfLS0yLTBzc2EuL2MxLTVgM19eNDQyYzE6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_POI_AWEME"]
                 * width : 720
                 * data_size : 4784429
                 * height : 720
                 */

                private String uri;
                private int width;
                private int data_size;
                private int height;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class DynamicCoverBean {
                /**
                 * height : 720
                 * uri : tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929?from=2563711402_large","https://p29-dy.byteimg.com/obj/tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/7f09718bcdc741aebc79cd32674995e0_1604660929?from=2563711402_large"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class OriginCoverBean {
                /**
                 * uri : tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929~tplv-dy-360p.jpeg?from=2563711402","https://p1-dy-ipv6.byteimg.com/tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929~tplv-dy-360p.jpeg?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/453db0c6eae84edfb44028887d9ea870_1604660929~tplv-dy-360p.jpeg?from=2563711402"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class PlayAddrH264Bean {
                /**
                 * url_key : v0300f5a0000buiisrtoiaikjdjud3jg_h264_540p_1442491
                 * url_list : ["https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_POI_AWEME"]
                 * width : 720
                 * data_size : 3144452
                 * file_cs : c:0-19905-b795
                 * height : 720
                 * uri : v0300f5a0000buiisrtoiaikjdjud3jg
                 */

                private String url_key;
                private int width;
                private int data_size;
                private String file_cs;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class CoverBean {
                /**
                 * height : 720
                 * uri : tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a
                 * url_list : ["https://p9-dy.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.webp?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.webp?from=2563711402_large","https://p5-dy-ipv6.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.webp?from=2563711402_large","https://p9-dy.byteimg.com/img/tos-cn-p-0015/e2418e286d5a4c7982f679b07b774e0a~c5_300x400.jpeg?from=2563711402_large"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class BitRateBean {
                @NoArgsConstructor
                @Data
                public static class PlayAddrBeanX {
                    /**
                     * url_list : ["http://v27-dy.ixigua.com/9ba0710af1f6ef66e71ec9c39f5b0aca/5fcbb2f8/video/tos/cn/tos-cn-ve-15/ea5805cf8048446aa3dd53b0d5b5b702/?a=1128&br=3675&bt=1225&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=15&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzc6OmVoPDtlN2Y3Ozo1N2dnYWdnZmZxcGZfLS0yLTBzczJeY2FjNF81MDMwL14tXzI6Yw%3D%3D&vl=&vr=","http://v5-dy-gdhy.ixigua.com/c90b1243ddf4071f19b7e88302e678af/5fcbb2f8/video/tos/cn/tos-cn-ve-15/ea5805cf8048446aa3dd53b0d5b5b702/?a=1128&br=3675&bt=1225&cd=0%7C0%7C0&cr=3&cs=&cv=1&dr=0&ds=3&er=&l=2020120523184701019806020601D015B4&lr=all&mime_type=video_mp4&qs=15&rc=ajZ4Z25kcnVseDMzZGkzM0ApNzc6OmVoPDtlN2Y3Ozo1N2dnYWdnZmZxcGZfLS0yLTBzczJeY2FjNF81MDMwL14tXzI6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_POI_AWEME","https://api.amemv.com/aweme/v1/play/?video_id=v0300f5a0000buiisrtoiaikjdjud3jg&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_POI_AWEME"]
                     * width : 720
                     * data_size : 2736581
                     * file_cs : c:0-20096-bbf7
                     * height : 720
                     * uri : v0300f5a0000buiisrtoiaikjdjud3jg
                     * url_key : v0300f5a0000buiisrtoiaikjdjud3jg_bytevc1_720p_1255384
                     */

                    private int width;
                    private int data_size;
                    private String file_cs;
                    private int height;
                    private String uri;
                    private String url_key;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class PlayAddr265BeanX {
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class CommerceInfoBean {
        }

        @NoArgsConstructor
        @Data
        public static class StatusBean {
            /**
             * dont_share_status : 0
             * is_private : false
             * allow_comment : true
             * download_status : 0
             * is_prohibited : false
             * reviewed : 1
             * self_see : false
             * is_delete : false
             * private_status : 0
             * review_result : {"review_status":0}
             * with_fusion_goods : false
             * allow_share : true
             * aweme_id : 6891966187299785995
             * in_reviewing : false
             * video_hide_search : 0
             * with_goods : false
             */

            private int dont_share_status;
            private boolean is_private;
            private boolean allow_comment;
            private int download_status;
            private boolean is_prohibited;
            private int reviewed;
            private boolean self_see;
            private boolean is_delete;
            private int private_status;
            private ReviewResultBean review_result;
            private boolean with_fusion_goods;
            private boolean allow_share;
            private String aweme_id;
            private boolean in_reviewing;
            private int video_hide_search;
            private boolean with_goods;

            @NoArgsConstructor
            @Data
            public static class ReviewResultBean {
                /**
                 * review_status : 0
                 */

                private int review_status;
            }
        }

        @NoArgsConstructor
        @Data
        public static class MusicBean {
            /**
             * duration : 204
             * is_original_sound : true
             * lyric_short_position : null
             * cover_hd : {"height":720,"uri":"1080x1080/31af00000ec3f88ae6cd0","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720}
             * cover_large : {"height":720,"uri":"1080x1080/31af00000ec3f88ae6cd0","url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720}
             * music_chart_ranks : null
             * schema_url :
             * author_deleted : false
             * author_position : null
             * avatar_thumb : {"height":720,"uri":"100x100/31af00000ec3f88ae6cd0","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720}
             * avatar_medium : {"width":720,"height":720,"uri":"720x720/31af00000ec3f88ae6cd0","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]}
             * id : 6865468019271863048
             * owner_handle : dyol9ffqj01b
             * position : null
             * can_background_play : true
             * cover_medium : {"height":720,"uri":"720x720/31af00000ec3f88ae6cd0","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720}
             * is_matched_metadata : false
             * offline_desc :
             * avatar_large : {"url_list":["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720,"height":720,"uri":"1080x1080/31af00000ec3f88ae6cd0"}
             * id_str : 6865468019271863048
             * preview_start_time : 0
             * reason_type : 0
             * redirect : false
             * dmv_auto_show : false
             * start_time : 0
             * is_pgc : false
             * source_platform : 23
             * tag_list : null
             * binded_challenge_id : 0
             * is_commerce_music : false
             * prevent_download : false
             * strong_beat_url : {"uri":"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076","url_list":["https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076","https://sf9-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076"],"width":720,"height":720}
             * author : 抖音好音乐
             * external_song_info : []
             * extra : {"aggregate_exempt_conf":[],"review_unshelve_reason":0,"beats":{"energy_trace":"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339746488331","merged_beats":"https://sf9-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339777649667","audio_effect_onset":"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339746582532","beats_tracker":"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1676339777612803"},"douyin_beats_info":{},"hotsoon_review_time":-1,"music_label_id":null,"has_edited":0,"reviewed":1,"schedule_search_time":0}
             * is_video_self_see : false
             * mid : 6865468019271863048
             * owner_id : 1675300213891155
             * play_url : {"height":720,"uri":"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3","url_list":["https://sf1-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3","https://sf9-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3"],"width":720}
             * title : @抖音好音乐创作的原声
             * artists : []
             * is_original : false
             * owner_nickname : 抖音好音乐
             * album :
             * collect_stat : 0
             * is_audio_url_with_cookie : false
             * is_restricted : false
             * shoot_duration : 204
             * audition_duration : 204
             * prevent_item_download_status : 0
             * unshelve_countries : null
             * cover_thumb : {"height":720,"uri":"100x100/31af00000ec3f88ae6cd0","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.jpeg?from=2563711402"],"width":720}
             * end_time : 0
             * is_del_video : false
             * mute_share : false
             * preview_end_time : 0
             * sec_uid : MS4wLjABAAAArjb6u7g4lZvYk8Zs-aZrFvpNaCX-jPjgjEz4nvKnWj2wYzZXHgaSUimJ9R672kMA
             * status : 1
             * user_count : 0
             */

            private int duration;
            private boolean is_original_sound;
            private Object lyric_short_position;
            private CoverHdBeanXX cover_hd;
            private CoverLargeBeanXX cover_large;
            private Object music_chart_ranks;
            private String schema_url;
            private boolean author_deleted;
            private Object author_position;
            private AvatarThumbBean avatar_thumb;
            private AvatarMediumBean avatar_medium;
            private long id;
            private String owner_handle;
            private Object position;
            private boolean can_background_play;
            private CoverMediumBeanXX cover_medium;
            private boolean is_matched_metadata;
            private String offline_desc;
            private AvatarLargeBean avatar_large;
            private String id_str;
            private int preview_start_time;
            private int reason_type;
            private boolean redirect;
            private boolean dmv_auto_show;
            private int start_time;
            private boolean is_pgc;
            private int source_platform;
            private Object tag_list;
            private int binded_challenge_id;
            private boolean is_commerce_music;
            private boolean prevent_download;
            private StrongBeatUrlBean strong_beat_url;
            private String author;
            private String extraX;
            private boolean is_video_self_see;
            private String mid;
            private String owner_id;
            private PlayUrlBean play_url;
            private String title;
            private boolean is_original;
            private String owner_nickname;
            private String album;
            private int collect_stat;
            private boolean is_audio_url_with_cookie;
            private boolean is_restricted;
            private int shoot_duration;
            private int audition_duration;
            private int prevent_item_download_status;
            private Object unshelve_countries;
            private CoverThumbBeanXX cover_thumb;
            private int end_time;
            private boolean is_del_video;
            private boolean mute_share;
            private int preview_end_time;
            private String sec_uid;
            private int status;
            private int user_count;
            private List<?> external_song_info;
            private List<?> artists;

            @NoArgsConstructor
            @Data
            public static class CoverHdBeanXX {
                /**
                 * height : 720
                 * uri : 1080x1080/31af00000ec3f88ae6cd0
                 * url_list : ["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class CoverLargeBeanXX {
                /**
                 * height : 720
                 * uri : 1080x1080/31af00000ec3f88ae6cd0
                 * url_list : ["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarThumbBean {
                /**
                 * height : 720
                 * uri : 100x100/31af00000ec3f88ae6cd0
                 * url_list : ["https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarMediumBean {
                /**
                 * width : 720
                 * height : 720
                 * uri : 720x720/31af00000ec3f88ae6cd0
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class CoverMediumBeanXX {
                /**
                 * height : 720
                 * uri : 720x720/31af00000ec3f88ae6cd0
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarLargeBean {
                /**
                 * url_list : ["https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/1080x1080/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]
                 * width : 720
                 * height : 720
                 * uri : 1080x1080/31af00000ec3f88ae6cd0
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class StrongBeatUrlBean {
                /**
                 * uri : https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076
                 * url_list : ["https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076","https://sf9-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1676147744344076"]
                 * width : 720
                 * height : 720
                 */

                private String uri;
                private int width;
                private int height;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class PlayUrlBean {
                /**
                 * height : 720
                 * uri : https://sf1-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3
                 * url_list : ["https://sf1-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3","https://sf9-dycdn-tos.pstatp.com/obj/ies-music/6865467970978630413.mp3"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class CoverThumbBeanXX {
                /**
                 * height : 720
                 * uri : 100x100/31af00000ec3f88ae6cd0
                 * url_list : ["https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/31af00000ec3f88ae6cd0.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }
        }

        @NoArgsConstructor
        @Data
        public static class XiguaTaskBean {
            /**
             * is_xigua_task : false
             */

            private boolean is_xigua_task;
        }

        @NoArgsConstructor
        @Data
        public static class RiskInfosBean {
            /**
             * content :
             * risk_sink : false
             * type : 0
             * vote : false
             * warn : false
             */

            private String content;
            private boolean risk_sink;
            private int type;
            private boolean vote;
            private boolean warn;
        }

        @NoArgsConstructor
        @Data
        public static class StatisticsBean {
            /**
             * forward_count : 7
             * lose_comment_count : 0
             * play_count : 0
             * share_count : 845
             * whatsapp_share_count : 0
             * digest :
             * download_count : 706
             * digg_count : 5872
             * exposure_count : 0
             * lose_count : 0
             * aweme_id : 6891966187299785995
             * comment_count : 877
             */

            private int forward_count;
            private int lose_comment_count;
            private int play_count;
            private int share_count;
            private int whatsapp_share_count;
            private String digest;
            private int download_count;
            private int digg_count;
            private int exposure_count;
            private int lose_count;
            private String aweme_id;
            private int comment_count;
        }

        @NoArgsConstructor
        @Data
        public static class AuthorBean {
            /**
             * cha_list : null
             * download_prompt_ts : 0
             * has_insights : false
             * language : zh-Hans
             * twitter_id :
             * authority_status : 0
             * has_unread_story : false
             * reflow_page_uid : 0
             * avatar_thumb : {"height":720,"uri":"100x100/2d2710002273e47a56eee","url_list":["https://p29-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.jpeg?from=2563711402"],"width":720}
             * aweme_hotsoon_auth : 1
             * has_facebook_token : false
             * school_type : 0
             * shield_follow_notice : 0
             * ad_cover_url : null
             * avatar_168x168 : {"height":720,"uri":"168x168/2d2710002273e47a56eee","url_list":["https://p5-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.jpeg?from=2563711402"],"width":720}
             * item_list : null
             * verify_info :
             * special_lock : 1
             * follow_status : 0
             * is_gov_media_vip : false
             * live_commerce : false
             * prevent_download : false
             * unique_id_modify_time : 1607181527
             * user_rate : 1
             * avatar_uri : 2d2710002273e47a56eee
             * fb_expire_time : 0
             * avatar_medium : {"height":720,"uri":"720x720/2d2710002273e47a56eee","url_list":["https://p29-dy.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/720x720/2d2710002273e47a56eee.jpeg?from=2563711402"],"width":720}
             * can_set_geofencing : null
             * need_points : null
             * total_favorited : 0
             * enterprise_verify_reason :
             * google_account :
             * room_id : 0
             * tw_expire_time : 0
             * bind_phone :
             * favoriting_count : 0
             * accept_private_policy : false
             * new_story_cover : null
             * relative_users : null
             * create_time : 0
             * follower_count : 0
             * has_twitter_token : false
             * twitter_name :
             * type_label : null
             * youtube_channel_title :
             * school_name :
             * sync_to_toutiao : 0
             * user_period : 0
             * has_orders : false
             * sec_uid : MS4wLjABAAAAuNSQzCFBpeGl0KfYW3xevVrkj6BR2VLLyJwC5cF0KHQ
             * signature :
             * cover_url : [{"width":720,"height":720,"uri":"c8510002be9a3a61aad2","url_list":["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"]}]
             * shield_digg_notice : 0
             * weibo_url :
             * aweme_count : 0
             * location :
             * with_dou_entry : false
             * birthday : 1995-01-01
             * user_tags : null
             * hide_location : false
             * neiguang_shield : 0
             * school_poi_id :
             * shield_comment_notice : 0
             * constellation : 6
             * duet_setting : 0
             * is_verified : true
             * youtube_expire_time : 0
             * comment_setting : 0
             * followers_detail : null
             * homepage_bottom_toast : null
             * ins_id :
             * is_binded_weibo : false
             * share_info : {"share_desc_info":"","share_qrcode_url":{"url_list":["https://p9-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p29-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402"],"width":720,"height":720,"uri":"24a20022bf0288d794b9"},"share_title":"","share_title_myself":"","share_title_other":"","share_url":"","share_weibo_desc":"","share_desc":""}
             * story_count : 0
             * weibo_verify :
             * white_cover_url : null
             * apple_account : 0
             * custom_verify :
             * hide_search : false
             * is_block : false
             * status : 1
             * geofencing : []
             * has_youtube_token : false
             * platform_sync_info : null
             * story_open : false
             * user_canceled : false
             * verification_type : 1
             * download_setting : -1
             * following_count : 0
             * unique_id :
             * is_discipline_member : false
             * is_mix_user : false
             * ky_only_predict : 0
             * live_agreement : 0
             * secret : 0
             * share_qrcode_uri : 24a20022bf0288d794b9
             * youtube_channel_id :
             * is_star : false
             * cv_level :
             * follower_status : 0
             * gender : 2
             * is_ad_fake : false
             * weibo_schema :
             * nickname : 『0.2°C』
             * short_id : 10366464
             * video_icon : {"width":720,"height":720,"uri":"","url_list":[]}
             * with_commerce_entry : false
             * comment_filter_status : 0
             * need_recommend : 0
             * show_image_bubble : false
             * avatar_larger : {"height":720,"uri":"1080x1080/2d2710002273e47a56eee","url_list":["https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.jpeg?from=2563711402"],"width":720}
             * commerce_user_level : 0
             * enable_nearby_visible : true
             * react_setting : 0
             * user_mode : 0
             * ban_user_functions : []
             * live_agreement_time : 0
             * region : CN
             * weibo_name :
             * with_fusion_shop_entry : false
             * with_shop_entry : false
             * account_region :
             * avatar_300x300 : {"width":720,"height":720,"uri":"300x300/2d2710002273e47a56eee","url_list":["https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.jpeg?from=2563711402"]}
             * aweme_control : {"can_comment":true,"can_forward":true,"can_share":true,"can_show_comment":true}
             * has_email : false
             * is_phone_binded : false
             * live_verify : 0
             * reflow_page_gid : 0
             * stitch_setting : 0
             * uid : 59416769587
             */

            private Object cha_list;
            private int download_prompt_ts;
            private boolean has_insights;
            private String language;
            private String twitter_id;
            private int authority_status;
            private boolean has_unread_story;
            private int reflow_page_uid;
            private AvatarThumbBeanX avatar_thumb;
            private int aweme_hotsoon_auth;
            private boolean has_facebook_token;
            private int school_type;
            private int shield_follow_notice;
            private Object ad_cover_url;
            private Avatar168x168Bean avatar_168x168;
            private Object item_list;
            private String verify_info;
            private int special_lock;
            private int follow_status;
            private boolean is_gov_media_vip;
            private boolean live_commerce;
            private boolean prevent_download;
            private int unique_id_modify_time;
            private int user_rate;
            private String avatar_uri;
            private int fb_expire_time;
            private AvatarMediumBeanX avatar_medium;
            private Object can_set_geofencing;
            private Object need_points;
            private int total_favorited;
            private String enterprise_verify_reason;
            private String google_account;
            private int room_id;
            private int tw_expire_time;
            private String bind_phone;
            private int favoriting_count;
            private boolean accept_private_policy;
            private Object new_story_cover;
            private Object relative_users;
            private int create_time;
            private int follower_count;
            private boolean has_twitter_token;
            private String twitter_name;
            private Object type_label;
            private String youtube_channel_title;
            private String school_name;
            private int sync_to_toutiao;
            private int user_period;
            private boolean has_orders;
            private String sec_uid;
            private String signature;
            private int shield_digg_notice;
            private String weibo_url;
            private int aweme_count;
            private String location;
            private boolean with_dou_entry;
            private String birthday;
            private Object user_tags;
            private boolean hide_location;
            private int neiguang_shield;
            private String school_poi_id;
            private int shield_comment_notice;
            private int constellation;
            private int duet_setting;
            private boolean is_verified;
            private int youtube_expire_time;
            private int comment_setting;
            private Object followers_detail;
            private Object homepage_bottom_toast;
            private String ins_id;
            private boolean is_binded_weibo;
            private ShareInfoBeanXX share_info;
            private int story_count;
            private String weibo_verify;
            private Object white_cover_url;
            private int apple_account;
            private String custom_verify;
            private boolean hide_search;
            private boolean is_block;
            private int status;
            private boolean has_youtube_token;
            private Object platform_sync_info;
            private boolean story_open;
            private boolean user_canceled;
            private int verification_type;
            private int download_setting;
            private int following_count;
            private String unique_id;
            private boolean is_discipline_member;
            private boolean is_mix_user;
            private int ky_only_predict;
            private int live_agreement;
            private int secret;
            private String share_qrcode_uri;
            private String youtube_channel_id;
            private boolean is_star;
            private String cv_level;
            private int follower_status;
            private int gender;
            private boolean is_ad_fake;
            private String weibo_schema;
            private String nickname;
            private String short_id;
            private VideoIconBean video_icon;
            private boolean with_commerce_entry;
            private int comment_filter_status;
            private int need_recommend;
            private boolean show_image_bubble;
            private AvatarLargerBean avatar_larger;
            private int commerce_user_level;
            private boolean enable_nearby_visible;
            private int react_setting;
            private int user_mode;
            private int live_agreement_time;
            private String region;
            private String weibo_name;
            private boolean with_fusion_shop_entry;
            private boolean with_shop_entry;
            private String account_region;
            private Avatar300x300Bean avatar_300x300;
            private AwemeControlBean aweme_control;
            private boolean has_email;
            private boolean is_phone_binded;
            private int live_verify;
            private int reflow_page_gid;
            private int stitch_setting;
            private String uid;
            private List<CoverUrlBean> cover_url;
            private List<?> geofencing;
            private List<?> ban_user_functions;

            @NoArgsConstructor
            @Data
            public static class AvatarThumbBeanX {
                /**
                 * height : 720
                 * uri : 100x100/2d2710002273e47a56eee
                 * url_list : ["https://p29-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/2d2710002273e47a56eee.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class Avatar168x168Bean {
                /**
                 * height : 720
                 * uri : 168x168/2d2710002273e47a56eee
                 * url_list : ["https://p5-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_168x168.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarMediumBeanX {
                /**
                 * height : 720
                 * uri : 720x720/2d2710002273e47a56eee
                 * url_list : ["https://p29-dy.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2d2710002273e47a56eee.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/720x720/2d2710002273e47a56eee.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class ShareInfoBeanXX {
                /**
                 * share_desc_info :
                 * share_qrcode_url : {"url_list":["https://p9-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p29-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402"],"width":720,"height":720,"uri":"24a20022bf0288d794b9"}
                 * share_title :
                 * share_title_myself :
                 * share_title_other :
                 * share_url :
                 * share_weibo_desc :
                 * share_desc :
                 */

                private String share_desc_info;
                private ShareQrcodeUrlBean share_qrcode_url;
                private String share_title;
                private String share_title_myself;
                private String share_title_other;
                private String share_url;
                private String share_weibo_desc;
                private String share_desc;

                @NoArgsConstructor
                @Data
                public static class ShareQrcodeUrlBean {
                    /**
                     * url_list : ["https://p9-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p29-dy.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/24a20022bf0288d794b9?from=2563711402"]
                     * width : 720
                     * height : 720
                     * uri : 24a20022bf0288d794b9
                     */

                    private int width;
                    private int height;
                    private String uri;
                    private List<String> url_list;
                }
            }

            @NoArgsConstructor
            @Data
            public static class VideoIconBean {
                /**
                 * width : 720
                 * height : 720
                 * uri :
                 * url_list : []
                 */

                private int width;
                private int height;
                private String uri;
                private List<?> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class AvatarLargerBean {
                /**
                 * height : 720
                 * uri : 1080x1080/2d2710002273e47a56eee
                 * url_list : ["https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p5-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/1080x1080/2d2710002273e47a56eee.jpeg?from=2563711402"]
                 * width : 720
                 */

                private int height;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class Avatar300x300Bean {
                /**
                 * width : 720
                 * height : 720
                 * uri : 300x300/2d2710002273e47a56eee
                 * url_list : ["https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p9-dy.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/2d2710002273e47a56eee~c5_300x300.jpeg?from=2563711402"]
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class CoverUrlBean {
                /**
                 * width : 720
                 * height : 720
                 * uri : c8510002be9a3a61aad2
                 * url_list : ["https://p26-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"]
                 */

                private int width;
                private int height;
                private String uri;
                private List<String> url_list;
            }
        }

        @NoArgsConstructor
        @Data
        public static class DescendantsBean {
            /**
             * notify_msg : 头条
             * platforms : ["toutiao"]
             */

            private String notify_msg;
            private List<String> platforms;
        }

        @NoArgsConstructor
        @Data
        public static class TextExtraBean {
            /**
             * end : 45
             * hashtag_id : 1665397887645703
             * hashtag_name : 唐尧古镇
             * is_commerce : false
             * start : 40
             * type : 1
             */

            private int end;
            private String hashtag_id;
            private String hashtag_name;
            private boolean is_commerce;
            private int start;
            private int type;
        }

        @NoArgsConstructor
        @Data
        public static class ChaListBean {
            /**
             * author : {"platform_sync_info":null,"relative_users":null,"cha_list":null,"cover_url":null,"homepage_bottom_toast":null,"need_points":null,"user_tags":null,"white_cover_url":null,"ad_cover_url":null,"ban_user_functions":null,"geofencing":null,"item_list":null,"new_story_cover":null,"type_label":null,"can_set_geofencing":null,"followers_detail":null}
             * extra_attr : {"is_live":false}
             * is_commerce : false
             * schema : aweme://aweme/challenge/detail?cid=1665397887645703
             * show_items : null
             * sub_type : 0
             * banner_list : null
             * cid : 1665397887645703
             * is_challenge : 0
             * type : 1
             * user_count : 0
             * cha_attrs : null
             * cha_name : 唐尧古镇
             * collect_stat : 0
             * view_count : 0
             * connect_music : []
             * desc :
             * hashtag_profile : image-cut-tos/fb38aa3497e4af85ddf9373ce357317e.jpg
             * is_pgcshow : false
             * share_info : {"share_desc":"在抖音，记录美好生活","share_signature_desc":"","share_title":"我在抖音参加#唐尧古镇 ","share_url":"https://www.iesdouyin.com/share/challenge/1665397887645703/?u_code=166gl01b5mfa","bool_persist":0,"share_desc_info":"我在抖音参加#唐尧古镇 ","share_quote":"","share_signature_url":"","share_title_myself":"","share_title_other":"","share_weibo_desc":"我在抖音参加#唐尧古镇 "}
             */

            private AuthorBeanX author;
            private ExtraAttrBean extra_attr;
            private boolean is_commerce;
            private String schema;
            private Object show_items;
            private int sub_type;
            private Object banner_list;
            private String cid;
            private int is_challenge;
            private int type;
            private int user_count;
            private Object cha_attrs;
            private String cha_name;
            private int collect_stat;
            private int view_count;
            private String desc;
            private String hashtag_profile;
            private boolean is_pgcshow;
            private ShareInfoBeanX share_info;
            private List<?> connect_music;

            @NoArgsConstructor
            @Data
            public static class AuthorBeanX {
                /**
                 * platform_sync_info : null
                 * relative_users : null
                 * cha_list : null
                 * cover_url : null
                 * homepage_bottom_toast : null
                 * need_points : null
                 * user_tags : null
                 * white_cover_url : null
                 * ad_cover_url : null
                 * ban_user_functions : null
                 * geofencing : null
                 * item_list : null
                 * new_story_cover : null
                 * type_label : null
                 * can_set_geofencing : null
                 * followers_detail : null
                 */

                private Object platform_sync_info;
                private Object relative_users;
                private Object cha_list;
                private Object cover_url;
                private Object homepage_bottom_toast;
                private Object need_points;
                private Object user_tags;
                private Object white_cover_url;
                private Object ad_cover_url;
                private Object ban_user_functions;
                private Object geofencing;
                private Object item_list;
                private Object new_story_cover;
                private Object type_label;
                private Object can_set_geofencing;
                private Object followers_detail;
            }

            @NoArgsConstructor
            @Data
            public static class ExtraAttrBean {
                /**
                 * is_live : false
                 */

                private boolean is_live;
            }
        }
    }
}

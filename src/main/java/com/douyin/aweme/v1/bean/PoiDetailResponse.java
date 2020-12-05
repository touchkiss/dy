package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 23:30
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class PoiDetailResponse extends BaseResponse{

    /**
     * poi_ext : {"telephone":"0312-4915555","biz_src":0,"valid":true,"has_detail_info":false,"destination_poi_class_list":null,"feedback_url":"aweme/v1/poi/feedback","has_upload_image_permission":false,"photos":null,"recommend_items":[],"sub_type":"风景名胜","comment_list":null,"customer_service_url":"aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fpoi_h5%2Fmerchant_access_helper_center%3Fenter_from%3Dpoi_page"}
     * poi_list : null
     * icon_service_list : null
     * poi_claimer : {"can_claim":false}
     * aweme_type : 12
     * is_show_campus_rank : 0
     * is_local : false
     * aweme_title : 相关视频
     * dynamic : null
     * extra : {"fatal_item_ids":[],"logid":"2020120523184701019806502110CD8E6C","now":1607181527000}
     * aweme_list : null
     * around_hot_poi_count : 10
     * poi_aweme_tab : null
     * detail_struct_type : 0
     * status_code : 0
     * coupon_share_setting : {"share_flag":1,"share_text":"喊好友领优惠，一起去玩吧"}
     * aweme_infos : [{"aweme_info_type":1,"aweme_count":10}]
     * poi_theme_list : null
     * user_list : []
     * poi_info : {"share_info":{"bool_persist":0,"share_url":"https://www.iesdouyin.com/share/poilist/?id=6679538858037725191","share_weibo_desc":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","share_title":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里"},"address_info":{"province":"河北省","city":"保定市","district":"唐县","address":"庆都山","simple_addr":"河北省保定市唐县庆都山","city_code":"130600"},"poi_subtitle":"在你附近的景点","poi_id":"6679538858037725191","cover_thumb":{"url_list":["https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"],"uri":"42dd001cf2907be11106"},"expand_type":1,"icon_on_entry":{"uri":"2d5d9000661d50bb52ae3","url_list":["https://p9-dy.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344","https://p29-dy.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344"]},"poi_type":0,"poi_frontend_type":[{"name":"游玩;景点;风景名胜","code":"180101"}],"user_count":257754,"distance":"","poi_latitude":38.793988,"poi_backend_type":{"code":"180101","name":"游玩;景点;风景名胜"},"icon_service_type_list":null,"poi_detail_tags":null,"type_code":"110000","cover_medium":{"uri":"42dd001cf2907be11106","url_list":["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]},"collect_stat":0,"poi_voucher":"","is_admin_area":false,"effect_ids":null,"cover_hd":{"uri":"42dd001cf2907be11106","url_list":["https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]},"poi_longitude":115.014636,"icon_on_map":{"uri":"9b92001171754afde148","url_list":["https://p29-dy.byteimg.com/obj/9b92001171754afde148?from=1551292344","https://p1-dy-ipv6.byteimg.com/obj/9b92001171754afde148?from=1551292344","https://p9-dy.byteimg.com/obj/9b92001171754afde148?from=1551292344"]},"icon_on_info":{"uri":"98a10025d47fd79cb0aa","url_list":["https://p3-dy-ipv6.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344","https://p29-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344"]},"poi_subtitle_type":4,"voucher_release_areas":[],"view_count":"31460801","poi_name":"庆都山旅游度假区唐尧古镇","item_count":16083,"icon_type":8,"show_type":1,"cover_large":{"uri":"42dd001cf2907be11106","url_list":["https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]},"collected_count":"26593"}
     * show_detail_type : 1
     * notice_banner_list : []
     */

    private PoiExtBean poi_ext;
    private Object poi_list;
    private Object icon_service_list;
    private PoiClaimerBean poi_claimer;
    private int aweme_type;
    private int is_show_campus_rank;
    private boolean is_local;
    private String aweme_title;
    private Object dynamic;
    private Object aweme_list;
    private int around_hot_poi_count;
    private Object poi_aweme_tab;
    private int detail_struct_type;
    private CouponShareSettingBean coupon_share_setting;
    private Object poi_theme_list;
    private PoiInfoBean poi_info;
    private int show_detail_type;
    private List<AwemeInfosBean> aweme_infos;
    private List<?> user_list;
    private List<?> notice_banner_list;

    @NoArgsConstructor
    @Data
    public static class PoiExtBean {
        /**
         * telephone : 0312-4915555
         * biz_src : 0
         * valid : true
         * has_detail_info : false
         * destination_poi_class_list : null
         * feedback_url : aweme/v1/poi/feedback
         * has_upload_image_permission : false
         * photos : null
         * recommend_items : []
         * sub_type : 风景名胜
         * comment_list : null
         * customer_service_url : aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fpoi_h5%2Fmerchant_access_helper_center%3Fenter_from%3Dpoi_page
         */

        private String telephone;
        private int biz_src;
        private boolean valid;
        private boolean has_detail_info;
        private Object destination_poi_class_list;
        private String feedback_url;
        private boolean has_upload_image_permission;
        private Object photos;
        private String sub_type;
        private Object comment_list;
        private String customer_service_url;
        private List<?> recommend_items;
    }

    @NoArgsConstructor
    @Data
    public static class PoiClaimerBean {
        /**
         * can_claim : false
         */

        private boolean can_claim;
    }

    @NoArgsConstructor
    @Data
    public static class CouponShareSettingBean {
        /**
         * share_flag : 1
         * share_text : 喊好友领优惠，一起去玩吧
         */

        private int share_flag;
        private String share_text;
    }

    @NoArgsConstructor
    @Data
    public static class PoiInfoBean {
        /**
         * share_info : {"bool_persist":0,"share_url":"https://www.iesdouyin.com/share/poilist/?id=6679538858037725191","share_weibo_desc":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里","share_title":"庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里"}
         * address_info : {"province":"河北省","city":"保定市","district":"唐县","address":"庆都山","simple_addr":"河北省保定市唐县庆都山","city_code":"130600"}
         * poi_subtitle : 在你附近的景点
         * poi_id : 6679538858037725191
         * cover_thumb : {"url_list":["https://p1-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"],"uri":"42dd001cf2907be11106"}
         * expand_type : 1
         * icon_on_entry : {"uri":"2d5d9000661d50bb52ae3","url_list":["https://p9-dy.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344","https://p29-dy.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/2d5d9000661d50bb52ae3?from=1551292344"]}
         * poi_type : 0
         * poi_frontend_type : [{"name":"游玩;景点;风景名胜","code":"180101"}]
         * user_count : 257754
         * distance :
         * poi_latitude : 38.793988
         * poi_backend_type : {"code":"180101","name":"游玩;景点;风景名胜"}
         * icon_service_type_list : null
         * poi_detail_tags : null
         * type_code : 110000
         * cover_medium : {"uri":"42dd001cf2907be11106","url_list":["https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]}
         * collect_stat : 0
         * poi_voucher :
         * is_admin_area : false
         * effect_ids : null
         * cover_hd : {"uri":"42dd001cf2907be11106","url_list":["https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p3-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]}
         * poi_longitude : 115.014636
         * icon_on_map : {"uri":"9b92001171754afde148","url_list":["https://p29-dy.byteimg.com/obj/9b92001171754afde148?from=1551292344","https://p1-dy-ipv6.byteimg.com/obj/9b92001171754afde148?from=1551292344","https://p9-dy.byteimg.com/obj/9b92001171754afde148?from=1551292344"]}
         * icon_on_info : {"uri":"98a10025d47fd79cb0aa","url_list":["https://p3-dy-ipv6.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344","https://p29-dy.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/98a10025d47fd79cb0aa?from=1551292344"]}
         * poi_subtitle_type : 4
         * voucher_release_areas : []
         * view_count : 31460801
         * poi_name : 庆都山旅游度假区唐尧古镇
         * item_count : 16083
         * icon_type : 8
         * show_type : 1
         * cover_large : {"uri":"42dd001cf2907be11106","url_list":["https://p29-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p9-dy.byteimg.com/obj/42dd001cf2907be11106?from=1551292344","https://p6-dy-ipv6.byteimg.com/obj/42dd001cf2907be11106?from=1551292344"]}
         * collected_count : 26593
         */

        private ShareInfoBean share_info;
        private AddressInfoBean address_info;
        private String poi_subtitle;
        private String poi_id;
        private CoverBean cover_thumb;
        private int expand_type;
        private CoverBean icon_on_entry;
        private int poi_type;
        private int user_count;
        private String distance;
        private double poi_latitude;
        private PoiBackendTypeBean poi_backend_type;
        private Object icon_service_type_list;
        private Object poi_detail_tags;
        private String type_code;
        private CoverBean cover_medium;
        private int collect_stat;
        private String poi_voucher;
        private boolean is_admin_area;
        private Object effect_ids;
        private CoverBean cover_hd;
        private double poi_longitude;
        private CoverBean icon_on_map;
        private CoverBean icon_on_info;
        private int poi_subtitle_type;
        private String view_count;
        private String poi_name;
        private int item_count;
        private int icon_type;
        private int show_type;
        private CoverBean cover_large;
        private String collected_count;
        private List<PoiBackendTypeBean> poi_frontend_type;
        private List<?> voucher_release_areas;

        @NoArgsConstructor
        @Data
        public static class ShareInfoBean {
            /**
             * bool_persist : 0
             * share_url : https://www.iesdouyin.com/share/poilist/?id=6679538858037725191
             * share_weibo_desc : 庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里
             * share_title : 庆都山旅游度假区唐尧古镇附近超多有趣的抖音视频，一起来玩，戳这里
             */

            private int bool_persist;
            private String share_url;
            private String share_weibo_desc;
            private String share_title;
        }

        @NoArgsConstructor
        @Data
        public static class AddressInfoBean {
            /**
             * province : 河北省
             * city : 保定市
             * district : 唐县
             * address : 庆都山
             * simple_addr : 河北省保定市唐县庆都山
             * city_code : 130600
             */

            private String province;
            private String city;
            private String district;
            private String address;
            private String simple_addr;
            private String city_code;
        }

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
    }

    @NoArgsConstructor
    @Data
    public static class AwemeInfosBean {
        /**
         * aweme_info_type : 1
         * aweme_count : 10
         */

        private int aweme_info_type;
        private int aweme_count;
    }
}

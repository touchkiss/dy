package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 21:52
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class BranchBillboardEntranceReqsponse extends BaseResponse{

    /**
     * top_music : {"collect_stat":0,"lyric_short_position":null,"extra":"{\"review_unshelve_reason\":0,\"beats\":{\"beats_tracker\":\"https://sf9-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489989056523\",\"energy_trace\":\"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489942965255\",\"merged_beats\":\"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489989080068\",\"audio_effect_onset\":\"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489942988811\"},\"douyin_beats_info\":{},\"aggregate_exempt_conf\":[],\"has_edited\":0,\"reviewed\":1,\"schedule_search_time\":0,\"hotsoon_review_time\":-1,\"music_label_id\":1}","is_restricted":false,"owner_handle":"","source_platform":22,"is_original_sound":false,"cover_large":{"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~720x720.webp?x-expires=1607197856&x-signature=FtmYNi0NmB9RnvhbxhX9C%2B%2FEqqE%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~720x720.webp?x-expires=1607197856&x-signature=FtmYNi0NmB9RnvhbxhX9C%2B%2FEqqE%3D"],"width":720,"height":720},"end_time":0,"is_commerce_music":false,"cover_thumb":{"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~100x100.webp?x-expires=1607197856&x-signature=QcVULSmpDTfKmta63Tr5mZCLTBw%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~100x100.webp?x-expires=1607197856&x-signature=QcVULSmpDTfKmta63Tr5mZCLTBw%3D"],"width":720,"height":720},"author_deleted":false,"preview_start_time":49,"music_chart_ranks":null,"position":null,"preview_end_time":0,"id_str":"6626921478493309704","status":1,"prevent_download":false,"id":6626921478493309704,"play_url":{"uri":"https://sf1-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/f381000209f06bc7a8ea","url_list":["https://sf1-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/f381000209f06bc7a8ea","https://sf3-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/f381000209f06bc7a8ea"],"width":720,"height":720},"dmv_auto_show":false,"is_matched_metadata":false,"cover_medium":{"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~200x200.webp?x-expires=1607197856&x-signature=l1ikwECIFjB%2BIRxiE1zDPWnaG1E%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~200x200.webp?x-expires=1607197856&x-signature=l1ikwECIFjB%2BIRxiE1zDPWnaG1E%3D"],"width":720,"height":720},"is_del_video":false,"lyric_url":"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/lyric/netease/6747257647461828615.json","offline_desc":"","owner_nickname":"","binded_challenge_id":0,"is_audio_url_with_cookie":false,"title":"2002","unshelve_countries":null,"shoot_duration":60,"tag_list":null,"is_original":false,"user_count":0,"mute_share":false,"cover_hd":{"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~1080x1080.webp?x-expires=1607197856&x-signature=lrh87XaP4s%2BEA806cATJktVKyug%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~1080x1080.webp?x-expires=1607197856&x-signature=lrh87XaP4s%2BEA806cATJktVKyug%3D"],"width":720,"height":720},"lyric_type":10,"is_pgc":true,"strong_beat_url":{"uri":"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1617900873747464","url_list":["https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1617900873747464","https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1617900873747464"],"width":720,"height":720},"start_time":0,"is_video_self_see":false,"author_position":null,"prevent_item_download_status":0,"audition_duration":60,"artists":[],"can_background_play":true,"album":"","external_song_info":[],"duration":61,"schema_url":"","mid":"6626921478493309704","redirect":false,"reason_type":0,"author":"Anne-Marie"}
     * top_promotion : {"title":"好物榜","category":"TOP.1","promotion_image":{"uri":"cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg","url_list":["https://p29-dy.byteimg.com/obj/cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg","https://p1-dy-ipv6.byteimg.com/obj/cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg","https://p3-dy-ipv6.byteimg.com/obj/cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg"]},"promotion_title":"法国Forvil温莎森林鱼子酱安瓶发膜套装修护精华改善毛糙便携发膜","h5_url":"aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Frecommended_rank%3Fhide_nav_bar%3D1%26loading_bgcolor%3D7339DB%26should_full_screen%3D1%26enter_from%3Ddiscovery&hide_nav_bar=1&loading_bgcolor=7339DB&should_full_screen=1&enter_from=discovery&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_rn_lyon_recommended_rank%26bundle_name%3Dindex%26module_name%3Dpage_recommended_rank%26hide_nav_bar%3D1%26loading_bgcolor%3D7339DB%26should_full_screen%3D1%26enter_from%3Ddiscovery"}
     * top_brand : {"title":"品牌热DOU榜","category_list":[{"id":1,"name":"汽车","brand_list":[{"name":"宝马","logo_url":{"uri":"https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685","url_list":["https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685"]},"heat":1278,"rank":1,"rank_diff":0,"id":7532}]},{"id":2,"name":"手机","brand_list":[{"id":9117,"name":"华为","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/9117.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/9117.jpg"]},"heat":1209,"rank":1,"rank_diff":0}]},{"id":3,"name":"美妆","brand_list":[{"id":7699,"name":"兰蔻","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/7699.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/7699.jpg"]},"heat":1126,"rank":1,"rank_diff":0}]},{"id":4,"name":"奢侈品","brand_list":[{"logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/9362.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/9362.jpg"]},"heat":1057,"rank":1,"rank_diff":0,"id":9362,"name":"路易威登"}]},{"id":5,"name":"食品饮料","brand_list":[{"heat":1079,"rank":1,"rank_diff":0,"id":8974,"name":"茅台","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/8974.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/8974.jpg"]}}]},{"brand_list":[{"heat":985,"rank":1,"rank_diff":1,"id":7390,"name":"美的","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/7390.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/7390.jpg"]}}],"id":6,"name":"家用电器"},{"name":"服饰鞋帽","brand_list":[{"id":8599,"name":"优衣库","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/8599.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/8599.jpg"]},"heat":1087,"rank":1,"rank_diff":0}],"id":7},{"id":9,"name":"母婴","brand_list":[{"name":"a2至初","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/20972.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/20972.jpg"]},"heat":869,"rank":1,"rank_diff":3,"id":20972}]},{"name":"日化","brand_list":[{"id":1094445,"name":"高露洁","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b"]},"heat":928,"rank":1,"rank_diff":0}],"id":10}]}
     * extra : {"now":1607176256000,"fatal_item_ids":[],"logid":"2020120521505601002802015628B9EFDF"}
     * status_code : 0
     * top_star : {"status":1,"avatar_larger":{"uri":"http://p9.pstatp.com/thumb/216d0007cfb3a10f04e5","url_list":["https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5"],"width":720,"height":720},"uid":"60373328124","signature":"","avatar_thumb":{"uri":"http://p9.pstatp.com/thumb/216d0007cfb3a10f04e5","url_list":["https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5"],"width":720,"height":720},"follow_status":0,"nickname":"UNIQ-王一博","user_rate":1,"unique_id":"WYB.","sec_uid":"MS4wLjABAAAA4gwJG2z-QzXuiwGOsoZO2Eg-yq4k8-wll1YjqdJiV1Y"}
     */

    private TopMusicBean top_music;
    private TopPromotionBean top_promotion;
    private TopBrandBean top_brand;
    private TopStarBean top_star;

    @NoArgsConstructor
    @Data
    public static class TopMusicBean {
        /**
         * collect_stat : 0
         * lyric_short_position : null
         * extra : {"review_unshelve_reason":0,"beats":{"beats_tracker":"https://sf9-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489989056523","energy_trace":"https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489942965255","merged_beats":"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489989080068","audio_effect_onset":"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/v3/1640489942988811"},"douyin_beats_info":{},"aggregate_exempt_conf":[],"has_edited":0,"reviewed":1,"schedule_search_time":0,"hotsoon_review_time":-1,"music_label_id":1}
         * is_restricted : false
         * owner_handle :
         * source_platform : 22
         * is_original_sound : false
         * cover_large : {"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~720x720.webp?x-expires=1607197856&x-signature=FtmYNi0NmB9RnvhbxhX9C%2B%2FEqqE%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~720x720.webp?x-expires=1607197856&x-signature=FtmYNi0NmB9RnvhbxhX9C%2B%2FEqqE%3D"],"width":720,"height":720}
         * end_time : 0
         * is_commerce_music : false
         * cover_thumb : {"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~100x100.webp?x-expires=1607197856&x-signature=QcVULSmpDTfKmta63Tr5mZCLTBw%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~100x100.webp?x-expires=1607197856&x-signature=QcVULSmpDTfKmta63Tr5mZCLTBw%3D"],"width":720,"height":720}
         * author_deleted : false
         * preview_start_time : 49
         * music_chart_ranks : null
         * position : null
         * preview_end_time : 0
         * id_str : 6626921478493309704
         * status : 1
         * prevent_download : false
         * id : 6626921478493309704
         * play_url : {"uri":"https://sf1-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/f381000209f06bc7a8ea","url_list":["https://sf1-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/f381000209f06bc7a8ea","https://sf3-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/iesmsc-sg-local/v1/m/f381000209f06bc7a8ea"],"width":720,"height":720}
         * dmv_auto_show : false
         * is_matched_metadata : false
         * cover_medium : {"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~200x200.webp?x-expires=1607197856&x-signature=l1ikwECIFjB%2BIRxiE1zDPWnaG1E%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~200x200.webp?x-expires=1607197856&x-signature=l1ikwECIFjB%2BIRxiE1zDPWnaG1E%3D"],"width":720,"height":720}
         * is_del_video : false
         * lyric_url : https://sf6-dycdn-tos.pstatp.com/obj/ies-music/lyric/netease/6747257647461828615.json
         * offline_desc :
         * owner_nickname :
         * binded_challenge_id : 0
         * is_audio_url_with_cookie : false
         * title : 2002
         * unshelve_countries : null
         * shoot_duration : 60
         * tag_list : null
         * is_original : false
         * user_count : 0
         * mute_share : false
         * cover_hd : {"uri":"iesmusic-cn-local/v1/m/989b0003bdd8b3192950","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~1080x1080.webp?x-expires=1607197856&x-signature=lrh87XaP4s%2BEA806cATJktVKyug%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/m/989b0003bdd8b3192950~1080x1080.webp?x-expires=1607197856&x-signature=lrh87XaP4s%2BEA806cATJktVKyug%3D"],"width":720,"height":720}
         * lyric_type : 10
         * is_pgc : true
         * strong_beat_url : {"uri":"https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1617900873747464","url_list":["https://sf6-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1617900873747464","https://sf1-dycdn-tos.pstatp.com/obj/ies-music/strong_beat/1617900873747464"],"width":720,"height":720}
         * start_time : 0
         * is_video_self_see : false
         * author_position : null
         * prevent_item_download_status : 0
         * audition_duration : 60
         * artists : []
         * can_background_play : true
         * album :
         * external_song_info : []
         * duration : 61
         * schema_url :
         * mid : 6626921478493309704
         * redirect : false
         * reason_type : 0
         * author : Anne-Marie
         */

        private int collect_stat;
        private Object lyric_short_position;
        private String extraX;
        private boolean is_restricted;
        private String owner_handle;
        private int source_platform;
        private boolean is_original_sound;
        private CoverBean cover_large;
        private int end_time;
        private boolean is_commerce_music;
        private CoverBean cover_thumb;
        private boolean author_deleted;
        private int preview_start_time;
        private Object music_chart_ranks;
        private Object position;
        private int preview_end_time;
        private String id_str;
        private int status;
        private boolean prevent_download;
        private long id;
        private CoverBean play_url;
        private boolean dmv_auto_show;
        private boolean is_matched_metadata;
        private CoverBean cover_medium;
        private boolean is_del_video;
        private String lyric_url;
        private String offline_desc;
        private String owner_nickname;
        private int binded_challenge_id;
        private boolean is_audio_url_with_cookie;
        private String title;
        private Object unshelve_countries;
        private int shoot_duration;
        private Object tag_list;
        private boolean is_original;
        private int user_count;
        private boolean mute_share;
        private CoverBean cover_hd;
        private int lyric_type;
        private boolean is_pgc;
        private CoverBean strong_beat_url;
        private int start_time;
        private boolean is_video_self_see;
        private Object author_position;
        private int prevent_item_download_status;
        private int audition_duration;
        private boolean can_background_play;
        private String album;
        private int duration;
        private String schema_url;
        private String mid;
        private boolean redirect;
        private int reason_type;
        private String author;
        private List<?> artists;
        private List<?> external_song_info;
    }

    @NoArgsConstructor
    @Data
    public static class TopPromotionBean {
        /**
         * title : 好物榜
         * category : TOP.1
         * promotion_image : {"uri":"cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg","url_list":["https://p29-dy.byteimg.com/obj/cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg","https://p1-dy-ipv6.byteimg.com/obj/cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg","https://p3-dy-ipv6.byteimg.com/obj/cmp-ecom-alliance/FkmIXy-oc4qlNEba6vgMr_6ff07C.jpg"]}
         * promotion_title : 法国Forvil温莎森林鱼子酱安瓶发膜套装修护精华改善毛糙便携发膜
         * h5_url : aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Frecommended_rank%3Fhide_nav_bar%3D1%26loading_bgcolor%3D7339DB%26should_full_screen%3D1%26enter_from%3Ddiscovery&hide_nav_bar=1&loading_bgcolor=7339DB&should_full_screen=1&enter_from=discovery&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_rn_lyon_recommended_rank%26bundle_name%3Dindex%26module_name%3Dpage_recommended_rank%26hide_nav_bar%3D1%26loading_bgcolor%3D7339DB%26should_full_screen%3D1%26enter_from%3Ddiscovery
         */

        private String title;
        private String category;
        private CoverBean promotion_image;
        private String promotion_title;
        private String h5_url;
    }

    @NoArgsConstructor
    @Data
    public static class TopBrandBean {
        /**
         * title : 品牌热DOU榜
         * category_list : [{"id":1,"name":"汽车","brand_list":[{"name":"宝马","logo_url":{"uri":"https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685","url_list":["https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685"]},"heat":1278,"rank":1,"rank_diff":0,"id":7532}]},{"id":2,"name":"手机","brand_list":[{"id":9117,"name":"华为","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/9117.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/9117.jpg"]},"heat":1209,"rank":1,"rank_diff":0}]},{"id":3,"name":"美妆","brand_list":[{"id":7699,"name":"兰蔻","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/7699.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/7699.jpg"]},"heat":1126,"rank":1,"rank_diff":0}]},{"id":4,"name":"奢侈品","brand_list":[{"logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/9362.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/9362.jpg"]},"heat":1057,"rank":1,"rank_diff":0,"id":9362,"name":"路易威登"}]},{"id":5,"name":"食品饮料","brand_list":[{"heat":1079,"rank":1,"rank_diff":0,"id":8974,"name":"茅台","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/8974.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/8974.jpg"]}}]},{"brand_list":[{"heat":985,"rank":1,"rank_diff":1,"id":7390,"name":"美的","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/7390.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/7390.jpg"]}}],"id":6,"name":"家用电器"},{"name":"服饰鞋帽","brand_list":[{"id":8599,"name":"优衣库","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/8599.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/8599.jpg"]},"heat":1087,"rank":1,"rank_diff":0}],"id":7},{"id":9,"name":"母婴","brand_list":[{"name":"a2至初","logo_url":{"uri":"https://p1.pstatp.com/large/ad-brand/20972.jpg","url_list":["https://p1.pstatp.com/large/ad-brand/20972.jpg"]},"heat":869,"rank":1,"rank_diff":3,"id":20972}]},{"name":"日化","brand_list":[{"id":1094445,"name":"高露洁","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b"]},"heat":928,"rank":1,"rank_diff":0}],"id":10}]
         */

        private String title;
        private List<CategoryListBean> category_list;

        @NoArgsConstructor
        @Data
        public static class CategoryListBean {
            /**
             * id : 1
             * name : 汽车
             * brand_list : [{"name":"宝马","logo_url":{"uri":"https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685","url_list":["https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685"]},"heat":1278,"rank":1,"rank_diff":0,"id":7532}]
             */

            private int id;
            private String name;
            private List<BrandListBean> brand_list;

            @NoArgsConstructor
            @Data
            public static class BrandListBean {
                /**
                 * name : 宝马
                 * logo_url : {"uri":"https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685","url_list":["https://p1.pstatp.com/large/web.business.image/202003165d0d22dc33f467844f859685"]}
                 * heat : 1278
                 * rank : 1
                 * rank_diff : 0
                 * id : 7532
                 */

                private String name;
                private CoverBean logo_url;
                private int heat;
                private int rank;
                private int rank_diff;
                private int id;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class ExtraBean {
        /**
         * now : 1607176256000
         * fatal_item_ids : []
         * logid : 2020120521505601002802015628B9EFDF
         */

        private long now;
        private String logid;
        private List<?> fatal_item_ids;
    }

    @NoArgsConstructor
    @Data
    public static class TopStarBean {
        /**
         * status : 1
         * avatar_larger : {"uri":"http://p9.pstatp.com/thumb/216d0007cfb3a10f04e5","url_list":["https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5"],"width":720,"height":720}
         * uid : 60373328124
         * signature :
         * avatar_thumb : {"uri":"http://p9.pstatp.com/thumb/216d0007cfb3a10f04e5","url_list":["https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5"],"width":720,"height":720}
         * follow_status : 0
         * nickname : UNIQ-王一博
         * user_rate : 1
         * unique_id : WYB.
         * sec_uid : MS4wLjABAAAA4gwJG2z-QzXuiwGOsoZO2Eg-yq4k8-wll1YjqdJiV1Y
         */

        private int status;
        private CoverBean avatar_larger;
        private String uid;
        private String signature;
        private CoverBean avatar_thumb;
        private int follow_status;
        private String nickname;
        private int user_rate;
        private String unique_id;
        private String sec_uid;
    }
}

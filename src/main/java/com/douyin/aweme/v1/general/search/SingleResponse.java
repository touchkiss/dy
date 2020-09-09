package com.douyin.aweme.v1.general.search;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/08/28 16:16
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class SingleResponse {

    private int status_code;
    private String qc;
    private int cursor;
    private int has_more;
    private AdInfoBean ad_info;
    private ExtraBean extra;
    private LogPbBean log_pb;
    private Object guide_search_words;
    private String backtrace;
    private List<DataBean> data;

    @NoArgsConstructor
    @Data
    public static class AdInfoBean {
    }

    @NoArgsConstructor
    @Data
    public static class ExtraBean {

        private long now;
        private String logid;
        private String search_request_id;
        private List<?> fatal_item_ids;
    }

    @NoArgsConstructor
    @Data
    public static class LogPbBean {
        /**
         * impr_id : 202008281601270101450210370F27B212
         */

        private String impr_id;
    }

    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * type : 1
         * aweme_info : {"aweme_id":"6865174286412434699","desc":"关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手","create_time":1598422951,"author":{"uid":"95839180871","short_id":"613361833","nickname":"苹果大连","gender":1,"signature":"分享 苹果全线产品 （iPhone iPad MacBook iMac) 使用技巧 创作不易 尽量1~2天 19点更新\n我爱大连，从未离开！","avatar_larger":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_thumb":{"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_medium":{"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"birthday":"","is_verified":true,"follow_status":0,"aweme_count":0,"following_count":0,"follower_count":0,"favoriting_count":0,"total_favorited":0,"is_block":false,"hide_search":false,"constellation":8,"location":"","hide_location":false,"weibo_verify":"","custom_verify":"","unique_id":"AppleWang0411","bind_phone":"","special_lock":1,"need_recommend":0,"is_binded_weibo":false,"weibo_name":"","weibo_schema":"","weibo_url":"","story_open":false,"story_count":0,"has_facebook_token":false,"has_twitter_token":false,"fb_expire_time":0,"tw_expire_time":0,"has_youtube_token":false,"youtube_expire_time":0,"room_id":0,"live_verify":0,"authority_status":0,"verify_info":"","shield_follow_notice":0,"shield_digg_notice":0,"shield_comment_notice":0,"school_name":"","school_poi_id":"","school_type":0,"share_info":{"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"6f95001d6793f6689bef","url_list":["https://p3-dy-ipv6.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p9-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p26-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402"],"width":720,"height":720},"share_title_myself":"","share_title_other":"","share_desc_info":""},"with_commerce_entry":false,"verification_type":1,"enterprise_verify_reason":"","is_ad_fake":false,"followers_detail":null,"region":"CN","account_region":"","sync_to_toutiao":0,"commerce_user_level":0,"live_agreement":0,"platform_sync_info":null,"with_shop_entry":false,"is_discipline_member":false,"secret":0,"has_orders":false,"prevent_download":false,"show_image_bubble":false,"geofencing":[],"unique_id_modify_time":1598601687,"video_icon":{"uri":"","url_list":[],"width":720,"height":720},"ins_id":"","google_account":"","youtube_channel_id":"","youtube_channel_title":"","apple_account":0,"with_dou_entry":false,"with_fusion_shop_entry":false,"is_phone_binded":false,"accept_private_policy":false,"twitter_id":"","twitter_name":"","user_canceled":false,"has_email":false,"is_gov_media_vip":false,"live_agreement_time":0,"status":1,"create_time":0,"avatar_uri":"3147500013670b5ccdd93","follower_status":0,"neiguang_shield":0,"comment_setting":0,"duet_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"user_rate":1,"download_setting":-1,"download_prompt_ts":0,"react_setting":0,"live_commerce":false,"cover_url":[{"uri":"c8510002be9a3a61aad2","url_list":["https://p6-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720,"height":720}],"language":"zh-Hans","has_insights":false,"share_qrcode_uri":"6f95001d6793f6689bef","item_list":null,"user_mode":0,"user_period":0,"has_unread_story":false,"new_story_cover":null,"is_star":false,"cv_level":"","type_label":null,"ad_cover_url":null,"comment_filter_status":0,"avatar_168x168":{"uri":"168x168/3147500013670b5ccdd93","url_list":["https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p26-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.jpeg?from=2563711402"],"width":720,"height":720},"avatar_300x300":{"uri":"300x300/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.jpeg?from=2563711402"],"width":720,"height":720},"relative_users":null,"cha_list":null,"sec_uid":"MS4wLjABAAAA8B_w_h2ze5zLRpzQdPGBcJ2K8zYbuRAGTc3lRrLEPvg","need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null,"stitch_setting":0},"music":{"id":6865174317593938696,"id_str":"6865174317593938696","title":"@苹果大连创作的原声","author":"苹果大连","album":"","cover_hd":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"cover_large":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"cover_medium":{"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"cover_thumb":{"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"play_url":{"uri":"http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3","url_list":["http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3","http://p9-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3"],"width":720,"height":720},"schema_url":"","source_platform":23,"start_time":0,"end_time":0,"duration":40,"extra":"{\"review_unshelve_reason\":0,\"beats\":{},\"douyin_beats_info\":{},\"schedule_search_time\":0,\"hotsoon_review_time\":-1,\"music_label_id\":null,\"has_edited\":0,\"reviewed\":0}","user_count":0,"position":null,"collect_stat":0,"status":1,"offline_desc":"","owner_id":"95839180871","owner_nickname":"苹果大连","is_original":false,"mid":"6865174317593938696","binded_challenge_id":0,"redirect":false,"is_restricted":false,"author_deleted":false,"is_del_video":false,"is_video_self_see":false,"owner_handle":"AppleWang0411","author_position":null,"prevent_download":false,"unshelve_countries":null,"prevent_item_download_status":0,"external_song_info":[],"sec_uid":"MS4wLjABAAAA8B_w_h2ze5zLRpzQdPGBcJ2K8zYbuRAGTc3lRrLEPvg","avatar_thumb":{"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_medium":{"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_large":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"preview_start_time":0,"preview_end_time":0,"is_commerce_music":false,"is_original_sound":true,"audition_duration":40,"shoot_duration":40,"reason_type":0,"artists":[],"lyric_short_position":null,"mute_share":false,"tag_list":null,"dmv_auto_show":false,"is_pgc":false,"is_matched_metadata":false,"is_audio_url_with_cookie":false},"cha_list":[{"cid":"1675873736053767","cha_name":"iphone12系列售价曝光","desc":"","schema":"aweme://aweme/challenge/detail?cid=1675873736053767","author":{"followers_detail":null,"platform_sync_info":null,"geofencing":null,"cover_url":null,"item_list":null,"new_story_cover":null,"type_label":null,"ad_cover_url":null,"relative_users":null,"cha_list":null,"need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null},"user_count":0,"share_info":{"share_url":"https://www.iesdouyin.com/share/challenge/1675873736053767/?u_code=0","share_weibo_desc":"我在抖音参加#iphone12系列售价曝光 ","share_desc":"在抖音，记录美好生活","share_title":"我在抖音参加#iphone12系列售价曝光 ","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"我在抖音参加#iphone12系列售价曝光 "},"connect_music":[],"type":1,"sub_type":0,"is_pgcshow":false,"collect_stat":0,"is_challenge":0,"view_count":0,"is_commerce":false,"hashtag_profile":"tos-cn-p-0015/99c7ca86765d42e4bbf6ec6ea882d15a","cha_attrs":null,"banner_list":null,"extra_attr":{"is_live":false},"show_items":null}],"video":{"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"},"cover":{"uri":"tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa","url_list":["https://p9-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p26-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large"],"width":720,"height":720},"height":1280,"width":720,"dynamic_cover":{"uri":"tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952","url_list":["https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large"],"width":720,"height":720},"origin_cover":{"uri":"tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952","url_list":["https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p9-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402"],"width":720,"height":720},"ratio":"540p","download_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"data_size":5221945},"has_watermark":true,"play_addr_lowbr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"},"bit_rate":[{"gear_name":"adapt_lowest_720","quality_type":15,"bit_rate":474383,"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/93d568c6fb4b7da7c9763566e7f5a695/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/1f016cb90c7d0ab6c18ffdc706f9e048/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_720p_474383","data_size":2395814,"file_cs":"c:0-45483-671c"},"is_h265":1,"is_bytevc1":1},{"gear_name":"adapt_540","quality_type":28,"bit_rate":447298,"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/25e8f11982afda897a598530a82fc374/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/de327dd00d4958ffa481713368ab6f17/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_540p_447298","data_size":2259025,"file_cs":"c:0-45483-eabf"},"is_h265":1,"is_bytevc1":1}],"duration":40403,"download_suffix_logo_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"data_size":5221945},"has_download_suffix_logo_addr":true,"play_addr_265":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/25e8f11982afda897a598530a82fc374/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/de327dd00d4958ffa481713368ab6f17/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_540p_447298","data_size":2259025,"file_cs":"c:0-45483-eabf"},"is_h265":0,"play_addr_h264":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"},"cdn_url_expired":0,"animated_cover":{"uri":"tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954","url_list":["https://p29-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large"]},"need_set_token":false,"CoverTsp":0,"misc_download_addrs":"{\"suffix_scene\":{\"uri\":\"v0200f470000bt2vtg18alkil86nsv0g\",\"url_list\":[\"http://v9-dy-z.ixigua.com/eb949c287f5d2132844d5142fd156227/5f48c80f/video/tos/cn/tos-cn-ve-15/ae7d450720c44e6ea7da7acd93c7f30a/?a=1128\\u0026br=2700\\u0026bt=900\\u0026cr=3\\u0026cs=0\\u0026cv=1\\u0026dr=0\\u0026ds=3\\u0026er=\\u0026l=202008281601270101450210370F27B212\\u0026lr=all\\u0026mime_type=video_mp4\\u0026qs=0\\u0026rc=anlxO2xvO2p5dzMzOmkzM0ApaWZpZTs1aGU2Nzw0PDY0aWctcDNpaF4ucS9fLS0xLS9zc2FiX2IuLTI2YWNhXi1iM186Yw%3D%3D\\u0026vl=\\u0026vr=\",\"http://v26-dy.ixigua.com/8500133665b66054b3acf30a63984c37/5f48c80f/video/tos/cn/tos-cn-ve-15/ae7d450720c44e6ea7da7acd93c7f30a/?a=1128\\u0026br=2700\\u0026bt=900\\u0026cr=3\\u0026cs=0\\u0026cv=1\\u0026dr=0\\u0026ds=3\\u0026er=\\u0026l=202008281601270101450210370F27B212\\u0026lr=all\\u0026mime_type=video_mp4\\u0026qs=0\\u0026rc=anlxO2xvO2p5dzMzOmkzM0ApaWZpZTs1aGU2Nzw0PDY0aWctcDNpaF4ucS9fLS0xLS9zc2FiX2IuLTI2YWNhXi1iM186Yw%3D%3D\\u0026vl=\\u0026vr=\",\"https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g\\u0026line=0\\u0026ratio=540p\\u0026watermark=1\\u0026media_type=4\\u0026vr_type=0\\u0026improve_bitrate=0\\u0026logo_name=aweme_hot\\u0026quality_type=11\\u0026source=PackSourceEnum_SEARCH\",\"https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g\\u0026line=1\\u0026ratio=540p\\u0026watermark=1\\u0026media_type=4\\u0026vr_type=0\\u0026improve_bitrate=0\\u0026logo_name=aweme_hot\\u0026quality_type=11\\u0026source=PackSourceEnum_SEARCH\"],\"width\":720,\"height\":720,\"data_size\":5002265}}","is_callback":true,"tags":null,"use_static_cover":false,"big_thumbs":null,"is_bytevc1":0},"share_url":"https://www.iesdouyin.com/share/video/6865174286412434699/?region=CN&mid=6865174317593938696&u_code=0&titleType=title","user_digged":0,"statistics":{"aweme_id":"6865174286412434699","comment_count":416,"digg_count":946,"download_count":312,"play_count":0,"share_count":314,"forward_count":1,"lose_count":0,"lose_comment_count":0,"whatsapp_share_count":0},"status":{"aweme_id":"6865174286412434699","is_delete":false,"allow_share":true,"allow_comment":true,"is_private":false,"with_goods":false,"private_status":0,"with_fusion_goods":false,"in_reviewing":false,"reviewed":1,"self_see":false,"is_prohibited":false,"download_status":0,"review_result":{"review_status":0},"dont_share_status":-1,"video_hide_search":0},"rate":12,"text_extra":[{"start":38,"end":44,"user_id":"6796248446","type":0,"sec_uid":"MS4wLjABAAAAGA9bHrExvrQmowuVfRZxjG4s07M7EUjf1PlaHRHqdls"},{"start":21,"end":36,"type":1,"hashtag_name":"iphone12系列售价曝光","hashtag_id":"1675873736053767","is_commerce":false}],"is_top":0,"share_info":{"share_url":"https://www.iesdouyin.com/share/video/6865174286412434699/?region=CN&mid=6865174317593938696&u_code=0&titleType=title","share_weibo_desc":"#在抖音，记录美好生活#关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手","share_desc":"在抖音，记录美好生活","share_title":"关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手","bool_persist":0,"share_title_myself":"","share_title_other":"","share_link_desc":"关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手  %s 复製此链接，哒开【抖音duan视頻】，値接观看视频！","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"#在抖音，记录美好生活#关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手"},"distance":"","video_labels":null,"is_vr":false,"duration":40403,"aweme_type":0,"is_fantasy":false,"cmt_swt":false,"image_infos":null,"risk_infos":{"vote":false,"warn":false,"risk_sink":false,"type":0,"content":""},"is_relieve":false,"sort_label":"","position":null,"uniqid_position":null,"comment_list":null,"author_user_id":95839180871,"bodydance_score":0,"geofencing":[],"is_hash_tag":1,"is_pgcshow":false,"region":"CN","video_text":[],"vr_type":0,"collect_stat":0,"label_top_text":null,"promotions":[],"group_id":"6865174286412434699","prevent_download":false,"nickname_position":null,"challenge_position":null,"item_comment_settings":0,"with_promotional_music":false,"xigua_task":{"is_xigua_task":false},"long_video":null,"item_duet":0,"item_react":0,"without_watermark":false,"desc_language":"zh","interaction_stickers":null,"misc_info":"{\"ocr_location\":\"{\\\"x_max\\\":0.9852222222222222,\\\"x_min\\\":0.008694444444444444,\\\"y_max\\\":0.872171875,\\\"y_min\\\":0.056671875000000003}\"}","origin_comment_ids":null,"commerce_config_data":null,"distribute_type":1,"video_control":{"allow_download":true,"share_type":1,"show_progress_bar":1,"draft_progress_bar":1,"allow_duet":true,"allow_react":true,"prevent_download_type":0,"allow_dynamic_wallpaper":true,"timer_status":1,"allow_music":true,"allow_stitch":true},"aweme_control":{"can_forward":true,"can_share":true,"can_comment":true,"can_show_comment":true},"has_vs_entry":false,"hot_list":{"title":"iPhone12系列售价曝光","image_url":"http://sf1-ttcdn-tos.pstatp.com/obj/ttfe/hot_lists/feed_hot_search_icon.png","schema":"sslocal://hot/spot?keyword=iPhone12系列售价曝光","type":11,"i18n_title":"","header":"相关热点","pattern_type":0},"commerce_info":{},"need_vs_entry":false,"is_preview":0,"anchors":null,"hybrid_label":null,"geofencing_regions":null,"have_dashboard":false,"poi_patch_info":{"item_patch_poi_prompt_mark":0},"is_story":0,"report_action":false,"item_stitch":0,"story_ttl":0}
         * comment_list : [{"cid":"6865199845792153600","text":"11用户当场脑淤血","aweme_id":"6865174286412434699","create_time":1598428906,"digg_count":47,"status":1,"user":{"uid":"2396590586212116","short_id":"2303271672","nickname":"半块糖","gender":1,"signature":"","avatar_larger":{"uri":"1080x1080/2e9af0006f1004cdf39df","url_list":["https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720},"avatar_thumb":{"uri":"100x100/2e9af0006f1004cdf39df","url_list":["https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720},"avatar_medium":{"uri":"720x720/2e9af0006f1004cdf39df","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p26-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720},"birthday":"2000-01-01","is_verified":true,"follow_status":-1,"aweme_count":0,"following_count":125,"follower_count":3,"favoriting_count":433,"total_favorited":0,"is_block":false,"hide_search":true,"constellation":12,"location":"","hide_location":false,"weibo_verify":"","custom_verify":"","unique_id":"LCY1122334","bind_phone":"","special_lock":1,"need_recommend":0,"is_binded_weibo":false,"weibo_name":"","weibo_schema":"","weibo_url":"","story_open":false,"story_count":0,"has_facebook_token":false,"has_twitter_token":false,"fb_expire_time":0,"tw_expire_time":0,"has_youtube_token":false,"youtube_expire_time":0,"room_id":0,"live_verify":0,"authority_status":0,"verify_info":"","shield_follow_notice":0,"shield_digg_notice":0,"shield_comment_notice":0,"school_name":"","school_poi_id":"","school_type":0,"share_info":{"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"26dfd00015fd41f8b272b","url_list":["https://p1-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p6-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662"],"width":720,"height":720},"share_title_myself":"","share_title_other":"","share_desc_info":""},"with_commerce_entry":false,"verification_type":1,"original_musician":{"music_count":0,"music_used_count":0,"digg_count":0},"enterprise_verify_reason":"","is_ad_fake":false,"followers_detail":null,"region":"CN","account_region":"","sync_to_toutiao":0,"commerce_user_level":0,"live_agreement":0,"platform_sync_info":null,"with_shop_entry":false,"is_discipline_member":false,"secret":0,"has_orders":false,"prevent_download":false,"show_image_bubble":false,"geofencing":[],"unique_id_modify_time":1598601687,"video_icon":{"uri":"","url_list":[],"width":720,"height":720},"ins_id":"","google_account":"","youtube_channel_id":"","youtube_channel_title":"","apple_account":0,"with_dou_entry":false,"with_fusion_shop_entry":false,"is_phone_binded":false,"accept_private_policy":false,"twitter_id":"","twitter_name":"","user_canceled":false,"has_email":false,"is_gov_media_vip":false,"live_agreement_time":0,"status":1,"create_time":0,"avatar_uri":"2e9af0006f1004cdf39df","follower_status":0,"neiguang_shield":0,"comment_setting":0,"duet_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"user_rate":1,"download_setting":-1,"download_prompt_ts":0,"react_setting":0,"live_commerce":false,"cover_url":[{"uri":"c8510002be9a3a61aad2","url_list":["https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p1-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662"],"width":720,"height":720}],"language":"zh-Hans","has_insights":false,"share_qrcode_uri":"26dfd00015fd41f8b272b","item_list":null,"user_mode":0,"user_period":0,"has_unread_story":false,"new_story_cover":null,"is_star":false,"cv_level":"","type_label":null,"ad_cover_url":null,"comment_filter_status":0,"avatar_168x168":{"uri":"168x168/2e9af0006f1004cdf39df","url_list":["https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.jpeg?from=2956013662"],"width":720,"height":720},"avatar_300x300":{"uri":"300x300/2e9af0006f1004cdf39df","url_list":["https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p9-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.jpeg?from=2956013662"],"width":720,"height":720},"relative_users":null,"cha_list":null,"sec_uid":"MS4wLjABAAAAGXwsVYuUTEALbv0_tbgnQANIy6jCyWgxj27UoO1djjvNbDOL3UURSsm_WbDXTnwq","need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null,"stitch_setting":0},"reply_id":"0","user_digged":0,"reply_comment":null,"text_extra":[],"reply_to_reply_id":"0","reply_to_username":"","reply_to_userid":"0","label_list":null}]
         * dynamic_patch : {"height":212,"origin_type":6,"raw_data":"{\"type\":6,\"related_word_list\":[{\"related_word\":\"iphone12确定9月开售吗\",\"word_record\":{\"group_id\":\"6837000653575820552\",\"words_position\":0,\"words_content\":\"iphone12确定9月开售吗\",\"words_source\":\"related_search\"},\"related_img\":\"6314582118925946353\",\"rand_num\":1083756387108031074},{\"related_word\":\"iphone12国内上市时间\",\"word_record\":{\"group_id\":\"6800173646301107464\",\"words_position\":1,\"words_content\":\"iphone12国内上市时间\",\"words_source\":\"related_search\"},\"related_img\":\"3238287515070005315\",\"rand_num\":6506857694155677924},{\"related_word\":\"买苹果11还是等苹果12\",\"word_record\":{\"group_id\":\"6737086024704333063\",\"words_position\":2,\"words_content\":\"买苹果11还是等苹果12\",\"words_source\":\"related_search\"},\"related_img\":\"4652098699310783212\",\"rand_num\":3150234154877938055},{\"related_word\":\"iphone12的准确售价\",\"word_record\":{\"group_id\":\"6706775950870189316\",\"words_position\":3,\"words_content\":\"iphone12的准确售价\",\"words_source\":\"related_search\"},\"related_img\":\"3921229412113078416\",\"rand_num\":8983872125110951156},{\"related_word\":\"iphone12是双卡双待吗\",\"word_record\":{\"group_id\":\"6727788701570585868\",\"words_position\":4,\"words_content\":\"iphone12是双卡双待吗\",\"words_source\":\"related_search\"},\"related_img\":\"37703625418447650\",\"rand_num\":3804201491023202990},{\"related_word\":\"iphone 12最新官方消息\",\"word_record\":{\"group_id\":\"6804670067674977543\",\"words_position\":5,\"words_content\":\"iphone 12最新官方消息\",\"words_source\":\"related_search\"},\"related_img\":\"620012094207589486\",\"rand_num\":3148741623235254623}],\"words_query_record\":{\"info\":\"{}\",\"words_source\":\"related_search\",\"query_id\":\"6805147553143756045\"},\"doc_type\":108}","schema":"aweme://lynxview/?channel=fe_lynx_main_search_card&bundle=related-search%2Ftemplate.js&group=fe_lynx_main_search_card&card_version=2&dynamic=1"}
         */

        private int type;
        private AwemeInfoBean aweme_info;
        private DynamicPatchBean dynamic_patch;
        private List<CommentListBean> comment_list;

        @NoArgsConstructor
        @Data
        public static class AwemeInfoBean {
            /**
             * aweme_id : 6865174286412434699
             * desc : 关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手
             * create_time : 1598422951
             * author : {"uid":"95839180871","short_id":"613361833","nickname":"苹果大连","gender":1,"signature":"分享 苹果全线产品 （iPhone iPad MacBook iMac) 使用技巧 创作不易 尽量1~2天 19点更新\n我爱大连，从未离开！","avatar_larger":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_thumb":{"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_medium":{"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"birthday":"","is_verified":true,"follow_status":0,"aweme_count":0,"following_count":0,"follower_count":0,"favoriting_count":0,"total_favorited":0,"is_block":false,"hide_search":false,"constellation":8,"location":"","hide_location":false,"weibo_verify":"","custom_verify":"","unique_id":"AppleWang0411","bind_phone":"","special_lock":1,"need_recommend":0,"is_binded_weibo":false,"weibo_name":"","weibo_schema":"","weibo_url":"","story_open":false,"story_count":0,"has_facebook_token":false,"has_twitter_token":false,"fb_expire_time":0,"tw_expire_time":0,"has_youtube_token":false,"youtube_expire_time":0,"room_id":0,"live_verify":0,"authority_status":0,"verify_info":"","shield_follow_notice":0,"shield_digg_notice":0,"shield_comment_notice":0,"school_name":"","school_poi_id":"","school_type":0,"share_info":{"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"6f95001d6793f6689bef","url_list":["https://p3-dy-ipv6.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p9-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p26-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402"],"width":720,"height":720},"share_title_myself":"","share_title_other":"","share_desc_info":""},"with_commerce_entry":false,"verification_type":1,"enterprise_verify_reason":"","is_ad_fake":false,"followers_detail":null,"region":"CN","account_region":"","sync_to_toutiao":0,"commerce_user_level":0,"live_agreement":0,"platform_sync_info":null,"with_shop_entry":false,"is_discipline_member":false,"secret":0,"has_orders":false,"prevent_download":false,"show_image_bubble":false,"geofencing":[],"unique_id_modify_time":1598601687,"video_icon":{"uri":"","url_list":[],"width":720,"height":720},"ins_id":"","google_account":"","youtube_channel_id":"","youtube_channel_title":"","apple_account":0,"with_dou_entry":false,"with_fusion_shop_entry":false,"is_phone_binded":false,"accept_private_policy":false,"twitter_id":"","twitter_name":"","user_canceled":false,"has_email":false,"is_gov_media_vip":false,"live_agreement_time":0,"status":1,"create_time":0,"avatar_uri":"3147500013670b5ccdd93","follower_status":0,"neiguang_shield":0,"comment_setting":0,"duet_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"user_rate":1,"download_setting":-1,"download_prompt_ts":0,"react_setting":0,"live_commerce":false,"cover_url":[{"uri":"c8510002be9a3a61aad2","url_list":["https://p6-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720,"height":720}],"language":"zh-Hans","has_insights":false,"share_qrcode_uri":"6f95001d6793f6689bef","item_list":null,"user_mode":0,"user_period":0,"has_unread_story":false,"new_story_cover":null,"is_star":false,"cv_level":"","type_label":null,"ad_cover_url":null,"comment_filter_status":0,"avatar_168x168":{"uri":"168x168/3147500013670b5ccdd93","url_list":["https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p26-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.jpeg?from=2563711402"],"width":720,"height":720},"avatar_300x300":{"uri":"300x300/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.jpeg?from=2563711402"],"width":720,"height":720},"relative_users":null,"cha_list":null,"sec_uid":"MS4wLjABAAAA8B_w_h2ze5zLRpzQdPGBcJ2K8zYbuRAGTc3lRrLEPvg","need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null,"stitch_setting":0}
             * music : {"id":6865174317593938696,"id_str":"6865174317593938696","title":"@苹果大连创作的原声","author":"苹果大连","album":"","cover_hd":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"cover_large":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"cover_medium":{"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"cover_thumb":{"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"play_url":{"uri":"http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3","url_list":["http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3","http://p9-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3"],"width":720,"height":720},"schema_url":"","source_platform":23,"start_time":0,"end_time":0,"duration":40,"extra":"{\"review_unshelve_reason\":0,\"beats\":{},\"douyin_beats_info\":{},\"schedule_search_time\":0,\"hotsoon_review_time\":-1,\"music_label_id\":null,\"has_edited\":0,\"reviewed\":0}","user_count":0,"position":null,"collect_stat":0,"status":1,"offline_desc":"","owner_id":"95839180871","owner_nickname":"苹果大连","is_original":false,"mid":"6865174317593938696","binded_challenge_id":0,"redirect":false,"is_restricted":false,"author_deleted":false,"is_del_video":false,"is_video_self_see":false,"owner_handle":"AppleWang0411","author_position":null,"prevent_download":false,"unshelve_countries":null,"prevent_item_download_status":0,"external_song_info":[],"sec_uid":"MS4wLjABAAAA8B_w_h2ze5zLRpzQdPGBcJ2K8zYbuRAGTc3lRrLEPvg","avatar_thumb":{"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_medium":{"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"avatar_large":{"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720},"preview_start_time":0,"preview_end_time":0,"is_commerce_music":false,"is_original_sound":true,"audition_duration":40,"shoot_duration":40,"reason_type":0,"artists":[],"lyric_short_position":null,"mute_share":false,"tag_list":null,"dmv_auto_show":false,"is_pgc":false,"is_matched_metadata":false,"is_audio_url_with_cookie":false}
             * cha_list : [{"cid":"1675873736053767","cha_name":"iphone12系列售价曝光","desc":"","schema":"aweme://aweme/challenge/detail?cid=1675873736053767","author":{"followers_detail":null,"platform_sync_info":null,"geofencing":null,"cover_url":null,"item_list":null,"new_story_cover":null,"type_label":null,"ad_cover_url":null,"relative_users":null,"cha_list":null,"need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null},"user_count":0,"share_info":{"share_url":"https://www.iesdouyin.com/share/challenge/1675873736053767/?u_code=0","share_weibo_desc":"我在抖音参加#iphone12系列售价曝光 ","share_desc":"在抖音，记录美好生活","share_title":"我在抖音参加#iphone12系列售价曝光 ","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"我在抖音参加#iphone12系列售价曝光 "},"connect_music":[],"type":1,"sub_type":0,"is_pgcshow":false,"collect_stat":0,"is_challenge":0,"view_count":0,"is_commerce":false,"hashtag_profile":"tos-cn-p-0015/99c7ca86765d42e4bbf6ec6ea882d15a","cha_attrs":null,"banner_list":null,"extra_attr":{"is_live":false},"show_items":null}]
             * video : {"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"},"cover":{"uri":"tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa","url_list":["https://p9-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p26-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large"],"width":720,"height":720},"height":1280,"width":720,"dynamic_cover":{"uri":"tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952","url_list":["https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large"],"width":720,"height":720},"origin_cover":{"uri":"tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952","url_list":["https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p9-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402"],"width":720,"height":720},"ratio":"540p","download_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"data_size":5221945},"has_watermark":true,"play_addr_lowbr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"},"bit_rate":[{"gear_name":"adapt_lowest_720","quality_type":15,"bit_rate":474383,"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/93d568c6fb4b7da7c9763566e7f5a695/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/1f016cb90c7d0ab6c18ffdc706f9e048/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_720p_474383","data_size":2395814,"file_cs":"c:0-45483-671c"},"is_h265":1,"is_bytevc1":1},{"gear_name":"adapt_540","quality_type":28,"bit_rate":447298,"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/25e8f11982afda897a598530a82fc374/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/de327dd00d4958ffa481713368ab6f17/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_540p_447298","data_size":2259025,"file_cs":"c:0-45483-eabf"},"is_h265":1,"is_bytevc1":1}],"duration":40403,"download_suffix_logo_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"data_size":5221945},"has_download_suffix_logo_addr":true,"play_addr_265":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/25e8f11982afda897a598530a82fc374/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/de327dd00d4958ffa481713368ab6f17/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_540p_447298","data_size":2259025,"file_cs":"c:0-45483-eabf"},"is_h265":0,"play_addr_h264":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"},"cdn_url_expired":0,"animated_cover":{"uri":"tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954","url_list":["https://p29-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large"]},"need_set_token":false,"CoverTsp":0,"misc_download_addrs":"{\"suffix_scene\":{\"uri\":\"v0200f470000bt2vtg18alkil86nsv0g\",\"url_list\":[\"http://v9-dy-z.ixigua.com/eb949c287f5d2132844d5142fd156227/5f48c80f/video/tos/cn/tos-cn-ve-15/ae7d450720c44e6ea7da7acd93c7f30a/?a=1128\\u0026br=2700\\u0026bt=900\\u0026cr=3\\u0026cs=0\\u0026cv=1\\u0026dr=0\\u0026ds=3\\u0026er=\\u0026l=202008281601270101450210370F27B212\\u0026lr=all\\u0026mime_type=video_mp4\\u0026qs=0\\u0026rc=anlxO2xvO2p5dzMzOmkzM0ApaWZpZTs1aGU2Nzw0PDY0aWctcDNpaF4ucS9fLS0xLS9zc2FiX2IuLTI2YWNhXi1iM186Yw%3D%3D\\u0026vl=\\u0026vr=\",\"http://v26-dy.ixigua.com/8500133665b66054b3acf30a63984c37/5f48c80f/video/tos/cn/tos-cn-ve-15/ae7d450720c44e6ea7da7acd93c7f30a/?a=1128\\u0026br=2700\\u0026bt=900\\u0026cr=3\\u0026cs=0\\u0026cv=1\\u0026dr=0\\u0026ds=3\\u0026er=\\u0026l=202008281601270101450210370F27B212\\u0026lr=all\\u0026mime_type=video_mp4\\u0026qs=0\\u0026rc=anlxO2xvO2p5dzMzOmkzM0ApaWZpZTs1aGU2Nzw0PDY0aWctcDNpaF4ucS9fLS0xLS9zc2FiX2IuLTI2YWNhXi1iM186Yw%3D%3D\\u0026vl=\\u0026vr=\",\"https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g\\u0026line=0\\u0026ratio=540p\\u0026watermark=1\\u0026media_type=4\\u0026vr_type=0\\u0026improve_bitrate=0\\u0026logo_name=aweme_hot\\u0026quality_type=11\\u0026source=PackSourceEnum_SEARCH\",\"https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g\\u0026line=1\\u0026ratio=540p\\u0026watermark=1\\u0026media_type=4\\u0026vr_type=0\\u0026improve_bitrate=0\\u0026logo_name=aweme_hot\\u0026quality_type=11\\u0026source=PackSourceEnum_SEARCH\"],\"width\":720,\"height\":720,\"data_size\":5002265}}","is_callback":true,"tags":null,"use_static_cover":false,"big_thumbs":null,"is_bytevc1":0}
             * share_url : https://www.iesdouyin.com/share/video/6865174286412434699/?region=CN&mid=6865174317593938696&u_code=0&titleType=title
             * user_digged : 0
             * statistics : {"aweme_id":"6865174286412434699","comment_count":416,"digg_count":946,"download_count":312,"play_count":0,"share_count":314,"forward_count":1,"lose_count":0,"lose_comment_count":0,"whatsapp_share_count":0}
             * status : {"aweme_id":"6865174286412434699","is_delete":false,"allow_share":true,"allow_comment":true,"is_private":false,"with_goods":false,"private_status":0,"with_fusion_goods":false,"in_reviewing":false,"reviewed":1,"self_see":false,"is_prohibited":false,"download_status":0,"review_result":{"review_status":0},"dont_share_status":-1,"video_hide_search":0}
             * rate : 12
             * text_extra : [{"start":38,"end":44,"user_id":"6796248446","type":0,"sec_uid":"MS4wLjABAAAAGA9bHrExvrQmowuVfRZxjG4s07M7EUjf1PlaHRHqdls"},{"start":21,"end":36,"type":1,"hashtag_name":"iphone12系列售价曝光","hashtag_id":"1675873736053767","is_commerce":false}]
             * is_top : 0
             * share_info : {"share_url":"https://www.iesdouyin.com/share/video/6865174286412434699/?region=CN&mid=6865174317593938696&u_code=0&titleType=title","share_weibo_desc":"#在抖音，记录美好生活#关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手","share_desc":"在抖音，记录美好生活","share_title":"关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手","bool_persist":0,"share_title_myself":"","share_title_other":"","share_link_desc":"关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手  %s 复製此链接，哒开【抖音duan视頻】，値接观看视频！","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"#在抖音，记录美好生活#关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手"}
             * distance :
             * video_labels : null
             * is_vr : false
             * duration : 40403
             * aweme_type : 0
             * is_fantasy : false
             * cmt_swt : false
             * image_infos : null
             * risk_infos : {"vote":false,"warn":false,"risk_sink":false,"type":0,"content":""}
             * is_relieve : false
             * sort_label :
             * position : null
             * uniqid_position : null
             * comment_list : null
             * author_user_id : 95839180871
             * bodydance_score : 0
             * geofencing : []
             * is_hash_tag : 1
             * is_pgcshow : false
             * region : CN
             * video_text : []
             * vr_type : 0
             * collect_stat : 0
             * label_top_text : null
             * promotions : []
             * group_id : 6865174286412434699
             * prevent_download : false
             * nickname_position : null
             * challenge_position : null
             * item_comment_settings : 0
             * with_promotional_music : false
             * xigua_task : {"is_xigua_task":false}
             * long_video : null
             * item_duet : 0
             * item_react : 0
             * without_watermark : false
             * desc_language : zh
             * interaction_stickers : null
             * misc_info : {"ocr_location":"{\"x_max\":0.9852222222222222,\"x_min\":0.008694444444444444,\"y_max\":0.872171875,\"y_min\":0.056671875000000003}"}
             * origin_comment_ids : null
             * commerce_config_data : null
             * distribute_type : 1
             * video_control : {"allow_download":true,"share_type":1,"show_progress_bar":1,"draft_progress_bar":1,"allow_duet":true,"allow_react":true,"prevent_download_type":0,"allow_dynamic_wallpaper":true,"timer_status":1,"allow_music":true,"allow_stitch":true}
             * aweme_control : {"can_forward":true,"can_share":true,"can_comment":true,"can_show_comment":true}
             * has_vs_entry : false
             * hot_list : {"title":"iPhone12系列售价曝光","image_url":"http://sf1-ttcdn-tos.pstatp.com/obj/ttfe/hot_lists/feed_hot_search_icon.png","schema":"sslocal://hot/spot?keyword=iPhone12系列售价曝光","type":11,"i18n_title":"","header":"相关热点","pattern_type":0}
             * commerce_info : {}
             * need_vs_entry : false
             * is_preview : 0
             * anchors : null
             * hybrid_label : null
             * geofencing_regions : null
             * have_dashboard : false
             * poi_patch_info : {"item_patch_poi_prompt_mark":0}
             * is_story : 0
             * report_action : false
             * item_stitch : 0
             * story_ttl : 0
             */

            private String aweme_id;
            private String desc;
            private int create_time;
            private AuthorBean author;
            private MusicBean music;
            private VideoBean video;
            private String share_url;
            private int user_digged;
            private StatisticsBean statistics;
            private StatusBean status;
            private int rate;
            private int is_top;
            private ShareInfoBeanX share_info;
            private String distance;
            private Object video_labels;
            private boolean is_vr;
            private int duration;
            private int aweme_type;
            private boolean is_fantasy;
            private boolean cmt_swt;
            private Object image_infos;
            private RiskInfosBean risk_infos;
            private boolean is_relieve;
            private String sort_label;
            private Object position;
            private Object uniqid_position;
            private Object comment_list;
            private long author_user_id;
            private int bodydance_score;
            private int is_hash_tag;
            private boolean is_pgcshow;
            private String region;
            private int vr_type;
            private int collect_stat;
            private Object label_top_text;
            private String group_id;
            private boolean prevent_download;
            private Object nickname_position;
            private Object challenge_position;
            private int item_comment_settings;
            private boolean with_promotional_music;
            private XiguaTaskBean xigua_task;
            private Object long_video;
            private int item_duet;
            private int item_react;
            private boolean without_watermark;
            private String desc_language;
            private Object interaction_stickers;
            private String misc_info;
            private Object origin_comment_ids;
            private Object commerce_config_data;
            private int distribute_type;
            private VideoControlBean video_control;
            private AwemeControlBean aweme_control;
            private boolean has_vs_entry;
            private HotListBean hot_list;
            private CommerceInfoBean commerce_info;
            private boolean need_vs_entry;
            private int is_preview;
            private Object anchors;
            private Object hybrid_label;
            private Object geofencing_regions;
            private boolean have_dashboard;
            private PoiPatchInfoBean poi_patch_info;
            private int is_story;
            private boolean report_action;
            private int item_stitch;
            private int story_ttl;
            private List<ChaListBean> cha_list;
            private List<TextExtraBean> text_extra;
            private List<?> geofencing;
            private List<?> video_text;
            private List<?> promotions;

            @NoArgsConstructor
            @Data
            public static class AuthorBean {
                /**
                 * uid : 95839180871
                 * short_id : 613361833
                 * nickname : 苹果大连
                 * gender : 1
                 * signature : 分享 苹果全线产品 （iPhone iPad MacBook iMac) 使用技巧 创作不易 尽量1~2天 19点更新
                 * 我爱大连，从未离开！
                 * avatar_larger : {"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * avatar_thumb : {"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * avatar_medium : {"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * birthday :
                 * is_verified : true
                 * follow_status : 0
                 * aweme_count : 0
                 * following_count : 0
                 * follower_count : 0
                 * favoriting_count : 0
                 * total_favorited : 0
                 * is_block : false
                 * hide_search : false
                 * constellation : 8
                 * location :
                 * hide_location : false
                 * weibo_verify :
                 * custom_verify :
                 * unique_id : AppleWang0411
                 * bind_phone :
                 * special_lock : 1
                 * need_recommend : 0
                 * is_binded_weibo : false
                 * weibo_name :
                 * weibo_schema :
                 * weibo_url :
                 * story_open : false
                 * story_count : 0
                 * has_facebook_token : false
                 * has_twitter_token : false
                 * fb_expire_time : 0
                 * tw_expire_time : 0
                 * has_youtube_token : false
                 * youtube_expire_time : 0
                 * room_id : 0
                 * live_verify : 0
                 * authority_status : 0
                 * verify_info :
                 * shield_follow_notice : 0
                 * shield_digg_notice : 0
                 * shield_comment_notice : 0
                 * school_name :
                 * school_poi_id :
                 * school_type : 0
                 * share_info : {"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"6f95001d6793f6689bef","url_list":["https://p3-dy-ipv6.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p9-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p26-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402"],"width":720,"height":720},"share_title_myself":"","share_title_other":"","share_desc_info":""}
                 * with_commerce_entry : false
                 * verification_type : 1
                 * enterprise_verify_reason :
                 * is_ad_fake : false
                 * followers_detail : null
                 * region : CN
                 * account_region :
                 * sync_to_toutiao : 0
                 * commerce_user_level : 0
                 * live_agreement : 0
                 * platform_sync_info : null
                 * with_shop_entry : false
                 * is_discipline_member : false
                 * secret : 0
                 * has_orders : false
                 * prevent_download : false
                 * show_image_bubble : false
                 * geofencing : []
                 * unique_id_modify_time : 1598601687
                 * video_icon : {"uri":"","url_list":[],"width":720,"height":720}
                 * ins_id :
                 * google_account :
                 * youtube_channel_id :
                 * youtube_channel_title :
                 * apple_account : 0
                 * with_dou_entry : false
                 * with_fusion_shop_entry : false
                 * is_phone_binded : false
                 * accept_private_policy : false
                 * twitter_id :
                 * twitter_name :
                 * user_canceled : false
                 * has_email : false
                 * is_gov_media_vip : false
                 * live_agreement_time : 0
                 * status : 1
                 * create_time : 0
                 * avatar_uri : 3147500013670b5ccdd93
                 * follower_status : 0
                 * neiguang_shield : 0
                 * comment_setting : 0
                 * duet_setting : 0
                 * reflow_page_gid : 0
                 * reflow_page_uid : 0
                 * user_rate : 1
                 * download_setting : -1
                 * download_prompt_ts : 0
                 * react_setting : 0
                 * live_commerce : false
                 * cover_url : [{"uri":"c8510002be9a3a61aad2","url_list":["https://p6-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"],"width":720,"height":720}]
                 * language : zh-Hans
                 * has_insights : false
                 * share_qrcode_uri : 6f95001d6793f6689bef
                 * item_list : null
                 * user_mode : 0
                 * user_period : 0
                 * has_unread_story : false
                 * new_story_cover : null
                 * is_star : false
                 * cv_level :
                 * type_label : null
                 * ad_cover_url : null
                 * comment_filter_status : 0
                 * avatar_168x168 : {"uri":"168x168/3147500013670b5ccdd93","url_list":["https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p26-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.jpeg?from=2563711402"],"width":720,"height":720}
                 * avatar_300x300 : {"uri":"300x300/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.jpeg?from=2563711402"],"width":720,"height":720}
                 * relative_users : null
                 * cha_list : null
                 * sec_uid : MS4wLjABAAAA8B_w_h2ze5zLRpzQdPGBcJ2K8zYbuRAGTc3lRrLEPvg
                 * need_points : null
                 * homepage_bottom_toast : null
                 * can_set_geofencing : null
                 * white_cover_url : null
                 * user_tags : null
                 * stitch_setting : 0
                 */

                private String uid;
                private String short_id;
                private String nickname;
                private int gender;
                private String signature;
                private AvatarLargerBean avatar_larger;
                private AvatarThumbBean avatar_thumb;
                private AvatarMediumBean avatar_medium;
                private String birthday;
                private boolean is_verified;
                private int follow_status;
                private int aweme_count;
                private int following_count;
                private int follower_count;
                private int favoriting_count;
                private int total_favorited;
                private boolean is_block;
                private boolean hide_search;
                private int constellation;
                private String location;
                private boolean hide_location;
                private String weibo_verify;
                private String custom_verify;
                private String unique_id;
                private String bind_phone;
                private int special_lock;
                private int need_recommend;
                private boolean is_binded_weibo;
                private String weibo_name;
                private String weibo_schema;
                private String weibo_url;
                private boolean story_open;
                private int story_count;
                private boolean has_facebook_token;
                private boolean has_twitter_token;
                private int fb_expire_time;
                private int tw_expire_time;
                private boolean has_youtube_token;
                private int youtube_expire_time;
                private int room_id;
                private int live_verify;
                private int authority_status;
                private String verify_info;
                private int shield_follow_notice;
                private int shield_digg_notice;
                private int shield_comment_notice;
                private String school_name;
                private String school_poi_id;
                private int school_type;
                private ShareInfoBean share_info;
                private boolean with_commerce_entry;
                private int verification_type;
                private String enterprise_verify_reason;
                private boolean is_ad_fake;
                private Object followers_detail;
                private String region;
                private String account_region;
                private int sync_to_toutiao;
                private int commerce_user_level;
                private int live_agreement;
                private Object platform_sync_info;
                private boolean with_shop_entry;
                private boolean is_discipline_member;
                private int secret;
                private boolean has_orders;
                private boolean prevent_download;
                private boolean show_image_bubble;
                private int unique_id_modify_time;
                private VideoIconBean video_icon;
                private String ins_id;
                private String google_account;
                private String youtube_channel_id;
                private String youtube_channel_title;
                private int apple_account;
                private boolean with_dou_entry;
                private boolean with_fusion_shop_entry;
                private boolean is_phone_binded;
                private boolean accept_private_policy;
                private String twitter_id;
                private String twitter_name;
                private boolean user_canceled;
                private boolean has_email;
                private boolean is_gov_media_vip;
                private int live_agreement_time;
                private int status;
                private int create_time;
                private String avatar_uri;
                private int follower_status;
                private int neiguang_shield;
                private int comment_setting;
                private int duet_setting;
                private int reflow_page_gid;
                private int reflow_page_uid;
                private int user_rate;
                private int download_setting;
                private int download_prompt_ts;
                private int react_setting;
                private boolean live_commerce;
                private String language;
                private boolean has_insights;
                private String share_qrcode_uri;
                private Object item_list;
                private int user_mode;
                private int user_period;
                private boolean has_unread_story;
                private Object new_story_cover;
                private boolean is_star;
                private String cv_level;
                private Object type_label;
                private Object ad_cover_url;
                private int comment_filter_status;
                private Avatar168x168Bean avatar_168x168;
                private Avatar300x300Bean avatar_300x300;
                private Object relative_users;
                private Object cha_list;
                private String sec_uid;
                private Object need_points;
                private Object homepage_bottom_toast;
                private Object can_set_geofencing;
                private Object white_cover_url;
                private Object user_tags;
                private int stitch_setting;
                private List<?> geofencing;
                private List<CoverUrlBean> cover_url;

                @NoArgsConstructor
                @Data
                public static class AvatarLargerBean {
                    /**
                     * uri : 1080x1080/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class AvatarThumbBean {
                    /**
                     * uri : 100x100/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p9-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class AvatarMediumBean {
                    /**
                     * uri : 720x720/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class ShareInfoBean {
                    /**
                     * share_url :
                     * share_weibo_desc :
                     * share_desc :
                     * share_title :
                     * share_qrcode_url : {"uri":"6f95001d6793f6689bef","url_list":["https://p3-dy-ipv6.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p9-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p26-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402"],"width":720,"height":720}
                     * share_title_myself :
                     * share_title_other :
                     * share_desc_info :
                     */

                    private String share_url;
                    private String share_weibo_desc;
                    private String share_desc;
                    private String share_title;
                    private ShareQrcodeUrlBean share_qrcode_url;
                    private String share_title_myself;
                    private String share_title_other;
                    private String share_desc_info;

                    @NoArgsConstructor
                    @Data
                    public static class ShareQrcodeUrlBean {
                        /**
                         * uri : 6f95001d6793f6689bef
                         * url_list : ["https://p3-dy-ipv6.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p9-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402","https://p26-dy.byteimg.com/obj/6f95001d6793f6689bef?from=2563711402"]
                         * width : 720
                         * height : 720
                         */

                        private String uri;
                        private int width;
                        private int height;
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
                    private int width;
                    private int height;
                    private List<?> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class Avatar168x168Bean {
                    /**
                     * uri : 168x168/3147500013670b5ccdd93
                     * url_list : ["https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p26-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.webp?from=2563711402","https://p9-dy.byteimg.com/img/3147500013670b5ccdd93~c5_168x168.jpeg?from=2563711402"]
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
                public static class Avatar300x300Bean {
                    /**
                     * uri : 300x300/3147500013670b5ccdd93
                     * url_list : ["https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p29-dy.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/img/3147500013670b5ccdd93~c5_300x300.jpeg?from=2563711402"]
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
                public static class CoverUrlBean {
                    /**
                     * uri : c8510002be9a3a61aad2
                     * url_list : ["https://p6-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p29-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2563711402"]
                     * width : 720
                     * height : 720
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private List<String> url_list;
                }
            }

            @NoArgsConstructor
            @Data
            public static class MusicBean {
                /**
                 * id : 6865174317593938696
                 * id_str : 6865174317593938696
                 * title : @苹果大连创作的原声
                 * author : 苹果大连
                 * album :
                 * cover_hd : {"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * cover_large : {"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * cover_medium : {"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * cover_thumb : {"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * play_url : {"uri":"http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3","url_list":["http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3","http://p9-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3"],"width":720,"height":720}
                 * schema_url :
                 * source_platform : 23
                 * start_time : 0
                 * end_time : 0
                 * duration : 40
                 * extra : {"review_unshelve_reason":0,"beats":{},"douyin_beats_info":{},"schedule_search_time":0,"hotsoon_review_time":-1,"music_label_id":null,"has_edited":0,"reviewed":0}
                 * user_count : 0
                 * position : null
                 * collect_stat : 0
                 * status : 1
                 * offline_desc :
                 * owner_id : 95839180871
                 * owner_nickname : 苹果大连
                 * is_original : false
                 * mid : 6865174317593938696
                 * binded_challenge_id : 0
                 * redirect : false
                 * is_restricted : false
                 * author_deleted : false
                 * is_del_video : false
                 * is_video_self_see : false
                 * owner_handle : AppleWang0411
                 * author_position : null
                 * prevent_download : false
                 * unshelve_countries : null
                 * prevent_item_download_status : 0
                 * external_song_info : []
                 * sec_uid : MS4wLjABAAAA8B_w_h2ze5zLRpzQdPGBcJ2K8zYbuRAGTc3lRrLEPvg
                 * avatar_thumb : {"uri":"100x100/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * avatar_medium : {"uri":"720x720/3147500013670b5ccdd93","url_list":["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * avatar_large : {"uri":"1080x1080/3147500013670b5ccdd93","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"],"width":720,"height":720}
                 * preview_start_time : 0
                 * preview_end_time : 0
                 * is_commerce_music : false
                 * is_original_sound : true
                 * audition_duration : 40
                 * shoot_duration : 40
                 * reason_type : 0
                 * artists : []
                 * lyric_short_position : null
                 * mute_share : false
                 * tag_list : null
                 * dmv_auto_show : false
                 * is_pgc : false
                 * is_matched_metadata : false
                 * is_audio_url_with_cookie : false
                 */

                private long id;
                private String id_str;
                private String title;
                private String author;
                private String album;
                private CoverHdBean cover_hd;
                private CoverLargeBean cover_large;
                private CoverMediumBean cover_medium;
                private CoverThumbBean cover_thumb;
                private PlayUrlBean play_url;
                private String schema_url;
                private int source_platform;
                private int start_time;
                private int end_time;
                private int duration;
                private String extra;
                private int user_count;
                private Object position;
                private int collect_stat;
                private int status;
                private String offline_desc;
                private String owner_id;
                private String owner_nickname;
                private boolean is_original;
                private String mid;
                private int binded_challenge_id;
                private boolean redirect;
                private boolean is_restricted;
                private boolean author_deleted;
                private boolean is_del_video;
                private boolean is_video_self_see;
                private String owner_handle;
                private Object author_position;
                private boolean prevent_download;
                private Object unshelve_countries;
                private int prevent_item_download_status;
                private String sec_uid;
                private AvatarThumbBeanX avatar_thumb;
                private AvatarMediumBeanX avatar_medium;
                private AvatarLargeBean avatar_large;
                private int preview_start_time;
                private int preview_end_time;
                private boolean is_commerce_music;
                private boolean is_original_sound;
                private int audition_duration;
                private int shoot_duration;
                private int reason_type;
                private Object lyric_short_position;
                private boolean mute_share;
                private Object tag_list;
                private boolean dmv_auto_show;
                private boolean is_pgc;
                private boolean is_matched_metadata;
                private boolean is_audio_url_with_cookie;
                private List<?> external_song_info;
                private List<?> artists;

                @NoArgsConstructor
                @Data
                public static class CoverHdBean {
                    /**
                     * uri : 1080x1080/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class CoverLargeBean {
                    /**
                     * uri : 1080x1080/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class CoverMediumBean {
                    /**
                     * uri : 720x720/3147500013670b5ccdd93
                     * url_list : ["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class CoverThumbBean {
                    /**
                     * uri : 100x100/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                     * uri : http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3
                     * url_list : ["http://p1-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3","http://p9-dy.byteimg.com/obj/ies-music/6865174286550797070.mp3"]
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
                public static class AvatarThumbBeanX {
                    /**
                     * uri : 100x100/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/100x100/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/100x100/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class AvatarMediumBeanX {
                    /**
                     * uri : 720x720/3147500013670b5ccdd93
                     * url_list : ["https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p6-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/720x720/3147500013670b5ccdd93.webp?from=2563711402","https://p1-dy-ipv6.byteimg.com/aweme/720x720/3147500013670b5ccdd93.jpeg?from=2563711402"]
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
                public static class AvatarLargeBean {
                    /**
                     * uri : 1080x1080/3147500013670b5ccdd93
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p29-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p26-dy.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.webp?from=2563711402","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/3147500013670b5ccdd93.jpeg?from=2563711402"]
                     * width : 720
                     * height : 720
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private List<String> url_list;
                }
            }

            @NoArgsConstructor
            @Data
            public static class VideoBean {
                /**
                 * play_addr : {"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"}
                 * cover : {"uri":"tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa","url_list":["https://p9-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p26-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large"],"width":720,"height":720}
                 * height : 1280
                 * width : 720
                 * dynamic_cover : {"uri":"tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952","url_list":["https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large"],"width":720,"height":720}
                 * origin_cover : {"uri":"tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952","url_list":["https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p9-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402"],"width":720,"height":720}
                 * ratio : 540p
                 * download_addr : {"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"data_size":5221945}
                 * has_watermark : true
                 * play_addr_lowbr : {"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"}
                 * bit_rate : [{"gear_name":"adapt_lowest_720","quality_type":15,"bit_rate":474383,"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/93d568c6fb4b7da7c9763566e7f5a695/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/1f016cb90c7d0ab6c18ffdc706f9e048/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_720p_474383","data_size":2395814,"file_cs":"c:0-45483-671c"},"is_h265":1,"is_bytevc1":1},{"gear_name":"adapt_540","quality_type":28,"bit_rate":447298,"play_addr":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/25e8f11982afda897a598530a82fc374/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/de327dd00d4958ffa481713368ab6f17/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_540p_447298","data_size":2259025,"file_cs":"c:0-45483-eabf"},"is_h265":1,"is_bytevc1":1}]
                 * duration : 40403
                 * download_suffix_logo_addr : {"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"data_size":5221945}
                 * has_download_suffix_logo_addr : true
                 * play_addr_265 : {"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/25e8f11982afda897a598530a82fc374/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/de327dd00d4958ffa481713368ab6f17/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_540p_447298","data_size":2259025,"file_cs":"c:0-45483-eabf"}
                 * is_h265 : 0
                 * play_addr_h264 : {"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621","data_size":3285884,"file_cs":"c:0-45113-a5e0"}
                 * cdn_url_expired : 0
                 * animated_cover : {"uri":"tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954","url_list":["https://p29-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large"]}
                 * need_set_token : false
                 * CoverTsp : 0
                 * misc_download_addrs : {"suffix_scene":{"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/eb949c287f5d2132844d5142fd156227/5f48c80f/video/tos/cn/tos-cn-ve-15/ae7d450720c44e6ea7da7acd93c7f30a/?a=1128\u0026br=2700\u0026bt=900\u0026cr=3\u0026cs=0\u0026cv=1\u0026dr=0\u0026ds=3\u0026er=\u0026l=202008281601270101450210370F27B212\u0026lr=all\u0026mime_type=video_mp4\u0026qs=0\u0026rc=anlxO2xvO2p5dzMzOmkzM0ApaWZpZTs1aGU2Nzw0PDY0aWctcDNpaF4ucS9fLS0xLS9zc2FiX2IuLTI2YWNhXi1iM186Yw%3D%3D\u0026vl=\u0026vr=","http://v26-dy.ixigua.com/8500133665b66054b3acf30a63984c37/5f48c80f/video/tos/cn/tos-cn-ve-15/ae7d450720c44e6ea7da7acd93c7f30a/?a=1128\u0026br=2700\u0026bt=900\u0026cr=3\u0026cs=0\u0026cv=1\u0026dr=0\u0026ds=3\u0026er=\u0026l=202008281601270101450210370F27B212\u0026lr=all\u0026mime_type=video_mp4\u0026qs=0\u0026rc=anlxO2xvO2p5dzMzOmkzM0ApaWZpZTs1aGU2Nzw0PDY0aWctcDNpaF4ucS9fLS0xLS9zc2FiX2IuLTI2YWNhXi1iM186Yw%3D%3D\u0026vl=\u0026vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g\u0026line=0\u0026ratio=540p\u0026watermark=1\u0026media_type=4\u0026vr_type=0\u0026improve_bitrate=0\u0026logo_name=aweme_hot\u0026quality_type=11\u0026source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g\u0026line=1\u0026ratio=540p\u0026watermark=1\u0026media_type=4\u0026vr_type=0\u0026improve_bitrate=0\u0026logo_name=aweme_hot\u0026quality_type=11\u0026source=PackSourceEnum_SEARCH"],"width":720,"height":720,"data_size":5002265}}
                 * is_callback : true
                 * tags : null
                 * use_static_cover : false
                 * big_thumbs : null
                 * is_bytevc1 : 0
                 */

                private PlayAddrBean play_addr;
                private CoverBean cover;
                private int height;
                private int width;
                private DynamicCoverBean dynamic_cover;
                private OriginCoverBean origin_cover;
                private String ratio;
                private DownloadAddrBean download_addr;
                private boolean has_watermark;
                private PlayAddrLowbrBean play_addr_lowbr;
                private int duration;
                private DownloadSuffixLogoAddrBean download_suffix_logo_addr;
                private boolean has_download_suffix_logo_addr;
                private PlayAddr265Bean play_addr_265;
                private int is_h265;
                private PlayAddrH264Bean play_addr_h264;
                private int cdn_url_expired;
                private AnimatedCoverBean animated_cover;
                private boolean need_set_token;
                private int CoverTsp;
                private String misc_download_addrs;
                private boolean is_callback;
                private Object tags;
                private boolean use_static_cover;
                private Object big_thumbs;
                private int is_bytevc1;
                private List<BitRateBean> bit_rate;

                @NoArgsConstructor
                @Data
                public static class PlayAddrBean {
                    /**
                     * uri : v0200f470000bt2vtg18alkil86nsv0g
                     * url_list : ["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"]
                     * width : 720
                     * height : 720
                     * url_key : v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621
                     * data_size : 3285884
                     * file_cs : c:0-45113-a5e0
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private String url_key;
                    private int data_size;
                    private String file_cs;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class CoverBean {
                    /**
                     * uri : tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa
                     * url_list : ["https://p9-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p26-dy.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/img/tos-cn-p-0015/89bccacbec5f40b493c3b2791afacbfa~noop.jpeg?from=2563711402_large"]
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
                public static class DynamicCoverBean {
                    /**
                     * uri : tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p6-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/cb47e9213bd04f988ee1c6c80e6551a3_1598422952?from=2563711402_large"]
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
                public static class OriginCoverBean {
                    /**
                     * uri : tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p26-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402","https://p9-dy.byteimg.com/tos-cn-p-0015/adf0a8296c5949939d4d4c20bcc36dc0_1598422952~tplv-dy-360p.jpeg?from=2563711402"]
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
                public static class DownloadAddrBean {
                    /**
                     * uri : v0200f470000bt2vtg18alkil86nsv0g
                     * url_list : ["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"]
                     * width : 720
                     * height : 720
                     * data_size : 5221945
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private int data_size;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class PlayAddrLowbrBean {
                    /**
                     * uri : v0200f470000bt2vtg18alkil86nsv0g
                     * url_list : ["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_SEARCH"]
                     * width : 720
                     * height : 720
                     * url_key : v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621
                     * data_size : 3285884
                     * file_cs : c:0-45113-a5e0
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private String url_key;
                    private int data_size;
                    private String file_cs;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class DownloadSuffixLogoAddrBean {
                    /**
                     * uri : v0200f470000bt2vtg18alkil86nsv0g
                     * url_list : ["http://v9-dy-z.ixigua.com/7627165d9d77d8bf3a9382790365a064/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/ebf7413fa3b0a213528f753c61eb8033/5f48c80f/video/tos/cn/tos-cn-ve-15/dee2e72757734c9dab70fb90a98d324a/?a=1128&br=2817&bt=939&cr=3&cs=0&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=0&rc=anlxO2xvO2p5dzMzOmkzM0ApNDhpOWU6OTtpNzpnZzVkOGctcDNpaF4ucS9fLS0xLS9zc2ExNmAuNTAyNC0vMTIxM186Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&watermark=1&media_type=4&vr_type=0&improve_bitrate=0&logo_name=aweme_search_suffix&quality_type=11&source=PackSourceEnum_SEARCH"]
                     * width : 720
                     * height : 720
                     * data_size : 5221945
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private int data_size;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class PlayAddr265Bean {
                    /**
                     * uri : v0200f470000bt2vtg18alkil86nsv0g
                     * url_list : ["http://v9-dy-z.ixigua.com/25e8f11982afda897a598530a82fc374/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/de327dd00d4958ffa481713368ab6f17/5f48c80f/video/tos/cn/tos-cn-ve-15/bfe035f254df4e02ba7436b7612487ce/?a=1128&br=1744&bt=436&cr=3&cs=2&cv=1&dr=0&ds=6&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=11&rc=anlxO2xvO2p5dzMzOmkzM0ApZ2VoNWVlZjtlNzhoODk3O2ctcDNpaF4ucS9fLS0xLS9zczFeMTBiMWIuMDJfYV8yNC86Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=11&adapt540=1&source=PackSourceEnum_SEARCH"]
                     * width : 720
                     * height : 720
                     * url_key : v0200f470000bt2vtg18alkil86nsv0g_bytevc1_540p_447298
                     * data_size : 2259025
                     * file_cs : c:0-45483-eabf
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private String url_key;
                    private int data_size;
                    private String file_cs;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class PlayAddrH264Bean {
                    /**
                     * uri : v0200f470000bt2vtg18alkil86nsv0g
                     * url_list : ["https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&quality_type=11&source=PackSourceEnum_SEARCH"]
                     * width : 720
                     * height : 720
                     * url_key : v0200f470000bt2vtg18alkil86nsv0g_h264_540p_650621
                     * data_size : 3285884
                     * file_cs : c:0-45113-a5e0
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private String url_key;
                    private int data_size;
                    private String file_cs;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class AnimatedCoverBean {
                    /**
                     * uri : tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954
                     * url_list : ["https://p29-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p9-dy.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large","https://p3-dy-ipv6.byteimg.com/obj/tos-cn-p-0015/352d9965cf254152b03289c2bc43c9bb_1598422954?from=2563711402_large"]
                     */

                    private String uri;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class BitRateBean {
                    /**
                     * gear_name : adapt_lowest_720
                     * quality_type : 15
                     * bit_rate : 474383
                     * play_addr : {"uri":"v0200f470000bt2vtg18alkil86nsv0g","url_list":["http://v9-dy-z.ixigua.com/93d568c6fb4b7da7c9763566e7f5a695/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/1f016cb90c7d0ab6c18ffdc706f9e048/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH"],"width":720,"height":720,"url_key":"v0200f470000bt2vtg18alkil86nsv0g_bytevc1_720p_474383","data_size":2395814,"file_cs":"c:0-45483-671c"}
                     * is_h265 : 1
                     * is_bytevc1 : 1
                     */

                    private String gear_name;
                    private int quality_type;
                    private int bit_rate;
                    private PlayAddrBeanX play_addr;
                    private int is_h265;
                    private int is_bytevc1;

                    @NoArgsConstructor
                    @Data
                    public static class PlayAddrBeanX {
                        /**
                         * uri : v0200f470000bt2vtg18alkil86nsv0g
                         * url_list : ["http://v9-dy-z.ixigua.com/93d568c6fb4b7da7c9763566e7f5a695/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","http://v26-dy.ixigua.com/1f016cb90c7d0ab6c18ffdc706f9e048/5f48c80f/video/tos/cn/tos-cn-ve-15/e30d4f3a1c244fae813361055b2d26f3/?a=1128&br=1389&bt=463&cr=3&cs=2&cv=1&dr=0&ds=3&er=&l=202008281601270101450210370F27B212&lr=all&mime_type=video_mp4&qs=15&rc=anlxO2xvO2p5dzMzOmkzM0ApZWZkOjdlOGQzNzlnOTc4OGctcDNpaF4ucS9fLS0xLS9zcy1gNjMzXjEuNWJfMWE0YDI6Yw%3D%3D&vl=&vr=","https://aweme-hl.snssdk.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=0&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH","https://api-hl.amemv.com/aweme/v1/play/?video_id=v0200f470000bt2vtg18alkil86nsv0g&line=1&ratio=720p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&bytevc1=1&quality_type=14&source=PackSourceEnum_SEARCH"]
                         * width : 720
                         * height : 720
                         * url_key : v0200f470000bt2vtg18alkil86nsv0g_bytevc1_720p_474383
                         * data_size : 2395814
                         * file_cs : c:0-45483-671c
                         */

                        private String uri;
                        private int width;
                        private int height;
                        private String url_key;
                        private int data_size;
                        private String file_cs;
                        private List<String> url_list;
                    }
                }
            }

            @NoArgsConstructor
            @Data
            public static class StatisticsBean {
                /**
                 * aweme_id : 6865174286412434699
                 * comment_count : 416
                 * digg_count : 946
                 * download_count : 312
                 * play_count : 0
                 * share_count : 314
                 * forward_count : 1
                 * lose_count : 0
                 * lose_comment_count : 0
                 * whatsapp_share_count : 0
                 */

                private String aweme_id;
                private int comment_count;
                private int digg_count;
                private int download_count;
                private int play_count;
                private int share_count;
                private int forward_count;
                private int lose_count;
                private int lose_comment_count;
                private int whatsapp_share_count;
            }

            @NoArgsConstructor
            @Data
            public static class StatusBean {
                /**
                 * aweme_id : 6865174286412434699
                 * is_delete : false
                 * allow_share : true
                 * allow_comment : true
                 * is_private : false
                 * with_goods : false
                 * private_status : 0
                 * with_fusion_goods : false
                 * in_reviewing : false
                 * reviewed : 1
                 * self_see : false
                 * is_prohibited : false
                 * download_status : 0
                 * review_result : {"review_status":0}
                 * dont_share_status : -1
                 * video_hide_search : 0
                 */

                private String aweme_id;
                private boolean is_delete;
                private boolean allow_share;
                private boolean allow_comment;
                private boolean is_private;
                private boolean with_goods;
                private int private_status;
                private boolean with_fusion_goods;
                private boolean in_reviewing;
                private int reviewed;
                private boolean self_see;
                private boolean is_prohibited;
                private int download_status;
                private ReviewResultBean review_result;
                private int dont_share_status;
                private int video_hide_search;

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
            public static class ShareInfoBeanX {
                /**
                 * share_url : https://www.iesdouyin.com/share/video/6865174286412434699/?region=CN&mid=6865174317593938696&u_code=0&titleType=title
                 * share_weibo_desc : #在抖音，记录美好生活#关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手
                 * share_desc : 在抖音，记录美好生活
                 * share_title : 关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手
                 * bool_persist : 0
                 * share_title_myself :
                 * share_title_other :
                 * share_link_desc : 关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手  %s 复製此链接，哒开【抖音duan视頻】，値接观看视频！
                 * share_signature_url :
                 * share_signature_desc :
                 * share_quote :
                 * share_desc_info : #在抖音，记录美好生活#关于iPhone12的上市时间和价格的预计#iphone12系列售价曝光 #@抖音小助手
                 */

                private String share_url;
                private String share_weibo_desc;
                private String share_desc;
                private String share_title;
                private int bool_persist;
                private String share_title_myself;
                private String share_title_other;
                private String share_link_desc;
                private String share_signature_url;
                private String share_signature_desc;
                private String share_quote;
                private String share_desc_info;
            }

            @NoArgsConstructor
            @Data
            public static class RiskInfosBean {
                /**
                 * vote : false
                 * warn : false
                 * risk_sink : false
                 * type : 0
                 * content :
                 */

                private boolean vote;
                private boolean warn;
                private boolean risk_sink;
                private int type;
                private String content;
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
            public static class VideoControlBean {
                /**
                 * allow_download : true
                 * share_type : 1
                 * show_progress_bar : 1
                 * draft_progress_bar : 1
                 * allow_duet : true
                 * allow_react : true
                 * prevent_download_type : 0
                 * allow_dynamic_wallpaper : true
                 * timer_status : 1
                 * allow_music : true
                 * allow_stitch : true
                 */

                private boolean allow_download;
                private int share_type;
                private int show_progress_bar;
                private int draft_progress_bar;
                private boolean allow_duet;
                private boolean allow_react;
                private int prevent_download_type;
                private boolean allow_dynamic_wallpaper;
                private int timer_status;
                private boolean allow_music;
                private boolean allow_stitch;
            }

            @NoArgsConstructor
            @Data
            public static class AwemeControlBean {
                /**
                 * can_forward : true
                 * can_share : true
                 * can_comment : true
                 * can_show_comment : true
                 */

                private boolean can_forward;
                private boolean can_share;
                private boolean can_comment;
                private boolean can_show_comment;
            }

            @NoArgsConstructor
            @Data
            public static class HotListBean {
            }

            @NoArgsConstructor
            @Data
            public static class CommerceInfoBean {
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
            public static class ChaListBean {
                /**
                 * cid : 1675873736053767
                 * cha_name : iphone12系列售价曝光
                 * desc :
                 * schema : aweme://aweme/challenge/detail?cid=1675873736053767
                 * author : {"followers_detail":null,"platform_sync_info":null,"geofencing":null,"cover_url":null,"item_list":null,"new_story_cover":null,"type_label":null,"ad_cover_url":null,"relative_users":null,"cha_list":null,"need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null}
                 * user_count : 0
                 * share_info : {"share_url":"https://www.iesdouyin.com/share/challenge/1675873736053767/?u_code=0","share_weibo_desc":"我在抖音参加#iphone12系列售价曝光 ","share_desc":"在抖音，记录美好生活","share_title":"我在抖音参加#iphone12系列售价曝光 ","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"我在抖音参加#iphone12系列售价曝光 "}
                 * connect_music : []
                 * type : 1
                 * sub_type : 0
                 * is_pgcshow : false
                 * collect_stat : 0
                 * is_challenge : 0
                 * view_count : 0
                 * is_commerce : false
                 * hashtag_profile : tos-cn-p-0015/99c7ca86765d42e4bbf6ec6ea882d15a
                 * cha_attrs : null
                 * banner_list : null
                 * extra_attr : {"is_live":false}
                 * show_items : null
                 */

                private String cid;
                private String cha_name;
                private String desc;
                private String schema;
                private AuthorBeanX author;
                private int user_count;
                private ShareInfoBeanXX share_info;
                private int type;
                private int sub_type;
                private boolean is_pgcshow;
                private int collect_stat;
                private int is_challenge;
                private int view_count;
                private boolean is_commerce;
                private String hashtag_profile;
                private Object cha_attrs;
                private Object banner_list;
                private ExtraAttrBean extra_attr;
                private Object show_items;
                private List<?> connect_music;

                @NoArgsConstructor
                @Data
                public static class AuthorBeanX {
                    /**
                     * followers_detail : null
                     * platform_sync_info : null
                     * geofencing : null
                     * cover_url : null
                     * item_list : null
                     * new_story_cover : null
                     * type_label : null
                     * ad_cover_url : null
                     * relative_users : null
                     * cha_list : null
                     * need_points : null
                     * homepage_bottom_toast : null
                     * can_set_geofencing : null
                     * white_cover_url : null
                     * user_tags : null
                     */

                    private Object followers_detail;
                    private Object platform_sync_info;
                    private Object geofencing;
                    private Object cover_url;
                    private Object item_list;
                    private Object new_story_cover;
                    private Object type_label;
                    private Object ad_cover_url;
                    private Object relative_users;
                    private Object cha_list;
                    private Object need_points;
                    private Object homepage_bottom_toast;
                    private Object can_set_geofencing;
                    private Object white_cover_url;
                    private Object user_tags;
                }

                @NoArgsConstructor
                @Data
                public static class ShareInfoBeanXX {
                    /**
                     * share_url : https://www.iesdouyin.com/share/challenge/1675873736053767/?u_code=0
                     * share_weibo_desc : 我在抖音参加#iphone12系列售价曝光
                     * share_desc : 在抖音，记录美好生活
                     * share_title : 我在抖音参加#iphone12系列售价曝光
                     * bool_persist : 0
                     * share_title_myself :
                     * share_title_other :
                     * share_signature_url :
                     * share_signature_desc :
                     * share_quote :
                     * share_desc_info : 我在抖音参加#iphone12系列售价曝光
                     */

                    private String share_url;
                    private String share_weibo_desc;
                    private String share_desc;
                    private String share_title;
                    private int bool_persist;
                    private String share_title_myself;
                    private String share_title_other;
                    private String share_signature_url;
                    private String share_signature_desc;
                    private String share_quote;
                    private String share_desc_info;
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

            @NoArgsConstructor
            @Data
            public static class TextExtraBean {
                /**
                 * start : 38
                 * end : 44
                 * user_id : 6796248446
                 * type : 0
                 * sec_uid : MS4wLjABAAAAGA9bHrExvrQmowuVfRZxjG4s07M7EUjf1PlaHRHqdls
                 * hashtag_name : iphone12系列售价曝光
                 * hashtag_id : 1675873736053767
                 * is_commerce : false
                 */

                private int start;
                private int end;
                private String user_id;
                private int type;
                private String sec_uid;
                private String hashtag_name;
                private String hashtag_id;
                private boolean is_commerce;
            }
        }

        @NoArgsConstructor
        @Data
        public static class DynamicPatchBean {
            /**
             * height : 212
             * origin_type : 6
             * raw_data : {"type":6,"related_word_list":[{"related_word":"iphone12确定9月开售吗","word_record":{"group_id":"6837000653575820552","words_position":0,"words_content":"iphone12确定9月开售吗","words_source":"related_search"},"related_img":"6314582118925946353","rand_num":1083756387108031074},{"related_word":"iphone12国内上市时间","word_record":{"group_id":"6800173646301107464","words_position":1,"words_content":"iphone12国内上市时间","words_source":"related_search"},"related_img":"3238287515070005315","rand_num":6506857694155677924},{"related_word":"买苹果11还是等苹果12","word_record":{"group_id":"6737086024704333063","words_position":2,"words_content":"买苹果11还是等苹果12","words_source":"related_search"},"related_img":"4652098699310783212","rand_num":3150234154877938055},{"related_word":"iphone12的准确售价","word_record":{"group_id":"6706775950870189316","words_position":3,"words_content":"iphone12的准确售价","words_source":"related_search"},"related_img":"3921229412113078416","rand_num":8983872125110951156},{"related_word":"iphone12是双卡双待吗","word_record":{"group_id":"6727788701570585868","words_position":4,"words_content":"iphone12是双卡双待吗","words_source":"related_search"},"related_img":"37703625418447650","rand_num":3804201491023202990},{"related_word":"iphone 12最新官方消息","word_record":{"group_id":"6804670067674977543","words_position":5,"words_content":"iphone 12最新官方消息","words_source":"related_search"},"related_img":"620012094207589486","rand_num":3148741623235254623}],"words_query_record":{"info":"{}","words_source":"related_search","query_id":"6805147553143756045"},"doc_type":108}
             * schema : aweme://lynxview/?channel=fe_lynx_main_search_card&bundle=related-search%2Ftemplate.js&group=fe_lynx_main_search_card&card_version=2&dynamic=1
             */

            private int height;
            private int origin_type;
            private String raw_data;
            private String schema;
        }

        @NoArgsConstructor
        @Data
        public static class CommentListBean {
            /**
             * cid : 6865199845792153600
             * text : 11用户当场脑淤血
             * aweme_id : 6865174286412434699
             * create_time : 1598428906
             * digg_count : 47
             * status : 1
             * user : {"uid":"2396590586212116","short_id":"2303271672","nickname":"半块糖","gender":1,"signature":"","avatar_larger":{"uri":"1080x1080/2e9af0006f1004cdf39df","url_list":["https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720},"avatar_thumb":{"uri":"100x100/2e9af0006f1004cdf39df","url_list":["https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720},"avatar_medium":{"uri":"720x720/2e9af0006f1004cdf39df","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p26-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720},"birthday":"2000-01-01","is_verified":true,"follow_status":-1,"aweme_count":0,"following_count":125,"follower_count":3,"favoriting_count":433,"total_favorited":0,"is_block":false,"hide_search":true,"constellation":12,"location":"","hide_location":false,"weibo_verify":"","custom_verify":"","unique_id":"LCY1122334","bind_phone":"","special_lock":1,"need_recommend":0,"is_binded_weibo":false,"weibo_name":"","weibo_schema":"","weibo_url":"","story_open":false,"story_count":0,"has_facebook_token":false,"has_twitter_token":false,"fb_expire_time":0,"tw_expire_time":0,"has_youtube_token":false,"youtube_expire_time":0,"room_id":0,"live_verify":0,"authority_status":0,"verify_info":"","shield_follow_notice":0,"shield_digg_notice":0,"shield_comment_notice":0,"school_name":"","school_poi_id":"","school_type":0,"share_info":{"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"26dfd00015fd41f8b272b","url_list":["https://p1-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p6-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662"],"width":720,"height":720},"share_title_myself":"","share_title_other":"","share_desc_info":""},"with_commerce_entry":false,"verification_type":1,"original_musician":{"music_count":0,"music_used_count":0,"digg_count":0},"enterprise_verify_reason":"","is_ad_fake":false,"followers_detail":null,"region":"CN","account_region":"","sync_to_toutiao":0,"commerce_user_level":0,"live_agreement":0,"platform_sync_info":null,"with_shop_entry":false,"is_discipline_member":false,"secret":0,"has_orders":false,"prevent_download":false,"show_image_bubble":false,"geofencing":[],"unique_id_modify_time":1598601687,"video_icon":{"uri":"","url_list":[],"width":720,"height":720},"ins_id":"","google_account":"","youtube_channel_id":"","youtube_channel_title":"","apple_account":0,"with_dou_entry":false,"with_fusion_shop_entry":false,"is_phone_binded":false,"accept_private_policy":false,"twitter_id":"","twitter_name":"","user_canceled":false,"has_email":false,"is_gov_media_vip":false,"live_agreement_time":0,"status":1,"create_time":0,"avatar_uri":"2e9af0006f1004cdf39df","follower_status":0,"neiguang_shield":0,"comment_setting":0,"duet_setting":0,"reflow_page_gid":0,"reflow_page_uid":0,"user_rate":1,"download_setting":-1,"download_prompt_ts":0,"react_setting":0,"live_commerce":false,"cover_url":[{"uri":"c8510002be9a3a61aad2","url_list":["https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p1-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662"],"width":720,"height":720}],"language":"zh-Hans","has_insights":false,"share_qrcode_uri":"26dfd00015fd41f8b272b","item_list":null,"user_mode":0,"user_period":0,"has_unread_story":false,"new_story_cover":null,"is_star":false,"cv_level":"","type_label":null,"ad_cover_url":null,"comment_filter_status":0,"avatar_168x168":{"uri":"168x168/2e9af0006f1004cdf39df","url_list":["https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.jpeg?from=2956013662"],"width":720,"height":720},"avatar_300x300":{"uri":"300x300/2e9af0006f1004cdf39df","url_list":["https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p9-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.jpeg?from=2956013662"],"width":720,"height":720},"relative_users":null,"cha_list":null,"sec_uid":"MS4wLjABAAAAGXwsVYuUTEALbv0_tbgnQANIy6jCyWgxj27UoO1djjvNbDOL3UURSsm_WbDXTnwq","need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null,"stitch_setting":0}
             * reply_id : 0
             * user_digged : 0
             * reply_comment : null
             * text_extra : []
             * reply_to_reply_id : 0
             * reply_to_username :
             * reply_to_userid : 0
             * label_list : null
             */

            private String cid;
            private String text;
            private String aweme_id;
            private int create_time;
            private int digg_count;
            private int status;
            private UserBean user;
            private String reply_id;
            private int user_digged;
            private Object reply_comment;
            private String reply_to_reply_id;
            private String reply_to_username;
            private String reply_to_userid;
            private Object label_list;
            private List<?> text_extra;

            @NoArgsConstructor
            @Data
            public static class UserBean {
                /**
                 * uid : 2396590586212116
                 * short_id : 2303271672
                 * nickname : 半块糖
                 * gender : 1
                 * signature :
                 * avatar_larger : {"uri":"1080x1080/2e9af0006f1004cdf39df","url_list":["https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720}
                 * avatar_thumb : {"uri":"100x100/2e9af0006f1004cdf39df","url_list":["https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720}
                 * avatar_medium : {"uri":"720x720/2e9af0006f1004cdf39df","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p26-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.jpeg?from=2956013662"],"width":720,"height":720}
                 * birthday : 2000-01-01
                 * is_verified : true
                 * follow_status : -1
                 * aweme_count : 0
                 * following_count : 125
                 * follower_count : 3
                 * favoriting_count : 433
                 * total_favorited : 0
                 * is_block : false
                 * hide_search : true
                 * constellation : 12
                 * location :
                 * hide_location : false
                 * weibo_verify :
                 * custom_verify :
                 * unique_id : LCY1122334
                 * bind_phone :
                 * special_lock : 1
                 * need_recommend : 0
                 * is_binded_weibo : false
                 * weibo_name :
                 * weibo_schema :
                 * weibo_url :
                 * story_open : false
                 * story_count : 0
                 * has_facebook_token : false
                 * has_twitter_token : false
                 * fb_expire_time : 0
                 * tw_expire_time : 0
                 * has_youtube_token : false
                 * youtube_expire_time : 0
                 * room_id : 0
                 * live_verify : 0
                 * authority_status : 0
                 * verify_info :
                 * shield_follow_notice : 0
                 * shield_digg_notice : 0
                 * shield_comment_notice : 0
                 * school_name :
                 * school_poi_id :
                 * school_type : 0
                 * share_info : {"share_url":"","share_weibo_desc":"","share_desc":"","share_title":"","share_qrcode_url":{"uri":"26dfd00015fd41f8b272b","url_list":["https://p1-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p6-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662"],"width":720,"height":720},"share_title_myself":"","share_title_other":"","share_desc_info":""}
                 * with_commerce_entry : false
                 * verification_type : 1
                 * original_musician : {"music_count":0,"music_used_count":0,"digg_count":0}
                 * enterprise_verify_reason :
                 * is_ad_fake : false
                 * followers_detail : null
                 * region : CN
                 * account_region :
                 * sync_to_toutiao : 0
                 * commerce_user_level : 0
                 * live_agreement : 0
                 * platform_sync_info : null
                 * with_shop_entry : false
                 * is_discipline_member : false
                 * secret : 0
                 * has_orders : false
                 * prevent_download : false
                 * show_image_bubble : false
                 * geofencing : []
                 * unique_id_modify_time : 1598601687
                 * video_icon : {"uri":"","url_list":[],"width":720,"height":720}
                 * ins_id :
                 * google_account :
                 * youtube_channel_id :
                 * youtube_channel_title :
                 * apple_account : 0
                 * with_dou_entry : false
                 * with_fusion_shop_entry : false
                 * is_phone_binded : false
                 * accept_private_policy : false
                 * twitter_id :
                 * twitter_name :
                 * user_canceled : false
                 * has_email : false
                 * is_gov_media_vip : false
                 * live_agreement_time : 0
                 * status : 1
                 * create_time : 0
                 * avatar_uri : 2e9af0006f1004cdf39df
                 * follower_status : 0
                 * neiguang_shield : 0
                 * comment_setting : 0
                 * duet_setting : 0
                 * reflow_page_gid : 0
                 * reflow_page_uid : 0
                 * user_rate : 1
                 * download_setting : -1
                 * download_prompt_ts : 0
                 * react_setting : 0
                 * live_commerce : false
                 * cover_url : [{"uri":"c8510002be9a3a61aad2","url_list":["https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p1-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662"],"width":720,"height":720}]
                 * language : zh-Hans
                 * has_insights : false
                 * share_qrcode_uri : 26dfd00015fd41f8b272b
                 * item_list : null
                 * user_mode : 0
                 * user_period : 0
                 * has_unread_story : false
                 * new_story_cover : null
                 * is_star : false
                 * cv_level :
                 * type_label : null
                 * ad_cover_url : null
                 * comment_filter_status : 0
                 * avatar_168x168 : {"uri":"168x168/2e9af0006f1004cdf39df","url_list":["https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.jpeg?from=2956013662"],"width":720,"height":720}
                 * avatar_300x300 : {"uri":"300x300/2e9af0006f1004cdf39df","url_list":["https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p9-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.jpeg?from=2956013662"],"width":720,"height":720}
                 * relative_users : null
                 * cha_list : null
                 * sec_uid : MS4wLjABAAAAGXwsVYuUTEALbv0_tbgnQANIy6jCyWgxj27UoO1djjvNbDOL3UURSsm_WbDXTnwq
                 * need_points : null
                 * homepage_bottom_toast : null
                 * can_set_geofencing : null
                 * white_cover_url : null
                 * user_tags : null
                 * stitch_setting : 0
                 */

                private String uid;
                private String short_id;
                private String nickname;
                private int gender;
                private String signature;
                private AvatarLargerBeanX avatar_larger;
                private AvatarThumbBeanXX avatar_thumb;
                private AvatarMediumBeanXX avatar_medium;
                private String birthday;
                private boolean is_verified;
                private int follow_status;
                private int aweme_count;
                private int following_count;
                private int follower_count;
                private int favoriting_count;
                private int total_favorited;
                private boolean is_block;
                private boolean hide_search;
                private int constellation;
                private String location;
                private boolean hide_location;
                private String weibo_verify;
                private String custom_verify;
                private String unique_id;
                private String bind_phone;
                private int special_lock;
                private int need_recommend;
                private boolean is_binded_weibo;
                private String weibo_name;
                private String weibo_schema;
                private String weibo_url;
                private boolean story_open;
                private int story_count;
                private boolean has_facebook_token;
                private boolean has_twitter_token;
                private int fb_expire_time;
                private int tw_expire_time;
                private boolean has_youtube_token;
                private int youtube_expire_time;
                private int room_id;
                private int live_verify;
                private int authority_status;
                private String verify_info;
                private int shield_follow_notice;
                private int shield_digg_notice;
                private int shield_comment_notice;
                private String school_name;
                private String school_poi_id;
                private int school_type;
                private ShareInfoBeanXXX share_info;
                private boolean with_commerce_entry;
                private int verification_type;
                private OriginalMusicianBean original_musician;
                private String enterprise_verify_reason;
                private boolean is_ad_fake;
                private Object followers_detail;
                private String region;
                private String account_region;
                private int sync_to_toutiao;
                private int commerce_user_level;
                private int live_agreement;
                private Object platform_sync_info;
                private boolean with_shop_entry;
                private boolean is_discipline_member;
                private int secret;
                private boolean has_orders;
                private boolean prevent_download;
                private boolean show_image_bubble;
                private int unique_id_modify_time;
                private VideoIconBeanX video_icon;
                private String ins_id;
                private String google_account;
                private String youtube_channel_id;
                private String youtube_channel_title;
                private int apple_account;
                private boolean with_dou_entry;
                private boolean with_fusion_shop_entry;
                private boolean is_phone_binded;
                private boolean accept_private_policy;
                private String twitter_id;
                private String twitter_name;
                private boolean user_canceled;
                private boolean has_email;
                private boolean is_gov_media_vip;
                private int live_agreement_time;
                private int status;
                private int create_time;
                private String avatar_uri;
                private int follower_status;
                private int neiguang_shield;
                private int comment_setting;
                private int duet_setting;
                private int reflow_page_gid;
                private int reflow_page_uid;
                private int user_rate;
                private int download_setting;
                private int download_prompt_ts;
                private int react_setting;
                private boolean live_commerce;
                private String language;
                private boolean has_insights;
                private String share_qrcode_uri;
                private Object item_list;
                private int user_mode;
                private int user_period;
                private boolean has_unread_story;
                private Object new_story_cover;
                private boolean is_star;
                private String cv_level;
                private Object type_label;
                private Object ad_cover_url;
                private int comment_filter_status;
                private Avatar168x168BeanX avatar_168x168;
                private Avatar300x300BeanX avatar_300x300;
                private Object relative_users;
                private Object cha_list;
                private String sec_uid;
                private Object need_points;
                private Object homepage_bottom_toast;
                private Object can_set_geofencing;
                private Object white_cover_url;
                private Object user_tags;
                private int stitch_setting;
                private List<?> geofencing;
                private List<CoverUrlBeanX> cover_url;

                @NoArgsConstructor
                @Data
                public static class AvatarLargerBeanX {
                    /**
                     * uri : 1080x1080/2e9af0006f1004cdf39df
                     * url_list : ["https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/1080x1080/2e9af0006f1004cdf39df.jpeg?from=2956013662"]
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
                public static class AvatarThumbBeanXX {
                    /**
                     * uri : 100x100/2e9af0006f1004cdf39df
                     * url_list : ["https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/100x100/2e9af0006f1004cdf39df.jpeg?from=2956013662"]
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
                public static class AvatarMediumBeanXX {
                    /**
                     * uri : 720x720/2e9af0006f1004cdf39df
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p29-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p26-dy.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/aweme/720x720/2e9af0006f1004cdf39df.jpeg?from=2956013662"]
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
                public static class ShareInfoBeanXXX {
                    /**
                     * share_url :
                     * share_weibo_desc :
                     * share_desc :
                     * share_title :
                     * share_qrcode_url : {"uri":"26dfd00015fd41f8b272b","url_list":["https://p1-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p6-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662"],"width":720,"height":720}
                     * share_title_myself :
                     * share_title_other :
                     * share_desc_info :
                     */

                    private String share_url;
                    private String share_weibo_desc;
                    private String share_desc;
                    private String share_title;
                    private ShareQrcodeUrlBeanX share_qrcode_url;
                    private String share_title_myself;
                    private String share_title_other;
                    private String share_desc_info;

                    @NoArgsConstructor
                    @Data
                    public static class ShareQrcodeUrlBeanX {
                        /**
                         * uri : 26dfd00015fd41f8b272b
                         * url_list : ["https://p1-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p6-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/26dfd00015fd41f8b272b?from=2956013662"]
                         * width : 720
                         * height : 720
                         */

                        private String uri;
                        private int width;
                        private int height;
                        private List<String> url_list;
                    }
                }

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
                public static class VideoIconBeanX {
                    /**
                     * uri :
                     * url_list : []
                     * width : 720
                     * height : 720
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private List<?> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class Avatar168x168BeanX {
                    /**
                     * uri : 168x168/2e9af0006f1004cdf39df
                     * url_list : ["https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.webp?from=2956013662","https://p3-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_168x168.jpeg?from=2956013662"]
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
                public static class Avatar300x300BeanX {
                    /**
                     * uri : 300x300/2e9af0006f1004cdf39df
                     * url_list : ["https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p1-dy-ipv6.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p9-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.webp?from=2956013662","https://p26-dy.byteimg.com/img/2e9af0006f1004cdf39df~c5_300x300.jpeg?from=2956013662"]
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
                public static class CoverUrlBeanX {
                    /**
                     * uri : c8510002be9a3a61aad2
                     * url_list : ["https://p9-dy.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p1-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662","https://p3-dy-ipv6.byteimg.com/obj/c8510002be9a3a61aad2?from=2956013662"]
                     * width : 720
                     * height : 720
                     */

                    private String uri;
                    private int width;
                    private int height;
                    private List<String> url_list;
                }
            }
        }
    }
}

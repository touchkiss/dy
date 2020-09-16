package com.douyin.aweme.v1.general.search;

import com.douyin.aweme.v1.aweme.post.AwemeInfo;
import com.douyin.aweme.v1.aweme.post.BaseResponse;
import com.douyin.aweme.v1.user.profile.UserInfo;
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
public class SingleResponse extends BaseResponse {
    private String qc;
    private int cursor;
    private int has_more;
    private AdInfoBean ad_info;
    private Object guide_search_words;
    private String backtrace;
    private List<DataBean> data;

    @NoArgsConstructor
    @Data
    public static class AdInfoBean {
    }

    @NoArgsConstructor
    @Data
    public static class DataBean {
        private int type;
        private AwemeInfo aweme_info;
        private DynamicPatchBean dynamic_patch;
        private List<CommentListBean> comment_list;

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
            private UserInfo user;
            private String reply_id;
            private int user_digged;
            private Object reply_comment;
            private String reply_to_reply_id;
            private String reply_to_username;
            private String reply_to_userid;
            private Object label_list;
            private List<?> text_extra;
        }
    }
}

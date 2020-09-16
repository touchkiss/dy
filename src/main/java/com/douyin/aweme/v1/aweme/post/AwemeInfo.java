package com.douyin.aweme.v1.aweme.post;

import com.douyin.aweme.v1.general.search.SingleResponse;
import com.douyin.aweme.v1.user.profile.UserInfo;
import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class AwemeInfo {
    private Object anchors;
    private UserInfo author;
    private long author_user_id;
    private AwemeControlBean aweme_control;
    private String aweme_id;
    private int aweme_type;
    private int bodydance_score;
    private List<ChaListBean> cha_list;
    private Object challenge_position;
    private boolean cmt_swt;
    private int collect_stat;
    private Object comment_list;
    private Object commerce_config_data;
    private CommerceInfoBean commerce_info;
    private Object cover_labels;
    private int create_time;
    private String desc;
    private String desc_language;
    private DescendantsBean descendants;
    private String distance;
    private int distribute_type;
    private int duration;
    private boolean have_dashboard;
    private boolean has_vs_entry;
    private HotListBean hot_list;
    private Object hybrid_label;
    private List<?> geofencing;
    private Object geofencing_regions;
    private String group_id;
    private Object image_infos;
    private Object interaction_stickers;
    private boolean is_fantasy;
    private int is_hash_tag;
    private boolean is_pgcshow;
    private int is_preview;
    private boolean is_relieve;
    private int is_story;
    private int is_top;
    private boolean is_vr;
    private int item_comment_settings;
    private int item_duet;
    private int item_react;
    private int item_stitch;
    private CoverBean label_top;
    private Object label_top_text;
    private Object long_video;
    private String misc_info;
    private MusicBean music;
    private boolean need_vs_entry;
    private Object nickname_position;
    private Object origin_comment_ids;
    private boolean prevent_download;
    private List<?> promotions;
    private PoiPatchInfoBean poi_patch_info;
    private Object position;
    private int rate;
    private String region;
    private boolean report_action;
    private RiskInfosBean risk_infos;
    private ShareInfoBeanX share_info;
    private String share_url;
    private String sort_label;
    private StatisticsBean statistics;
    private StatusBean status;
    private int story_ttl;
    private List<TextExtraBean> text_extra;
    private Object uniqid_position;
    private int user_digged;
    private VideoBean video;
    private VideoControlBean video_control;
    private List<?> video_labels;
    private List<?> video_text;
    private int vr_type;
    private boolean with_promotional_music;
    private boolean without_watermark;
    private XiguaTaskBean xigua_task;

    @NoArgsConstructor
    @Data
    public static class HotListBean {
    }

    @NoArgsConstructor
    @Data
    public static class MusicBean {

        private long id;
        private String id_str;
        private String title;
        private String author;
        private String album;
        private CoverBean cover_hd;
        private CoverBean cover_large;
        private CoverBean cover_medium;
        private CoverBean cover_thumb;
        private CoverBean play_url;
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
        private CoverBean strong_beat_url;
        private Object unshelve_countries;
        private int prevent_item_download_status;
        private String sec_uid;
        private CoverBean avatar_thumb;
        private CoverBean avatar_medium;
        private CoverBean avatar_large;
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
        private Object music_chart_ranks;
        private List<?> external_song_info;
        private List<?> artists;
    }

    @NoArgsConstructor
    @Data
    public static class VideoBean {
        private PlayAddrBean play_addr;
        private CoverBean cover;
        private int height;
        private int width;
        private CoverBean dynamic_cover;
        private CoverBean origin_cover;
        private String ratio;
        private PlayAddrBean download_addr;
        private boolean has_watermark;
        private PlayAddrBean play_addr_lowbr;
        private int duration;
        private PlayAddrBean download_suffix_logo_addr;
        private boolean has_download_suffix_logo_addr;
        private int is_h265;
        private int cdn_url_expired;
        private CoverBean animated_cover;
        private boolean need_set_token;
        private boolean is_callback;
        private Object tags;
        private boolean use_static_cover;
        private Object big_thumbs;
        private int is_bytevc1;
        private List<BitRateBean> bit_rate;

        @NoArgsConstructor
        @Data
        public static class PlayAddrBean extends com.huoshan.bean.response.CoverBean {
            /**
             * uri : v0300f0e0000bt4523i9n4jupi7eflbg
             * url_list : ["http://v5-dy-d.ixigua.com/59fda3e0223415ec9bca91691e649318/5f618f26/video/tos/cn/tos-cn-ve-15/60b01c10ed3d48e6ab5ab6efda09fd80/?a=1128&br=5646&bt=1882&cr=0&cs=0&cv=1&dr=0&ds=6&er=&l=202009161105340101300930351A9D84CF&lr=all&mime_type=video_mp4&qs=0&rc=am9obHg3PDY4dzMzaGkzM0ApZzo3Njc7M2VlNzozOWU4NWdfYzRtZ2tmLzFfLS0tLTBzczEzLV5eNV4wLi5fNDRhMDQ6Yw%3D%3D&vl=&vr=","http://v29-dy.ixigua.com/7f057aaca9d316cdd299bf3a79874cee/5f618f26/video/tos/cn/tos-cn-ve-15/60b01c10ed3d48e6ab5ab6efda09fd80/?a=1128&br=5646&bt=1882&cr=0&cs=0&cv=1&dr=0&ds=6&er=&l=202009161105340101300930351A9D84CF&lr=all&mime_type=video_mp4&qs=0&rc=am9obHg3PDY4dzMzaGkzM0ApZzo3Njc7M2VlNzozOWU4NWdfYzRtZ2tmLzFfLS0tLTBzczEzLV5eNV4wLi5fNDRhMDQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f0e0000bt4523i9n4jupi7eflbg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_PUBLISH","https://api.amemv.com/aweme/v1/play/?video_id=v0300f0e0000bt4523i9n4jupi7eflbg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_PUBLISH"]
             * width : 720
             * height : 720
             * url_key : v0300f0e0000bt4523i9n4jupi7eflbg_h264_540p_1927355
             * data_size : 5884699
             * file_cs : c:0-34537-f6fc
             */

            private String url_key;
            private int data_size;
            private String file_cs;
        }

        @NoArgsConstructor
        @Data
        public static class BitRateBean {
            /**
             * gear_name : normal_540
             * quality_type : 20
             * bit_rate : 1927355
             * play_addr : {"uri":"v0300f0e0000bt4523i9n4jupi7eflbg","url_list":["http://v5-dy-d.ixigua.com/59fda3e0223415ec9bca91691e649318/5f618f26/video/tos/cn/tos-cn-ve-15/60b01c10ed3d48e6ab5ab6efda09fd80/?a=1128&br=5646&bt=1882&cr=0&cs=0&cv=1&dr=0&ds=6&er=&l=202009161105340101300930351A9D84CF&lr=all&mime_type=video_mp4&qs=0&rc=am9obHg3PDY4dzMzaGkzM0ApZzo3Njc7M2VlNzozOWU4NWdfYzRtZ2tmLzFfLS0tLTBzczEzLV5eNV4wLi5fNDRhMDQ6Yw%3D%3D&vl=&vr=","http://v29-dy.ixigua.com/7f057aaca9d316cdd299bf3a79874cee/5f618f26/video/tos/cn/tos-cn-ve-15/60b01c10ed3d48e6ab5ab6efda09fd80/?a=1128&br=5646&bt=1882&cr=0&cs=0&cv=1&dr=0&ds=6&er=&l=202009161105340101300930351A9D84CF&lr=all&mime_type=video_mp4&qs=0&rc=am9obHg3PDY4dzMzaGkzM0ApZzo3Njc7M2VlNzozOWU4NWdfYzRtZ2tmLzFfLS0tLTBzczEzLV5eNV4wLi5fNDRhMDQ6Yw%3D%3D&vl=&vr=","https://aweme.snssdk.com/aweme/v1/play/?video_id=v0300f0e0000bt4523i9n4jupi7eflbg&line=0&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_PUBLISH","https://api.amemv.com/aweme/v1/play/?video_id=v0300f0e0000bt4523i9n4jupi7eflbg&line=1&ratio=540p&media_type=4&vr_type=0&improve_bitrate=0&is_play_url=1&source=PackSourceEnum_PUBLISH"],"width":720,"height":720,"url_key":"v0300f0e0000bt4523i9n4jupi7eflbg_h264_540p_1927355","data_size":5884699,"file_cs":"c:0-34537-f6fc"}
             * is_h265 : 0
             * is_bytevc1 : 0
             */

            private String gear_name;
            private int quality_type;
            private int bit_rate;
            private PlayAddrBean play_addr;
            private int is_h265;
            private int is_bytevc1;
        }
    }

    @NoArgsConstructor
    @Data
    public static class StatisticsBean {
        /**
         * aweme_id : 6865826950535974159
         * comment_count : 38486
         * digg_count : 2096077
         * download_count : 89041
         * play_count : 0
         * share_count : 51532
         * forward_count : 4228
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
         * aweme_id : 6865826950535974159
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
         * share_url : https://www.iesdouyin.com/share/video/6865826950535974159/?region=CN&mid=6862996375744432904&u_code=0&titleType=title
         * share_weibo_desc : #在抖音，记录美好生活#老婆这次换装惊呆了，我和儿子@小孙嫂万万 #夫妻日常
         * share_desc : 在抖音，记录美好生活
         * share_title : 老婆这次换装惊呆了，我和儿子@小孙嫂万万 #夫妻日常
         * bool_persist : 0
         * share_title_myself :
         * share_title_other :
         * share_link_desc : 老婆这次换装惊呆了，我和儿子@小孙嫂万万 #夫妻日常  %s 复制此链接，打开【抖音短视频】，直接观看视频！
         * share_signature_url :
         * share_signature_desc :
         * share_quote :
         * share_desc_info : #在抖音，记录美好生活#老婆这次换装惊呆了，我和儿子@小孙嫂万万 #夫妻日常
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
    public static class DescendantsBean {
        /**
         * platforms : ["toutiao","duoshan"]
         * notify_msg : 头条
         */

        private String notify_msg;
        private List<String> platforms;
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
         * show_progress_bar : 0
         * draft_progress_bar : 0
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
         * cid : 1589745110342676
         * cha_name : 夫妻日常
         * desc :
         * schema : aweme://aweme/challenge/detail?cid=1589745110342676
         * author : {"followers_detail":null,"platform_sync_info":null,"geofencing":null,"cover_url":null,"item_list":null,"new_story_cover":null,"type_label":null,"ad_cover_url":null,"relative_users":null,"cha_list":null,"need_points":null,"homepage_bottom_toast":null,"can_set_geofencing":null,"white_cover_url":null,"user_tags":null}
         * user_count : 0
         * share_info : {"share_url":"https://www.iesdouyin.com/share/challenge/1589745110342676/?u_code=0","share_weibo_desc":"我在抖音参加#夫妻日常 ","share_desc":"在抖音，记录美好生活","share_title":"我在抖音参加#夫妻日常 ","bool_persist":0,"share_title_myself":"","share_title_other":"","share_signature_url":"","share_signature_desc":"","share_quote":"","share_desc_info":"我在抖音参加#夫妻日常 "}
         * connect_music : []
         * type : 0
         * sub_type : 0
         * is_pgcshow : false
         * collect_stat : 0
         * is_challenge : 0
         * view_count : 0
         * is_commerce : false
         * hashtag_profile : 183760007bae27ecbadd1
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
        private ShareInfoBeanX share_info;
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
         * start : 14
         * end : 20
         * user_id : 65408466395
         * type : 0
         * sec_uid : MS4wLjABAAAA5lSFYZ8jgB4nRpHcn_B1s-9QLbdh0BJ5k7zdXnXE9jw
         * hashtag_name : 夫妻日常
         * hashtag_id : 1589745110342676
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

package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/08 14:18
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class OriginalMusicListResponse extends BaseResponse{
    private Integer cursor;
    private Integer has_more;
    private List<?> chart_musics;
    private List<MusicBean> music;

    @NoArgsConstructor
    @Data
    public static class MusicBean {
        /**
         * is_video_self_see : false
         * owner_handle :
         * avatar_thumb : {"uri":"100x100/285e5000798e4c0062e73","url_list":["https://p9-dy.byteimg.com/aweme/100x100/285e5000798e4c0062e73.webp?from=889713528","https://p1-dy-ipv6.byteimg.com/aweme/100x100/285e5000798e4c0062e73.webp?from=889713528","https://p3-dy-ipv6.byteimg.com/aweme/100x100/285e5000798e4c0062e73.webp?from=889713528","https://p9-dy.byteimg.com/aweme/100x100/285e5000798e4c0062e73.jpeg?from=889713528"],"width":720,"height":720}
         * lyric_short_position : null
         * source_platform : 10036
         * extra : {"beats":{},"douyin_beats_info":{},"schedule_search_time":0,"hotsoon_review_time":-1,"aggregate_exempt_conf":[],"reviewed":1,"review_unshelve_reason":0,"has_edited":0,"music_label_id":1012}
         * position : null
         * status : 1
         * mid : 6787926720088820492
         * play_url : {"uri":"https://sf3-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/tt-obj/643a203dddb293a83b1db4c93f277105.mp3","url_list":["https://sf3-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/tt-obj/643a203dddb293a83b1db4c93f277105.mp3","https://sf9-dycdn-tos.pstatp.com/obj/iesmusic-cn-local/v1/tt-obj/643a203dddb293a83b1db4c93f277105.mp3"],"width":720,"height":720}
         * redirect : false
         * is_pgc : true
         * can_background_play : true
         * id : 6787926720088820492
         * cover_hd : {"height":720,"uri":"iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~1080x1080.webp?x-expires=1607429838&x-signature=XBq4DbJzFZ%2BlPFP6LtYKVFwWEKM%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~1080x1080.webp?x-expires=1607429838&x-signature=XBq4DbJzFZ%2BlPFP6LtYKVFwWEKM%3D"],"width":720}
         * duration : 30
         * owner_nickname :
         * is_original : false
         * title : 忽然之间
         * cover_medium : {"height":720,"uri":"iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~200x200.webp?x-expires=1607429838&x-signature=cMwpwyGRmWr%2BkQUxBuQMHi6Qm5s%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~200x200.webp?x-expires=1607429838&x-signature=cMwpwyGRmWr%2BkQUxBuQMHi6Qm5s%3D"],"width":720}
         * start_time : 0
         * reason_type : 0
         * id_str : 6787926720088820492
         * author_position : null
         * is_matched_metadata : false
         * music_chart_ranks : null
         * dmv_auto_show : false
         * cover_thumb : {"height":720,"uri":"iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~100x100.webp?x-expires=1607429838&x-signature=qAX9whWuzp9DBUhRitonJctJBmw%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~100x100.webp?x-expires=1607429838&x-signature=qAX9whWuzp9DBUhRitonJctJBmw%3D"],"width":720}
         * prevent_download : false
         * unshelve_countries : null
         * avatar_large : {"uri":"1080x1080/285e5000798e4c0062e73","url_list":["https://p5-dy-ipv6.byteimg.com/aweme/1080x1080/285e5000798e4c0062e73.webp?from=889713528","https://p9-dy.byteimg.com/aweme/1080x1080/285e5000798e4c0062e73.webp?from=889713528","https://p26-dy.byteimg.com/aweme/1080x1080/285e5000798e4c0062e73.webp?from=889713528","https://p5-dy-ipv6.byteimg.com/aweme/1080x1080/285e5000798e4c0062e73.jpeg?from=889713528"],"width":720,"height":720}
         * mute_share : false
         * offline_desc :
         * music_billboard_type : 1
         * preview_end_time : 0
         * shoot_duration : 30
         * billboard_rank : 0
         * is_original_sound : false
         * schema_url :
         * end_time : 0
         * is_restricted : false
         * avatar_medium : {"height":720,"uri":"720x720/285e5000798e4c0062e73","url_list":["https://p3-dy-ipv6.byteimg.com/aweme/720x720/285e5000798e4c0062e73.webp?from=889713528","https://p6-dy-ipv6.byteimg.com/aweme/720x720/285e5000798e4c0062e73.webp?from=889713528","https://p5-dy-ipv6.byteimg.com/aweme/720x720/285e5000798e4c0062e73.webp?from=889713528","https://p3-dy-ipv6.byteimg.com/aweme/720x720/285e5000798e4c0062e73.jpeg?from=889713528"],"width":720}
         * audition_duration : 30
         * binded_challenge_id : 0
         * external_song_info : []
         * cover_large : {"height":720,"uri":"iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg","url_list":["https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~720x720.webp?x-expires=1607429838&x-signature=o4UrruKNapbPPTDdxgGtXKqqh7g%3D","https://p9-dy-cdn.byteimg.com/iesmusic-cn-local/v1/tt-obj/image/d22bc84b2f74f018c63b5106f8115561.jpg~720x720.webp?x-expires=1607429838&x-signature=o4UrruKNapbPPTDdxgGtXKqqh7g%3D"],"width":720}
         * user_count : 156517
         * collect_stat : 0
         * preview_start_time : 0
         * prevent_item_download_status : 0
         * is_commerce_music : false
         * tag_list : null
         * is_audio_url_with_cookie : false
         * album :
         * author : 王天阳
         * author_deleted : false
         * is_del_video : false
         * artists : []
         * owner_id : 80430828164
         * sec_uid : MS4wLjABAAAAcZGzyELZy3zQ9m3XBFl9rq3Z9_mlEDfrQTxE7Lxuz2o
         */

        private Boolean is_video_self_see;
        private String owner_handle;
        private CoverBean avatar_thumb;
        private Object lyric_short_position;
        private Integer source_platform;
        private String extraX;
        private Object position;
        private Integer status;
        private String mid;
        private CoverBean play_url;
        private Boolean redirect;
        private Boolean is_pgc;
        private Boolean can_background_play;
        private Long id;
        private CoverBean cover_hd;
        private Integer duration;
        private String owner_nickname;
        private Boolean is_original;
        private String title;
        private CoverBean cover_medium;
        private Integer start_time;
        private Integer reason_type;
        private String id_str;
        private Object author_position;
        private Boolean is_matched_metadata;
        private Object music_chart_ranks;
        private Boolean dmv_auto_show;
        private CoverBean cover_thumb;
        private Boolean prevent_download;
        private Object unshelve_countries;
        private CoverBean avatar_large;
        private Boolean mute_share;
        private String offline_desc;
        private Integer music_billboard_type;
        private Integer preview_end_time;
        private Integer shoot_duration;
        private Integer billboard_rank;
        private Boolean is_original_sound;
        private String schema_url;
        private Integer end_time;
        private Boolean is_restricted;
        private CoverBean avatar_medium;
        private Integer audition_duration;
        private Integer binded_challenge_id;
        private CoverBean cover_large;
        private Integer user_count;
        private Integer collect_stat;
        private Integer preview_start_time;
        private Integer prevent_item_download_status;
        private Boolean is_commerce_music;
        private Object tag_list;
        private Boolean is_audio_url_with_cookie;
        private String album;
        private String author;
        private Boolean author_deleted;
        private Boolean is_del_video;
        private String owner_id;
        private String sec_uid;
        private List<?> external_song_info;
        private List<?> artists;
    }
}

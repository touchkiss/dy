package com.huoshan.hotsoon.item.profile;

import com.huoshan.bean.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/08 21:31
 *
 * @author Touchkiss
 */
@lombok.NoArgsConstructor
@lombok.Data
public class PublishedListResponse extends BaseResponse<List<PublishedListResponse.DataBeanX>>{

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class DataBeanX {
        private DataBean data;
        private String rid;
        //        private List<Object>tags;
        private Integer type;

        @lombok.Data
        @lombok.NoArgsConstructor
        public static class DataBean {
            private boolean allow_comment;
            private boolean allow_dislike;
            private boolean allow_display_comments;
            private boolean allow_download;
            private boolean allow_share;
            private Author author;
            private Object author_location;
            private Object author_top_fans;
            private int comment_delay;
            private Object comment_info;
            private CoverBean commerce;
            private int create_time;
            private String create_time_tag;
            private String description;
            private boolean disable_watermark;
            private String extra_scheme_url;
            private String extra_share_scheme_url;
            private boolean follow_display;
            private String follow_status_tag;
            private Object friend_action_list;
            private Hashtag hashtag;
            private long id;
            private String id_str;
            private String item_log_extra;
            private String location;
            private int media_type;
            private MiscInfoBean misc_info;
            private Object out_show_comments;
            private boolean prefetch_comment;
            private boolean prefetch_profile;
            private int private_status;
            private String share_description;
            private boolean share_enable;
            private int share_strong_guide;
            private String share_title;
            private String share_url;
            private boolean show_user_video_widget;
            private Song song;
            private Stats stats;
            private int status;
            private String tips;
            private String tips_url;
            private String title;
            private int user_bury;
            private int user_digg;
            private VideoInfo video;
            private String weibo_share_title;
            private List<AtUser> at_users;

            @NoArgsConstructor
            @Data
            public static class MiscInfoBean {

                /**
                 * ocr_location :
                 * source : 1
                 */

                private String ocr_location;
                private int source;
            }
        }
    }
}

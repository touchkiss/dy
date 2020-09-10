package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/10 15:37
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ItemInfo {
    private boolean allow_comment;
    private boolean allow_dislike;
    private boolean allow_display_comments;
    private boolean allow_download;
    private boolean allow_share;
    private Author author;
    private Object author_location;
    private Object author_top_fans;
    private Integer comment_delay;
    private Object comment_info;
    private CoverBean commerce;
    private Integer create_time;
    private String create_time_tag;
    private String description;
    private boolean disable_watermark;
    private String extra_scheme_url;
    private String extra_share_scheme_url;
    private FrameInfo frame_info;
    private boolean follow_display;
    private String follow_status_tag;
    private Object friend_action_list;
    private List<GoodsInfo> goods_infos;
    private Hashtag hashtag;
    private Long id;
    private String id_str;
    private String item_log_extra;
    private String location;
    private Integer media_type;
    private MiscInfoBean misc_info;
    private Object out_show_comments;
    private boolean prefetch_comment;
    private boolean prefetch_profile;
    private Integer private_status;
    private String share_description;
    private boolean share_enable;
    private String share_prompts;
    private Integer share_strong_guide;
    private String share_title;
    private String share_url;
    private boolean show_user_video_widget;
    private Song song;
    private Stats stats;
    private Integer status;
    private String tips;
    private String tips_url;
    private String title;
    private Integer user_bury;
    private Integer user_digg;
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
        private Integer source;
    }

    @NoArgsConstructor
    @Data
    public static class FrameInfo {

        private Integer fans_count;
        private List<Author> top_contributors;
    }
}

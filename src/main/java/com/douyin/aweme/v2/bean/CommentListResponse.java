package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.BaseResponse;
import com.douyin.aweme.v1.bean.UserInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/16 13:07
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class CommentListResponse extends BaseResponse {
    private Long cursor;
    private Long has_more;
    private Long reply_style;
    private Long total;
    private Long hotsoon_filtered_count;
    private Long hotsoon_has_more;
    private String hotsoon_text;
    private List<CommentsBean> comments;

    @NoArgsConstructor
    @Data
    public static class CommentsBean {
        private String cid;
        private String text;
        private String aweme_id;
        private Long create_time;
        private Long digg_count;
        private Long status;
        private UserInfo user;
        private String reply_id;
        private Long user_digged;
        private Object reply_comment;
        private Long reply_comment_total;
        private String reply_to_reply_id;
        private boolean is_author_digged;
        private Long stick_position;
        private boolean user_buried;
        private Object label_list;
        private List<?> text_extra;
    }
}

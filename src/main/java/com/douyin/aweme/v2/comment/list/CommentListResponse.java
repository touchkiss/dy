package com.douyin.aweme.v2.comment.list;

import com.douyin.aweme.v1.aweme.post.BaseResponse;
import com.douyin.aweme.v1.user.profile.UserInfo;
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
    private int cursor;
    private int has_more;
    private int reply_style;
    private int total;
    private int hotsoon_filtered_count;
    private int hotsoon_has_more;
    private String hotsoon_text;
    private List<CommentsBean> comments;

    @NoArgsConstructor
    @Data
    public static class CommentsBean {
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
        private int reply_comment_total;
        private String reply_to_reply_id;
        private boolean is_author_digged;
        private int stick_position;
        private boolean user_buried;
        private Object label_list;
        private List<?> text_extra;
    }
}

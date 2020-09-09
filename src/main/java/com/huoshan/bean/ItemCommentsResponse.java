package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/09 22:46
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ItemCommentsResponse extends BaseResponse<ItemCommentsResponse.DataBean> {
    @NoArgsConstructor
    @Data
    public static class DataBean {
        private List<CommentsBean> comments;
        private List<?> hot_comments;

        @NoArgsConstructor
        @Data
        public static class CommentsBean {

            private int status;
            private String text;
            private int digg_count;
            private int create_time;
            private int reply_id;
            private Author user;
            private long item_id;
            private int user_digg;
            private long id;
            private int reply_count;
            private long owner_id;
            private int type;
            private Object media_list;
            private int comment_flash_count;
        }
    }
}

package com.huoshan.bean.response;

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

            private Integer status;
            private String text;
            private Integer digg_count;
            private Integer create_time;
            private Integer reply_id;
            private Author user;
            private Long item_id;
            private Integer user_digg;
            private Long id;
            private Integer reply_count;
            private Long owner_id;
            private Integer type;
            private Object media_list;
            private Integer comment_flash_count;
        }
    }
}

package com.douyin.aweme.v1.hot.search;

import com.douyin.aweme.v1.aweme.post.BaseResponse;
import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/08/28 15:19
 * <p>
 * 实时热榜
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ListResponse extends BaseResponse {
    private DataBean data;
    private Object ad_search_list;
    private CoverBean banner_dark;
    private CoverBean banner_light;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        private String active_time;
        private ShareInfoBean share_info;
        private String trending_desc;
        private Object recommend_list;
        private List<WordListBean> word_list;
        private List<TrendingListBean> trending_list;

        @NoArgsConstructor
        @Data
        public static class ShareInfoBean {
            /**
             * share_url : https://www.iesdouyin.com/share/billboard/?id=0
             * share_title : 我在看抖音热榜，发现最火的内容，赶快来看！
             * share_link_desc : 我在看抖音热榜，发现最火的内容，赶快来看！戳这里>>
             */

            private String share_url;
            private String share_title;
            private String share_link_desc;
        }

        @NoArgsConstructor
        @Data
        public static class WordListBean {
            /**
             * challenge_id :
             * word_type : 1
             * related_words : null
             * sentence_id : 110756
             * word : 四川观察版把嘴给我闭上
             * label : 0
             * hot_value : 8504877
             * word_cover : {"uri":"tos-cn-p-0015/44690fd0f4334a3db2c674d06c2c90d0","url_list":["https://p29-dy.byteimg.com/img/tos-cn-p-0015/44690fd0f4334a3db2c674d06c2c90d0~noop.jpeg?from=3218412987","https://p26-dy.byteimg.com/img/tos-cn-p-0015/44690fd0f4334a3db2c674d06c2c90d0~noop.jpeg?from=3218412987","https://p9-dy.byteimg.com/img/tos-cn-p-0015/44690fd0f4334a3db2c674d06c2c90d0~noop.jpeg?from=3218412987"]}
             * position : 1
             * video_count : 15
             * group_id : 6865664462163023112
             * event_time : 1598537076
             * can_extend_detail : true
             */

            private String challenge_id;
            private int word_type;
            private Object related_words;
            private String sentence_id;
            private String word;
            private int label;
            private int hot_value;
            private CoverBean word_cover;
            private int position;
            private int video_count;
            private String group_id;
            private int event_time;
            private boolean can_extend_detail;
        }

        @NoArgsConstructor
        @Data
        public static class TrendingListBean {
            /**
             * video_count : 8
             * group_id : 6797651212972856589
             * word_type : 3
             * sentence_id : 0xc0482c2f88
             * related_words : null
             * word : 在劫难逃定档
             * label : 0
             * word_cover : {"uri":"tos-cn-p-0015/76b16ce435404dedbbd4377961a79601_1598581102","url_list":["https://p9-dy.byteimg.com/img/tos-cn-p-0015/76b16ce435404dedbbd4377961a79601_1598581102~noop.jpeg?from=3218412987","https://p6-dy-ipv6.byteimg.com/img/tos-cn-p-0015/76b16ce435404dedbbd4377961a79601_1598581102~noop.jpeg?from=3218412987","https://p29-dy.byteimg.com/img/tos-cn-p-0015/76b16ce435404dedbbd4377961a79601_1598581102~noop.jpeg?from=3218412987"]}
             */

            private int video_count;
            private String group_id;
            private int word_type;
            private String sentence_id;
            private Object related_words;
            private String word;
            private int label;
            private CoverBean word_cover;
        }
    }
}

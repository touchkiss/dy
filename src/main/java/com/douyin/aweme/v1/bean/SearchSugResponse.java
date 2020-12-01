package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/01 15:51
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class SearchSugResponse extends BaseResponse{
    private String rid;
    private WordsQueryRecordBean words_query_record;
    private List<SugListBean> sug_list;

    @NoArgsConstructor
    @Data
    public static class WordsQueryRecordBean {
        /**
         * info : {}
         * words_source : sug
         * query_id :
         */

        private String info;
        private String words_source;
        private String query_id;
    }

    @NoArgsConstructor
    @Data
    public static class SugListBean {
        /**
         * pos : [{"begin":0,"end":1}]
         * content : 丁真走红第一个视频
         * sug_type :
         * word_record : {"group_id":"6893635749556933902","words_position":0,"words_content":"丁真走红第一个视频","words_source":"sug"}
         * extra_info : {"combine_utility":"0.340420","is_rich_sug":"0","latency":"45651","recall_reason":"orion_qse_recall|aweme_index_query_word_shortterm|aweme_orion_word","rich_sug_type":"0","score":"39.873826"}
         */

        private String content;
        private String sug_type;
        private WordRecordBean word_record;
        private ExtraInfoBean extra_info;
        private List<PosBean> pos;

        @NoArgsConstructor
        @Data
        public static class WordRecordBean {
            /**
             * group_id : 6893635749556933902
             * words_position : 0
             * words_content : 丁真走红第一个视频
             * words_source : sug
             */

            private String group_id;
            private int words_position;
            private String words_content;
            private String words_source;
        }

        @NoArgsConstructor
        @Data
        public static class ExtraInfoBean {
            /**
             * combine_utility : 0.340420
             * is_rich_sug : 0
             * latency : 45651
             * recall_reason : orion_qse_recall|aweme_index_query_word_shortterm|aweme_orion_word
             * rich_sug_type : 0
             * score : 39.873826
             */

            private String combine_utility;
            private String is_rich_sug;
            private String latency;
            private String recall_reason;
            private String rich_sug_type;
            private String score;
        }

        @NoArgsConstructor
        @Data
        public static class PosBean {
            /**
             * begin : 0
             * end : 1
             */

            private int begin;
            private int end;
        }
    }
}

package com.douyin.aweme.web.bean;

import com.douyin.aweme.v1.bean.BaseResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/01 18:05
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ShareBillboardResponse extends BaseResponse {
    private String active_time;
    private List<WordListBean> word_list;

    @NoArgsConstructor
    @Data
    public static class WordListBean {
        /**
         * word : 蔡依林把小s口红亲花了
         * search_word :
         * hot_value : 8857715
         * label : 0
         * challenge_id :
         */

        private String word;
        private String search_word;
        private int hot_value;
        private int label;
        private String challenge_id;
    }
}

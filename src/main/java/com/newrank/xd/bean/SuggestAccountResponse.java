package com.newrank.xd.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/12 15:04
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class SuggestAccountResponse extends BaseResponse{
    private List<DataBean> data;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * ana_time : 2020-12-12 12:37:45
         * avatar : https://p9-dy.byteimg.com/aweme/1080x1080/2b1fd0003fc9741ec71f7.webp?from=2956013662
         * custom_verify : 优质美食自媒体
         * enterprise_verify_reason :
         * follower_count : 3953404
         * name_list : []
         * newrank_index : 0
         * nickname : 阿飞和爷爷奶奶
         * rank_date : 2020-11-30 00:00:00
         * short_id : 2195231220
         * uid : 81195831075
         * unique_id :
         * verify_label : 个人认证
         */

        private String ana_time;
        private String avatar;
        private String custom_verify;
        private String enterprise_verify_reason;
        private String follower_count;
        private String newrank_index;
        private String nickname;
        private String rank_date;
        private String short_id;
        private String uid;
        private String unique_id;
        private String verify_label;
        private List<?> name_list;
    }
}

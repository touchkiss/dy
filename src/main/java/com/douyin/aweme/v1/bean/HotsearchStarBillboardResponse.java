package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 19:40
 * 明星榜
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class HotsearchStarBillboardResponse extends BaseResponse{
    private String active_time;
    private CoverBean banner_url;
    private boolean is_activity_online;
    private ShareInfoBean share_info;
    private List<UserListBean> user_list;

    @NoArgsConstructor
    @Data
    public static class ShareInfoBean {
        /**
         * share_url : https://www.iesdouyin.com/share/billboard/star/
         * share_title : 我在看抖音明星爱DOU榜，发现最火的明星，赶快来看！
         * share_link_desc : 我在看抖音明星爱DOU榜，发现最火的明星，赶快来看！戳这里>>
         */

        private String share_url;
        private String share_title;
        private String share_link_desc;
    }

    @NoArgsConstructor
    @Data
    public static class UserListBean {
        /**
         * rank_diff : 0
         * factor_hot_value : 623944
         * honor_tags : [2]
         * user_info : {"nickname":"UNIQ-王一博","signature":"","avatar_thumb":{"uri":"https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5","url_list":["https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5"]},"status":1,"user_rate":1,"avatar_larger":{"uri":"https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5","url_list":["https://p9.pstatp.com/thumb/216d0007cfb3a10f04e5"]},"sec_uid":"MS4wLjABAAAA4gwJG2z-QzXuiwGOsoZO2Eg-yq4k8-wll1YjqdJiV1Y","uid":"60373328124"}
         * hot_value : 12781967
         * is_new : false
         * hot_value_bar : 95
         * sprint : {"sprint":0,"followers":null}
         * factor_interact_value : 12114820
         * room_id : 6902693076033080064
         */

        private int rank_diff;
        private int factor_hot_value;
        private UserInfo user_info;
        private int hot_value;
        private boolean is_new;
        private int hot_value_bar;
        private SprintBean sprint;
        private int factor_interact_value;
        private String room_id;
        private List<Integer> honor_tags;

        @NoArgsConstructor
        @Data
        public static class SprintBean {
            /**
             * sprint : 0
             * followers : null
             */

            private int sprint;
            private Object followers;
        }
    }
}

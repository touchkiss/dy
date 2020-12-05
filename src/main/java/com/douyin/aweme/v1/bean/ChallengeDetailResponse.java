package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 23:59
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ChallengeDetailResponse extends BaseResponse{
    private ChInfoBean ch_info;
    private Object rec_list;
    private Object slide_list;
    private Object dynamic_list;

    @NoArgsConstructor
    @Data
    public static class ChInfoBean {
        private String desc;
        private String schema;
        private int user_count;
        private int type;
        private String link_action;
        private boolean is_pgcshow;
        private String cid;
        private String cha_name;
        private int is_challenge;
        private int link_type;
        private String link_text;
        private int collect_stat;
        private long view_count;
        private boolean is_commerce;
        private String hashtag_profile;
        private UserInfo author;
        private ShareInfoBean share_info;
        private Object banner_list;
        private boolean is_strong_music;
        private Object show_items;
        private int sub_type;
        private boolean allow_upload_cover;
        private ExtraAttrBean extra_attr;
        private Object cha_attrs;
        private int has_related_poi;
        private List<?> connect_music;

        @NoArgsConstructor
        @Data
        public static class ShareInfoBean {
            /**
             * bool_persist : 0
             * share_url : https://www.iesdouyin.com/share/challenge/1600145164240900/?u_code=0
             * share_weibo_desc : 我在抖音参加#整蛊
             * share_title_myself :
             * share_title_other :
             * share_signature_url :
             * share_signature_desc :
             * share_quote :
             * share_desc_info : 我在抖音参加#整蛊
             * share_desc : 在抖音，记录美好生活
             * share_title : 我在抖音参加#整蛊
             */

            private int bool_persist;
            private String share_url;
            private String share_weibo_desc;
            private String share_title_myself;
            private String share_title_other;
            private String share_signature_url;
            private String share_signature_desc;
            private String share_quote;
            private String share_desc_info;
            private String share_desc;
            private String share_title;
        }

        @NoArgsConstructor
        @Data
        public static class ExtraAttrBean {
            /**
             * is_live : false
             */

            private boolean is_live;
        }
    }
}

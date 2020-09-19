package com.douyin.webcast;

import com.douyin.aweme.v1.BaseResponse;
import com.douyin.aweme.v1.UserInfo;
import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/08/28 15:36
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ListResponse extends BaseResponse {

    private DataBeanX data;

    @NoArgsConstructor
    @Data
    public static class DataBeanX {
        private String top_image_url;
        private Long updated_at;
        private List<RanksBean> ranks;

        @NoArgsConstructor
        @Data
        public static class RanksBean {

            private String gap_description;
            private String label;
            private Long rank;
            private RoomBean room;
            private Long score;
            private UserInfo user;

            @NoArgsConstructor
            @Data
            public static class RoomBean {
                /**
                 * challenge_info :
                 * content_label : {"avg_color":"#524037","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/aweme_cover_redPackage_webcast_3_2.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/aweme_cover_redPackage_webcast_3_2.png~tplv-obj.image"],"width":0}
                 * cover : {"avg_color":"#DCF4FA","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/6794395117043206926","url_list":["http://p3-webcast-dycdn.byteimg.com/img/webcast/6794395117043206926~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/6794395117043206926~tplv-obj.image"],"width":0}
                 * id : 6865901132342889216
                 * id_str : 6865901132342889216
                 * title :
                 * user_count : 44450
                 */

                private String challenge_info;
                private CoverBean content_label;
                private CoverBean cover;
                private long id;
                private String id_str;
                private String title;
                private Long user_count;

            }
        }
    }
}

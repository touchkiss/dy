package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.BaseResponse;
import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/07 15:31
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class PlatformShareCommandTransResponse extends BaseResponse {

    /**
     * command_gen_scene : {"copy_type":"un_auto","shareUserId":"0","share_user_did":"1213500227850904","symbol":"normal","token_form":"token"}
     * extra : {"logid":"202012071529410101440612270E016BE9","now":1607326181000,"fatal_item_ids":[]}
     * status_code : 0
     * schema : sslocal://aweme/detail/6903306538971139336?sec_uid=MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ
     * schema_type : 1
     * subhead_template : 三三：我只是想吃个面，有错吗？#单身狗 #搞笑 #这是人干的事嘛 的作品
     * hide_popup : false
     * confirm_button_text : 打开看看
     * schema_detail : {"video":{"aweme_id":"6903306538971139336","desc":"三三：我只是想吃个面，有错吗？#单身狗 #搞笑 #这是人干的事嘛","cover":{"uri":"tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg","https://p26-dy.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg","https://p9-dy.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg"]},"author_name":"花样男团"}}
     * share_user_id :
     * share_user_iid : 3676409821409683
     * sec_uid : MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ
     */

    private String command_gen_scene;
    private String schema;
    private Integer schema_type;
    private String subhead_template;
    private Boolean hide_popup;
    private String confirm_button_text;
    private SchemaDetailBean schema_detail;
    private String share_user_id;
    private Long share_user_iid;
    private String sec_uid;

    @NoArgsConstructor
    @Data
    public static class SchemaDetailBean {
        /**
         * video : {"aweme_id":"6903306538971139336","desc":"三三：我只是想吃个面，有错吗？#单身狗 #搞笑 #这是人干的事嘛","cover":{"uri":"tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg","https://p26-dy.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg","https://p9-dy.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg"]},"author_name":"花样男团"}
         */

        private VideoBean video;

        @NoArgsConstructor
        @Data
        public static class VideoBean {
            /**
             * aweme_id : 6903306538971139336
             * desc : 三三：我只是想吃个面，有错吗？#单身狗 #搞笑 #这是人干的事嘛
             * cover : {"uri":"tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335","url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg","https://p26-dy.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg","https://p9-dy.byteimg.com/img/tos-cn-p-0015/e25dc3108ed445d2b2c25bfbd3f0694f_1607301335~c5_300x400.jpeg"]}
             * author_name : 花样男团
             */

            private String aweme_id;
            private String desc;
            private CoverBean cover;
            private String author_name;

        }
    }
}

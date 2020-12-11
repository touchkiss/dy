package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/07 20:19
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class StickerDetailResponse extends BaseResponse{

    /**
     * sticker_infos : [{"is_favorite":false,"owner_nickname":"包妆侠","user_count":3936344,"desc":"点头开始，嘟嘴跳一跳","effect_id":"645185","sec_uid":"MS4wLjABAAAAGu9rIs8jsznFy8_tDRb9g_6wKOEdjP9fJx6H6dXf390","children":[],"icon_url":{"uri":"bdfd48db50d6bd46c4b2b1d741e5c638","url_list":["https://lf3-effectcdn-tos.pstatp.com/obj/ies.fe.effect/bdfd48db50d6bd46c4b2b1d741e5c638","https://lf6-effectcdn-tos.pstatp.com/obj/ies.fe.effect/bdfd48db50d6bd46c4b2b1d741e5c638","https://lf9-effectcdn-tos.pstatp.com/obj/ies.fe.effect/bdfd48db50d6bd46c4b2b1d741e5c638"]},"owner_id":"100717515222","vv_count":1979186895,"avatar_large":{"url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_1080x1080.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_1080x1080.jpeg?from=4010531038"],"uri":"1080x1080/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf"},"extra":"","EffectType":0,"id":"645185","name":"鸡蛋碰石头","tags":["challenge:1593297745955864"],"avatar_medium":{"uri":"720x720/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_720x720.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_720x720.jpeg?from=4010531038"]},"share_info":{"share_url":"https://www.iesdouyin.com/share/sticker/detail/645185/?schema_type=17&object_id=645185","share_weibo_desc":"这么有趣的道具，不能只有我一个人知道吧","share_desc":"在抖音，记录美好生活","share_title":"这么有趣的道具，不能只有我一个人知道吧","share_signature_url":"https://tiktokv.com/","share_signature_desc":"TikTok: Make Every Second Count"},"avatar_thumb":{"url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_100x100.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_100x100.jpeg?from=4010531038"],"uri":"100x100/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf"}}]
     * extra : {"logid":"202012072018100100260780873A157507","now":1607343490000,"fatal_item_ids":[]}
     * status_code : 0
     */

    private List<StickerInfosBean> sticker_infos;

    @NoArgsConstructor
    @Data
    public static class StickerInfosBean {
        /**
         * is_favorite : false
         * owner_nickname : 包妆侠
         * user_count : 3936344
         * desc : 点头开始，嘟嘴跳一跳
         * effect_id : 645185
         * sec_uid : MS4wLjABAAAAGu9rIs8jsznFy8_tDRb9g_6wKOEdjP9fJx6H6dXf390
         * children : []
         * icon_url : {"uri":"bdfd48db50d6bd46c4b2b1d741e5c638","url_list":["https://lf3-effectcdn-tos.pstatp.com/obj/ies.fe.effect/bdfd48db50d6bd46c4b2b1d741e5c638","https://lf6-effectcdn-tos.pstatp.com/obj/ies.fe.effect/bdfd48db50d6bd46c4b2b1d741e5c638","https://lf9-effectcdn-tos.pstatp.com/obj/ies.fe.effect/bdfd48db50d6bd46c4b2b1d741e5c638"]}
         * owner_id : 100717515222
         * vv_count : 1979186895
         * avatar_large : {"url_list":["https://p6-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_1080x1080.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_1080x1080.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_1080x1080.jpeg?from=4010531038"],"uri":"1080x1080/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf"}
         * extra :
         * EffectType : 0
         * id : 645185
         * name : 鸡蛋碰石头
         * tags : ["challenge:1593297745955864"]
         * avatar_medium : {"uri":"720x720/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf","url_list":["https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_720x720.jpeg?from=4010531038","https://p1-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_720x720.jpeg?from=4010531038","https://p29-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_720x720.jpeg?from=4010531038"]}
         * share_info : {"share_url":"https://www.iesdouyin.com/share/sticker/detail/645185/?schema_type=17&object_id=645185","share_weibo_desc":"这么有趣的道具，不能只有我一个人知道吧","share_desc":"在抖音，记录美好生活","share_title":"这么有趣的道具，不能只有我一个人知道吧","share_signature_url":"https://tiktokv.com/","share_signature_desc":"TikTok: Make Every Second Count"}
         * avatar_thumb : {"url_list":["https://p29-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_100x100.jpeg?from=4010531038","https://p9-dy.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_100x100.jpeg?from=4010531038","https://p3-dy-ipv6.byteimg.com/img/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf~c5_100x100.jpeg?from=4010531038"],"uri":"100x100/tos-cn-avt-0015/3dd749d9e3e8b738e9a1adf8e92bdcbf"}
         */

        private boolean is_favorite;
        private String owner_nickname;
        private int user_count;
        private String desc;
        private String effect_id;
        private String sec_uid;
        private CoverBean icon_url;
        private String owner_id;
        private Long vv_count;
        private CoverBean avatar_large;
        private String extraX;
        private int EffectType;
        private String id;
        private String name;
        private CoverBean avatar_medium;
        private ShareInfoBean share_info;
        private CoverBean avatar_thumb;
        private List<?> children;
        private List<String> tags;

        @NoArgsConstructor
        @Data
        public static class ShareInfoBean {
            /**
             * share_url : https://www.iesdouyin.com/share/sticker/detail/645185/?schema_type=17&object_id=645185
             * share_weibo_desc : 这么有趣的道具，不能只有我一个人知道吧
             * share_desc : 在抖音，记录美好生活
             * share_title : 这么有趣的道具，不能只有我一个人知道吧
             * share_signature_url : https://tiktokv.com/
             * share_signature_desc : TikTok: Make Every Second Count
             */

            private String share_url;
            private String share_weibo_desc;
            private String share_desc;
            private String share_title;
            private String share_signature_url;
            private String share_signature_desc;
        }
    }
}

package com.douyin.webcast;

import com.douyin.aweme.v1.BaseResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/21 18:03
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class GiftListResponse extends BaseResponse {
    private DataBean data;
    @NoArgsConstructor
    @Data
    public static class DataBean {
        private GiftsInfoBean gifts_info;
        private List<?> doodle_templates;
        private List<?> gifts;
        private List<PagesBean> pages;

        @NoArgsConstructor
        @Data
        public static class GiftsInfoBean {
            /**
             * fansclub_gift_ids : [3431,3430,685,860,679,875,458,3246]
             * free_cell_items : []
             * game_gift_items : []
             * gift_combo_infos : [{"combo_count":10,"combo_effect_img":{"avg_color":"#7C9BA3","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/bb72bec9f00ad99bf3416aeca6080118.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/bb72bec9f00ad99bf3416aeca6080118.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/bb72bec9f00ad99bf3416aeca6080118.png~tplv-obj.image"],"width":0}},{"combo_count":66,"combo_effect_img":{"avg_color":"#FFF1EB","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/6623b963352253a6df0b8e9a3f8a4254.png","url_list":["http://p9-webcast-dycdn.byteimg.com/img/webcast/6623b963352253a6df0b8e9a3f8a4254.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/6623b963352253a6df0b8e9a3f8a4254.png~tplv-obj.image"],"width":0}},{"combo_count":188,"combo_effect_img":{"avg_color":"#E0D4BC","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/935466628ec047c736b53b06dee0e8a7.png","url_list":["http://p9-webcast-dycdn.byteimg.com/img/webcast/935466628ec047c736b53b06dee0e8a7.png~tplv-obj.image","http://p6-webcast-dycdn.byteimg.com/img/webcast/935466628ec047c736b53b06dee0e8a7.png~tplv-obj.image"],"width":0}},{"combo_count":520,"combo_effect_img":{"avg_color":"#DCF4FA","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/5f9e2469a1345fc7950c21bb6aea0af3.png","url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/5f9e2469a1345fc7950c21bb6aea0af3.png~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/5f9e2469a1345fc7950c21bb6aea0af3.png~tplv-obj.image"],"width":0}},{"combo_count":999,"combo_effect_img":{"avg_color":"#CCA3BE","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/14e6f853353c40b82fd1116be2d3cce3.png","url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/14e6f853353c40b82fd1116be2d3cce3.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/14e6f853353c40b82fd1116be2d3cce3.png~tplv-obj.image"],"width":0}},{"combo_count":1314,"combo_effect_img":{"avg_color":"#FFEBF8","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/7e502c0d9998fc18b3b96f2cf1084a88.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/7e502c0d9998fc18b3b96f2cf1084a88.png~tplv-obj.image","http://p1-webcast-dycdn.byteimg.com/img/webcast/7e502c0d9998fc18b3b96f2cf1084a88.png~tplv-obj.image"],"width":0}}]
             * gift_entrance_icon : {"avg_color":"#523737","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/47f428e737df0120d6324d368e00bcbe.webp","url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/47f428e737df0120d6324d368e00bcbe.webp~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/47f428e737df0120d6324d368e00bcbe.webp~tplv-obj.image"],"width":0}
             * gift_group_infos : [{"group_count":1,"group_text":"一心一意"},{"group_count":10,"group_text":"十全十美"},{"group_count":66,"group_text":"一切顺利"},{"group_count":188,"group_text":"要抱抱"},{"group_count":520,"group_text":"我爱你"},{"group_count":1314,"group_text":"一生一世"}]
             * gift_words :
             * hide_recharge_entry : false
             * honor_gift_ids : [867,861,3207,3234,3249]
             * new_gift_id : 0
             * noble_gift_ids : []
             * speedy_gift_id : 463
             * vip_gift_ids : [3306,3307,3308,3309]
             */

            private GiftEntranceIconBean gift_entrance_icon;
            private String gift_words;
            private boolean hide_recharge_entry;
            private int new_gift_id;
            private int speedy_gift_id;
            private List<Integer> fansclub_gift_ids;
            private List<?> free_cell_items;
            private List<?> game_gift_items;
            private List<GiftComboInfosBean> gift_combo_infos;
            private List<GiftGroupInfosBean> gift_group_infos;
            private List<Integer> honor_gift_ids;
            private List<?> noble_gift_ids;
            private List<Integer> vip_gift_ids;

            @NoArgsConstructor
            @Data
            public static class GiftEntranceIconBean {
                /**
                 * avg_color : #523737
                 * height : 0
                 * image_type : 0
                 * is_animated : false
                 * open_web_url :
                 * uri : webcast/47f428e737df0120d6324d368e00bcbe.webp
                 * url_list : ["http://p1-webcast-dycdn.byteimg.com/img/webcast/47f428e737df0120d6324d368e00bcbe.webp~tplv-obj.image","http://p9-webcast-dycdn.byteimg.com/img/webcast/47f428e737df0120d6324d368e00bcbe.webp~tplv-obj.image"]
                 * width : 0
                 */

                private String avg_color;
                private int height;
                private int image_type;
                private boolean is_animated;
                private String open_web_url;
                private String uri;
                private int width;
                private List<String> url_list;
            }

            @NoArgsConstructor
            @Data
            public static class GiftComboInfosBean {
                /**
                 * combo_count : 10
                 * combo_effect_img : {"avg_color":"#7C9BA3","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/bb72bec9f00ad99bf3416aeca6080118.png","url_list":["http://p6-webcast-dycdn.byteimg.com/img/webcast/bb72bec9f00ad99bf3416aeca6080118.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/bb72bec9f00ad99bf3416aeca6080118.png~tplv-obj.image"],"width":0}
                 */

                private int combo_count;
                private ComboEffectImgBean combo_effect_img;

                @NoArgsConstructor
                @Data
                public static class ComboEffectImgBean {
                    /**
                     * avg_color : #7C9BA3
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : webcast/bb72bec9f00ad99bf3416aeca6080118.png
                     * url_list : ["http://p6-webcast-dycdn.byteimg.com/img/webcast/bb72bec9f00ad99bf3416aeca6080118.png~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/bb72bec9f00ad99bf3416aeca6080118.png~tplv-obj.image"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }
            }

            @NoArgsConstructor
            @Data
            public static class GiftGroupInfosBean {
                /**
                 * group_count : 1
                 * group_text : 一心一意
                 */

                private int group_count;
                private String group_text;
            }
        }

        @NoArgsConstructor
        @Data
        public static class PagesBean {
            private boolean display;
            private String event_name;
            private String page_name;
            private int page_type;
            private List<GiftsBean> gifts;

            @NoArgsConstructor
            @Data
            public static class GiftsBean {
                /**
                 * action_type : 0
                 * app_id : 1128
                 * business_text :
                 * cny_gift : false
                 * combo : true
                 * describe : 送出小心心
                 * diamond_count : 1
                 * doodle : true
                 * duration : 0
                 * event_name : livesdk_gift_click
                 * for_custom : false
                 * for_fansclub : false
                 * for_linkmic : true
                 * for_portal : false
                 * gift_scene : 5
                 * gold_effect :
                 * golden_beans : 0
                 * gray_scheme_url :
                 * guide_url :
                 * honor_level : 0
                 * icon : {"avg_color":"#373752","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/0ea40b8376ef8157791b928a339ed9c9","url_list":["http://p1-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png","http://p9-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png"],"width":0}
                 * id : 463
                 * image : {"avg_color":"#7A6053","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/0ea40b8376ef8157791b928a339ed9c9","url_list":["http://p9-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png","http://p1-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png"],"width":0}
                 * is_displayed_on_panel : true
                 * is_gray : false
                 * item_type : 1
                 * manual :
                 * name : 小心心
                 * noble_level : 0
                 * notify : false
                 * primary_effect_id : 0
                 * punish_medicine : false
                 * region :
                 * scheme_url :
                 * special_effects : {"1314":887,"520":915,"66":918}
                 * subs : []
                 * trigger_words : ["小心心","送心","喜欢","爱你","心动","感谢","感恩","支持","加油","鼓掌","挺你","辛苦","么么哒","欢迎","爱心","喜欢你"]
                 * type : 1
                 * vip_level : 0
                 * watermelon_seeds : 0
                 * gift_label_icon : {"avg_color":"#8F8F8F","height":0,"image_type":0,"is_animated":false,"open_web_url":"","uri":"webcast/61b4dd3e99a54d72ea0fcef57cf680bd","url_list":["http://p9-webcast-dycdn.byteimg.com/img/webcast/61b4dd3e99a54d72ea0fcef57cf680bd~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/61b4dd3e99a54d72ea0fcef57cf680bd~tplv-obj.image"],"width":0}
                 */

                private int action_type;
                private int app_id;
                private String business_text;
                private boolean cny_gift;
                private boolean combo;
                private String describe;
                private int diamond_count;
                private boolean doodle;
                private int duration;
                private String event_name;
                private boolean for_custom;
                private boolean for_fansclub;
                private boolean for_linkmic;
                private boolean for_portal;
                private int gift_scene;
                private String gold_effect;
                private int golden_beans;
                private String gray_scheme_url;
                private String guide_url;
                private int honor_level;
                private IconBean icon;
                private int id;
                private ImageBean image;
                private boolean is_displayed_on_panel;
                private boolean is_gray;
                private int item_type;
                private String manual;
                private String name;
                private int noble_level;
                private boolean notify;
                private int primary_effect_id;
                private boolean punish_medicine;
                private String region;
                private String scheme_url;
                private SpecialEffectsBean special_effects;
                private int type;
                private int vip_level;
                private int watermelon_seeds;
                private GiftLabelIconBean gift_label_icon;
                private List<?> subs;
                private List<String> trigger_words;

                @NoArgsConstructor
                @Data
                public static class IconBean {
                    /**
                     * avg_color : #373752
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : webcast/0ea40b8376ef8157791b928a339ed9c9
                     * url_list : ["http://p1-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png","http://p9-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class ImageBean {
                    /**
                     * avg_color : #7A6053
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : webcast/0ea40b8376ef8157791b928a339ed9c9
                     * url_list : ["http://p9-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png","http://p1-webcast-dycdn.byteimg.com/img/webcast/0ea40b8376ef8157791b928a339ed9c9~tplv-obj.png"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }

                @NoArgsConstructor
                @Data
                public static class SpecialEffectsBean {
                    /**
                     * 1314 : 887
                     * 520 : 915
                     * 66 : 918
                     */

                    private int _$1314;
                    private int _$520;
                    private int _$66;
                }

                @NoArgsConstructor
                @Data
                public static class GiftLabelIconBean {
                    /**
                     * avg_color : #8F8F8F
                     * height : 0
                     * image_type : 0
                     * is_animated : false
                     * open_web_url :
                     * uri : webcast/61b4dd3e99a54d72ea0fcef57cf680bd
                     * url_list : ["http://p9-webcast-dycdn.byteimg.com/img/webcast/61b4dd3e99a54d72ea0fcef57cf680bd~tplv-obj.image","http://p3-webcast-dycdn.byteimg.com/img/webcast/61b4dd3e99a54d72ea0fcef57cf680bd~tplv-obj.image"]
                     * width : 0
                     */

                    private String avg_color;
                    private int height;
                    private int image_type;
                    private boolean is_animated;
                    private String open_web_url;
                    private String uri;
                    private int width;
                    private List<String> url_list;
                }
            }
        }
    }
}

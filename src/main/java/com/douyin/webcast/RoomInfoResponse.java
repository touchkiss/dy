package com.douyin.webcast;

import com.douyin.aweme.v1.bean.response.BaseResponse;
import com.douyin.aweme.v1.bean.response.UserInfo;
import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/21 17:43
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class RoomInfoResponse extends BaseResponse {
    private DataBeanXX data;

    @NoArgsConstructor
    @Data
    public static class DataBeanXX {
        private AnchorABMapBean AnchorABMap;
        private String anchor_scheduled_time_text;
        private String anchor_share_text;
        private int anchor_tab_type;
        private int app_id;
        private int auto_cover;
        private int base_category;
        private int book_end_time;
        private int book_time;
        private int business_live;
        private int category;
        private int cell_style;
        private String challenge_info;
        private int client_version;
        private CommentBoxBean comment_box;
        private int comment_name_mode;
        private String common_label_list;
        private String content_tag;
        private CoverBean cover;
        private int create_time;
        private String distance;
        private String distance_city;
        private String distance_km;
        private CoverBean dynamic_cover_dict;
        private String dynamic_cover_uri;
        private boolean enable_room_perspective;
        private int fansclub_msg_style;
        private int fcdn_appid;
        private CoverBean feed_room_label;
        private int finish_reason;
        private int finish_time;
        private String finish_url;
        private int follow_msg_style;
        private String forum_extra_data;
        private int gift_msg_style;
        private int group_id;
        private int group_source;
        private GuideButtonBean guide_button;
        private boolean has_commerce_goods;
        private String hot_sentence_info;
        private long id;
        private String id_str;
        private String introduction;
        private boolean is_replay;
        private boolean is_show_inquiry_ball;
        private boolean is_show_user_card_switch;
        private int last_ping_time;
        private int layout;
        private int like_count;
        private LinkerMapBean linker_map;
        private int linkmic_layout;
        private int live_id;
        private boolean live_type_audio;
        private boolean live_type_linkmic;
        private boolean live_type_normal;
        private boolean live_type_official;
        private boolean live_type_sandbox;
        private boolean live_type_screenshot;
        private boolean live_type_third_party;
        private LivingRoomAttrsBean living_room_attrs;
        private String location;
        private int lottery_finish_time;
        private int luckymoney_num;
        private int mosaic_status;
        private String mosaic_tip;
        private int orientation;
        private int os_type;
        private UserInfo owner;
        private int owner_device_id;
        private long owner_user_id;
        private int popularity;
        private String popularity_str;
        private int pre_enter_time;
        private String preview_copy;
        private int preview_flow_tag;
        private String private_info;
        private int ranklist_audience_type;
        private String real_distance;
        private String relation_tag;
        private boolean replay;
        private int replay_location;
        private int room_audit_status;
        private RoomAuthBean room_auth;
        private String room_create_ab_param;
        private int room_layout;
        private int room_tag;
        private String scroll_config;
        private int search_id;
        private boolean sell_goods;
        private int share_msg_style;
        private String share_url;
        private String short_title;
        private ShortTouchAreaConfigBean short_touch_area_config;
        private String stamps;
        private int start_time;
        private StatsBean stats;
        private int status;
        private int stream_close_time;
        private long stream_id;
        private String stream_id_str;
        private int stream_provider;
        private StreamUrlBean stream_url;
        private String sun_daily_icon_content;
        private String title;
        private boolean use_filter;
        private int user_count;
        private String user_share_text;
        private String vertical_cover_uri;
        private String vid;
        private String video_feed_tag;
        private String wait_copy;
        private int web_count;
        private int webcast_comment_tcs;
        private int webcast_sdk_version;
        private boolean with_draw_something;
        private boolean with_ktv;
        private boolean with_linkmic;
        private List<Long> admin_user_ids;
        private List<?> deco_list;
        private List<?> live_distribution;
        private List<?> room_tabs;
        private List<?> tags;
        private List<TopFansBean> top_fans;

        @NoArgsConstructor
        @Data
        public static class AnchorABMapBean {
        }

        @NoArgsConstructor
        @Data
        public static class CommentBoxBean {
            /**
             * placeholder : 说点什么...
             */

            private String placeholder;
        }

        @NoArgsConstructor
        @Data
        public static class GuideButtonBean {
        }

        @NoArgsConstructor
        @Data
        public static class LinkerMapBean {
        }

        @NoArgsConstructor
        @Data
        public static class LivingRoomAttrsBean {
            /**
             * admin_flag : 0
             * rank : 0
             * room_id : 6874848145021340420
             * room_id_str : 6874848145021340420
             * silence_flag : 0
             */

            private int admin_flag;
            private int rank;
            private long room_id;
            private String room_id_str;
            private int silence_flag;
        }

        @NoArgsConstructor
        @Data
        public static class RoomAuthBean {
            /**
             * AudioChat : 2
             * Banner : 1
             * Chat : true
             * CommerceCard : 1
             * Danmaku : false
             * DanmakuDefault : 0
             * Digg : true
             * DonationSticker : 2
             * Gift : true
             * GiftAnchorMt : 0
             * HourRank : 0
             * Landscape : 1
             * LandscapeChat : 1
             * LuckMoney : true
             * MoreAnchor : 1
             * POI : true
             * Props : true
             * PublicScreen : 1
             * RecordScreen : 1
             * RoomContributor : true
             * Share : 1
             * UserCard : true
             * UserCorner : 1
             */

            private int AudioChat;
            private int Banner;
            private boolean Chat;
            private int CommerceCard;
            private boolean Danmaku;
            private int DanmakuDefault;
            private boolean Digg;
            private int DonationSticker;
            private boolean Gift;
            private int GiftAnchorMt;
            private int HourRank;
            private int Landscape;
            private int LandscapeChat;
            private boolean LuckMoney;
            private int MoreAnchor;
            private boolean POI;
            private boolean Props;
            private int PublicScreen;
            private int RecordScreen;
            private boolean RoomContributor;
            private int Share;
            private boolean UserCard;
            private int UserCorner;
        }

        @NoArgsConstructor
        @Data
        public static class ShortTouchAreaConfigBean {
            /**
             * elements : {"1":{"priority":0,"type":1},"10":{"priority":2,"type":10},"12":{"priority":2,"type":12},"2":{"priority":0,"type":2},"3":{"priority":0,"type":3},"4":{"priority":2,"type":4},"5":{"priority":3,"type":5},"6":{"priority":2,"type":6},"7":{"priority":2,"type":7},"8":{"priority":2,"type":8},"9":{"priority":2,"type":9}}
             */

            private ElementsBean elements;

            @NoArgsConstructor
            @Data
            public static class ElementsBean {
                /**
                 * 1 : {"priority":0,"type":1}
                 * 10 : {"priority":2,"type":10}
                 * 12 : {"priority":2,"type":12}
                 * 2 : {"priority":0,"type":2}
                 * 3 : {"priority":0,"type":3}
                 * 4 : {"priority":2,"type":4}
                 * 5 : {"priority":3,"type":5}
                 * 6 : {"priority":2,"type":6}
                 * 7 : {"priority":2,"type":7}
                 * 8 : {"priority":2,"type":8}
                 * 9 : {"priority":2,"type":9}
                 */

                private _$1Bean _$1;
                private _$1Bean _$10;
                private _$1Bean _$12;
                private _$1Bean _$2;
                private _$1Bean _$3;
                private _$1Bean _$4;
                private _$1Bean _$5;
                private _$1Bean _$6;
                private _$1Bean _$7;
                private _$1Bean _$8;
                private _$1Bean _$9;

                @NoArgsConstructor
                @Data
                public static class _$1Bean {
                    /**
                     * priority : 0
                     * type : 1
                     */

                    private int priority;
                    private int type;
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class StatsBean {
            /**
             * digg_count : 0
             * dou_plus_promotion :
             * enter_count : 0
             * fan_ticket : 21338
             * follow_count : 5476
             * gift_uv_count : 1105
             * id : 6874848145021340420
             * id_str : 6874848145021340420
             * like_count : 0
             * money : 0
             * total_user : 410370
             * total_user_desp :
             * user_count_composition : {"city":0.01,"my_follow":0.03,"other":0.82,"video_detail":0.14}
             * watermelon : 0
             */

            private int digg_count;
            private String dou_plus_promotion;
            private int enter_count;
            private int fan_ticket;
            private int follow_count;
            private int gift_uv_count;
            private long id;
            private String id_str;
            private int like_count;
            private int money;
            private int total_user;
            private String total_user_desp;
            private UserCountCompositionBean user_count_composition;
            private int watermelon;

            @NoArgsConstructor
            @Data
            public static class UserCountCompositionBean {
                /**
                 * city : 0.01
                 * my_follow : 0.03
                 * other : 0.82
                 * video_detail : 0.14
                 */

                private double city;
                private double my_follow;
                private double other;
                private double video_detail;
            }
        }

        @NoArgsConstructor
        @Data
        public static class StreamUrlBean {
            /**
             * candidate_resolution : []
             * complete_push_urls : []
             * default_resolution : FULL_HD1
             * extra : {"anchor_interact_profile":0,"audience_interact_profile":0,"bframe_enable":false,"bitrate_adapt_strategy":0,"bytevc1_enable":false,"default_bitrate":800,"fps":15,"gop_sec":0,"h265_enable":false,"hardware_encode":false,"height":864,"max_bitrate":900,"min_bitrate":300,"roi":false,"sw_roi":false,"video_profile":0,"width":480}
             * flv_pull_url : {}
             * flv_pull_url_params : {}
             * hls_pull_url : http://pull-hls-f5.douyincdn.com/stage/stream-395649870391410789_or4/index.m3u8
             * hls_pull_url_map : {}
             * hls_pull_url_params : {"VCodec":"h264"}
             * id : 395649870391410789
             * id_str : 395649870391410789
             * live_core_sdk_data : {"pull_data":{"options":{"default_quality":{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""},"qualities":[{"level":0,"name":"原画","resolution":"or4","sdk_key":"origin","v_codec":"264"}]},"stream_data":"{\"common\":{\"session_id\":\"037-202009211738200101290171551802BE4B\"},\"data\":{\"origin\":{\"main\":{\"flv\":\"httpk://pull-f5.flive.douyincdn.com:8848/stage/stream-395649870391410789_or4.flv\",\"hls\":\"http://pull-hls-f5.douyincdn.com/stage/stream-395649870391410789_or4/index.m3u8\",\"cmaf\":\"\",\"dash\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"gop\\\":4,\\\"resolution\\\":\\\"or4\\\",\\\"vbitrate\\\":0}\"}}}}"},"push_data":{"push_stream_level":0,"resolution_params":{"hd":{"default_bitrate":1200000,"fps":15,"height":1280,"max_bitrate":2000000,"min_bitrate":800000,"width":720},"ld":{"default_bitrate":800000,"fps":15,"height":848,"max_bitrate":1333000,"min_bitrate":320000,"width":480},"sd":{"default_bitrate":1000000,"fps":15,"height":960,"max_bitrate":1600000,"min_bitrate":500000,"width":540}}}}
             * provider : 0
             * push_urls : []
             * resolution_name : {"FULL_HD1":"蓝光","HD1":"超清","ORIGION":"原画","SD1":"标清","SD2":"高清"}
             * rtmp_pull_url : httpk://pull-f5.flive.douyincdn.com:8848/stage/stream-395649870391410789_or4.flv
             * rtmp_pull_url_params : {"VCodec":"h264"}
             * rtmp_push_url :
             * rtmp_push_url_params :
             * stream_control_type : 0
             */

            private String default_resolution;
            private ExtraBean extra;
            private FlvPullUrlBean flv_pull_url;
            private FlvPullUrlParamsBean flv_pull_url_params;
            private String hls_pull_url;
            private HlsPullUrlMapBean hls_pull_url_map;
            private String hls_pull_url_params;
            private long id;
            private String id_str;
            private LiveCoreSdkDataBean live_core_sdk_data;
            private int provider;
            private ResolutionNameBean resolution_name;
            private String rtmp_pull_url;
            private String rtmp_pull_url_params;
            private String rtmp_push_url;
            private String rtmp_push_url_params;
            private int stream_control_type;
            private List<?> candidate_resolution;
            private List<?> complete_push_urls;
            private List<?> push_urls;

            @NoArgsConstructor
            @Data
            public static class ExtraBean {
            }

            @NoArgsConstructor
            @Data
            public static class FlvPullUrlBean {
            }

            @NoArgsConstructor
            @Data
            public static class FlvPullUrlParamsBean {
            }

            @NoArgsConstructor
            @Data
            public static class HlsPullUrlMapBean {
            }

            @NoArgsConstructor
            @Data
            public static class LiveCoreSdkDataBean {
                /**
                 * pull_data : {"options":{"default_quality":{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""},"qualities":[{"level":0,"name":"原画","resolution":"or4","sdk_key":"origin","v_codec":"264"}]},"stream_data":"{\"common\":{\"session_id\":\"037-202009211738200101290171551802BE4B\"},\"data\":{\"origin\":{\"main\":{\"flv\":\"httpk://pull-f5.flive.douyincdn.com:8848/stage/stream-395649870391410789_or4.flv\",\"hls\":\"http://pull-hls-f5.douyincdn.com/stage/stream-395649870391410789_or4/index.m3u8\",\"cmaf\":\"\",\"dash\":\"\",\"sdk_params\":\"{\\\"VCodec\\\":\\\"h264\\\",\\\"gop\\\":4,\\\"resolution\\\":\\\"or4\\\",\\\"vbitrate\\\":0}\"}}}}"}
                 * push_data : {"push_stream_level":0,"resolution_params":{"hd":{"default_bitrate":1200000,"fps":15,"height":1280,"max_bitrate":2000000,"min_bitrate":800000,"width":720},"ld":{"default_bitrate":800000,"fps":15,"height":848,"max_bitrate":1333000,"min_bitrate":320000,"width":480},"sd":{"default_bitrate":1000000,"fps":15,"height":960,"max_bitrate":1600000,"min_bitrate":500000,"width":540}}}
                 */

                private PullDataBean pull_data;
                private PushDataBean push_data;

                @NoArgsConstructor
                @Data
                public static class PullDataBean {
                    /**
                     * options : {"default_quality":{"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""},"qualities":[{"level":0,"name":"原画","resolution":"or4","sdk_key":"origin","v_codec":"264"}]}
                     * stream_data : {"common":{"session_id":"037-202009211738200101290171551802BE4B"},"data":{"origin":{"main":{"flv":"httpk://pull-f5.flive.douyincdn.com:8848/stage/stream-395649870391410789_or4.flv","hls":"http://pull-hls-f5.douyincdn.com/stage/stream-395649870391410789_or4/index.m3u8","cmaf":"","dash":"","sdk_params":"{\"VCodec\":\"h264\",\"gop\":4,\"resolution\":\"or4\",\"vbitrate\":0}"}}}}
                     */

                    private OptionsBean options;
                    private String stream_data;

                    @NoArgsConstructor
                    @Data
                    public static class OptionsBean {
                        /**
                         * default_quality : {"level":0,"name":"原画","resolution":"","sdk_key":"origin","v_codec":""}
                         * qualities : [{"level":0,"name":"原画","resolution":"or4","sdk_key":"origin","v_codec":"264"}]
                         */

                        private DefaultQualityBean default_quality;
                        private List<DefaultQualityBean> qualities;

                        @NoArgsConstructor
                        @Data
                        public static class DefaultQualityBean {
                            /**
                             * level : 0
                             * name : 原画
                             * resolution :
                             * sdk_key : origin
                             * v_codec :
                             */

                            private int level;
                            private String name;
                            private String resolution;
                            private String sdk_key;
                            private String v_codec;
                        }
                    }
                }

                @NoArgsConstructor
                @Data
                public static class PushDataBean {
                    /**
                     * push_stream_level : 0
                     * resolution_params : {"hd":{"default_bitrate":1200000,"fps":15,"height":1280,"max_bitrate":2000000,"min_bitrate":800000,"width":720},"ld":{"default_bitrate":800000,"fps":15,"height":848,"max_bitrate":1333000,"min_bitrate":320000,"width":480},"sd":{"default_bitrate":1000000,"fps":15,"height":960,"max_bitrate":1600000,"min_bitrate":500000,"width":540}}
                     */

                    private int push_stream_level;
                    private ResolutionParamsBean resolution_params;

                    @NoArgsConstructor
                    @Data
                    public static class ResolutionParamsBean {
                        /**
                         * hd : {"default_bitrate":1200000,"fps":15,"height":1280,"max_bitrate":2000000,"min_bitrate":800000,"width":720}
                         * ld : {"default_bitrate":800000,"fps":15,"height":848,"max_bitrate":1333000,"min_bitrate":320000,"width":480}
                         * sd : {"default_bitrate":1000000,"fps":15,"height":960,"max_bitrate":1600000,"min_bitrate":500000,"width":540}
                         */

                        private ExtraBean hd;
                        private ExtraBean ld;
                        private ExtraBean sd;
                    }
                }
            }

            @NoArgsConstructor
            @Data
            public static class ResolutionNameBean {
                /**
                 * FULL_HD1 : 蓝光
                 * HD1 : 超清
                 * ORIGION : 原画
                 * SD1 : 标清
                 * SD2 : 高清
                 */

                private String FULL_HD1;
                private String HD1;
                private String ORIGION;
                private String SD1;
                private String SD2;
            }
        }

        @NoArgsConstructor
        @Data
        public static class TopFansBean {
            private int fan_ticket;
            private UserInfo user;
        }
    }
}

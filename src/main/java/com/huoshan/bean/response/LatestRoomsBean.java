package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class LatestRoomsBean {
    private String anchor_share_text;
    private Integer cell_style;
    private Integer client_version;
    private String common_label_list;
    private CoverBean cover;
    private Integer create_time;
    private Object dynamic_cover;
    private Object dynamic_cover_low;
    private Boolean enable_room_perspective;
    private Integer finish_time;
    private Long id;
    private String id_str;
    private Integer layout;
    private Integer linkmic_layout;
    private Integer live_id;
    private Boolean live_type_normal;
    private Integer luckymoney_num;
    private Integer mosaic_status;
    private Integer os_type;
    private Author owner;
    private Long owner_user_id;
    private RoomAuthBean room_auth;
    private String share_url;
    private StatsBeanX stats;
    private Integer status;
    private Long stream_id;
    private String stream_id_str;
    private StreamUrlBean stream_url;
    private String title;
    private Integer user_count;
    private String user_share_text;
    private Boolean with_linkmic;

    @NoArgsConstructor
    @Data
    public static class RoomAuthBean {
        /**
         * Chat : true
         * Danmaku : true
         * Digg : true
         * Gift : true
         * LuckyMoney : true
         * RoomContributor : true
         */

        private Boolean Chat;
        private Boolean Danmaku;
        private Boolean Digg;
        private Boolean Gift;
        private Boolean LuckyMoney;
        private Boolean RoomContributor;
    }

    @NoArgsConstructor
    @Data
    public static class StatsBeanX {
        /**
         * fan_ticket : 0
         * follow_count : 41
         * gift_uv_count : 17
         * id : 6869737171042568967
         * id_str : 6869737171042568967
         * money : 0
         * total_user : 24252
         * user_count_composition : {"city":0.001237266465954551,"video_detail":0.010393038314018228}
         */

        private Integer fan_ticket;
        private Integer follow_count;
        private Integer gift_uv_count;
        private Long id;
        private String id_str;
        private Integer money;
        private Integer total_user;
        private UserCountCompositionBean user_count_composition;

        @NoArgsConstructor
        @Data
        public static class UserCountCompositionBean {
            /**
             * city : 0.001237266465954551
             * video_detail : 0.010393038314018228
             */

            private double city;
            private double video_detail;
        }
    }

    @NoArgsConstructor
    @Data
    public static class StreamUrlBean {

        private String default_resolution;
        private ExtraBean extra;
        private FlvPullUrlBean flv_pull_url;
        private Long id;
        private String id_str;
        private Integer provider;
        private ResolutionNameBean resolution_name;
        private String rtmp_pull_url;
        private List<?> candidate_resolution;

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
        public static class ResolutionNameBean {
            /**
             * FULL_HD1 : 超清
             * HD1 : 高清
             * SD1 : 标清
             * SD2 : 标清
             */

            private String FULL_HD1;
            private String HD1;
            private String SD1;
            private String SD2;
        }
    }
}

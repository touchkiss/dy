package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@lombok.NoArgsConstructor
@lombok.Data
public class ExtraBean {
    private Integer cost;
    private Boolean has_more;
    private Boolean is_backup;
    private LogPbBean log_pb;
    private Long max_time;
    private Long min_time;
    private Long now;
    private Integer total;
    private Integer offset;
    private String query;
    private Integer query_id;
    private String req_id;
    private String search_id;
    private List<FollowerStatsListBean> follower_stats_list;
    private java.util.List<?> fatal_ids;

    @NoArgsConstructor
    @Data
    public static class FollowerStatsListBean {
        /**
         * fans_count : 162256
         * icon_url : http://p1-hs.byteimg.com/img/hotsoon-resource/new_hotsoon_icon216.png~60x60.png
         * schema_url :
         * name : 火山
         */

        private int fans_count;
        private String icon_url;
        private String schema_url;
        private String name;
    }

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class LogPbBean {
        /**
         * impr_id : 202009071725400101290200950F39268D
         */

        private String impr_id;
    }
}

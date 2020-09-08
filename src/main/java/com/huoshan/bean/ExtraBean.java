package com.huoshan.bean;

@lombok.NoArgsConstructor
@lombok.Data
public class ExtraBean {
    /**
     * cost : 602940
     * has_more : true
     * is_backup : false
     * log_pb : {"impr_id":"202009071725400101290200950F39268D"}
     * max_time : 1599470740676
     * min_time : 1599470740676
     * now : 1599470740682
     * total : 8
     */

    private int cost;
    private boolean has_more;
    private boolean is_backup;
    private LogPbBean log_pb;
    private long max_time;
    private long min_time;
    private long now;
    private int total;
    private int offset;
    private String query;
    private int query_id;
    private String req_id;
    private String search_id;
    private java.util.List<?> fatal_ids;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class LogPbBean {
        /**
         * impr_id : 202009071725400101290200950F39268D
         */

        private String impr_id;
    }
}

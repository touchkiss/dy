package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 22:02
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class HotsearchBrandWeeklyListResponse extends BaseResponse{
    private List<WeeklyListBean> weekly_list;

    @NoArgsConstructor
    @Data
    public static class WeeklyListBean {
        /**
         * serial : 4
         * start_date : 2020-11-22
         * end_date : 2020-11-28
         * last_updated_date : 2020-12-01
         * is_current : false
         */

        private int serial;
        private String start_date;
        private String end_date;
        private String last_updated_date;
        private boolean is_current;
    }
}

package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/18 14:54
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class NearbyFeedResponse extends BaseResponse {
    private Long has_more;
    private Object poi_op_tab_list;
    private Object poi_rank_card_list;
    private Object poi_op_card_list;
    private Object poi_info_list;
    private CurrentCityBean current_city;
    private Object poi_class_info_list;
    private List<AwemeInfo> aweme_list;

    @NoArgsConstructor
    @Data
    public static class CurrentCityBean {

        private String name_en;
        private String show_name;
        private Long show_type;
        private String country_code;
        private String nearby_tab_name;
        private String code;
        private String name;
        private String ad_code;
        private String show_name_en;
        private String nearby_label_name;
        private String current_position_name;
        private Object districts;
    }
}

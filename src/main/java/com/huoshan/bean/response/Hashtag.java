package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/08 21:57
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class Hashtag {

    private DescH5Bean desc_h5;
    private String entrance_desc;
    private Integer fav_cnt;
    private Long id;
    private String id_string;
    private Boolean is_visible;
    private String share_h5_url;
    private Integer status;
    private String title;
    private Integer video_cnt;
    private List<OrdersBean> orders;

    @NoArgsConstructor
    @Data
    public static class DescH5Bean {
        /**
         * height : 1100
         * url : https://hotsoon.snssdk.com/magic/page/ejs/5ed7172b3e8bfe02f71d0170?appType=hotsoon
         * width : 750
         */

        private Integer height;
        private String url;
        private Integer width;
    }

    @NoArgsConstructor
    @Data
    public static class OrdersBean {
        /**
         * title : 热门
         * type : hot
         */

        private String title;
        private String type;
    }
}

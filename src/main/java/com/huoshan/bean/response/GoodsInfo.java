package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class GoodsInfo {
    private String coupon_title;
    private Long id;
    private String id_str;
    private CoverBean image;
    private Integer market_price;
    private Integer price;
    private Integer promotion_source;
    private Integer sales;
    private String schema_url;
    private String short_title;
    private String title;
    private Integer type;
}

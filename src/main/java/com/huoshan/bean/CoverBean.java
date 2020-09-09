package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class CoverBean {
    private Integer height;
    private String avg_color;
    private String uri;
    private Integer width;
    private List<String> url_list;
}

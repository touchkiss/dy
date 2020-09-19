package com.huoshan.bean.response;

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
    private long image_type;
    private boolean is_animated;
    private String open_web_url;
    private List<String> url_list;
}

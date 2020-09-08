package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class VideoInfo {
    private Boolean allow_cache;
    private CoverBean cover;
    private CoverBean cover_360p;
    private Object cover_animated;
    private CoverBean cover_medium;
    private CoverBean cover_normal;
    private CoverBean cover_thumb;
    private double duration;
    private CoverBean first_frame;
    private CoverBean first_frame_360p;
    private String gear_name;
    private String h265_uri;
    private Integer h265_url_expire;
    private Integer height;
    private Integer preload_size;
    private String uri;
    private Integer url_list_expire;
    private String video_id;
    private Boolean watermark;
    private Integer width;
    private List<String> download_url;
    private List<String> h265_url;
    private List<String> url_list;
}

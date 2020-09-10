package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/08 21:55
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class Song {

    private String album;
    private String author;
    private CoverBean cover_large;
    private CoverBean cover_thumb;
    private Integer duration;
    private Long id;
    private CoverBean play_url;
    private String share_description;
    private String share_title;
    private String share_url;
    private Integer source_platform;
    private Integer status;
    private String title;
    private Integer video_cnt;
}

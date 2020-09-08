package com.huoshan.bean;

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
    private int duration;
    private long id;
    private CoverBean play_url;
    private String share_description;
    private String share_title;
    private String share_url;
    private int source_platform;
    private int status;
    private String title;
    private int video_cnt;
}

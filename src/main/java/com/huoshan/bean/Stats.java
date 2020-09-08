package com.huoshan.bean;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Stats {

    /**
     * comment_count : 13869
     * digg_count : 1695974
     * flame_sender_count : 194349
     * play_count : 0
     * share_count : 5478
     */

    private Integer comment_count;
    private Integer digg_count;
    private Integer flame_sender_count;
    private Integer play_count;
    private Integer share_count;
}

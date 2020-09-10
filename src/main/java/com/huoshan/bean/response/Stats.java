package com.huoshan.bean.response;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Stats {
    private Integer comment_count;
    private Integer digg_count;
    private Integer flame_sender_count;
    private Integer play_count;
    private Integer share_count;
}

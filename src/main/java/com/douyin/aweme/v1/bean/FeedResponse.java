package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.List;

/**
 * Created on 2020/12/01 17:50
 *
 * @author Touchkiss
 */
@Data
public class FeedResponse extends BaseResponse {
    private List<AwemeInfo> aweme_list;
    private Boolean disable_adjust_for_cache;
    private Boolean enable_re_rank;
    private int has_more;
    private int home_model;
    private int max_cursor;
    private int min_cursor;
    private int refresh_clear;
}

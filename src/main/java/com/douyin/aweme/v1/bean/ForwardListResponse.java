package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.List;

/**
 * Created on 2020/11/28 22:55
 *
 * @author Touchkiss
 */
@Data
public class ForwardListResponse extends BaseResponse{
    private long min_cursor;
    private long max_cursor;
    private Boolean has_more;
    private List<AwemeInfo> dongtai_list;
}

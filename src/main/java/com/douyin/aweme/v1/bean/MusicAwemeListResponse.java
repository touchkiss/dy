package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.List;

/**
 * Created on 2020/12/01 15:10
 *
 * @author Touchkiss
 */
@Data
public class MusicAwemeListResponse extends BaseResponse{
    List<AwemeInfo> aweme_list;
    private int cursor;
    private int has_more;
}

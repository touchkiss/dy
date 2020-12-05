package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.List;

/**
 * Created on 2020/12/05 11:13
 *
 * @author Touchkiss
 */
@Data
public class MixAwemeResponse extends BaseResponse{
    private int cursor;
    private int has_more;
    private int mix_cursor;
    private List<AwemeInfo>aweme_list;
}

package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.List;

/**
 * Created on 2020/12/07 20:24
 *
 * @author Touchkiss
 */
@Data
public class StickerAwemeResponse extends BaseResponse{
    private List<AwemeInfo> aweme_list;
    private int cursor;
    private int has_more;
}

package com.douyin.aweme.v1.bean;

import lombok.Data;

/**
 * Created on 2020/11/28 23:33
 *
 * @author Touchkiss
 */
@Data
public class MusicDetailResponse extends BaseResponse{
    private AwemeInfo.MusicBean music_info;
    private String msg;
}

package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/12/07 15:03
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ShortenResponse extends BaseResponse{

    /**
     * code : 0
     * message : success
     * now : 1607324309
     * data : https://v.douyin.com/JX3UWnd/
     */

    private Integer code;
    private String message;
    private Integer now;
    private String data;
}

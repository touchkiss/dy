package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/16 10:01
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class UserResponse extends BaseResponse {
    private UserInfo user;

}

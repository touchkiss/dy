package com.douyin.aweme.v1.user.profile;

import com.douyin.aweme.v1.aweme.post.BaseResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/16 10:01
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class UserProfile extends BaseResponse {
    private UserInfo user;
}

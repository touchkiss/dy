package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.BaseResponse;
import com.douyin.aweme.v1.bean.UserInfo;
import lombok.Data;

/**
 * Created on 2020/12/01 17:00
 *
 * @author Touchkiss
 * get
 * https://www.iesdouyin.com/web/api/v2/user/info/?sec_uid=MS4wLjABAAAAxbS9RCPze6PsYoVVGPUdpj02Mm8Gr-xFi7NcC4xhl2IMAhpSPNJrfEtDAS6ZZqyB
 */
@Data
public class UserInfoResponse extends BaseResponse {
    private UserInfo user_info;
}

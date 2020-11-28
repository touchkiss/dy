package com.douyin.aweme.v1.bean.request;

import com.douyin.aweme.v1.bean.response.UserInfoResponse;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/11/28 15:18
 *
 * @author Touchkiss
 */
@Data
public class UserInfoRequest extends BaseRequest<UserInfoResponse> {
    private String sec_user_id;
    private String user_id;
    public UserInfoRequest() {
        super(new HashSet<>(Arrays.asList("Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-Khronos", "X-Gorgon", "User-Agent", "Host", "Connection")), new ArrayList<>(Arrays.asList("sec_user_id","user_id", "retry_type", "mcc_mnc", "iid", "device_id", "ac", "channel", "aid", "app_name", "version_code", "version_name", "device_platform", "ssmix", "device_type", "device_brand", "language", "os_api", "os_version", "openudid", "manifest_version_code", "resolution", "dpi", "update_version_code","_rticket","ts","js_sdk_version")), "aweme-eagle.snssdk.com", "/aweme/v1/user/", "get");
    }
}




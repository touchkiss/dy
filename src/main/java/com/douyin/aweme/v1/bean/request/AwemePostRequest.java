package com.douyin.aweme.v1.bean.request;

import com.douyin.aweme.v1.bean.response.AwemePostResponse;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/11/28 22:39
 *
 * @author Touchkiss
 */
@Data
public class AwemePostRequest extends BaseRequest<AwemePostResponse> {
    /**
     * 返回记录中的最大值，默认0
     */
    private long max_cursor;
    private String sec_user_id;
    private String user_id;
    private int count;

    public AwemePostRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-QUERIES", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), new ArrayList<>(Arrays.asList("max_cursor", "sec_user_id", "user_id", "count", "retry_type", "mcc_mnc", "iid", "device_id", "ac", "channel", "aid", "app_name", "version_code", "version_name", "device_platform", "ssmix", "device_type", "device_brand", "language", "os_api", "os_version", "openudid", "manifest_version_code", "resolution", "dpi", "update_version_code", "_rticket", "ts", "js_sdk_version")), "api.amemv.com", "/aweme/v1/aweme/post/", "get");
    }
}


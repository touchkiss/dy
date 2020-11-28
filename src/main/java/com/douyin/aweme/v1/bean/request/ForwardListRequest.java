package com.douyin.aweme.v1.bean.request;

import com.douyin.aweme.v1.bean.response.ForwardListResponse;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/11/28 22:54
 *
 * @author Touchkiss
 */
@Data
public class ForwardListRequest extends BaseRequest<ForwardListResponse> {
    private String user_id;
    private long max_cursor;
    private long min_cursor;
    private int count;

    public ForwardListRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "User-Agent", "X-Khronos", "X-Gorgon")), new ArrayList<>(Arrays.asList("user_id", "max_cursor", "min_cursor", "count", "ts", "js_sdk_version", "app_type", "manifest_version_code", "_rticket", "ac", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "as", "cp", "mas")), "api.amemv.com", "/aweme/v1/forward/list/", "get");
    }
}


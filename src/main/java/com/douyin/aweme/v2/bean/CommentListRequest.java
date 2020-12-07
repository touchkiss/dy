package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.BaseRequest;
import com.douyin.aweme.v2.bean.CommentListResponse;
import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/11/28 23:23
 *
 * @author Touchkiss
 */
@Data
public class CommentListRequest extends BaseRequest<CommentListResponse> {
    private String aweme_id;
    private long cursor;
    private int count;
    public CommentListRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Cookie", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("aweme_id", "cursor", "count", "ts", "js_sdk_version", "app_type", "manifest_version_code", "_rticket", "ac", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "as", "cp", "mas"), "aweme.snssdk.com", "/aweme/v2/comment/list/", "get");
    }
}



package com.douyin.aweme.v1.bean;

import com.douyin.aweme.v2.bean.CommentListResponse;
import lombok.Data;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created on 2020/12/07 14:38
 *
 * @author Touchkiss
 */
@Data
public class CommentListReplyRequest extends BaseRequest<CommentListResponse> {
    private long comment_id;
    private long cursor = 0;
    private int count = 3;
    private String top_ids;
    private long item_id;
    private String insert_ids;

    public CommentListReplyRequest() {
        super(new HashSet<>(Arrays.asList("Host", "Connection", "Cookie", "Accept-Encoding", "X-SS-REQ-TICKET", "sdk-version", "X-SS-RS", "User-Agent", "X-Khronos", "X-Gorgon", "X-Pods")), Arrays.asList("comment_id", "cursor", "count", "top_ids", "item_id", "insert_ids", "manifest_version_code", "_rticket", "ac", "app_type", "device_id", "iid", "mcc_mnc", "os_version", "channel", "version_code", "device_type", "language", "resolution", "openudid", "update_version_code", "app_name", "version_name", "os_api", "device_brand", "ssmix", "device_platform", "dpi", "aid", "ts"), "aweme.snssdk.com", "/aweme/v1/comment/list/reply/", "get");
    }
}


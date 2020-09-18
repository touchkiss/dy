package com.douyin.aweme.v1;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/16 11:08
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class UserPostListResponse extends BaseResponse {
    private long min_cursor;
    private long max_cursor;
    private Long has_more;
    private List<AwemeInfo> aweme_list;
}

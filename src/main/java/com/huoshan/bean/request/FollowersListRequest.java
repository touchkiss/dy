package com.huoshan.bean.request;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/10 17:01
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class FollowersListRequest extends BaseRequest{
    private String current_user_id;
    private Long max_time;
    private Integer count;
    private String sort_type;
}

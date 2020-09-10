package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/09/10 16:02
 * <p>
 * 用户粉丝列表
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class FollowersListResponse extends BaseResponse<List<Author>> {
}

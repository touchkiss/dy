package com.huoshan.bean.response;

import com.douyin.webcast.ListResponse;

import java.util.List;

/**
 * Created on 2020/09/07 17:30
 * 火山推荐列表
 *
 * @author Touchkiss
 */
@lombok.NoArgsConstructor
@lombok.Data
public class FeedResponse extends BaseResponse<List<ListResponse.DataBeanX>> {
}

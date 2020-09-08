package com.huoshan.hotsoon.feed;

import com.douyin.webcast.ranklist.hot.ListResponse;
import com.huoshan.bean.ExtraBean;

/**
 * Created on 2020/09/07 17:30
 * 火山推荐列表
 *
 * @author Touchkiss
 */
@lombok.NoArgsConstructor
@lombok.Data
public class FeedResponse {


    private ExtraBean extra;
    private int status_code;
    private java.util.List<ListResponse.DataBeanX> data;


}

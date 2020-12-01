package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.AwemeInfo;
import com.huoshan.bean.response.BaseResponse;
import lombok.Data;

import java.util.List;

/**
 * Created on 2020/12/01 17:29
 *
 * @author Touchkiss
 */
@Data
public class AwemeIteminfoResponse extends BaseResponse {
    private List<AwemeInfo> item_list;
}

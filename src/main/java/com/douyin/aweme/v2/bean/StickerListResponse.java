package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.AwemeInfo;
import com.douyin.aweme.v1.bean.BaseResponse;
import lombok.Data;

import java.util.List;

/**
 * Created on 2020/12/08 13:10
 *
 * @author Touchkiss
 */
@Data
public class StickerListResponse extends BaseResponse {
    private List<AwemeInfo> aweme_list;
    private int cursor;
    private boolean has_more;
}

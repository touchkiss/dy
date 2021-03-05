package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2021/03/04 15:55
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class ToutiaoFeedNormandyNewestResponse extends BaseResponse{

    private String message;
    private List<DataBean> data;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        private String content;
        private String code;
    }
}

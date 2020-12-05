package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/01 18:02
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class HotsearchAwemeBillboardResponse extends BaseResponse {
    private List<Aweme> aweme_list;
    private AwemeInfo.ShareInfoBeanX share_info;
    private CoverBean banner_dark;
    private CoverBean banner_light;
    private String active_time;

    @Data
    public static class Aweme {
        private AwemeInfo aweme_info;
        private int label;
//        播放量
        private long hot_value;
    }
}

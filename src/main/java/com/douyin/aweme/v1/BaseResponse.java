package com.douyin.aweme.v1;

import com.huoshan.bean.response.ExtraBean;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/09/16 11:25
 *
 * @author Touchkiss
 */
@Data
public class BaseResponse {
    private Long status_code;
    private ExtraBean extra;
    private LogPbBean log_pb;
    @NoArgsConstructor
    @Data
    public static class LogPbBean {
        /**
         * impr_id : 202009160959480101310570193A98304F
         */

        private String impr_id;
    }
}

package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2020/12/14 11:18
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class UserInfoResponse extends BaseResponse<UserVideoResponse.DataBean>{

    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * encrypted_id : MS4wLjABAAAA--2lW1pg2n4SRSjgckH6ddc48OPJikGWh_IuSplPXl5xX2cWNHYPVnTL8loK5464
         * nickname : chenjuhua
         * signature :
         * short_id : 845644381
         * avatar : http://p5-hs.byteimg.com/img/mosaic-legacy/2e0cc0002d70f56269825~100x100.jpg
         * follower_count : 1176
         * item_count : 829
         * record_count : 0
         * fan_ticket_count : 0
         */

        private String encrypted_id;
        private String nickname;
        private String signature;
        private Integer short_id;
        private String avatar;
        private Integer follower_count;
        private Integer item_count;
        private Integer record_count;
        private Integer fan_ticket_count;
    }
}

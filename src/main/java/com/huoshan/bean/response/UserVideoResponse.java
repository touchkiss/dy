package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/14 10:57
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class UserVideoResponse extends BaseResponse<List<UserVideoResponse.DataBean>>{
    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * item_id : 6905769622625176840
         * cover : http://p1-hs.byteimg.com/img/tos-cn-p-0015/4dbd5bb8cedd4c72b3aac107f29a97c1~tplv-hs-large.jpg
         */

        private String item_id;
        private String cover;
    }
}

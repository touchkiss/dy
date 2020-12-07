package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/07 21:24
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class CityListResponse extends BaseResponse{
    private CurrentBean current;
    private List<AllBean> all;
    private List<HotBean> hot;

    @NoArgsConstructor
    @Data
    public static class CurrentBean {
        /**
         * code : 110000
         * name : 昌平
         * en : Changping
         * name_en : Changping
         * ad_code : 110114
         * districts : null
         */

        private String code;
        private String name;
        private String en;
        private String name_en;
        private String ad_code;
        private Object districts;
    }

    @NoArgsConstructor
    @Data
    public static class AllBean {
        /**
         * districts : [{"code":"440300","name":"宝安","en":"Bao'an","cn_pinyin":"Bao'an","districts":null},{"code":"440300","name":"福田","en":"Futian","cn_pinyin":"Futian","districts":null},{"code":"440300","name":"光明","en":"Guangming","cn_pinyin":"Guangming","districts":null},{"code":"440300","name":"龙岗","en":"Longgang","cn_pinyin":"Longgang","districts":null},{"code":"440300","name":"龙华","en":"Longhua","cn_pinyin":"Longhua","districts":null},{"code":"440300","name":"罗湖","en":"Luohu","cn_pinyin":"Luohu","districts":null},{"name":"南山","en":"Nanshan","cn_pinyin":"Nanshan","districts":null,"code":"440300"},{"code":"440300","name":"坪山","en":"Pingshan","cn_pinyin":"Pingshan","districts":null},{"code":"440300","name":"盐田","en":"Yantian","cn_pinyin":"Yantian","districts":null}]
         * code : 440300
         * name : 深圳
         * en : Shenzhen
         * cn_pinyin : ShenZhen
         */

        private String code;
        private String name;
        private String en;
        private String cn_pinyin;
        private List<DistrictsBean> districts;

        @NoArgsConstructor
        @Data
        public static class DistrictsBean {
            /**
             * code : 440300
             * name : 宝安
             * en : Bao'an
             * cn_pinyin : Bao'an
             * districts : null
             */

            private String code;
            private String name;
            private String en;
            private String cn_pinyin;
            private Object districts;
        }
    }

    @NoArgsConstructor
    @Data
    public static class HotBean {
        /**
         * code : 440300
         * name : 深圳
         * en : Shenzhen
         * districts : null
         */

        private String code;
        private String name;
        private String en;
        private Object districts;
    }
}

package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
    @Data
    public class CoverBean {
        /**
         * avg_color : #B1CCA3
         * uri : tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4
         * url_list : ["http://p1-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-large.webp","http://p3-hs.byteimg.com/img/tos-cn-p-0015/e904da5cd6c44d67b22e53e083c6d7f4~tplv-hs-large.webp"]
         */

        private String avg_color;
        private String uri;
        private List<String> url_list;
    }

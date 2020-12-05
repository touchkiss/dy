package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 21:58
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class HotsearchBrandCategoryResponse extends BaseResponse{

    /**
     * banner_url : {"uri":"daa7000a0f0d6a308320","url_list":["https://p9-dy.byteimg.com/obj/daa7000a0f0d6a308320?from=3158387923","https://p29-dy.byteimg.com/obj/daa7000a0f0d6a308320?from=3158387923","https://p6-dy-ipv6.byteimg.com/obj/daa7000a0f0d6a308320?from=3158387923"]}
     * category_list : [{"id":1,"name":"汽车"},{"id":2,"name":"手机"},{"id":3,"name":"美妆"},{"id":4,"name":"奢侈品"},{"id":5,"name":"食品饮料"},{"id":6,"name":"家用电器"},{"id":7,"name":"服饰鞋帽"},{"id":9,"name":"母婴"},{"id":10,"name":"日化"}]
     * extra : {"now":1607176669000,"fatal_item_ids":[],"logid":"2020120521574901014406208034BA1971"}
     * status_code : 0
     */

    private CoverBean banner_url;
    private List<CategoryListBean> category_list;


    @NoArgsConstructor
    @Data
    public static class CategoryListBean {
        /**
         * id : 1
         * name : 汽车
         */

        private int id;
        private String name;
    }
}

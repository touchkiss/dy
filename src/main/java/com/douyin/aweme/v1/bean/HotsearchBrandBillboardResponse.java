package com.douyin.aweme.v1.bean;

import com.huoshan.bean.response.CoverBean;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 22:08
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class HotsearchBrandBillboardResponse extends BaseResponse{

    /**
     * status_code : 0
     * banner_url : {"uri":"daa7000a0f0d6a308320","url_list":["https://p3-dy-ipv6.byteimg.com/obj/daa7000a0f0d6a308320?from=3158387923","https://p6-dy-ipv6.byteimg.com/obj/daa7000a0f0d6a308320?from=3158387923","https://p29-dy.byteimg.com/obj/daa7000a0f0d6a308320?from=3158387923"]}
     * weekly_info : {"serial":4,"start_date":"2020-11-22","end_date":"2020-11-28","last_updated_date":"2020-12-01","is_current":false}
     * brand_list : [{"heat_diff":12,"is_in_webcasting":false,"name":"高露洁","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b"]},"rank_diff":0,"interactive_tag_type":0,"explain_tag_desc":"","bluev_uid":"94054716109","bluev_sec_uid":"MS4wLjABAAAAv2Tg7jQzQnjXBsLsRfH814hmOHkq82s3jWxp2M4x7YM","id":1094445,"heat":928,"rank":1},{"heat_diff":-9,"interactive_tag_type":0,"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/87d3271b6948d5e8","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/87d3271b6948d5e8"]},"name":"舒肤佳","heat":883,"rank":2,"rank_diff":0,"explain_tag_desc":"","is_in_webcasting":false,"bluev_uid":"108264563069","id":1094459,"bluev_sec_uid":"MS4wLjABAAAASEA9Js-ghcGkKW6bmi46D48uu9pVoWK2P4bxCpEi3z0"},{"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f5751a36e6fe40f5","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f5751a36e6fe40f5"]},"heat":852,"rank_diff":22,"explain_tag_desc":"","is_in_webcasting":false,"bluev_uid":"72808973566","id":1094579,"name":"苏菲","rank":3,"heat_diff":111,"interactive_tag_type":0,"bluev_sec_uid":"MS4wLjABAAAAELII3kGvXzL74ILTMq2qo0KNPWBtVhUlRrzJEELAi4Y"},{"id":1133553,"rank":4,"rank_diff":0,"heat_diff":-8,"is_in_webcasting":false,"bluev_uid":"0","bluev_sec_uid":"MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ","name":"KONO","logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5420a4509b4ec9d0"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5420a4509b4ec9d0"},"heat":844,"interactive_tag_type":0,"explain_tag_desc":""},{"id":1094515,"rank_diff":0,"is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAANwkJuWIRFOzg5uCpDRpMj4OX-QryoDgn-yYlXQnRwQQ","heat_diff":-22,"interactive_tag_type":0,"explain_tag_desc":"","bluev_uid":"0","name":"清风","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/8ec8bf9fee25008e","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/8ec8bf9fee25008e"]},"heat":827,"rank":5},{"rank":6,"rank_diff":1,"heat_diff":-36,"interactive_tag_type":0,"bluev_uid":"98681892258","bluev_sec_uid":"MS4wLjABAAAAP7xViIsiGYsaOdMOj-5ndCpXjSF5UImPdnlI2OvNd7Q","name":"黑人牙膏","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/19132bea6edf54b3","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/19132bea6edf54b3"]},"explain_tag_desc":"","is_in_webcasting":false,"id":1094498,"heat":789},{"id":9640,"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/c6a93746788214e2","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/c6a93746788214e2"]},"heat":787,"interactive_tag_type":0,"is_in_webcasting":false,"bluev_uid":"102423832982","bluev_sec_uid":"MS4wLjABAAAAXCP11bD_8b7Y_3-vxn27YH1gzpMYQdK0t0Ee4QQJrP8","name":"蓝月亮","rank":7,"rank_diff":-4,"heat_diff":-99,"explain_tag_desc":""},{"is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAAGaXlCYL7W8vnitubzyZD-f8cvJXts711-EuPvG5OgoM","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/fb05c89952fc0c22","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/fb05c89952fc0c22"]},"heat":785,"heat_diff":40,"explain_tag_desc":"","interactive_tag_type":0,"bluev_uid":"94817956125","id":1094444,"name":"满婷","rank":8,"rank_diff":16},{"heat_diff":184,"interactive_tag_type":0,"explain_tag_desc":"","is_in_webcasting":false,"name":"心相印","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E5%BF%83%E7%9B%B8%E5%8D%B0.jpg","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E5%BF%83%E7%9B%B8%E5%8D%B0.jpg"]},"heat":783,"rank":9,"bluev_uid":"60477253789","id":1264021,"rank_diff":39,"bluev_sec_uid":"MS4wLjABAAAA0eIm7x0ad7IyiFBC9joUxEvqpxQ51gEcRP1mmRrGjtM"},{"heat_diff":-54,"interactive_tag_type":0,"explain_tag_desc":"","is_in_webcasting":false,"bluev_uid":"75956112409","bluev_sec_uid":"MS4wLjABAAAAJ3RUL0oHh3avwnx9F4xmZn2rUZXSubCdErGgtNwyIJ0","id":885708,"rank_diff":-3,"heat":771,"rank":10,"name":"施华蔻","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/70f6f82317c23bef","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/70f6f82317c23bef"]}},{"id":1327248,"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/e0de51bfabd878c8","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/e0de51bfabd878c8"]},"rank_diff":3,"is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAArfOLFT4BWbwHzNNs_fc_DBujufKWDe-aoaESKOpsyPU","name":"凡士林","heat":763,"rank":11,"heat_diff":-21,"interactive_tag_type":0,"explain_tag_desc":"","bluev_uid":"60662084273"},{"id":1094580,"name":"云南白药牙膏","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E4%BA%91%E5%8D%97%E7%99%BD%E8%8D%AF%E7%89%99%E8%86%8F.jpg","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E4%BA%91%E5%8D%97%E7%99%BD%E8%8D%AF%E7%89%99%E8%86%8F.jpg"]},"rank":12,"explain_tag_desc":"","bluev_uid":"97299015579","heat":760,"rank_diff":26,"heat_diff":93,"interactive_tag_type":0,"is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAA8UboD_7NBUX94XJu1ev_cTn2vc9CCOn6xCK68WWRvkM"},{"name":"立白","rank":13,"heat":746,"rank_diff":10,"heat_diff":-2,"interactive_tag_type":0,"explain_tag_desc":"","is_in_webcasting":false,"id":1094492,"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/0c4fd3a27017db7a","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/0c4fd3a27017db7a"]},"bluev_uid":"97344319913","bluev_sec_uid":"MS4wLjABAAAAgHFuYXb4lMa9RkKcdYa69VtZsc3NrVh0ldF0b3NR1p4"},{"bluev_uid":"56920340056","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/bd977d5be0f30497","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/bd977d5be0f30497"]},"heat":745,"rank":14,"heat_diff":-57,"interactive_tag_type":0,"is_in_webcasting":false,"id":21113,"name":"隆力奇","rank_diff":-4,"explain_tag_desc":"","bluev_sec_uid":"MS4wLjABAAAA3VGDG0WTscOGeB4YIoGdu0XdA_QfvCbf3OOuYjct_Z8"},{"explain_tag_desc":"","is_in_webcasting":false,"bluev_uid":"96008589130","heat":744,"rank":15,"rank_diff":4,"heat_diff":-20,"interactive_tag_type":0,"bluev_sec_uid":"MS4wLjABAAAAlWSXrAUj0v-rGervjDZcjE6IKaR5XWH_0xsHbUbCQcY","id":1094534,"name":"金纺","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/a61f8cdcde84229c","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/a61f8cdcde84229c"]}},{"id":1094532,"rank":16,"interactive_tag_type":0,"is_in_webcasting":false,"bluev_uid":"97823254229","bluev_sec_uid":"MS4wLjABAAAAiFjVqRU3McvhPiryzCSeJGx9LeEyoppc_32lB9fvpqY","name":"奥妙","logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E5%A5%A5%E5%A6%99logo.jpg"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E5%A5%A5%E5%A6%99logo.jpg"},"heat":743,"rank_diff":-3,"heat_diff":-43,"explain_tag_desc":""},{"heat":741,"heat_diff":-11,"interactive_tag_type":0,"explain_tag_desc":"","is_in_webcasting":false,"bluev_uid":"105266026395","id":1094485,"name":"飘柔","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/9fd107294737bf9d","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/9fd107294737bf9d"]},"rank":17,"rank_diff":4,"bluev_sec_uid":"MS4wLjABAAAA7TVJhMbqswSd37jytIbBCfvHLyjRGtsjBTwGpoZW9VQ"},{"heat":735,"rank_diff":8,"interactive_tag_type":0,"bluev_sec_uid":"MS4wLjABAAAA6NGBW8ASHOZFnlcMniefaDomZ83pfnmrRmPbpUs8jUc","name":"汰渍","logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5376bf1053f13576"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5376bf1053f13576"},"heat_diff":-3,"explain_tag_desc":"","is_in_webcasting":false,"bluev_uid":"97917547121","id":1094489,"rank":18},{"name":"力士","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/260955797edde5de","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/260955797edde5de"]},"rank":19,"interactive_tag_type":0,"explain_tag_desc":"","bluev_uid":"2000740698037448","id":1094535,"heat":730,"rank_diff":-13,"heat_diff":-109,"is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAAwax51e1NV32I-V92rb-g2g3pSBE2qLPKVfzrja1iKNWOyRt0ZU4Gn87V0Hfy-2nP"},{"name":"欧乐B","logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/8925e3231daebacd"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/8925e3231daebacd"},"rank":20,"interactive_tag_type":0,"id":1094457,"heat":726,"rank_diff":-11,"heat_diff":-81,"explain_tag_desc":"","is_in_webcasting":false,"bluev_uid":"88180271385","bluev_sec_uid":"MS4wLjABAAAAA_tSZbzYnuamF1pxI4U1TT_pR_7NA9vbHE-Eo0GcVxw"},{"explain_tag_desc":"","bluev_uid":"98780334538","name":"好爸爸","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5567f4f9bb2b3831","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5567f4f9bb2b3831"]},"heat":724,"rank_diff":-9,"heat_diff":-64,"id":1094493,"rank":21,"interactive_tag_type":0,"is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAAvV-WTTtVQf8zwzAJ3RcV_0hyd4Kr0sXfLew_gRzG-TM"},{"name":"高洁丝","rank":21,"heat_diff":19,"interactive_tag_type":0,"bluev_uid":"96949817991","bluev_sec_uid":"MS4wLjABAAAA9PWhD7X_Okr4wGScRjecvgV_s84XetCShogQHtDEPU0","id":1094512,"logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E9%AB%98%E6%B4%81%E4%B8%9D.jpg"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E9%AB%98%E6%B4%81%E4%B8%9D.jpg"},"heat":724,"rank_diff":12,"explain_tag_desc":"","is_in_webcasting":false},{"id":1264035,"name":"冰泉","heat":719,"rank_diff":-3,"interactive_tag_type":0,"bluev_uid":"87198529994","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/a8244e1a06047273","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/a8244e1a06047273"]},"rank":23,"heat_diff":-34,"explain_tag_desc":"","is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAAJUmbnCHbwtfhh228kwOHRR3n5IR-qC7Re63_EsLBhDo"},{"rank_diff":4,"heat_diff":-10,"bluev_uid":"101525016604","bluev_sec_uid":"MS4wLjABAAAAXzH-nOW6RA_Ll6qVfqFJWWjhfiy5-LcBlx10k1JHd9w","id":1133561,"name":"TTOUCHME","logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/ed6dfd7b8214488d"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/ed6dfd7b8214488d"},"rank":24,"heat":718,"interactive_tag_type":0,"explain_tag_desc":"","is_in_webcasting":false},{"explain_tag_desc":"","bluev_uid":"101244411191","bluev_sec_uid":"MS4wLjABAAAAxjyX8X7nppWHRpsNqkfIdmFnYh3iaH0TR7CVqtQg9YM","heat":717,"rank_diff":-14,"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/1e388b54c06f3564","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/1e388b54c06f3564"]},"rank":25,"heat_diff":-73,"interactive_tag_type":0,"is_in_webcasting":false,"id":1094536,"name":"清扬"},{"id":1094442,"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E5%AE%89%E5%88%A9.jpg","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/%E5%AE%89%E5%88%A9.jpg"]},"heat":703,"heat_diff":-8,"explain_tag_desc":"","is_in_webcasting":false,"name":"安利","rank":26,"rank_diff":5,"interactive_tag_type":0,"bluev_uid":"94950564462","bluev_sec_uid":"MS4wLjABAAAAWLi-CF0SSf54mB1--VqmgPZDiLZ5d_brdO9DczkGiT8"},{"logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/12a386f1a8129230","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/12a386f1a8129230"]},"heat":701,"rank":27,"rank_diff":-12,"heat_diff":-82,"bluev_uid":"99748099044","id":1094484,"interactive_tag_type":0,"explain_tag_desc":"","is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAAn1jyJgK9nt9WC5Hl_w24gpOgke7Isrq5Co0H0eJ-iHg","name":"潘婷"},{"bluev_sec_uid":"MS4wLjABAAAAgQWDVKiJeNx_S7zp3oJc9u7SAaMsh1PEKzhr7oB4VXs","logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/cbe1a5c7598c072c"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/cbe1a5c7598c072c"},"is_in_webcasting":false,"heat":698,"rank":28,"rank_diff":1,"heat_diff":-23,"interactive_tag_type":0,"explain_tag_desc":"","id":1264024,"name":"维达","bluev_uid":"99626017016"},{"heat_diff":-89,"bluev_uid":"95920681573","bluev_sec_uid":"MS4wLjABAAAASXsWsboioS9j1Y38NbVOmj1a45SZ7scE9OSLZpSG4-s","logo_url":{"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5376c5c30fefabca","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/5376c5c30fefabca"]},"heat":687,"rank":29,"rank_diff":-12,"interactive_tag_type":0,"explain_tag_desc":"","is_in_webcasting":false,"id":1094482,"name":"海飞丝"},{"bluev_uid":"97693455364","heat_diff":-93,"interactive_tag_type":0,"explain_tag_desc":"","heat":682,"rank":30,"rank_diff":-12,"is_in_webcasting":false,"bluev_sec_uid":"MS4wLjABAAAAEjygcba002fy9m2rQGl_L-rZnsmLR2wZzWCaX6cmBt0","id":1094458,"name":"佳洁士","logo_url":{"url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/93b270c079e2b5f6"],"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/93b270c079e2b5f6"}}]
     * banners : [{"track_url_list":null,"click_track_url_list":null}]
     * extra : {"logid":"2020120521574901014404020601B9A7F7","now":1607176669000,"fatal_item_ids":[]}
     */

    private CoverBean banner_url;
    private WeeklyInfoBean weekly_info;
    private List<BrandListBean> brand_list;
    private List<BannersBean> banners;


    @NoArgsConstructor
    @Data
    public static class WeeklyInfoBean {
        /**
         * serial : 4
         * start_date : 2020-11-22
         * end_date : 2020-11-28
         * last_updated_date : 2020-12-01
         * is_current : false
         */

        private int serial;
        private String start_date;
        private String end_date;
        private String last_updated_date;
        private boolean is_current;
    }

    @NoArgsConstructor
    @Data
    public static class BrandListBean {
        /**
         * heat_diff : 12
         * is_in_webcasting : false
         * name : 高露洁
         * logo_url : {"uri":"https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b","url_list":["https://sf1-hscdn-tos.pstatp.com/obj/ad-count-platform/f56342332997d05b"]}
         * rank_diff : 0
         * interactive_tag_type : 0
         * explain_tag_desc :
         * bluev_uid : 94054716109
         * bluev_sec_uid : MS4wLjABAAAAv2Tg7jQzQnjXBsLsRfH814hmOHkq82s3jWxp2M4x7YM
         * id : 1094445
         * heat : 928
         * rank : 1
         */

        private int heat_diff;
        private boolean is_in_webcasting;
        private String name;
        private CoverBean logo_url;
        private int rank_diff;
        private int interactive_tag_type;
        private String explain_tag_desc;
        private String bluev_uid;
        private String bluev_sec_uid;
        private int id;
        private int heat;
        private int rank;
    }

    @NoArgsConstructor
    @Data
    public static class BannersBean {
        /**
         * track_url_list : null
         * click_track_url_list : null
         */

        private Object track_url_list;
        private Object click_track_url_list;
    }
}

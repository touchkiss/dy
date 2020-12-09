package com.touchkiss.dy.utils;

import com.google.gson.Gson;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/**
 * Created on 2020/12/08 12:40
 *
 * @author Touchkiss
 */
public class ProxyUtil {
    private volatile static long lastUpdate = 0L;
    private static Proxy proxy = null;

    public static Proxy getProxy() {
        if (System.currentTimeMillis() > lastUpdate) {
            synchronized (ProxyUtil.class) {
                if (System.currentTimeMillis() > lastUpdate) {
                    proxy = null;
                    try {
                        String response = HttpUtil.get("http://httpbapi.dobel.cn/User/getIp?account=JQQEFAUSm9p11rCa&accountKey=C22aa9x0QTmA&num=1&cityId=all");
                        System.out.println(response);
                        if (StringUtils.isNotBlank(response)) {
                            ProxyResponse proxyResponse = new Gson().fromJson(response, ProxyResponse.class);
                            if (proxyResponse != null && !CollectionUtils.isEmpty(proxyResponse.getData())) {
                                ProxyResponse.DataBean dataBean = proxyResponse.getData().get(0);
                                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(dataBean.getIp(), Integer.parseInt(dataBean.getPort())));
                                lastUpdate = System.currentTimeMillis() + (Integer.parseInt(dataBean.getLeft_time().replace("s", "")) * 1000) - 1000;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("获取代理失败");
                    }
                }
            }
        }
        return proxy;
    }

    @NoArgsConstructor
    @Data
    public static class ProxyResponse {

        /**
         * code : 200
         * msg : success
         * data : [{"ip":"117.95.26.37","port":"45075","left_time":"360s","city":"广州"},{"ip":"121.16.133.111","port":"45085","left_time":"360s","city":"邯郸"},{"ip":"119.249.45.102","port":"45094","left_time":"360s","city":"杭州"},{"ip":"101.21.108.84","port":"45075","left_time":"360s","city":"衡阳"}]
         */

        private String code;
        private String msg;
        private List<DataBean> data;

        @NoArgsConstructor
        @Data
        public static class DataBean {
            /**
             * ip : 117.95.26.37
             * port : 45075
             * left_time : 360s
             * city : 广州
             */

            private String ip;
            private String port;
            private String left_time;
            private String city;
        }
    }
}

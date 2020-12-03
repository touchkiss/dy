package com.touchkiss.dy.utils;

import cn.hutool.http.HttpRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.TextUtils;

import java.io.IOException;
import java.util.*;

/**
 * Created on 2020/11/28 9:50
 *
 * @author Touchkiss
 */
public class XGorgonUtil_V036 {
    private static final String NULL_MD5_STRING = "00000000000000000000000000000000";

    private static String byteTable1 =
            "D6 28 3B 71 70 76 BE 1B A4 FE 19 57 5E 6C BC 21 B2 14 37 " +
                    "7D 8C A2 FA 67 55 6A 95 E3 FA 67 78 ED 8E 55 33 " +
                    "89 A8 CE 36 B3 5C D6 B2 6F 96 C4 34 B9 6A EC 34 " +
                    "95 C4 FA 72 FF B8 42 8D FB EC 70 F0 85 46 D8 B2 " +
                    "A1 E0 CE AE 4B 7D AE A4 87 CE E3 AC 51 55 C4 36 " +
                    "AD FC C4 EA 97 70 6A 85 37 6A C8 68 FA FE B0 33 " +
                    "B9 67 7E CE E3 CC 86 D6 9F 76 74 89 E9 DA 9C 78 " +
                    "C5 95 AA B0 34 B3 F2 7D B2 A2 ED E0 B5 B6 88 95 " +
                    "D1 51 D6 9E 7D D1 C8 F9 B7 70 CC 9C B6 92 C5 FA " +
                    "DD 9F 28 DA C7 E0 CA 95 B2 DA 34 97 CE 74 FA 37 " +
                    "E9 7D C4 A2 37 FB FA F1 CF AA 89 7D 55 AE 87 BC " +
                    "F5 E9 6A C4 68 C7 FA 76 85 14 D0 D0 E5 CE FF 19 " +
                    "D6 E5 D6 CC F1 F4 6C E9 E7 89 B2 B7 AE 28 89 BE " +
                    "5E DC 87 6C F7 51 F2 67 78 AE B3 4B A2 B3 21 3B " +
                    "55 F8 B3 76 B2 CF B3 B3 FF B3 5E 71 7D FA FC FF " +
                    "A8 7D FE D8 9C 1B C4 6A F9 88 B5 E5";

    private static byte[] strToByte(String str) {
        int i = 0;
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        while (i < length) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            i += 2;
        }
        return bArr;
    }

    private static ArrayList<String> input(long timeMillis, byte[] inputBytes) {
        ArrayList<String> byteTable = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (inputBytes[i] < 0) {
                byteTable.add(Integer.toHexString(inputBytes[i]).substring(6));
            } else {
                byteTable.add(Integer.toHexString(inputBytes[i]));
            }
        }
        for (int i = 0; i < 4; i++) {
            byteTable.add("0");
        }
        for (int i = 32; i < 36; i++) {
            if (inputBytes[i] < 0) {
                byteTable.add(Integer.toHexString(inputBytes[i]).substring(6));
            } else {
                byteTable.add(Integer.toHexString(inputBytes[i]));
            }
        }
        for (int i = 0; i < 4; i++) {
            byteTable.add("0");
        }
        String timeByte = Long.toHexString(timeMillis);
        for (int i = 0; i < 4; i++) {
            byteTable.add(timeByte.substring(2 * i, 2 * i + 2));
        }
        return byteTable;
    }

    private static ArrayList<String> initialize(ArrayList<String> data) {
        int hex = 0;
        String[] byteTable2 = byteTable1.split(" ");
        for (int i = 0; i < data.size(); i++) {
            int hex1;
            if (i == 0) {
                hex1 = Integer.valueOf(byteTable2[Integer.valueOf(byteTable2[0], 16) - 1], 16);
                byteTable2[i] = Integer.toHexString(hex1);
            } else if (i == 1) {
                int temp = Integer.valueOf("D6", 16) + Integer.valueOf("28", 16);
                if (temp > 256) {
                    temp -= 256;
                }
                hex1 = Integer.valueOf(byteTable2[temp - 1], 16);
                hex = temp;
                byteTable2[i] = Integer.toHexString(hex1);
            } else {
                int temp = hex + Integer.valueOf(byteTable2[i], 16);
                if (temp > 256) {
                    temp -= 256;
                }
                hex1 = Integer.valueOf(byteTable2[temp - 1], 16);
                hex = temp;
                byteTable2[i] = Integer.toHexString(hex1);
            }
            if (hex1 * 2 > 256) {
                hex1 = hex1 * 2 - 256;
            } else {
                hex1 = hex1 * 2;
            }

            String hex2 = byteTable2[hex1 - 1];
            int result = Integer.valueOf(hex2, 16) ^ Integer.valueOf(data.get(i), 16);
            data.set(i, Integer.toHexString(result));
        }
        return data;
    }

    private static ArrayList<String> handle(ArrayList<String> data) {
        for (int i = 0; i < data.size(); i++) {
            String byte1 = data.get(i);
            if (byte1.length() < 2) {
                byte1 += "0";
            } else {
                byte1 = data.get(i).split("")[1] + data.get(i).split("")[0];
            }
            if (i < data.size() - 1) {
                byte1 = Integer.toHexString(Integer.valueOf(byte1, 16) ^ Integer.valueOf(data.get(i + 1), 16));
            } else {
                byte1 = Integer.toHexString(Integer.valueOf(byte1, 16) ^ Integer.valueOf(data.get(0), 16));
            }
            int byte2 = ((Integer.valueOf(byte1, 16) & Integer.valueOf("55", 16)) * 2) | ((Integer.valueOf(byte1, 16) & Integer.valueOf("AA", 16)) / 2);
            byte2 = ((byte2 & Integer.valueOf("33", 16)) * 4) | ((byte2 & Integer.valueOf("CC", 16)) / 4);
            String byte3 = Integer.toHexString(byte2);
            if (byte3.length() > 1) {
                byte3 = byte3.split("")[1] + byte3.split("")[0];
            } else {
                byte3 += "0";
            }
            int byte4 = Integer.valueOf(byte3, 16) ^ Integer.valueOf("FF", 16);
            byte4 = byte4 ^ Integer.valueOf("14", 16);
            data.set(i, Integer.toHexString(byte4));
        }
        return data;
    }

    public static String xGorgon(long timeSeconds, String params, String stub, String cookie) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(params)) {
            sb.append(NULL_MD5_STRING);
        } else {
            sb.append(MD5Util.MD5(params).toLowerCase());
        }
        if (TextUtils.isEmpty(stub)) {
            sb.append(NULL_MD5_STRING);
        } else {
            sb.append(stub);
        }
        if (TextUtils.isEmpty(cookie)) {
            sb.append(NULL_MD5_STRING);
        } else {
            sb.append(MD5Util.MD5(cookie).toLowerCase());
        }
        /*
        if (TextUtils.isEmpty(sessionid)) {
            sb.append(NULL_MD5_STRING);
        } else {
            sb.append(encryption(sessionid).toLowerCase());
        }*/
        int index = cookie.indexOf("sessionid=");
        if (index == -1) {
            sb.append(NULL_MD5_STRING);
        } else {
            String sessionid = StringUtils.substringBetween(cookie, "sessionid=", ";");
            if (sessionid == null) {//sessionid在cookie字符串中的最后
                sessionid = cookie.substring(index + 10);
            }
            sb.append(MD5Util.MD5(sessionid).toLowerCase());
        }
        return xGorgon(timeSeconds, strToByte(sb.toString()));
    }

    private static String xGorgon(long timeSeconds, byte[] inputBytes) {
        ArrayList<String> data1 = new ArrayList<>();
        data1.add("3");
        data1.add("61");
        data1.add("41");
        data1.add("10");
        data1.add("80");
        data1.add("0");

        ArrayList<String> data2 = input(timeSeconds, inputBytes);
        data2 = initialize(data2);
        data2 = handle(data2);
        data1.addAll(data2);

        StringBuilder xGorgonStr = new StringBuilder();
        for (String temp : data1) {
            if (temp.length() > 1) {
                xGorgonStr.append(temp);
            } else {
                xGorgonStr.append("0");
                xGorgonStr.append(temp);
            }
        }
        return xGorgonStr.toString();
    }

    public static void main(String[] args) throws IOException {
        userInfo();
    }
    public static void test1() throws IOException {
        long time = System.currentTimeMillis();
        int ts = (int) (time / 1000);
        String _rticket = time + "";
        String sessionid = "";
        String url = "https://aweme.snssdk.com/aweme/v1/aweme/post/?source=0&max_cursor=0&sec_user_id=MS4wLjABAAAA07Z6fx4H67g7rmBuEuwm22zLnyT3J0MaSEQBWETiHQY&count=20&manifest_version_code=960&_rticket=" + time + "&app_type=normal&iid=3781959390083272&channel=ame_xiaomi2020_960_yz1&device_type=Redmi%20Note%208%20Pro&language=zh&resolution=1080*2134&openudid=ce348c6bf7df0427&update_version_code=9603&cdid=e1e64752-cc73-46a6-8970-737a9de1ac2d&os_api=29&dpi=440&oaid=6292668db7e5f1fc&ac=wifi&device_id=1213500227850904&mcc_mnc=46001&os_version=10&version_code=960&app_name=aweme&version_name=9.6.0&device_brand=Redmi&ssmix=a&device_platform=android&aid=1128&ts=" + ts;
        String params = url.substring(url.indexOf("?") + 1);
        //String STUB = encryption(k).toUpperCase();
        String STUB = "";
        String cookies = "install_id=3781959390083272; ttreq=1$b2365398a1b270726a7449a9e5726fb77b3a933b; passport_csrf_token=4ca844986452ffb906378e1f7f64d859; tt_webid=7e2f785ca563711a4a18b9276a3f7995; d_ticket=1328caa6b68eef3234a4d4e414961c054b35e; odin_tt=58f8443fd9b8a8aea36060d16afd68c65408ee8869594cc678371ba82274678d2dbb09b025fb1dc71d62e4c163a802bc; n_mh=PjgrtMhiMQmV7JQBs0RKGVADgQNqOE32NJPwi5Si1Bs; sid_guard=6d0a78a13a0df1a6a40dbc0f3ac4c38c%7C1606459653%7C5184000%7CTue%2C+26-Jan-2021+06%3A47%3A33+GMT; uid_tt=9a6548a5904f3c302966550eea0389a3; uid_tt_ss=9a6548a5904f3c302966550eea0389a3; sid_tt=6d0a78a13a0df1a6a40dbc0f3ac4c38c; sessionid=6d0a78a13a0df1a6a40dbc0f3ac4c38c; sessionid_ss=6d0a78a13a0df1a6a40dbc0f3ac4c38c";
//        String Gorgon = xGorgon(ts,params, STUB, cookies);
        String Gorgon = xGorgon(ts, params, STUB, cookies);
//        String Gorgon = "0361411080008910015cb51fbeced734655bb996c44540b7c705";
        System.err.println("Gorgon=" + Gorgon);
        System.err.println(url);

        long ticket = time;
        System.err.println("ts             =" + ts);
        System.err.println("time           =" + time);
        System.err.println("X-SS-REQ-TICKET=" + time);
        System.err.println("X-Khronos      =" + ts);
        String body = "keyword=%E7%AE%B1%E5%AD%90%E7%B2%BE%E9%80%89%E7%94%B5%E5%BD%B1&offset=0&count=20&is_pull_refresh=0&search_source=search_history&hot_search=0&latitude=31.247221&longitude=121.492479&search_id=&query_correct_type=1&mac_address=d6%3Af5%3A35%3A8d%3A46%3A4e&is_filter_search=0&sort_type=0&publish_time=0&disable_synthesis=0&multi_mod=0&single_filter_aladdin=0";
        List<Header> headers = new ArrayList<>();
        headers.add(new BasicHeader("X-Gorgon", Gorgon));
        headers.add(new BasicHeader("X-Khronos", String.valueOf(ts)));
        headers.add(new BasicHeader("sdk-version", "1"));
        headers.add(new BasicHeader("Accept-Encoding", "gzip"));
//        headers.add(new BasicHeader("X-SS-REQ-TICKET",String.valueOf(time)));
        String md5 = MD5Util.MD5(body);
        System.out.println(md5);
//        headers.add(new BasicHeader("X-SS-STUB", md5));
        headers.add(new BasicHeader("User-Agent", "ttnet okhttp/3.10.0.2"));
        headers.add(new BasicHeader("Host", "aweme-lq.snssdk.com"));
        headers.add(new BasicHeader("Cookie", cookies));
        headers.add(new BasicHeader("Connection", "Keep-Alive"));
//
        String json = HttpUtil.get(url, HttpUtil.DEFAULT_CONNECT_TIMEOUT, HttpUtil.DEFAULT_SOCKET_TIMEOUT, "UTF-8", headers);
        System.err.println(json);
        System.out.println(Gorgon);
    }
    public static void hutool() {
        long time = System.currentTimeMillis();
        long ts = time / 1000;
        String url="https://aweme.snssdk.com/aweme/v1/user/profile/other/?sec_user_id=MS4wLjABAAAAp7gY2-GV8dVp-lC0_1ZVOlw-d0HE5vM9cPgXVZVqQp8&address_book_access=1&from=0&manifest_version_code=960&_rticket="+System.currentTimeMillis()+"&app_type=normal&iid=3781959390083272&channel=ame_xiaomi2020_960_yz1&device_type=Redmi%20Note%208%20Pro&language=zh&resolution=1080*2134&openudid=ce348c6bf7df0427&update_version_code=9603&cdid=e1e64752-cc73-46a6-8970-737a9de1ac2d&os_api=29&dpi=440&oaid=6292668db7e5f1fc&ac=wifi&device_id=1213500227850904&mcc_mnc=46001&os_version=10&version_code=960&app_name=aweme&version_name=9.6.0&device_brand=Redmi&ssmix=a&device_platform=android&aid=1128&ts="+System.currentTimeMillis()/1000;
        String cookie = "install_id=3781959390083272; ttreq=1$b2365398a1b270726a7449a9e5726fb77b3a933b; passport_csrf_token=4ca844986452ffb906378e1f7f64d859; tt_webid=7e2f785ca563711a4a18b9276a3f7995; d_ticket=1328caa6b68eef3234a4d4e414961c054b35e; odin_tt=58f8443fd9b8a8aea36060d16afd68c65408ee8869594cc678371ba82274678d2dbb09b025fb1dc71d62e4c163a802bc; n_mh=PjgrtMhiMQmV7JQBs0RKGVADgQNqOE32NJPwi5Si1Bs; sid_guard=6d0a78a13a0df1a6a40dbc0f3ac4c38c%7C1606459653%7C5184000%7CTue%2C+26-Jan-2021+06%3A47%3A33+GMT; uid_tt=9a6548a5904f3c302966550eea0389a3; uid_tt_ss=9a6548a5904f3c302966550eea0389a3; sid_tt=6d0a78a13a0df1a6a40dbc0f3ac4c38c; sessionid=6d0a78a13a0df1a6a40dbc0f3ac4c38c; sessionid_ss=6d0a78a13a0df1a6a40dbc0f3ac4c38c";
        Map<String, List<String>> headers=new HashMap<>();
        headers.put("Accept-Encoding", Collections.singletonList("gzip"));
        headers.put("X-SS-REQ-TICKET", Collections.singletonList(String.valueOf(System.currentTimeMillis())));
        headers.put("sdk-version", Collections.singletonList("1"));
        headers.put("x-tt-token", Collections.singletonList("006d0a78a13a0df1a6a40dbc0f3ac4c38c041994ea3850b92a09b3f58c4d0349186c3571b048c53f38c7d1d73df817033fd812dfa945afa9c170acf5cf073cfb71f07a3053b76c41146b29f1e40a5ac274001"));
        headers.put("X-Khronos", Collections.singletonList(String.valueOf(System.currentTimeMillis()/1000)));
        String xGorgon = xGorgon(System.currentTimeMillis() / 1000, url.substring(url.indexOf("?") + 1), "", cookie);
        System.out.println(xGorgon);
        headers.put("X-Gorgon", Collections.singletonList(xGorgon));
        headers.put("User-Agent", Collections.singletonList("okhttp/3.10.0.1"));
        headers.put("Host", Collections.singletonList("aweme.snssdk.com"));
        headers.put("Connection", Collections.singletonList("Keep-Alive"));
        HttpRequest get = cn.hutool.http.HttpUtil.createGet(url)
                .cookie(cookie)
                .header(headers,true);
        System.out.println(get.execute().body());
    }
    public static void userInfo() {
        long time = System.currentTimeMillis();
        long ts = time / 1000;
//        String url="https://aweme-eagle.snssdk.com/aweme/v1/user/?user_id=58814164483&retry_type=no_retry&mcc_mnc=46001&iid=175561601975351&device_id=1213500227850904&ac=wifi&channel=tianzhuo_dy_wifi1&aid=1128&app_name=aweme&version_code=421&version_name=4.2.1&device_platform=android&ssmix=a&device_type=Redmi+Note+8+Pro&device_brand=Redmi&language=zh&os_api=29&os_version=10&openudid=ce348c6bf7df0427&manifest_version_code=421&resolution=1080*2134&dpi=440&update_version_code=4212&_rticket="+time+"&ts="+ts+"&js_sdk_version=1.9.1&as=a1c5deec6b51cfbfe18444&cp=e51efe50bb17ccfae1_mMq&mas=012c4c4b856c5f4a202df3a753ff7508ef2c2c2c1c8ca6664666c6";
        String url="https://aweme-eagle.snssdk.com/aweme/v1/user/?sec_user_id=MS4wLjABAAAAT_y6U7R-QeZ4C2tpyzFHaUlwoKmZQGg0x9YCW15soh4&retry_type=no_retry&mcc_mnc=46001&iid=175561601975351&device_id=1213500227850904&ac=wifi&channel=tianzhuo_dy_wifi1&aid=1128&app_name=aweme&version_code=421&version_name=4.2.1&device_platform=android&ssmix=a&device_type=Redmi+Note+8+Pro&device_brand=Redmi&language=zh&os_api=29&os_version=10&openudid=ce348c6bf7df0427&manifest_version_code=421&resolution=1080*2134&dpi=440&update_version_code=4212&_rticket="+time+"&ts="+ts+"&js_sdk_version=1.9.1";
        String cookie = "install_id=175561601975351; ttreq=1$b58700d61faec314340a870b0ec82de5f1a0a4fa; odin_tt=a2a7581df5326b17c71dd091826bf564f05f91b5dafd4f08e4a7c0e7c8d7a3bacf410a5ff548cd09567c3703463a195bd90a2f0f51b9bd422caefbd362ec7eaa";
        Map<String, List<String>> headers=new HashMap<>();
        headers.put("Accept-Encoding", Collections.singletonList("gzip"));
        headers.put("X-SS-REQ-TICKET", Collections.singletonList(String.valueOf(System.currentTimeMillis())));
        headers.put("sdk-version", Collections.singletonList("1"));
//        headers.put("x-tt-token", Collections.singletonList("006d0a78a13a0df1a6a40dbc0f3ac4c38c041994ea3850b92a09b3f58c4d0349186c3571b048c53f38c7d1d73df817033fd812dfa945afa9c170acf5cf073cfb71f07a3053b76c41146b29f1e40a5ac274001"));
        headers.put("X-Khronos", Collections.singletonList(String.valueOf(System.currentTimeMillis()/1000)));
        String xGorgon = xGorgon(System.currentTimeMillis() / 1000, url.substring(url.indexOf("?") + 1), "", cookie);
        System.out.println(xGorgon);
        headers.put("X-Gorgon", Collections.singletonList(xGorgon));
        headers.put("User-Agent", Collections.singletonList("okhttp/3.10.0.1"));
        headers.put("Host", Collections.singletonList("aweme.snssdk.com"));
        headers.put("Connection", Collections.singletonList("Keep-Alive"));
        HttpRequest get = cn.hutool.http.HttpUtil.createGet(url)
                .cookie(cookie)
                .header(headers,true);
        System.out.println(get.execute().body());
    }
}

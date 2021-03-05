package com.touchkiss.dy.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.TextUtils;

import java.util.ArrayList;

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
}

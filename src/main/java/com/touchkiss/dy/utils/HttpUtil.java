package com.touchkiss.dy.utils;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.config.SocketConfig;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;

/**
 * Created on 2020/03/18 17:27
 *
 * @author Touchkiss
 */
public class HttpUtil {
    public final static int DEFAULT_CONNECT_TIMEOUT = 10 * 1000;
    public final static int DEFAULT_SOCKET_TIMEOUT = 10 * 1000;
    public final static String DEFAULT_CHARSET = "utf-8";
    public final static SocketConfig DEFAULT_SOCKET_CONFIG = SocketConfig.custom()
            .setSoKeepAlive(false)
            .setSoLinger(1)
            .setSoReuseAddress(true)
            .setSoTimeout(DEFAULT_SOCKET_TIMEOUT)
            .setTcpNoDelay(true)
            .build();
    private static HttpHost PROXY = null;

//    static {
//        PROXY = new HttpHost("192.168.8.67", 8087);
//    }

    public static String getRedirectUrl(String url) {
        HttpGet httpget = new HttpGet(url);
        HttpContext httpContext = new BasicHttpContext();
        try {
            CloseableHttpResponse response = getHttpClient().execute(httpget, httpContext);
            HttpHost targetHost = (HttpHost) httpContext.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
            HttpUriRequest realRequest = (HttpUriRequest) httpContext.getAttribute(HttpCoreContext.HTTP_REQUEST);
            return targetHost.toURI() + realRequest.getURI();

        } catch (Exception e) {

        }
        return url;
    }

    public static CloseableHttpClient getHttpClient() {
        return HttpClients.custom()
                .setConnectionTimeToLive(DEFAULT_CONNECT_TIMEOUT, TimeUnit.MILLISECONDS)
                .setDefaultSocketConfig(DEFAULT_SOCKET_CONFIG)
                .build();
    }

    public static String get(String url) throws IOException {
        return get(url, DEFAULT_CONNECT_TIMEOUT, DEFAULT_SOCKET_TIMEOUT, DEFAULT_CHARSET, null);
    }

    public static String get(String url, int connectTimeout, int socketTimeout, String charset, List<Header> headers) throws IOException {
        HttpGet httpget = new HttpGet(url);
        configAndHeaders(connectTimeout, socketTimeout, headers, httpget);
        return response(charset, getHttpClient().execute(httpget));
    }

    public static CloseableHttpResponse getResponse(String url, int connectTimeout, int socketTimeout, List<Header> headers) throws IOException {
        HttpGet httpget = new HttpGet(url);
        configAndHeaders(connectTimeout, socketTimeout, headers, httpget);
        return getHttpClient().execute(httpget);
    }

    public static String response(String charset, CloseableHttpResponse response) throws IOException {
        HttpEntity httpEntity = response.getEntity();
        return inputStream2String(httpEntity.getContent(), charset);
    }

    public static String post(String url) throws IOException {
        return post(url, "");
    }

    public static String post(String url, String body) throws IOException {
        return post(url, body, null);
    }

    public static String post(String url, Map params) throws IOException {
        return post(url, params, null);
    }

    public static String post(String url, String body, List<Header> headers) throws IOException {
        return post(url, DEFAULT_CONNECT_TIMEOUT, DEFAULT_SOCKET_TIMEOUT, DEFAULT_CHARSET, body, headers);
    }

    public static String post(String url, Map params, List<Header> headers) throws IOException {
        return post(url, DEFAULT_CONNECT_TIMEOUT, DEFAULT_SOCKET_TIMEOUT, DEFAULT_CHARSET, params, headers);
    }

    public static String post(String url, int connectTimeout, int socketTimeout, String charset, Map params, List<Header> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        if (params != null && params.size() > 0) {
            List<NameValuePair> pairs = new ArrayList<>();
            params.forEach((key, value) -> pairs.add(new BasicNameValuePair(key.toString(), value.toString())));
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(pairs, charset);
            httpPost.setEntity(formEntity);
        }
        configAndHeaders(connectTimeout, socketTimeout, headers, httpPost);
        return response(charset, getHttpClient().execute(httpPost));
    }

    public static CloseableHttpResponse postResponse(String url, int connectTimeout, int socketTimeout, String charset, Map params, List<Header> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        if (params != null && params.size() > 0) {
            List<NameValuePair> pairs = new ArrayList<>();
            params.forEach((key, value) -> pairs.add(new BasicNameValuePair(key.toString(), value.toString())));
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(pairs, charset);
            httpPost.setEntity(formEntity);
        }
        configAndHeaders(connectTimeout, socketTimeout, headers, httpPost);
        return getHttpClient().execute(httpPost);
    }

    private static void configAndHeaders(int connectTimeout, int socketTimeout, List<Header> headers, HttpRequestBase request) {
        RequestConfig.Builder builder = RequestConfig.custom()
                .setConnectTimeout(connectTimeout)
                .setSocketTimeout(socketTimeout);
        if (PROXY != null) {
            builder.setProxy(PROXY);
        }
        RequestConfig requestConfig = builder.build();
        request.setConfig(requestConfig);
        if (headers != null && headers.size() > 0) {
            headers.forEach(request::addHeader);
        }
    }

    public static String post(String url, int connectTimeout, int socketTimeout, String charset, String body, List<Header> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(body, Charset.forName(charset)));
        configAndHeaders(connectTimeout, socketTimeout, headers, httpPost);
        return response(charset, getHttpClient().execute(httpPost));
    }

    public static String inputStream2String(InputStream in, String charset) throws IOException {
//        return CharStreams.toString(new InputStreamReader(in, charset));
//        return new BufferedReader(new InputStreamReader(in, charset))
//                .lines().collect(Collectors.joining(System.lineSeparator()));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        String str = result.toString(charset);
        return str;
    }

    /**
     * @param inputByte 待解压缩的字节数组
     * @return 解压缩后的字节数组
     * @throws IOException
     */
    public static byte[] unDeflate(byte[] inputByte) {
        int len = 0;
        Inflater infl = new Inflater();
        infl.setInput(inputByte);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] outByte = new byte[1024];
        try {
            while (!infl.finished()) {
                // 解压缩并将解压缩后的内容输出到字节输出流bos中
                len = infl.inflate(outByte);
                if (len == 0) {
                    break;
                }
                bos.write(outByte, 0, len);
            }
            infl.end();
        } catch (Exception e) {
            //
            e.printStackTrace();
        } finally {
            try {
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bos.toByteArray();
    }

    public static byte[] unGzip(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try {
            GZIPInputStream ungzip = new GZIPInputStream(in);
            byte[] buffer = new byte[256];
            int n;
            while ((n = ungzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return out.toByteArray();
    }

    public static String toQueryString(Object obj) {
        Class<?> aClass = obj.getClass();
        List<Field> fields = new ArrayList<>(Arrays.asList(aClass.getDeclaredFields()));
        for (; ; ) {
            if (aClass.getSuperclass().getName().equals("java.lang.Object")) {
                break;
            } else {
                aClass = aClass.getSuperclass();
                fields.addAll(Arrays.asList(aClass.getDeclaredFields()));
            }
        }
        return fields.stream().map(field -> {
            field.setAccessible(true);
            try {
                return field.getName() + "=" + (field.get(obj) == null ? "" : field.get(obj).toString());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return "";
            }
        }).collect(Collectors.joining("&"));
    }
}

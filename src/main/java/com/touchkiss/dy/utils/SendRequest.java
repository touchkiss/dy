package com.touchkiss.dy.utils;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author Touchkiss
 * @date 7/19/18
 */
public class SendRequest {
    static String charset = "utf-8";
    static CloseableHttpClient httpClient;


    static {
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        cm.setMaxTotal(300);
        cm.setDefaultMaxPerRoute(20);
        cm.setDefaultMaxPerRoute(50);
        httpClient = HttpClients.custom().setConnectionManager(cm).build();
    }

    public static CloseableHttpResponse getResponse(String url, List<Header> headers) throws IOException {
        HttpGet httpget = new HttpGet(url);
        if (headers != null && headers.size() > 0) {
            for (Header header : headers) {
                httpget.addHeader(header);
            }
        }
        return httpClient.execute(httpget);
    }

    public static String sendGet(String url) throws IOException {
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        HttpPost httpPost=new HttpPost(url);
        HttpGet httpget = new HttpGet(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(50000).setConnectTimeout(50000).build();//设置请求和传输超时时间
        httpget.setConfig(requestConfig);
        CloseableHttpResponse response = httpClient.execute(httpget);
        HttpEntity httpEntity = response.getEntity();
        String resStr = EntityUtils.toString(httpEntity, charset);
        response.close();
        return resStr;
    }

    public static String sendGet(String url, int outtime) throws IOException {
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        HttpPost httpPost=new HttpPost(url);
        HttpGet httpget = new HttpGet(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(outtime).setConnectTimeout(outtime).build();//设置请求和传输超时时间
        httpget.setConfig(requestConfig);
        CloseableHttpResponse response = httpClient.execute(httpget);
        HttpEntity httpEntity = response.getEntity();
        String resStr = EntityUtils.toString(httpEntity, charset);
        response.close();
        return resStr;
    }

    public static String sendGet(String url, String charset) throws IOException {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpPost httpPost=new HttpPost(url);
        HttpGet httpget = new HttpGet(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(50000).setConnectTimeout(50000).build();//设置请求和传输超时时间
        httpget.setConfig(requestConfig);
        CloseableHttpResponse response = httpClient.execute(httpget);
        HttpEntity httpEntity = response.getEntity();
        String resStr = EntityUtils.toString(httpEntity, charset);
        response.close();
        return resStr;
    }

    public static String sendGet(String url, List<Header> headers) throws IOException {
        CloseableHttpResponse response = getResponse(url, headers);
        HttpEntity httpEntity = response.getEntity();
        String resStr = EntityUtils.toString(httpEntity, charset);
        response.close();
        return resStr;
    }

    public static String sendPost(String url, Map params) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        if (params != null && params.size() > 0) {
            List<NameValuePair> pairs = new ArrayList<NameValuePair>();
            pairs.clear();
            for (Object key : params.keySet()) {
                pairs.add(new BasicNameValuePair(key.toString(), params.get(key).toString()));
            }
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(pairs, charset);
            httpPost.setEntity(formEntity);
        }
        HttpResponse response = httpClient.execute(httpPost);
        HttpEntity httpEntity = response.getEntity();
        return inputStream2String(httpEntity.getContent());
    }

    public static String sendPost(String url, Map params, int timeout) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        if (params != null && params.size() > 0) {
            List<NameValuePair> pairs = new ArrayList<NameValuePair>();
            pairs.clear();
            for (Object key : params.keySet()) {
                pairs.add(new BasicNameValuePair(key.toString(), params.get(key).toString()));
            }
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(pairs, charset);
            httpPost.setEntity(formEntity);
        }
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeout).setConnectTimeout(timeout).build();//设置请求和传输超时时间
        httpPost.setConfig(requestConfig);
        HttpResponse response = httpClient.execute(httpPost);
        HttpEntity httpEntity = response.getEntity();
        return inputStream2String(httpEntity.getContent());
    }

    public static String sendPost(String url, Map params, List<Header> headers) throws IOException {
        HttpPost httpPost = new HttpPost(url);
        if (headers != null && headers.size() > 0) {
            for (Header header : headers) {
                httpPost.addHeader(header);
            }
        }
        if (params != null && params.size() > 0) {
            List<NameValuePair> pairs = new ArrayList<NameValuePair>();
            pairs.clear();
            for (Object key : params.keySet()) {
                pairs.add(new BasicNameValuePair(key.toString(), params.get(key).toString()));
            }
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(pairs, charset);
            httpPost.setEntity(formEntity);
        }
        HttpResponse response = httpClient.execute(httpPost);
        HttpEntity httpEntity = response.getEntity();
        return inputStream2String(httpEntity.getContent());
    }

    public static String inputStream2String(InputStream in) throws IOException {
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[4096];
        for (int n; (n = in.read(b)) != -1; ) {
            out.append(new String(b, 0, n, charset));
        }
        return out.toString();
    }

    public static String post(String url, String body) {
        // 实例化httpClient
        if (httpClient == null) {
            httpClient = HttpClients.createDefault();
        }
        // 实例化post方法
        HttpPost httpPost = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();
        httpPost.setConfig(requestConfig);

        // 结果
        CloseableHttpResponse response = null;
        String content = "";
        try {
            // 将参数给post方法
            httpPost.setEntity(new StringEntity(body, Charset.forName("utf-8")));
            httpPost.addHeader("Content-type", "application/json; charset=utf-8");
            httpPost.setHeader("Accept", "application/json");

            // 执行post方法
            response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {
                content = EntityUtils.toString(response.getEntity(), "utf-8");
                //System.out.println(content);
            } else {
                System.out.println("------>url:" + url);
                System.out.println("------>param:" + body);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (httpPost != null)
                    httpPost.abort();
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return content;
    }

    public static String post(String url, HttpEntity entity) {
        // 实例化httpClient
        if (httpClient == null) {
            httpClient = HttpClients.createDefault();
        }
        // 实例化post方法
        HttpPost httpPost = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).build();
        httpPost.setConfig(requestConfig);

        // 结果
        CloseableHttpResponse response = null;
        String content = "";
        try {
            // 将参数给post方法
            httpPost.setEntity(entity);
            httpPost.addHeader("Content-type", "multipart/form-data;boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
            httpPost.addHeader("Content-type", "application/x-www-form-urlencoded");
            httpPost.addHeader("cache-control", "no-cache");

            // 执行post方法
            response = httpClient.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {
                content = EntityUtils.toString(response.getEntity(), "utf-8");
                //System.out.println(content);
            } else {
                return null;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (httpPost != null)
                    httpPost.abort();
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return content;
    }

    public static InputStream downLoadFromUrl(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3 * 1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");


        //得到输入流
        return conn.getInputStream();
    }

    /**
     * 从输入流中获取字节数组
     *
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }

    public static String sendPost(String url, String param, List<Header> headers) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            if (headers != null && headers.size() > 0) {
                for (Header header : headers) {
                    conn.setRequestProperty(header.getName(), header.getValue());
                }
            }
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            OutputStreamWriter outWriter = new OutputStreamWriter(conn.getOutputStream(), "utf-8");
            out = new PrintWriter(outWriter);
            // 发送请求参数
            out.print(param);
//            out.print(URLEncoder.encode(param,"utf-8"));
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
}

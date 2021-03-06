package com.douyin.aweme.v1.bean;

import com.douyin.aweme.v1.bean.BaseResponse;
import lombok.Data;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/11/28 15:19
 *
 * @author Touchkiss
 */
@Data
public abstract class BaseRequest<T extends BaseResponse> {
    public Set<String> headers;
    public List<String> params;
    public String Host;
    public String uri;
    public String method;

    public BaseRequest(Set<String> headers, List<String> params, String host, String uri, String method) {
        this.headers = headers;
        this.params = params;
        Host = host;
        this.uri = uri;
        this.method = method;
    }

    public Class getRequestClass() {
        return getClass();
    }

    public Class<T> getResponseClass() {
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
}

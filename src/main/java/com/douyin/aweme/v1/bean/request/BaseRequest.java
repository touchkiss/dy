package com.douyin.aweme.v1.bean.request;

import com.douyin.aweme.v1.bean.response.BaseResponse;
import lombok.Data;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2020/11/28 15:19
 *
 * @author Touchkiss
 */
@Data
public abstract class BaseRequest<T extends BaseResponse> {
    public Set<String> headers = new HashSet<>();
    public List<String> params=new ArrayList<>();
    public String host;
    public String uri;
    public String method;

    public Class getRequestClass() {
        return getClass();
    }

    public Class<T> getResponseClass() {
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
}

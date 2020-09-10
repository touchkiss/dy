package com.huoshan.bean.response;

import lombok.Data;

/**
 * Created on 2020/09/09 23:31
 *
 * @author Touchkiss
 */
@Data
public abstract class BaseResponse<T> {
    private T data;
    private ExtraBean extra;
    private Integer status_code;
}

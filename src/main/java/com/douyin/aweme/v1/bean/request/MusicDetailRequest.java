package com.douyin.aweme.v1.bean.request;

import com.douyin.aweme.v1.bean.response.MusicDetailResponse;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * Created on 2020/11/28 23:33
 *
 * @author Touchkiss
 */
@Data
public class MusicDetailRequest extends BaseRequest<MusicDetailResponse>{
//    public MusicDetailRequest() {
//    }

    public MusicDetailRequest(Set<String> headers, List<String> params, String host, String uri, String method) {
        super(headers, params, host, uri, method);
    }
}

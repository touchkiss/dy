package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/07 20:55
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class MixListResponse extends BaseResponse{
    private int cursor;
    private int has_more;
    private List<MixDetailResponse.MixInfoBean> mix_infos;
}

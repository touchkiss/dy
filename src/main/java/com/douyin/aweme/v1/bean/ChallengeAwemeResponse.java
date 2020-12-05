package com.douyin.aweme.v1.bean;

import lombok.Data;

import java.util.List;

/**
 * Created on 2020/12/06 0:09
 *
 * @author Touchkiss
 */
@Data
public class ChallengeAwemeResponse extends BaseResponse{
    private List<AwemeInfo>aweme_list;
    private int cursor;
    private int has_more;
    private Object mix_list;
}

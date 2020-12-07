package com.douyin.aweme.v2.bean;

import com.douyin.aweme.v1.bean.BaseResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/07 15:38
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class PlatformShareCommandGenResponse extends BaseResponse {

    /**
     * status_code : 0
     * command : 8ecd7lkIXd8
     * command_v2 : ##8ecd7lkIXd8##
     * token_template : {0}；##8ecd7lkIXd8##打开抖音搜索
     * extra : {"now":1607326632000,"fatal_item_ids":[],"logid":"202012071537120101450190700D005187"}
     */
    private String command;
    private String command_v2;
    private String token_template;
}

package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AtUser {
    private String at_from;
    private String encrypt_user_id;
    private Integer end;
    private Integer start;
    private Long user_id;
    private String user_id_str;
    private Integer user_type;
}

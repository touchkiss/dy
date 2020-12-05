package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/12/05 23:44
 *
 * @author Touchkiss
 */
@NoArgsConstructor
@Data
public class AwemeFavoriteResponse extends BaseResponse{
    private String hotsoon_text;
    private int hotsoon_has_more;
    private String invalid_item_text;
    private int hotsoon_filtered_count;
    private int invalid_item_count;
    private int has_more;
    private int is_clear_invalid_item;
    private int is_hiding_invalid_item;
    private int min_cursor;
    private long max_cursor;
    private List<AwemeInfo> aweme_list;
    private List<?> invalid_item_id_list;
}

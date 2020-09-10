package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class PayGradeBean {
    private CoverBean diamond_icon;
    private String grade_banner;
    private String grade_describe;
    private CoverBean icon;
    private CoverBean im_icon;
    private CoverBean im_icon_with_level;
    private Integer level;
    private CoverBean live_icon;
    private String name;
    private CoverBean new_im_icon_with_level;
    private CoverBean new_live_icon;
    private CoverBean new_nav_live_icon;
    private Integer next_diamond;
    private CoverBean next_icon;
    private String next_name;
    private Integer now_diamond;
    private Integer pay_diamond_bak;
    private CoverBean profile_dialog_bg;
    private CoverBean profile_dialog_bg_back;
    private Integer screen_chat_type;
    private Integer this_grade_max_diamond;
    private Integer this_grade_min_diamond;
    private Integer total_diamond_count;
    private Integer upgrade_need_consume;
    private List<GradeIconListBean> grade_icon_list;

    @NoArgsConstructor
    @Data
    public static class GradeIconListBean {
        private CoverBean icon;
        private Integer icon_diamond;
        private Integer level;
        private String level_str;
    }
}

package com.huoshan.bean.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AnchorLevelBean {
    private Integer experience;
    private Integer highest_experience_this_level;
    private Integer level;
    private Integer lowest_experience_this_level;
    private CoverBean profile_dialog_bg;
    private CoverBean profile_dialog_bg_back;
    private CoverBean small_icon;
    private CoverBean stage_level;
    private Integer task_decrease_experience;
    private Integer task_end_time;
    private Integer task_start_experience;
    private Integer task_start_time;
    private Integer task_target_experience;
}

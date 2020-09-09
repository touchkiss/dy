package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AnchorLevelBean {
    private int experience;
    private int highest_experience_this_level;
    private int level;
    private int lowest_experience_this_level;
    private CoverBean profile_dialog_bg;
    private CoverBean profile_dialog_bg_back;
    private CoverBean small_icon;
    private CoverBean stage_level;
    private int task_decrease_experience;
    private int task_end_time;
    private int task_start_experience;
    private int task_start_time;
    private int task_target_experience;
}

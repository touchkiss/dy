package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:23
 *
 * @author Touchkiss
 */
@Data
public class AwemeMixInfo {
	private Long mixId; //
	private String mixName; //
	private Long createTime; //
	private String desc; //
	private Long authorUid; //
	private String authorSecUid; //
	private String coverUrl; //
	private Integer collectVv; //
	private Integer currentEpisode; //
	private Long playVv; //
	private Integer updatedToEpisode; //更新到几集
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

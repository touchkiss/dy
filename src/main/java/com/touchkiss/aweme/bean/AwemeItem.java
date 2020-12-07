package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Data
public class AwemeItem {
	private Long awemeId; //
	private Integer awemeType; //
	private Integer bodydanceScore; //
	private Boolean cmtSwt; //
	private Integer collectStat; //
	private Long createTime; //
	private String desc; //
	private String descLanguage; //
	private Integer distributeType; //
	private Integer duration; //长度
	private String groupId; //
	private Boolean haveDashboard; //
	private Boolean isFantasy; //
	private Boolean isFirstVideo; //
	private Integer isHashTag; //
	private Boolean isInScope; //
	private Boolean isPgcshow; //
	private Integer isPreview; //
	private Boolean isRelieve; //
	private Integer isStory; //
	private Integer isTop; //
	private Boolean isVr; //
	private Integer itemCommentSettings; //
	private Integer itemDuet; //
	private Integer itemReact; //
	private Integer itemStitch; //
	private Long mid; //音乐id
	private Long mixId; //合集id
	private Integer nearbyLevel; //
	private Boolean preventDownload; //
	private Integer rate; //
	private Integer vrType; //
	private Boolean withPromotionalMusic; //
	private Boolean withoutWatermark; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

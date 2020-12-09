package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:24
 *
 * @author Touchkiss
 */
@Data
public class AwemeItem {
	private Long awemeId; //
	private Long uid; //用户id
	private Integer awemeType; //
	private Integer bodydanceScore; //
	private Boolean cmtSwt; //
	private Integer collectStat; //
	private Long createTime; //
	private String itemDesc; //
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
	private Integer stickerId; //贴纸id
	private Long mid; //音乐id
	private Long mixId; //合集id
	private Integer nearbyLevel; //
	private Boolean preventDownload; //
	private Integer rate; //
	private Integer vrType; //
	private Integer width; //视频宽度
	private Integer height; //视频高度
	private String ratio; //视频比率
	private Boolean withPromotionalMusic; //
	private Boolean withoutWatermark; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

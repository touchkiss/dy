package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:23
 *
 * @author Touchkiss
 */
@Data
public class AwemeMusicInfo {
	private Long mid; //
	private Long id; //
	private Integer auditionDuration; //
	private String author; //
	private Boolean authorDeleted; //
	private String avatarLarger; //
	private Long bindedChallengeId; //
	private Boolean canBackgroundPlay; //
	private Integer collectStat; //
	private String coverUrl; //
	private Boolean dmvAutoShow; //
	private Integer duration; //
	private Integer endTime; //
	private String extra; //
	private Boolean isCommerceMusic; //
	private Boolean isDelVideo; //
	private Boolean isMatchedMetadata; //
	private Boolean isOriginal; //
	private Boolean isOriginalSound; //
	private Boolean isPgc; //
	private Boolean isRestricted; //
	private Boolean isVideoSelfSee; //
	private Boolean muteShare; //
	private Long ownerId; //
	private String playUrl; //
	private Boolean preventDownload; //
	private Boolean preventItemDownloadStatus; //
	private Integer previewEndTime; //
	private Integer previewStartTime; //
	private Integer reasonType; //
	private Boolean redirect; //
	private String schemaUrl; //
	private Integer sourcePlatform; //
	private Integer startTime; //
	private Integer status; //
	private String title; //
	private Integer userCount; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

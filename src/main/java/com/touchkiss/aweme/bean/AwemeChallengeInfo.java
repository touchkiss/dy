package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Data
public class AwemeChallengeInfo {
	private Long cid; //
	private String chaName; //
	private String desc; //
	private Integer type; //
	private Integer userCounr; //
	private Long viewCount; //
	private Integer subType; //
	private Long uid; //
	private String secUid; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

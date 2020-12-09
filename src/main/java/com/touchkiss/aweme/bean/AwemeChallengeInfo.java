package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:24
 *
 * @author Touchkiss
 */
@Data
public class AwemeChallengeInfo {
	private Long cid; //
	private String chaName; //
	private String chaDesc; //
	private Integer chaType; //
	private Integer userCounr; //
	private Long viewCount; //
	private Integer subType; //
	private Long uid; //
	private String secUid; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

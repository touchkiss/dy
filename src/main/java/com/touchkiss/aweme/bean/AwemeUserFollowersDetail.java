package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Data
public class AwemeUserFollowersDetail {
	private Long id; //
	private Long awemeUid; //
	private String appName; //
	private String name; //
	private String icon; //
	private Long fansCount; //
	private String openUrl; //
	private Long appleId; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

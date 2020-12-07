package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Data
public class AwemeStickerInfo {
	private Long id; //
	private Long effectId; //
	private String iconUrl; //
	private String name; //
	private Long ownerId; //
	private String ownerNickname; //
	private Integer userCount; //
	private Long vvCount; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

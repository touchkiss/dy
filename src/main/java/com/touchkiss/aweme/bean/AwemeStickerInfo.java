package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:23
 *
 * @author Touchkiss
 */
@Data
public class AwemeStickerInfo {
	private Long id; //
	private Long effectId; //
	private String iconUrl; //
	private String stickerName; //
	private String stickerDesc; //
	private Long ownerId; //
	private String ownerNickname; //
	private Integer userCount; //
	private Long vvCount; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

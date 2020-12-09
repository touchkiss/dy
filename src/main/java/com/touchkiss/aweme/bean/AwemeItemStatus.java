package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:23
 *
 * @author Touchkiss
 */
@Data
public class AwemeItemStatus {
	private Long awemeId; //
	private Boolean allowComment; //
	private Boolean allowShare; //
	private Integer dontShareStatus; //
	private Integer downloadStatus; //
	private Boolean isReviewing; //
	private Boolean isDelete; //
	private Boolean isPrivate; //
	private Boolean isProhibited; //
	private Integer privateStatus; //
	private Boolean selfSee; //
	private Integer videoHideSearch; //
	private Boolean withFusionGoods; //
	private Boolean withGoods; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

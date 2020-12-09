package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:24
 *
 * @author Touchkiss
 */
@Data
public class AwemeItemChallenge {
	private Long id; //
	private Long awemeId; //
	private Long cid; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

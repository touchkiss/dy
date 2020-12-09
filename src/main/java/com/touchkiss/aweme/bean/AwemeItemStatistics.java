package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-09 23:38:23
 *
 * @author Touchkiss
 */
@Data
public class AwemeItemStatistics {
	private Long awemeId; //
	private Integer commentCount; //评论数
	private Integer diggCount; //点赞数
	private Integer downloadCount; //下载数
	private Integer exposureCount; //曝光数
	private Integer forwardCount; //转发数
	private Integer loseCommentCount; //
	private Integer loseCount; //
	private Integer playCount; //播放数
	private Integer shareCount; //分享数
	private Integer whatsappShareCount; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

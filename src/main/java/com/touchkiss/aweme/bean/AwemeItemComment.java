package com.touchkiss.aweme.bean;

import lombok.Data;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Data
public class AwemeItemComment {
	private Long cid; //
	private Long awemeId; //
	private Long createTime; //
	private Integer diggCount; //点赞数
	private Boolean isAuthorDigged; //作者是否点赞
	private Long replyId; //评论的cid
	private Long replyToReplyId; //
	private Long replyToUserid; //
	private String replyToUsername; //
	private Integer status; //
	private String text; //
	private Long uid; //
	private Boolean userBuried; //
	private Integer userDigged; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

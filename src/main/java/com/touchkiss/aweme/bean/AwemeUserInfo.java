package com.touchkiss.aweme.bean;

import lombok.Data;

import java.sql.Date;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@Data
public class AwemeUserInfo {
	private Long uid; //数字id
	private Long shortId; //
	private String uniqueId; //抖音号
	private String secUid; //加密的抖音id
	private String nickname; //昵称
	private String language; //语言
	private String region; //地区
	private Long roomId; //直播房间号
	private Boolean acceptPrivatePolicy; //
	private String accountRegion; //
	private Long appleAccount; //
	private Integer authorityStatus; //
	private String avatarLarger; //大头像地址
	private Integer awemeCount; //
	private Date birthday; //生日
	private Integer birthdayHideLevel; //
	private String city; //
	private Integer commentFilterStatus; //
	private Integer commentSetting; //
	private Integer commerceUserLevel; //
	private Integer constellation; //星座
	private Integer contentLanguageAlreadyPopup; //
	private Integer countStatus; //
	private String country; //
	private String coverColour; //封面背景色
	private String coverUrl; //封面url
	private String customVerify; //
	private String district; //区域
	private Integer dongtaiCount; //动态数量
	private Boolean douplusOldUser; //
	private Long downloadPromotTs; //
	private Integer downloadSetting; //
	private Integer dpLevel; //
	private Integer duetSetting; //
	private Boolean enableNearbyVisible; //附近是否可见
	private String enterpriseUserInfo; //
	private String enterpriseVerifyReason; //
	private Boolean everOver_1kFollower; //
	private Integer favoritingCount; //
	private Integer followStatus; //
	private Integer followerCount; //
	private Integer followerStatus; //
	private Integer followingCount; //
	private Integer forwardCount; //
	private Integer gender; //
	private Boolean hasActivityMedal; //
	private Boolean hasInsights; //
	private Boolean hasStory; //
	private Boolean hasUnreadStory; //
	private Integer hideFollowingFollowerList; //隐藏关注、粉丝列表
	private Boolean hideLocation; //
	private String insId; //
	private Boolean isActivityUser; //
	private Boolean isAdFake; //
	private Boolean isBlock; //
	private Boolean isBlocked; //
	private Boolean isDisciplineMember; //
	private Boolean isEffectArtist; //
	private Boolean isGovMediaVip; //
	private Boolean isMixUser; //
	private Boolean isProAccount; //
	private Boolean isStar; //
	private Boolean isVerified; //
	private String isoCountryCode; //
	private Boolean liveCommerce; //
	private String location; //
	private Boolean messageChatEntry; //
	private Integer mplatformFollowersCount; //全平台粉丝数
	private Boolean preventDownload; //
	private Integer profileTabType; //
	private String province; //省
	private String recommendReasonRelation; //
	private Integer recommendUserReasonSource; //
	private String schoolName; //
	private Integer secret; //
	private Boolean showFavoriteList; //
	private String signature; //签名
	private String signatureLanguage; //
	private Integer stitchSetting; //
	private Integer storyCount; //
	private Boolean storyOpen; //
	private Integer syncToToutiao; //
	private Integer totalFavorited; //
	private String twitterId; //
	private String twitterName; //
	private Long uniqueIdModifyTime; //
	private Boolean userCanceled; //
	private Integer userMode; //
	private Integer userStoryCount; //
	private Integer verificationType; //
	private String verifyInfo; //
	private Boolean watchStatus; //
	private String weiboSchema; //
	private String weiboUrl; //
	private String weiboVerify; //
	private Boolean withCommerceEntry; //
	private Boolean withCommerceEnterpriseTabEntry; //
	private Boolean withFusionShopEntry; //
	private Boolean withLubanEntry; //
	private Boolean withNewGoods; //
	private Boolean withShopEntry; //
	private Boolean withStickEntry; //
	private String wxAvatarUrl; //
	private String wxNickname; //
	private Integer wxTag; //
	private String youtubeChannelId; //
	private String youtubeChannelTitle; //
	private Long firstFetchTime; //首次抓取时间
	private Long lastFetchTime; //最后抓取时间
}

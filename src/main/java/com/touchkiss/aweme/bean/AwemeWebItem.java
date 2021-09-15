package com.touchkiss.aweme.bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class AwemeWebItem {

    private String _location;
    private C0 C_0;
    private C18 C_18;

    @NoArgsConstructor
    @Data
    public static class C0 {
        private AbTestData abTestData;
        private Odin odin;
        private User user;

        @NoArgsConstructor
        @Data
        public static class AbTestData {
            private int navTabRecommendType;
            private int navTabFollowType;
            private int navTabHotType;
        }

        @NoArgsConstructor
        @Data
        public static class Odin {
            private String user_id;
            private int user_type;
            private int user_is_auth;
            private String user_unique_id;
        }

        @NoArgsConstructor
        @Data
        public static class User {
            private boolean isLogin;
            private int statusCode;
            private boolean isSpider;
        }
    }

    @NoArgsConstructor
    @Data
    public static class C18 {
        private String awemeId;
        private String logPb;
        private Aweme aweme;
        private Comment comment;
        private Object mixInfo;
        private DefaultRelate defaultRelate;

        @NoArgsConstructor
        @Data
        public static class Aweme {
            private int statusCode;
            private Detail detail;
            private String logPb;
            private int consumerTime;
            private boolean isReported;

            @NoArgsConstructor
            @Data
            public static class Detail {
                private String awemeId;
                private int awemeType;
                private String groupId;
                private AuthorInfo authorInfo;
                private String desc;
                private long authorUserId;
                private int createTime;
                private List<TextExtra> textExtra;
                private boolean userDigged;
                private Video video;
                private MixInfo mixInfo;
                private boolean isPrivate;
                private boolean isFriendLimit;
                private Download download;
                private String impressionData;
                private Tag tag;
                private Stats stats;
                private ShareInfo shareInfo;
                private Status status;

                @NoArgsConstructor
                @Data
                public static class AuthorInfo {
                    private String uid;
                    private String secUid;
                    private String nickname;
                    private String avatarUri;
                    private int followerCount;
                    private int totalFavorited;
                    private int followStatus;
                    private int followerStatus;
                    private String enterpriseVerifyReason;
                    private String customVerify;
                }

                @NoArgsConstructor
                @Data
                public static class Video {
                    private int width;
                    private int height;
                    private String ratio;
                    private int duration;
                    private List<PlayAddr> playAddr;
                    private String playApi;
                    private List<BitRateList> bitRateList;
                    private String cover;
                    private String dynamicCover;
                    private String originCover;

                    @NoArgsConstructor
                    @Data
                    public static class PlayAddr {
                        private String src;
                    }

                    @NoArgsConstructor
                    @Data
                    public static class BitRateList {
                        private int width;
                        private int height;
                        private List<PlayAddr> playAddr;
                        private String playApi;
                        private int isH265;
                        private int qualityType;
                        private int bitRate;
                        private String videoFormat;
                        private String gearName;

                        @NoArgsConstructor
                        @Data
                        public static class PlayAddr {
                            private String src;
                        }
                    }
                }

                @NoArgsConstructor
                @Data
                public static class MixInfo {
                    private String cover;
                    private int status;
                }

                @NoArgsConstructor
                @Data
                public static class Download {
                    private boolean prevent;
                    private String url;
                }

                @NoArgsConstructor
                @Data
                public static class Tag {
                    private boolean isTop;
                    private boolean relationLabels;
                    private boolean isStory;
                    private int reviewStatus;
                    private boolean inReviewing;
                }

                @NoArgsConstructor
                @Data
                public static class Stats {
                    private int commentCount;
                    private int diggCount;
                    private int shareCount;
                    private int playCount;
                }

                @NoArgsConstructor
                @Data
                public static class ShareInfo {
                    private String shareUrl;
                    private String shareLinkDesc;
                }

                @NoArgsConstructor
                @Data
                public static class Status {
                    private boolean allowShare;
                    private boolean isReviewing;
                    private boolean isDelete;
                    private boolean isProhibited;
                    private int privateStatus;
                    private int reviewStatus;
                }

                @NoArgsConstructor
                @Data
                public static class TextExtra {
                    private int start;
                    private int end;
                    private int type;
                    private String hashtagId;
                    private String hashtagName;
                    private String awemeId;
                    private String userId;
                    private boolean isCommerce;
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class Comment {
            private int statusCode;
            private boolean hasMore;
            private Object hotsoonHasMore;
            private Object hotsoonText;
            private int total;
            private LogPb logPb;
            private int cursor;
            private List<Comments> comments;
            private int consumerTime;

            @NoArgsConstructor
            @Data
            public static class LogPb {
                private String impr_id;
            }

            @NoArgsConstructor
            @Data
            public static class Comments {
                private int diggCount;
                private String cid;
                private String text;
                private List<?> textExtra;
                private StickyInfo stickyInfo;
                private User user;
                private String labelText;
                private int labelType;
                private int isTop;
                private List<?> labelList;
                private int createTime;
                private int replyTotal;
                private String replyToUserId;
                private int userDigged;
                private List<ReplyComment> replyComment;

                @NoArgsConstructor
                @Data
                public static class StickyInfo {
                }

                @NoArgsConstructor
                @Data
                public static class User {
                    private String uid;
                    private String secUid;
                    private String nickname;
                    private String avatarUri;
                    private int followerCount;
                    private int totalFavorited;
                    private int followStatus;
                    private int followerStatus;
                    private String enterpriseVerifyReason;
                    private String customVerify;
                }

                @NoArgsConstructor
                @Data
                public static class ReplyComment {
                    private int diggCount;
                    private String cid;
                    private String text;
                    private List<?> textExtra;
                    private StickyInfo stickyInfo;
                    private User user;
                    private String labelText;
                    private int labelType;
                    private List<?> labelList;
                    private int createTime;
                    private String replyToUserId;
                    private int userDigged;
                    private List<?> replyComment;

                    @NoArgsConstructor
                    @Data
                    public static class StickyInfo {
                    }

                    @NoArgsConstructor
                    @Data
                    public static class User {
                        private String uid;
                        private String secUid;
                        private String nickname;
                        private String avatarUri;
                        private int followerCount;
                        private int totalFavorited;
                        private int followStatus;
                        private int followerStatus;
                        private String enterpriseVerifyReason;
                        private String customVerify;
                    }
                }
            }
        }

        @NoArgsConstructor
        @Data
        public static class DefaultRelate {
            private int statusCode;
            private List<?> data;
            private boolean hasMore;
            private String logPb;
            private String nextVideoInfo;
            private String awemeId;
        }
    }
}

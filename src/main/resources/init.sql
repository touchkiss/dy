create database aweme;
use aweme;
CREATE TABLE `aweme_challenge_info` (
                                        `cid` bigint(20) NOT NULL,
                                        `cha_name` varchar(50) DEFAULT NULL,
                                        `cha_desc` varchar(200) DEFAULT NULL,
                                        `cha_type` int(11) DEFAULT NULL,
                                        `user_count` int(11) DEFAULT NULL,
                                        `view_count` bigint(20) DEFAULT NULL,
                                        `sub_type` int(11) DEFAULT NULL,
                                        `uid` bigint(20) DEFAULT NULL,
                                        `sec_uid` varchar(100) DEFAULT NULL,
                                        `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                        `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                        PRIMARY KEY (`cid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_item` (
                              `aweme_id` bigint(20) NOT NULL,
                              `uid` bigint(20) DEFAULT NULL COMMENT '用户id',
                              `aweme_type` int(11) DEFAULT NULL,
                              `bodydance_score` int(11) DEFAULT NULL,
                              `cmt_swt` bit(1) DEFAULT NULL,
                              `collect_stat` int(11) DEFAULT NULL,
                              `create_time` bigint(20) DEFAULT NULL,
                              `item_desc` varchar(255) DEFAULT NULL,
                              `desc_language` varchar(50) DEFAULT NULL,
                              `distribute_type` int(11) DEFAULT NULL,
                              `duration` int(11) DEFAULT NULL COMMENT '长度',
                              `group_id` varchar(30) DEFAULT NULL,
                              `have_dashboard` bit(1) DEFAULT NULL,
                              `is_fantasy` bit(1) DEFAULT NULL,
                              `is_first_video` bit(1) DEFAULT NULL,
                              `is_hash_tag` int(11) DEFAULT NULL,
                              `is_in_scope` bit(1) DEFAULT NULL,
                              `is_pgcshow` bit(1) DEFAULT NULL,
                              `is_preview` int(11) DEFAULT NULL,
                              `is_relieve` bit(1) DEFAULT NULL,
                              `is_story` int(11) DEFAULT NULL,
                              `is_top` int(11) DEFAULT NULL,
                              `is_vr` bit(1) DEFAULT NULL,
                              `item_comment_settings` int(11) DEFAULT NULL,
                              `item_duet` int(11) DEFAULT NULL,
                              `item_react` int(11) DEFAULT NULL,
                              `item_stitch` int(11) DEFAULT NULL,
                              `sticker_id` int(11) DEFAULT NULL COMMENT '贴纸id',
                              `mid` bigint(20) DEFAULT NULL COMMENT '音乐id',
                              `mix_id` bigint(20) DEFAULT NULL COMMENT '合集id',
                              `nearby_level` int(11) DEFAULT NULL,
                              `prevent_download` bit(1) DEFAULT NULL,
                              `rate` int(11) DEFAULT NULL,
                              `vr_type` int(11) DEFAULT NULL,
                              `width` int(11) DEFAULT NULL COMMENT '视频宽度',
                              `height` int(11) DEFAULT NULL COMMENT '视频高度',
                              `ratio` varchar(10) DEFAULT NULL COMMENT '视频比率',
                              `with_promotional_music` bit(1) DEFAULT NULL,
                              `without_watermark` bit(1) DEFAULT NULL,
                              `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                              `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                              PRIMARY KEY (`aweme_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_item_challenge` (
                                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                        `aweme_id` bigint(20) DEFAULT NULL,
                                        `cid` bigint(20) DEFAULT NULL,
                                        `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                        `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                        PRIMARY KEY (`id`) USING BTREE,
                                        UNIQUE KEY `aweme_item_cid` (`aweme_id`,`cid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=156109 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_item_comment` (
                                      `cid` bigint(20) NOT NULL,
                                      `aweme_id` bigint(20) DEFAULT NULL,
                                      `create_time` bigint(20) DEFAULT NULL,
                                      `digg_count` int(11) DEFAULT NULL COMMENT '点赞数',
                                      `is_author_digged` bit(1) DEFAULT NULL COMMENT '作者是否点赞',
                                      `reply_id` bigint(20) DEFAULT NULL COMMENT '评论的cid',
                                      `reply_to_reply_id` bigint(20) DEFAULT NULL,
                                      `reply_to_userid` bigint(20) DEFAULT NULL,
                                      `reply_to_username` varchar(100) DEFAULT NULL,
                                      `status` int(11) DEFAULT NULL,
                                      `text` varchar(255) DEFAULT NULL,
                                      `uid` bigint(20) DEFAULT NULL,
                                      `user_buried` bit(1) DEFAULT NULL,
                                      `user_digged` int(11) DEFAULT NULL,
                                      `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                      `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                      PRIMARY KEY (`cid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_item_statistics` (
                                         `aweme_id` bigint(20) NOT NULL,
                                         `comment_count` int(11) DEFAULT NULL COMMENT '评论数',
                                         `digg_count` int(11) DEFAULT NULL COMMENT '点赞数',
                                         `download_count` int(11) DEFAULT NULL COMMENT '下载数',
                                         `exposure_count` int(11) DEFAULT NULL COMMENT '曝光数',
                                         `forward_count` int(11) DEFAULT NULL COMMENT '转发数',
                                         `lose_comment_count` int(11) DEFAULT NULL,
                                         `lose_count` int(11) DEFAULT NULL,
                                         `play_count` int(11) DEFAULT NULL COMMENT '播放数',
                                         `share_count` int(11) DEFAULT NULL COMMENT '分享数',
                                         `whatsapp_share_count` int(11) DEFAULT NULL,
                                         `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                         `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                         PRIMARY KEY (`aweme_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_item_status` (
                                     `aweme_id` bigint(20) NOT NULL,
                                     `allow_comment` bit(1) DEFAULT NULL,
                                     `allow_share` bit(1) DEFAULT NULL,
                                     `dont_share_status` int(11) DEFAULT NULL,
                                     `download_status` int(11) DEFAULT NULL,
                                     `is_reviewing` bit(1) DEFAULT NULL,
                                     `is_delete` bit(1) DEFAULT NULL,
                                     `is_private` bit(1) DEFAULT NULL,
                                     `is_prohibited` bit(1) DEFAULT NULL,
                                     `private_status` int(11) DEFAULT NULL,
                                     `self_see` bit(1) DEFAULT NULL,
                                     `video_hide_search` int(11) DEFAULT NULL,
                                     `with_fusion_goods` bit(1) DEFAULT NULL,
                                     `with_goods` bit(1) DEFAULT NULL,
                                     `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                     `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                     PRIMARY KEY (`aweme_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_mix_info` (
                                  `mix_id` bigint(20) NOT NULL,
                                  `mix_name` varchar(255) DEFAULT NULL,
                                  `create_time` bigint(20) DEFAULT NULL,
                                  `desc` varchar(255) DEFAULT NULL,
                                  `author_uid` bigint(20) DEFAULT NULL,
                                  `author_sec_uid` varchar(100) DEFAULT NULL,
                                  `cover_url` varchar(255) DEFAULT NULL,
                                  `collect_vv` int(11) DEFAULT NULL,
                                  `current_episode` int(11) DEFAULT NULL,
                                  `play_vv` bigint(20) DEFAULT NULL,
                                  `updated_to_episode` int(11) DEFAULT NULL COMMENT '更新到几集',
                                  `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                  `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                  PRIMARY KEY (`mix_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_music_info` (
                                    `mid` bigint(20) NOT NULL,
                                    `id` bigint(20) DEFAULT NULL,
                                    `audition_duration` int(11) DEFAULT NULL,
                                    `author` varchar(100) DEFAULT NULL,
                                    `author_deleted` bit(1) DEFAULT NULL,
                                    `avatar_larger` varchar(255) DEFAULT NULL,
                                    `binded_challenge_id` bigint(20) DEFAULT NULL,
                                    `can_background_play` bit(1) DEFAULT NULL,
                                    `collect_stat` int(11) DEFAULT NULL,
                                    `cover_url` varchar(255) DEFAULT NULL,
                                    `dmv_auto_show` bit(1) DEFAULT NULL,
                                    `duration` int(11) DEFAULT NULL,
                                    `end_time` int(11) DEFAULT NULL,
                                    `extra` varchar(255) DEFAULT NULL,
                                    `is_commerce_music` bit(1) DEFAULT NULL,
                                    `is_del_video` bit(1) DEFAULT NULL,
                                    `is_matched_metadata` bit(1) DEFAULT NULL,
                                    `is_original` bit(1) DEFAULT NULL,
                                    `is_original_sound` bit(1) DEFAULT NULL,
                                    `is_pgc` bit(1) DEFAULT NULL,
                                    `is_restricted` bit(1) DEFAULT NULL,
                                    `is_video_self_see` bit(1) DEFAULT NULL,
                                    `mute_share` bit(1) DEFAULT NULL,
                                    `owner_id` bigint(20) DEFAULT NULL,
                                    `play_url` varchar(255) DEFAULT NULL,
                                    `prevent_download` bit(1) DEFAULT NULL,
                                    `prevent_item_download_status` bit(1) DEFAULT NULL,
                                    `preview_end_time` int(11) DEFAULT NULL,
                                    `preview_start_time` int(11) DEFAULT NULL,
                                    `reason_type` int(11) DEFAULT NULL,
                                    `redirect` bit(1) DEFAULT NULL,
                                    `schema_url` varchar(255) DEFAULT NULL,
                                    `source_platform` int(11) DEFAULT NULL,
                                    `start_time` int(11) DEFAULT NULL,
                                    `status` int(11) DEFAULT NULL,
                                    `title` varchar(255) DEFAULT NULL,
                                    `user_count` int(11) DEFAULT NULL,
                                    `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                    `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                    PRIMARY KEY (`mid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_sticker_info` (
                                      `id` bigint(20) NOT NULL,
                                      `effect_id` bigint(20) DEFAULT NULL,
                                      `icon_url` varchar(255) DEFAULT NULL,
                                      `sticker_name` varchar(100) DEFAULT NULL,
                                      `sticker_desc` varchar(255) DEFAULT NULL,
                                      `owner_id` bigint(20) DEFAULT NULL,
                                      `owner_nickname` varchar(100) DEFAULT NULL,
                                      `user_count` int(11) DEFAULT NULL,
                                      `vv_count` bigint(20) DEFAULT NULL,
                                      `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                      `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                      PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_user_followers_detail` (
                                               `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                               `aweme_uid` bigint(20) DEFAULT NULL,
                                               `app_name` varchar(50) DEFAULT NULL,
                                               `name` varchar(50) DEFAULT NULL,
                                               `icon` varchar(255) DEFAULT NULL,
                                               `fans_count` bigint(20) DEFAULT NULL,
                                               `open_url` varchar(255) DEFAULT NULL,
                                               `apple_id` bigint(20) DEFAULT NULL,
                                               `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                               `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                               PRIMARY KEY (`id`) USING BTREE,
                                               KEY `user_followers_details_uid` (`aweme_uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `aweme_user_info` (
                                   `uid` bigint(20) NOT NULL COMMENT '数字id',
                                   `short_id` bigint(20) DEFAULT NULL,
                                   `unique_id` varchar(50) DEFAULT NULL COMMENT '抖音号',
                                   `sec_uid` varchar(100) DEFAULT NULL COMMENT '加密的抖音id',
                                   `nickname` varchar(100) DEFAULT NULL COMMENT '昵称',
                                   `u_language` varchar(50) DEFAULT NULL COMMENT '语言',
                                   `region` varchar(10) DEFAULT NULL COMMENT '地区',
                                   `room_id` bigint(20) DEFAULT NULL COMMENT '直播房间号',
                                   `accept_private_policy` bit(1) DEFAULT NULL,
                                   `account_region` varchar(255) DEFAULT NULL,
                                   `apple_account` bigint(20) DEFAULT NULL,
                                   `authority_status` int(11) DEFAULT NULL,
                                   `avatar_larger` varchar(255) DEFAULT NULL COMMENT '大头像地址',
                                   `aweme_count` int(11) DEFAULT NULL,
                                   `birthday` date DEFAULT NULL COMMENT '生日',
                                   `birthday_hide_level` int(11) DEFAULT NULL,
                                   `city` varchar(255) DEFAULT NULL,
                                   `comment_filter_status` int(11) DEFAULT NULL,
                                   `comment_setting` int(11) DEFAULT NULL,
                                   `commerce_user_level` int(11) DEFAULT NULL,
                                   `constellation` int(11) DEFAULT NULL COMMENT '星座',
                                   `content_language_already_popup` int(11) DEFAULT NULL,
                                   `count_status` int(11) DEFAULT NULL,
                                   `country` varchar(100) DEFAULT NULL,
                                   `cover_colour` varchar(20) DEFAULT NULL COMMENT '封面背景色',
                                   `cover_url` varchar(255) DEFAULT NULL COMMENT '封面url',
                                   `custom_verify` varchar(255) DEFAULT NULL,
                                   `district` varchar(255) DEFAULT NULL COMMENT '区域',
                                   `dongtai_count` int(11) DEFAULT NULL COMMENT '动态数量',
                                   `douplus_old_user` bit(1) DEFAULT NULL,
                                   `download_promot_ts` bigint(20) DEFAULT NULL,
                                   `download_setting` int(11) DEFAULT NULL,
                                   `dp_level` int(11) DEFAULT NULL,
                                   `duet_setting` int(11) DEFAULT NULL,
                                   `enable_nearby_visible` bit(1) DEFAULT NULL COMMENT '附近是否可见',
                                   `enterprise_user_info` text DEFAULT NULL,
                                   `enterprise_verify_reason` varchar(255) DEFAULT NULL,
                                   `ever_over_1k_follower` bit(1) DEFAULT NULL,
                                   `favoriting_count` int(11) DEFAULT NULL,
                                   `follow_status` int(11) DEFAULT NULL,
                                   `follower_count` int(11) DEFAULT NULL,
                                   `follower_status` int(11) DEFAULT NULL,
                                   `following_count` int(11) DEFAULT NULL,
                                   `forward_count` int(11) DEFAULT NULL,
                                   `gender` int(11) DEFAULT NULL,
                                   `has_activity_medal` bit(1) DEFAULT NULL,
                                   `has_insights` bit(1) DEFAULT NULL,
                                   `has_orders` bit(1) DEFAULT NULL,
                                   `has_story` bit(1) DEFAULT NULL,
                                   `has_unread_story` bit(1) DEFAULT NULL,
                                   `hide_following_follower_list` int(11) DEFAULT NULL COMMENT '隐藏关注、粉丝列表',
                                   `hide_location` bit(1) DEFAULT NULL,
                                   `ins_id` varchar(255) DEFAULT NULL,
                                   `is_activity_user` bit(1) DEFAULT NULL,
                                   `is_ad_fake` bit(1) DEFAULT NULL,
                                   `is_block` bit(1) DEFAULT NULL,
                                   `is_blocked` bit(1) DEFAULT NULL,
                                   `is_discipline_member` bit(1) DEFAULT NULL,
                                   `is_effect_artist` bit(1) DEFAULT NULL,
                                   `is_gov_media_vip` bit(1) DEFAULT NULL,
                                   `is_mix_user` bit(1) DEFAULT NULL,
                                   `is_pro_account` bit(1) DEFAULT NULL,
                                   `is_star` bit(1) DEFAULT NULL,
                                   `is_verified` bit(1) DEFAULT NULL,
                                   `iso_country_code` varchar(10) DEFAULT NULL,
                                   `live_commerce` bit(1) DEFAULT NULL,
                                   `location` varchar(255) DEFAULT NULL,
                                   `message_chat_entry` bit(1) DEFAULT NULL,
                                   `mplatform_followers_count` int(11) DEFAULT NULL COMMENT '全平台粉丝数',
                                   `prevent_download` bit(1) DEFAULT NULL,
                                   `profile_tab_type` int(11) DEFAULT NULL,
                                   `province` varchar(100) DEFAULT NULL COMMENT '省',
                                   `rate` int(11) DEFAULT NULL,
                                   `recommend_reason_relation` varchar(255) DEFAULT NULL,
                                   `recommend_user_reason_source` int(11) DEFAULT NULL,
                                   `school_name` varchar(255) DEFAULT NULL,
                                   `secret` int(11) DEFAULT NULL,
                                   `show_favorite_list` bit(1) DEFAULT NULL,
                                   `signature` varchar(500) DEFAULT NULL COMMENT '签名',
                                   `signature_language` varchar(50) DEFAULT NULL,
                                   `stitch_setting` int(11) DEFAULT NULL,
                                   `story_count` int(11) DEFAULT NULL,
                                   `story_open` bit(1) DEFAULT NULL,
                                   `sync_to_toutiao` int(11) DEFAULT NULL,
                                   `total_favorited` int(11) DEFAULT NULL,
                                   `twitter_id` varchar(50) DEFAULT NULL,
                                   `twitter_name` varchar(50) DEFAULT NULL,
                                   `unique_id_modify_time` bigint(20) DEFAULT NULL,
                                   `user_canceled` bit(1) DEFAULT NULL,
                                   `user_mode` int(11) DEFAULT NULL,
                                   `user_story_count` int(11) DEFAULT NULL,
                                   `verification_type` int(11) DEFAULT NULL,
                                   `verify_info` varchar(255) DEFAULT NULL,
                                   `watch_status` bit(1) DEFAULT NULL,
                                   `weibo_schema` varchar(255) DEFAULT NULL,
                                   `weibo_url` varchar(255) DEFAULT NULL,
                                   `weibo_verify` varchar(255) DEFAULT NULL,
                                   `with_commerce_entry` bit(1) DEFAULT NULL,
                                   `with_commerce_enterprise_tab_entry` bit(1) DEFAULT NULL,
                                   `with_fusion_shop_entry` bit(1) DEFAULT NULL,
                                   `with_luban_entry` bit(1) DEFAULT NULL,
                                   `with_new_goods` bit(1) DEFAULT NULL,
                                   `with_shop_entry` bit(1) DEFAULT NULL,
                                   `with_stick_entry` bit(1) DEFAULT NULL,
                                   `wx_avatar_url` varchar(255) DEFAULT NULL,
                                   `wx_nickname` varchar(255) DEFAULT NULL,
                                   `wx_tag` int(11) DEFAULT NULL,
                                   `youtube_channel_id` varchar(50) DEFAULT NULL,
                                   `youtube_channel_title` varchar(255) DEFAULT NULL,
                                   `first_fetch_time` bigint(20) DEFAULT NULL COMMENT '首次抓取时间',
                                   `last_fetch_time` bigint(20) DEFAULT NULL COMMENT '最后抓取时间',
                                   PRIMARY KEY (`uid`) USING BTREE,
                                   UNIQUE KEY `user_sec_uid` (`sec_uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

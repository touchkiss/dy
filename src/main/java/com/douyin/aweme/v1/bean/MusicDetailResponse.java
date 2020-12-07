package com.douyin.aweme.v1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created on 2020/11/28 23:33
 *
 * @author Touchkiss
 */
@Data
public class MusicDetailResponse extends BaseResponse{
    private AwemeInfo.MusicBean music_info;
    private String msg;
    @NoArgsConstructor
    @Data
    public static class MusicDetailExtra{

        /**
         * fingerprint_info : {"status":2,"fingerprint_provider":"acr_cloud"}
         * owner_id : 4045834436223804
         * owner_nickname : koala宁🐨
         * recall_reviewed : 2
         * cover_uri : tos-cn-avt-0015/104013d758c05b9bae0fe3128d679a64
         * aed_music_dur : 0.0
         * countries : UNLIMITED
         * vid : v038822f0000butmp6km9tfn6g7a79og
         * aed_model : {"speech":0.5,"other":0.48,"singing":0,"music":0.01}
         * takedown_groups : []
         * ies_video_asr_bait : 0.0025646617
         * extract_item_id : 6898226627302395139
         */

        private FingerprintInfoBean fingerprint_info;
        private long owner_id;
        private String owner_nickname;
        private int recall_reviewed;
        private String cover_uri;
        private double aed_music_dur;
        private String countries;
        private String vid;
        private AedModelBean aed_model;
        private String ies_video_asr_bait;
        private long extract_item_id;
        private List<?> takedown_groups;

        @NoArgsConstructor
        @Data
        public static class FingerprintInfoBean {
            /**
             * status : 2
             * fingerprint_provider : acr_cloud
             */

            private int status;
            private String fingerprint_provider;
        }

        @NoArgsConstructor
        @Data
        public static class AedModelBean {
            /**
             * speech : 0.5
             * other : 0.48
             * singing : 0.0
             * music : 0.01
             */

            private double speech;
            private double other;
            private double singing;
            private double music;
        }
    }
}

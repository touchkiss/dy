package com.huoshan.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
                    @Data
                    public class AtUser {

                        /**
                         * at_from : aweme_sync
                         * encrypt_user_id : MS4wLjABAAAACm9CH6gxyUf8LO5q-jbwVYiihs53QgDi_7_uW3Eq6uA
                         * end : 29
                         * start : 24
                         * user_id : 888026444866144
                         * user_id_str : 888026444866144
                         * user_type : 0
                         */

                        private String at_from;
                        private String encrypt_user_id;
                        private int end;
                        private int start;
                        private long user_id;
                        private String user_id_str;
                        private int user_type;
                    }

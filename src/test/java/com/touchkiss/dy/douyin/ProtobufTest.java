package com.touchkiss.dy.douyin;

import com.douyin.webcast.*;
import com.google.protobuf.UnknownFieldSet;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created on 2020/09/19 16:21
 *
 * @author Touchkiss
 */
public class ProtobufTest {

    @Test
    void fetchLiveMsg() {

    }

    public void parseMessage(InputStream inputStream) throws IOException {
        RoomMessageSerializer.RoomMessage roomMessage = RoomMessageSerializer.RoomMessage.parseFrom(inputStream);
        for (RoomMessageSerializer.RoomMessage.RoomMessage_Obj1 roomMessage_obj1 : roomMessage.getBodyList()) {
            UnknownFieldSet unknownFields = roomMessage_obj1.getUnknownFields();
            unknownFields.asMap().forEach((k, v) -> {
                if (2 == k) {
                    try {
                        switch (roomMessage_obj1.getMessageType()) {
                            case "WebcastChatMessage":
                                WebcastChatMessageSerializer.WebcastChatMessage webcastChatMessage = WebcastChatMessageSerializer.WebcastChatMessage.parseFrom(v.toByteString(1));
                                System.out.println(webcastChatMessage.getBody().getMsg());
                                break;
                            case "WebcastGiftMessage":
                                WebcastGiftMessageSerializer.WebcastGiftMessage webcastGiftMessage = WebcastGiftMessageSerializer.WebcastGiftMessage.parseFrom(v.toByteString(1));
                                System.out.println(webcastGiftMessage.getBody().getUserInfo().getNickname());
                                System.out.println(webcastGiftMessage.getBody().getTimeInfo().getMsg());
                                System.out.println(webcastGiftMessage.getBody().getGiftCount());
                                for (GiftItemSerializer.GiftItem giftItem : webcastGiftMessage.getBody().getTimeInfo().getGiftInfo().getGiftsList()) {
                                    System.out.println(giftItem.getGiftName().getGiftNameInfo().getGiftName());
                                }
                                break;
                            case "WebcastMemberMessage":
                                WebcastMemberMessageSerializer.WebcastMemberMessage webcastMemberMessage = WebcastMemberMessageSerializer.WebcastMemberMessage.parseFrom(v.toByteString(1));
                                System.out.println(webcastMemberMessage.getBody().getLiveRoomEnterToast().getDetails4().getFromUser().getUserinfo().getNickname() + "" + webcastMemberMessage.getBody().getLiveRoomEnterToast().getMsg());
                                break;
                            case "WebcastLikeMessage":
                                WebcastLikeMessageSerializer.WebcastLikeMessage webcastLikeMessage = WebcastLikeMessageSerializer.WebcastLikeMessage.parseFrom(v.toByteString(1));
                                System.out.println(webcastLikeMessage.getBody().getUserInfo().getNickname() + "给主播点了赞");
                                break;
                            case "WebcastSunDailyRankMessage":
                                WebcastSunDailyRankMessageSerializer.WebcastSunDailyRankMessage webcastSunDailyRankMessage = WebcastSunDailyRankMessageSerializer.WebcastSunDailyRankMessage.parseFrom(v.toByteString(1));
                                System.out.println(v.toByteString(1).toStringUtf8());
                                System.out.println(webcastSunDailyRankMessage.getBody().getRankInHour());
                                System.out.println(webcastSunDailyRankMessage.getBody().getGapWithLastOneInHourRank());
                                System.out.println(webcastSunDailyRankMessage.getBody().getInfo19().getMsg());
                                System.out.println(webcastSunDailyRankMessage.getBody().getInfo20().getMsg());
                            default:
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            System.out.println(roomMessage_obj1.getMessageType());
        }
    }

    @Test
    public void testProtobuf() throws IOException {

    }
}

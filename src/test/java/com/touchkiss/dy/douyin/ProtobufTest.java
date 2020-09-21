package com.touchkiss.dy.douyin;

import com.douyin.webcast.RoomMessageSerializer;
import com.douyin.webcast.WebcastChatMessageSerializer;
import com.douyin.webcast.WebcastGiftMessageSerializer;
import com.google.protobuf.UnknownFieldSet;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created on 2020/09/19 16:21
 *
 * @author Touchkiss
 */
public class ProtobufTest {
    @Test
    public void testProtobuf() throws IOException {
        RoomMessageSerializer.RoomMessage roomMessage = RoomMessageSerializer.RoomMessage.parseFrom(new FileInputStream(new File("D:\\software\\protoc-3.13.0-win64\\bin\\message.bin")));
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
                                System.out.println(webcastGiftMessage.getBody().getUserInfo().getName());
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
}

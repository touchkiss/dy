package com.touchkiss.dy.douyin;

import com.douyin.webcast.RoomMessageSerializer;
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

        for (RoomMessageSerializer.RoomMessage.MessageInfo messageInfo : roomMessage.getBodyList()) {
            System.out.println(messageInfo.getMessageType() + "---" + messageInfo.getMessageBody().getTimeInfo().getMsg());
        }
//        System.out.println(GsonUtil.toJson(roomMessage.getBody(0).getMessageType()));
    }
}

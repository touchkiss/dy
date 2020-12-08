package com.touchkiss.aweme.controller;

import com.douyin.aweme.v1.bean.StickerAwemeResponse;
import com.douyin.aweme.v1.bean.StickerDetailResponse;
import com.douyin.aweme.v2.bean.StickerListResponse;
import com.douyin.aweme.v2.services.AwemeServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2020/12/08 13:02
 *
 * @author Touchkiss
 */
@RestController
@RequestMapping("aweme")
public class AwemeWebController {
    @Autowired
    private AwemeServiceV2 awemeServiceV2;

    @RequestMapping("sticker/{ids}")
    public StickerDetailResponse stickerDetails(@PathVariable String ids) {
        return awemeServiceV2.stickerDetail(ids);
    }

    @RequestMapping("sticker/aweme/{id}")
    public StickerListResponse stickerAweme(@PathVariable Integer id, @RequestParam(name = "cursor", defaultValue = "0") Integer cursor, @RequestParam(name = "count", defaultValue = "15") Integer count) {
        return awemeServiceV2.stickerList(id, cursor, count);
    }
}

package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeStickerInfo;
import com.touchkiss.aweme.services.AwemeStickerInfoDaoService;
import com.touchkiss.common.PageResult;
import com.touchkiss.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created on 2020-12-07 22:32:21
 *
 * @author Touchkiss
 */
@RestController
@RequestMapping("aweme")
public class AwemeStickerInfoController implements BaseController {
    @Autowired
    private AwemeStickerInfoDaoService awemeStickerInfoDaoService;

    @GetMapping("awemeStickerInfo")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeStickerInfoDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeStickerInfo/{id}")
    public AwemeStickerInfo getOne(@PathVariable("id") Long id) {
        return awemeStickerInfoDaoService.selectById(id);
    }

    @DeleteMapping("/awemeStickerInfo/{id}")
    public boolean deleteOne(@PathVariable("id") Long id) {
        return awemeStickerInfoDaoService.deleteById(id);
    }

    @PostMapping("awemeStickerInfo")
    public boolean insertOne(@RequestBody AwemeStickerInfo awemeStickerInfo) {
        return awemeStickerInfoDaoService.insert(awemeStickerInfo);
    }

    @PutMapping("awemeStickerInfo/{id}")
    public boolean updateOne(@RequestBody AwemeStickerInfo awemeStickerInfo, @PathVariable("id") Long id) {
        return awemeStickerInfoDaoService.updateById(awemeStickerInfo, id);
    }

    @PatchMapping("awemeStickerInfo/{id}")
    public boolean updateSelective(@RequestBody AwemeStickerInfo awemeStickerInfo, @PathVariable("id") Long id) {
        return awemeStickerInfoDaoService.updateSelectiveById(awemeStickerInfo, id);
    }
}

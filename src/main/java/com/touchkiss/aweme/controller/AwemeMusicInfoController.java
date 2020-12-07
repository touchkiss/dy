package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeMusicInfo;
import com.touchkiss.aweme.services.AwemeMusicInfoDaoService;
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
public class AwemeMusicInfoController implements BaseController {
    @Autowired
    private AwemeMusicInfoDaoService awemeMusicInfoDaoService;

    @GetMapping("awemeMusicInfo")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeMusicInfoDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeMusicInfo/{mid}")
    public AwemeMusicInfo getOne(@PathVariable("mid") Long mid) {
        return awemeMusicInfoDaoService.selectByMid(mid);
    }

    @DeleteMapping("/awemeMusicInfo/{mid}")
    public boolean deleteOne(@PathVariable("mid") Long mid) {
        return awemeMusicInfoDaoService.deleteByMid(mid);
    }

    @PostMapping("awemeMusicInfo")
    public boolean insertOne(@RequestBody AwemeMusicInfo awemeMusicInfo) {
        return awemeMusicInfoDaoService.insert(awemeMusicInfo);
    }

    @PutMapping("awemeMusicInfo/{mid}")
    public boolean updateOne(@RequestBody AwemeMusicInfo awemeMusicInfo, @PathVariable("mid") Long mid) {
        return awemeMusicInfoDaoService.updateByMid(awemeMusicInfo, mid);
    }

    @PatchMapping("awemeMusicInfo/{mid}")
    public boolean updateSelective(@RequestBody AwemeMusicInfo awemeMusicInfo, @PathVariable("mid") Long mid) {
        return awemeMusicInfoDaoService.updateSelectiveByMid(awemeMusicInfo, mid);
    }
}

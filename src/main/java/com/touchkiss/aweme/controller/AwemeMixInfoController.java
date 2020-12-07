package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeMixInfo;
import com.touchkiss.aweme.services.AwemeMixInfoDaoService;
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
public class AwemeMixInfoController implements BaseController {
    @Autowired
    private AwemeMixInfoDaoService awemeMixInfoDaoService;

    @GetMapping("awemeMixInfo")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeMixInfoDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeMixInfo/{mixId}")
    public AwemeMixInfo getOne(@PathVariable("mixId") Long mixId) {
        return awemeMixInfoDaoService.selectByMixId(mixId);
    }

    @DeleteMapping("/awemeMixInfo/{mixId}")
    public boolean deleteOne(@PathVariable("mixId") Long mixId) {
        return awemeMixInfoDaoService.deleteByMixId(mixId);
    }

    @PostMapping("awemeMixInfo")
    public boolean insertOne(@RequestBody AwemeMixInfo awemeMixInfo) {
        return awemeMixInfoDaoService.insert(awemeMixInfo);
    }

    @PutMapping("awemeMixInfo/{mixId}")
    public boolean updateOne(@RequestBody AwemeMixInfo awemeMixInfo, @PathVariable("mixId") Long mixId) {
        return awemeMixInfoDaoService.updateByMixId(awemeMixInfo, mixId);
    }

    @PatchMapping("awemeMixInfo/{mixId}")
    public boolean updateSelective(@RequestBody AwemeMixInfo awemeMixInfo, @PathVariable("mixId") Long mixId) {
        return awemeMixInfoDaoService.updateSelectiveByMixId(awemeMixInfo, mixId);
    }
}

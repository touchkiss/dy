package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeItem;
import com.touchkiss.aweme.services.AwemeItemDaoService;
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
public class AwemeItemController implements BaseController {
    @Autowired
    private AwemeItemDaoService awemeItemDaoService;

    @GetMapping("awemeItem")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeItemDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeItem/{awemeId}")
    public AwemeItem getOne(@PathVariable("awemeId") Long awemeId) {
        return awemeItemDaoService.selectByAwemeId(awemeId);
    }

    @DeleteMapping("/awemeItem/{awemeId}")
    public boolean deleteOne(@PathVariable("awemeId") Long awemeId) {
        return awemeItemDaoService.deleteByAwemeId(awemeId);
    }

    @PostMapping("awemeItem")
    public boolean insertOne(@RequestBody AwemeItem awemeItem) {
        return awemeItemDaoService.insert(awemeItem);
    }

    @PutMapping("awemeItem/{awemeId}")
    public boolean updateOne(@RequestBody AwemeItem awemeItem, @PathVariable("awemeId") Long awemeId) {
        return awemeItemDaoService.updateByAwemeId(awemeItem, awemeId);
    }

    @PatchMapping("awemeItem/{awemeId}")
    public boolean updateSelective(@RequestBody AwemeItem awemeItem, @PathVariable("awemeId") Long awemeId) {
        return awemeItemDaoService.updateSelectiveByAwemeId(awemeItem, awemeId);
    }
}

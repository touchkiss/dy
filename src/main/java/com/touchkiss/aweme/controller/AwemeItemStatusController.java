package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeItemStatus;
import com.touchkiss.aweme.services.AwemeItemStatusDaoService;
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
public class AwemeItemStatusController implements BaseController {
    @Autowired
    private AwemeItemStatusDaoService awemeItemStatusDaoService;

    @GetMapping("awemeItemStatus")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeItemStatusDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeItemStatus/{awemeId}")
    public AwemeItemStatus getOne(@PathVariable("awemeId") Long awemeId) {
        return awemeItemStatusDaoService.selectByAwemeId(awemeId);
    }

    @DeleteMapping("/awemeItemStatus/{awemeId}")
    public boolean deleteOne(@PathVariable("awemeId") Long awemeId) {
        return awemeItemStatusDaoService.deleteByAwemeId(awemeId);
    }

    @PostMapping("awemeItemStatus")
    public boolean insertOne(@RequestBody AwemeItemStatus awemeItemStatus) {
        return awemeItemStatusDaoService.insert(awemeItemStatus);
    }

    @PutMapping("awemeItemStatus/{awemeId}")
    public boolean updateOne(@RequestBody AwemeItemStatus awemeItemStatus, @PathVariable("awemeId") Long awemeId) {
        return awemeItemStatusDaoService.updateByAwemeId(awemeItemStatus, awemeId);
    }

    @PatchMapping("awemeItemStatus/{awemeId}")
    public boolean updateSelective(@RequestBody AwemeItemStatus awemeItemStatus, @PathVariable("awemeId") Long awemeId) {
        return awemeItemStatusDaoService.updateSelectiveByAwemeId(awemeItemStatus, awemeId);
    }
}

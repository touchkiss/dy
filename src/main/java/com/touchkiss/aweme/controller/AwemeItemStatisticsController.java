package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeItemStatistics;
import com.touchkiss.aweme.services.AwemeItemStatisticsDaoService;
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
public class AwemeItemStatisticsController implements BaseController {
    @Autowired
    private AwemeItemStatisticsDaoService awemeItemStatisticsDaoService;

    @GetMapping("awemeItemStatistics")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeItemStatisticsDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeItemStatistics/{awemeId}")
    public AwemeItemStatistics getOne(@PathVariable("awemeId") Long awemeId) {
        return awemeItemStatisticsDaoService.selectByAwemeId(awemeId);
    }

    @DeleteMapping("/awemeItemStatistics/{awemeId}")
    public boolean deleteOne(@PathVariable("awemeId") Long awemeId) {
        return awemeItemStatisticsDaoService.deleteByAwemeId(awemeId);
    }

    @PostMapping("awemeItemStatistics")
    public boolean insertOne(@RequestBody AwemeItemStatistics awemeItemStatistics) {
        return awemeItemStatisticsDaoService.insert(awemeItemStatistics);
    }

    @PutMapping("awemeItemStatistics/{awemeId}")
    public boolean updateOne(@RequestBody AwemeItemStatistics awemeItemStatistics, @PathVariable("awemeId") Long awemeId) {
        return awemeItemStatisticsDaoService.updateByAwemeId(awemeItemStatistics, awemeId);
    }

    @PatchMapping("awemeItemStatistics/{awemeId}")
    public boolean updateSelective(@RequestBody AwemeItemStatistics awemeItemStatistics, @PathVariable("awemeId") Long awemeId) {
        return awemeItemStatisticsDaoService.updateSelectiveByAwemeId(awemeItemStatistics, awemeId);
    }
}

package com.touchkiss.aweme.controller;

import com.touchkiss.aweme.bean.AwemeItemComment;
import com.touchkiss.aweme.services.AwemeItemCommentDaoService;
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
public class AwemeItemCommentController implements BaseController {
    @Autowired
    private AwemeItemCommentDaoService awemeItemCommentDaoService;

    @GetMapping("awemeItemComment")
    public PageResult list(HttpServletRequest request, Integer p, Integer pagesize) {
        HashMap<String, String> whereMap = parameterMap(request);
        return new PageResult(awemeItemCommentDaoService.findByPage(p == null ? 1 : p, pagesize == null ? 10 : pagesize, whereMap));
    }

    @GetMapping("/awemeItemComment/{cid}")
    public AwemeItemComment getOne(@PathVariable("cid") Long cid) {
        return awemeItemCommentDaoService.selectByCid(cid);
    }

    @DeleteMapping("/awemeItemComment/{cid}")
    public boolean deleteOne(@PathVariable("cid") Long cid) {
        return awemeItemCommentDaoService.deleteByCid(cid);
    }

    @PostMapping("awemeItemComment")
    public boolean insertOne(@RequestBody AwemeItemComment awemeItemComment) {
        return awemeItemCommentDaoService.insert(awemeItemComment);
    }

    @PutMapping("awemeItemComment/{cid}")
    public boolean updateOne(@RequestBody AwemeItemComment awemeItemComment, @PathVariable("cid") Long cid) {
        return awemeItemCommentDaoService.updateByCid(awemeItemComment, cid);
    }

    @PatchMapping("awemeItemComment/{cid}")
    public boolean updateSelective(@RequestBody AwemeItemComment awemeItemComment, @PathVariable("cid") Long cid) {
        return awemeItemCommentDaoService.updateSelectiveByCid(awemeItemComment, cid);
    }
}

package com.ivlai.templates.ssm.controller;

import com.ivlai.templates.ssm.utils.ReturnUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("content")
public class ContentController {

    @RequestMapping
    public ReturnUtil index() {
        ReturnUtil returnUtil = new ReturnUtil();
        returnUtil.isSuccess("信息管理");
        return returnUtil;
    }

}

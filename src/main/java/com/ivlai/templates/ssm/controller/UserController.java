package com.ivlai.templates.ssm.controller;

import com.ivlai.templates.ssm.utils.ReturnUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping
    public ReturnUtil index() {
        ReturnUtil returnUtil = new ReturnUtil();
        returnUtil.isSuccess("用户管理");
        return returnUtil;
    }

}

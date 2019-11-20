package com.ivlai.templates.ssm.controller;

import com.ivlai.templates.ssm.entity.UserInfo;
import com.ivlai.templates.ssm.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("reg")
    public String reg(
            UserInfo userInfo
            , Model model
    ) {
        int i = userInfoService.insertUserInfoByUserInfo(userInfo);
        if (i > 0) {
            model.addAttribute("info", "注册成功");
        } else {
            model.addAttribute("info", "注册失败");
        }
        return "reg";
    }

}

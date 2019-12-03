package com.ivlai.templates.ssm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 * 登录注册管理器
 */
@RequestMapping("/login")
@Controller
public class LARController {

    @ResponseBody
    @RequestMapping
    public void index(){
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("/i18n/i18n_zh_CN.json");
        System.out.println(file.exists());


    }

}

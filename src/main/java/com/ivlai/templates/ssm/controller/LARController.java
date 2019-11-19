package com.ivlai.templates.ssm.controller;

import com.ivlai.templates.ssm.entity.AdminUser;
import com.ivlai.templates.ssm.service.AdminUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 登录注册管理器
 */
@RequestMapping("/login")
@Controller
public class LARController {

    @Resource
    private AdminUserService adminUserService;

    /**
     * 管理员登录管理器
     */
    @RequestMapping("admin")
    public String admin(
            AdminUser adminUser
            , Model model
    ) {
        /* 有账号 */
        if (null != adminUser.getAdminAccount()) {
            AdminUser reAdminUser = adminUserService.selectAdminUserByAdminUser(adminUser);
            if (null == reAdminUser || null == reAdminUser.getAdminAccount()) {
                /* -1：账号不存在 */
                model.addAttribute("info", "账号不存在");
            } else if (!reAdminUser.getAdminPassword().equals(adminUser.getAdminPassword())) {
                return "redirect:/admin";
            } else {
                /* 密码错误 */
                model.addAttribute("info", "密码错误");
            }
        }
        return "adminLogin";
    }


}

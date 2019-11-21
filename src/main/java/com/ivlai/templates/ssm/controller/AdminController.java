package com.ivlai.templates.ssm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivlai.templates.ssm.entity.AdminMenu;
import com.ivlai.templates.ssm.entity.AdminUser;
import com.ivlai.templates.ssm.service.AdminUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Resource
    private AdminUserService adminUserService;

    /**
     * 管理员登录管理器
     */
    @RequestMapping("")
    public String admin(
            AdminUser adminUser
            , Model model
            , HttpServletRequest request
    ) {
        HttpSession session = request.getSession();
        /* 有账号 */
        if (null != adminUser.getAdminAccount()) {
            AdminUser reAdminUser = adminUserService.selectAdminUserByAdminUser(adminUser);
            if (null == reAdminUser || null == reAdminUser.getAdminAccount()) {
                /* -1：账号不存在 */
                model.addAttribute("info", "账号不存在");
            } else if (reAdminUser.getAdminPassword().equals(adminUser.getAdminPassword())) {
                /* 密码正确，跳转到主页 */
                session.setAttribute("adminUser", reAdminUser);
                return "redirect:/admin/do/index";
            } else {
                /* 密码错误 */
                model.addAttribute("info", "密码错误");
            }
        } else if (null != session.getAttribute("adminUser")) {
            /* 已有管理员账号信息，直接跳转到主页 */
            return "redirect:/admin/do/index";
        }
        return "adminLogin";
    }

    /**
     * 管理员主页
     */
    @RequestMapping("do/index")
    public String _index(
            @RequestParam(defaultValue = "1") Integer adminMenuActive
            , HttpServletRequest request
            , Model model
    ) throws IOException {
        HttpSession session = request.getSession();
        AdminUser adminUser = (AdminUser) session.getAttribute("adminUser");
        List<Map<String, Object>> adminMenuList = getAdminMenuList(adminUser.getAdminMenu());
        model.addAttribute("adminMenuList", adminMenuList);
        model.addAttribute("adminMenuActive", adminMenuActive);
        return "WEB-INF/index";
    }

    /**
     * 获取该用户的菜单列表
     */
    private List<Map<String, Object>> getAdminMenuList(String menuListStr) throws IOException {

        ArrayList<Map<String, Object>> menuList = new ArrayList<>();

        /* 获取主菜单列表 */
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<Integer> adminListForCan = objectMapper.readValue(menuListStr, ArrayList.class);
        /* 获取主菜单列表 */
        List<AdminMenu> adminMenuList = adminUserService.selectAdminMenuList(0, null);
        adminMenuList.forEach((adminMenu) -> {
            List<AdminMenu> adminMenus = adminUserService.selectAdminMenuList(adminMenu.getAdminMenuId(), adminListForCan);
            HashMap<String, Object> map = new HashMap<>();
            map.put("adminMenu", adminMenu);
            map.put("adminMenus", adminMenus);
            menuList.add(map);
        });

        return menuList;
    }


}

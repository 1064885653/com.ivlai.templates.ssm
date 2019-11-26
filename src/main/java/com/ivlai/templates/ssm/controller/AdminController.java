package com.ivlai.templates.ssm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivlai.templates.ssm.entity.AdminMenu;
import com.ivlai.templates.ssm.entity.AdminMenuVo;
import com.ivlai.templates.ssm.entity.AdminUser;
import com.ivlai.templates.ssm.service.AdminUserService;
import com.ivlai.templates.ssm.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Resource
    private AdminUserService adminUserService;
    @Resource
    private UserInfoService userInfoService;

    /**
     * 管理员登录管理器
     */
    @RequestMapping("")
    public String admin(
            AdminUser adminUser
            , Model model
            , HttpServletRequest request
    ) throws IOException {
        HttpSession session = request.getSession();
        /* 有账号 */
        if (null != adminUser.getAdminAccount()) {
            AdminUser reAdminUser = adminUserService.selectAdminUserByAdminUser(adminUser);
            if (null == reAdminUser || null == reAdminUser.getAdminAccount()) {
                /* -1：账号不存在 */
                model.addAttribute("info", "账号不存在");
            } else if (reAdminUser.getAdminPassword().equals(adminUser.getAdminPassword())) {
                /* 密码正确，跳转到主页 */
                session.setAttribute("adminUser", reAdminUser); /* 存储用户信息 */
                List<AdminMenuVo> adminMenuVoList = getAdminMenuList(reAdminUser.getAdminMenu());
                session.setAttribute("adminMenuVoList", adminMenuVoList); /* 将该用户所拥有的菜单保存到session */
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
     * 退出登录
     */
    @RequestMapping("out")
    public String out(
            HttpServletRequest request
    ) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/admin";
    }

    /**
     * 管理员
     */
    @RequestMapping("do/admin")
    public String admin(
            AdminUser adminUser
            , Model model
    ) {
        if (null != adminUser.getAdminAccount() && !adminUser.getAdminAccount().isEmpty() && null != adminUser.getAdminPassword()) {
            /* 添加  */
            int i = adminUserService.insertAdminUserByAdminUser(adminUser);
            if (i > 0) {
                model.addAttribute("info", "添加成功");
            } else {
                model.addAttribute("info", "添加失败");
            }
        } else if (null != adminUser.getAdminAccount()) {
            ArrayList<String> integers = new ArrayList<>();
            integers.add(adminUser.getAdminAccount());
            int i = adminUserService.deleteAdminUserByAdminUser(integers);
            if (i > 0) {
                model.addAttribute("info", "删除成功");
            } else {
                model.addAttribute("info", "删除失败");
            }
        }

        List<AdminUser> adminUserList = adminUserService.selectAdminUserList();
        model.addAttribute("adminUserList", adminUserList);
        return "WEB-INF/admin/index";
    }


    /**
     * 权限管理
     */
    @RequestMapping("do/adminUserAuth")
    public String adminUserAuth(
            Model model
            , AdminUser adminUser
            , AdminMenu adminMenu
    ) {

        /* 判断是否是需要更改用户菜单信息 */
        if (null != adminUser.getAdminAccount() && null != adminUser.getAdminMenu()) {
            adminUserService.updateAdminUserByAdminUser(adminUser);
        }

        if (null != adminMenu.getAdminMenuId() && null != adminMenu.getAdminMenuName() && !adminMenu.getAdminMenuName().isEmpty()) {
            /* 更新菜单列表 */
            ArrayList<Integer> list = new ArrayList<>();
            list.add(adminMenu.getAdminMenuId());
            List<AdminMenu> adminMenus = adminUserService.selectAdminMenuList(null, list);
            if (adminMenus.size() > 0) {
                /* 更新 */
                adminUserService.updateAdminMenuByAdminMenuId(adminMenu);
            } else {
                /* 添加 */
                adminUserService.insertAdminMenuByAdminMenu(adminMenu);
            }
        } else if (null != adminMenu.getAdminMenuId() && (null == adminMenu.getAdminMenuName() || adminMenu.getAdminMenuName().isEmpty())) {
            /* 删除菜单 */
            ArrayList<Integer> list = new ArrayList<>();
            list.add(adminMenu.getAdminMenuId());
            int i = adminUserService.deleteAdminMenuByAdminMenuId(list);
            if (i > 0) {
                model.addAttribute("info", "删除成功");
            } else {
                model.addAttribute("info", "删除失败");
            }
        }

        List<AdminUser> adminUserList = adminUserService.selectAdminUserList();
        List<AdminMenu> adminMenuList = adminUserService.selectAdminMenuList(null, null);

        model.addAttribute("adminUserList", adminUserList);
        model.addAttribute("adminMenuList", adminMenuList);

        return "WEB-INF/admin/adminUserAuth";
    }


    /**
     * 管理员主页
     */
    @RequestMapping("do/index")
    public String _index(
            HttpServletRequest request
            , Model model
    ) {
        return "redirect:/admin/do/admin";
    }

    /**
     * 用户管理
     */
    @RequestMapping("do/user")
    public String user() {
       /* if ( null != userIdList && userIdList.size() > 0) {
            int i = userInfoService.deleteUserInfoByUserInfoId(userIdList);
            if (i > 0) {
                model.addAttribute("info", "删除成功");
            } else {
                model.addAttribute("info", "删除失败");
            }
        }
        List<UserInfo> userInfoList = userInfoService.selectUserInfoListByUserInfo(null);
        model.addAttribute("userInfoList", userInfoList);*/
        return "WEB-INF/user/index";
    }


    /**
     * 用户管理
     */
    @ResponseBody
    @RequestMapping("do/user/json")
    public Object user_json(
            @RequestParam(value = "userId", required = false) List<Integer> userIdList
    ) {
        if (null != userIdList && userIdList.size() > 0) {
            int i = userInfoService.deleteUserInfoByUserInfoId(userIdList);
            return i > 0;
        }
        return userInfoService.selectUserInfoListByUserInfo(null);
    }

    /**
     * 用户信息管理
     */
    @ResponseBody
    @RequestMapping("do/message/json")
    public Object message_json(
            @RequestParam(value = "userId", required = false) List<Integer> userIdList
    ) {
        if (null != userIdList && userIdList.size() > 0) {
            int i = userInfoService.deleteUserInfoByUserInfoId(userIdList);
            return i > 0;
        }
        return userInfoService.selectMessageUserListByMessageUser(null);
    }

    /**
     * 用户信息管理
     */
    @RequestMapping("do/message")
    public String messageUser() {
        return "WEB-INF/user/messageUser";
    }

    /**
     * 获取该用户的菜单列表
     */
    private List<AdminMenuVo> getAdminMenuList(String menuListStr) throws IOException {
        ArrayList<AdminMenuVo> menuList = new ArrayList<>();

        /* 获取主菜单列表 */
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<Integer> adminListForCan = objectMapper.readValue(menuListStr, ArrayList.class);
        /* 获取主菜单列表 */
        List<AdminMenu> adminMenuList = adminUserService.selectAdminMenuList(0, null);
        /* 获取子菜单列表 */
        adminMenuList.forEach((adminMenu) -> {
            List<AdminMenu> adminMenus = adminUserService.selectAdminMenuList(adminMenu.getAdminMenuId(), adminListForCan);
            AdminMenuVo adminMenuVo = new AdminMenuVo();
            adminMenuVo.setAdminMenu(adminMenu);
            adminMenuVo.setAdminMenuList(adminMenus);
            menuList.add(adminMenuVo);
        });

        return menuList;
    }


}

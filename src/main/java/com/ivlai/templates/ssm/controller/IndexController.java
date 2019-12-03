package com.ivlai.templates.ssm.controller;

import com.ivlai.templates.ssm.entity.Menu;
import com.ivlai.templates.ssm.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
@SuppressWarnings({"unchecked"})
public class IndexController {

    @Resource
    private IndexService indexService;

    /**
     * 获取菜单并保存到session
     */
    @ModelAttribute
    private void saveMenuListToSession(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        List<Menu> menuList = (List<Menu>) session.getAttribute("menuList");
        if (null == menuList || menuList.isEmpty()) {
            menuList = indexService.selectMenuList();
            session.setAttribute("menuList", menuList);
        }
        model.addAttribute("menuList", menuList);
    }

    /**
     * 主页
     */
    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("contact")
    public String contact(){
        return "contact";
    }


}

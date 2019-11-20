package com.ivlai.templates.ssm.controller;

import com.ivlai.templates.ssm.entity.Content;
import com.ivlai.templates.ssm.entity.ContentMenu;
import com.ivlai.templates.ssm.entity.ContentWithBLOBs;
import com.ivlai.templates.ssm.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("content")
public class ContentController {

    @Resource
    private ContentService contentService;

    @RequestMapping({"{type}", "{type}/{title}", "{type}/{title}/{id}"})
    public String index(
            @PathVariable String type
            , @PathVariable(required = false) String title
            , @PathVariable(required = false) Integer id
            , Model model
    ) {
        ContentMenu contentMenu = new ContentMenu();
        /* 获取type下的title列表 */
        contentMenu.setContentMenuTypeUrl(type);
        List<ContentMenu> contentMenuList = contentService.selectContentMenuListBuContentMenu(contentMenu);

        /* 获取title下的content列表 */
        if (null == title) title = contentMenuList.get(0).getContentMenuTitleUrl();
        contentMenu.setContentMenuTitleUrl(title);
        List<ContentMenu> contentMenuList2 = contentService.selectContentMenuListBuContentMenu(contentMenu);
        List<Integer> titleList = contentMenuList2.stream().map(ContentMenu::getContentMenuId).collect(Collectors.toList());
        List<Content> contentList = contentService.selectContentListByContentMenuInMenu(titleList);

        /* 内容详情 */
        if (null == id) id = contentList.get(0).getContentId();
        ContentWithBLOBs contentInfo = contentService.selectContentInfoById(id);

        model.addAttribute("type", type);
        model.addAttribute("title", title);
        model.addAttribute("contentMenuList", contentMenuList);
        model.addAttribute("contentList", contentList);
        model.addAttribute("contentInfo", contentInfo);

        return "content";
    }

}

package com.ivlai.templates.ssm.service;

import com.ivlai.templates.ssm.entity.Content;
import com.ivlai.templates.ssm.entity.ContentMenu;
import com.ivlai.templates.ssm.entity.ContentWithBLOBs;

import java.util.List;

public interface ContentService {

    List<ContentMenu> selectContentMenuListBuContentMenu(ContentMenu contentMenu);

    List<Content> selectContentListByContentMenuInMenu(List<Integer> menuIdList);

    ContentWithBLOBs selectContentInfoById(Integer contentId);

}

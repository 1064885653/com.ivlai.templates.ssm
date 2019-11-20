package com.ivlai.templates.ssm.service.impl;

import com.ivlai.templates.ssm.entity.*;
import com.ivlai.templates.ssm.mapper.ContentMapper;
import com.ivlai.templates.ssm.mapper.ContentMenuMapper;
import com.ivlai.templates.ssm.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    private ContentMapper contentMapper;
    @Resource
    private ContentMenuMapper contentMenuMapper;

    /**
     * 获取菜单列表
     */
    @Override
    public List<ContentMenu> selectContentMenuListBuContentMenu(ContentMenu contentMenu) {
        ContentMenuExample contentMenuExample = new ContentMenuExample();
        ContentMenuExample.Criteria criteria = contentMenuExample.createCriteria();

        criteria.andContentMenuTypeUrlEqualTo(contentMenu.getContentMenuTypeUrl());
        if (null != contentMenu.getContentMenuTitleUrl()) criteria.andContentMenuTitleUrlEqualTo(contentMenu.getContentMenuTitleUrl());
        return contentMenuMapper.selectByExample(contentMenuExample);
    }

    @Override
    public List<Content> selectContentListByContentMenuInMenu(List<Integer> menuIdList) {
        ContentExample contentExample = new ContentExample();
        ContentExample.Criteria criteria = contentExample.createCriteria();
        criteria.andContentMenuIn(menuIdList);
        return contentMapper.selectByExample(contentExample);
    }

    @Override
    public ContentWithBLOBs selectContentInfoById(Integer contentId) {
        return contentMapper.selectByPrimaryKey(contentId);
    }

}

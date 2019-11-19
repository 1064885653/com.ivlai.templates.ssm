package com.ivlai.templates.ssm.service.impl;

import com.ivlai.templates.ssm.entity.Content;
import com.ivlai.templates.ssm.mapper.ContentMapper;
import com.ivlai.templates.ssm.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    private ContentMapper contentMapper;

    @Override
    public List<Content> selectContentMenuList(Content content) {
        return null;
    }
}

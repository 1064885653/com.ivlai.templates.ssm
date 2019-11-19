package com.ivlai.templates.ssm.service;

import com.ivlai.templates.ssm.entity.Content;

import java.util.List;

public interface ContentService {

    List<Content> selectContentMenuList(Content content);

}

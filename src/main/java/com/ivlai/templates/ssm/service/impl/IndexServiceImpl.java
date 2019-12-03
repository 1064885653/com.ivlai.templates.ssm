package com.ivlai.templates.ssm.service.impl;

import com.ivlai.templates.ssm.entity.Menu;
import com.ivlai.templates.ssm.mapper.MenuMapper;
import com.ivlai.templates.ssm.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectMenuList() {
        return menuMapper.selectByExample(null);
    }
}

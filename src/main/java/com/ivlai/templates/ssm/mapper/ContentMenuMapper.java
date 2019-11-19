package com.ivlai.templates.ssm.mapper;

import com.ivlai.templates.ssm.entity.ContentMenu;
import com.ivlai.templates.ssm.entity.ContentMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentMenuMapper {
    long countByExample(ContentMenuExample example);

    int deleteByExample(ContentMenuExample example);

    int deleteByPrimaryKey(Integer contentMenuId);

    int insert(ContentMenu record);

    int insertSelective(ContentMenu record);

    List<ContentMenu> selectByExample(ContentMenuExample example);

    ContentMenu selectByPrimaryKey(Integer contentMenuId);

    int updateByExampleSelective(@Param("record") ContentMenu record, @Param("example") ContentMenuExample example);

    int updateByExample(@Param("record") ContentMenu record, @Param("example") ContentMenuExample example);

    int updateByPrimaryKeySelective(ContentMenu record);

    int updateByPrimaryKey(ContentMenu record);
}
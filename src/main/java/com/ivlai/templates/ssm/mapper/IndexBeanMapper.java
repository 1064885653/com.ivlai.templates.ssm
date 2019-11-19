package com.ivlai.templates.ssm.mapper;

import com.ivlai.templates.ssm.entity.IndexBean;
import com.ivlai.templates.ssm.entity.IndexBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexBeanMapper {
    long countByExample(IndexBeanExample example);

    int deleteByExample(IndexBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexBean record);

    int insertSelective(IndexBean record);

    List<IndexBean> selectByExample(IndexBeanExample example);

    IndexBean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexBean record, @Param("example") IndexBeanExample example);

    int updateByExample(@Param("record") IndexBean record, @Param("example") IndexBeanExample example);

    int updateByPrimaryKeySelective(IndexBean record);

    int updateByPrimaryKey(IndexBean record);
}
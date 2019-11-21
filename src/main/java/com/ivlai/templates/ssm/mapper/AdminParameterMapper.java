package com.ivlai.templates.ssm.mapper;

import com.ivlai.templates.ssm.entity.AdminParameter;
import com.ivlai.templates.ssm.entity.AdminParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminParameterMapper {
    long countByExample(AdminParameterExample example);

    int deleteByExample(AdminParameterExample example);

    int deleteByPrimaryKey(Integer adminParameterId);

    int insert(AdminParameter record);

    int insertSelective(AdminParameter record);

    List<AdminParameter> selectByExample(AdminParameterExample example);

    AdminParameter selectByPrimaryKey(Integer adminParameterId);

    int updateByExampleSelective(@Param("record") AdminParameter record, @Param("example") AdminParameterExample example);

    int updateByExample(@Param("record") AdminParameter record, @Param("example") AdminParameterExample example);

    int updateByPrimaryKeySelective(AdminParameter record);

    int updateByPrimaryKey(AdminParameter record);
}
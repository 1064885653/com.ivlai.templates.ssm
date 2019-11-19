package com.ivlai.templates.ssm.mapper;

import com.ivlai.templates.ssm.entity.Nationality;
import com.ivlai.templates.ssm.entity.NationalityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NationalityMapper {
    long countByExample(NationalityExample example);

    int deleteByExample(NationalityExample example);

    int deleteByPrimaryKey(String nationalityEnglish);

    int insert(Nationality record);

    int insertSelective(Nationality record);

    List<Nationality> selectByExample(NationalityExample example);

    Nationality selectByPrimaryKey(String nationalityEnglish);

    int updateByExampleSelective(@Param("record") Nationality record, @Param("example") NationalityExample example);

    int updateByExample(@Param("record") Nationality record, @Param("example") NationalityExample example);

    int updateByPrimaryKeySelective(Nationality record);

    int updateByPrimaryKey(Nationality record);
}
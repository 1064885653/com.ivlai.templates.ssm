package com.ivlai.templates.ssm.mapper;

import com.ivlai.templates.ssm.entity.UserNation;
import com.ivlai.templates.ssm.entity.UserNationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserNationMapper {
    long countByExample(UserNationExample example);

    int deleteByExample(UserNationExample example);

    int deleteByPrimaryKey(Integer userNationId);

    int insert(UserNation record);

    int insertSelective(UserNation record);

    List<UserNation> selectByExample(UserNationExample example);

    UserNation selectByPrimaryKey(Integer userNationId);

    int updateByExampleSelective(@Param("record") UserNation record, @Param("example") UserNationExample example);

    int updateByExample(@Param("record") UserNation record, @Param("example") UserNationExample example);

    int updateByPrimaryKeySelective(UserNation record);

    int updateByPrimaryKey(UserNation record);
}
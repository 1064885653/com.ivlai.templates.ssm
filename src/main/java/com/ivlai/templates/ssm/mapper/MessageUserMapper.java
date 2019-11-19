package com.ivlai.templates.ssm.mapper;

import com.ivlai.templates.ssm.entity.MessageUser;
import com.ivlai.templates.ssm.entity.MessageUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageUserMapper {
    long countByExample(MessageUserExample example);

    int deleteByExample(MessageUserExample example);

    int deleteByPrimaryKey(Integer messageUserId);

    int insert(MessageUser record);

    int insertSelective(MessageUser record);

    List<MessageUser> selectByExample(MessageUserExample example);

    MessageUser selectByPrimaryKey(Integer messageUserId);

    int updateByExampleSelective(@Param("record") MessageUser record, @Param("example") MessageUserExample example);

    int updateByExample(@Param("record") MessageUser record, @Param("example") MessageUserExample example);

    int updateByPrimaryKeySelective(MessageUser record);

    int updateByPrimaryKey(MessageUser record);
}
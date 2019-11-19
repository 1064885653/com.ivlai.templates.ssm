package com.ivlai.templates.ssm.service;

import com.ivlai.templates.ssm.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    UserInfo selectUserInfoByUserInfoId(UserInfo userInfo);

    List<UserInfo> selectUserInfoListByUserInfo(UserInfo userInfo);

    int insertUserInfoByUserInfo(UserInfo userInfo);

    int deleteUserInfoByUserInfoId(UserInfo userInfo);

    int updateUserInfoByUserInfo(UserInfo userInfo);

}

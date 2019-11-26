package com.ivlai.templates.ssm.service;

import com.ivlai.templates.ssm.entity.MessageUser;
import com.ivlai.templates.ssm.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    UserInfo selectUserInfoByUserInfoId(Integer userInfoId);

    List<UserInfo> selectUserInfoListByUserInfo(UserInfo userInfo);

    int insertUserInfoByUserInfo(UserInfo userInfo);

    int deleteUserInfoByUserInfoId(List<Integer> idList);

    int updateUserInfoByUserInfo(UserInfo userInfo);


    MessageUser selectMessageUserByMessageUserId(Integer MessageUserId);

    List<MessageUser> selectMessageUserListByMessageUser(MessageUser messageUser);

    int insertMessageUserByMessageUser(MessageUser messageUser);

    int deleteMessageUserByMessageUserId(List<Integer> idList);

    int updateMessageUserByMessageUser(MessageUser messageUser);

}

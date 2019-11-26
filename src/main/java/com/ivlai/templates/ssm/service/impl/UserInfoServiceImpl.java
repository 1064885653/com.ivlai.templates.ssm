package com.ivlai.templates.ssm.service.impl;

import com.ivlai.templates.ssm.entity.MessageUser;
import com.ivlai.templates.ssm.entity.MessageUserExample;
import com.ivlai.templates.ssm.entity.UserInfo;
import com.ivlai.templates.ssm.entity.UserInfoExample;
import com.ivlai.templates.ssm.mapper.MessageUserMapper;
import com.ivlai.templates.ssm.mapper.UserInfoMapper;
import com.ivlai.templates.ssm.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private MessageUserMapper messageUserMapper;

    @Override
    public UserInfo selectUserInfoByUserInfoId(Integer userInfoId) {
        return userInfoMapper.selectByPrimaryKey(userInfoId);
    }

    @Override
    public List<UserInfo> selectUserInfoListByUserInfo(UserInfo userInfo) {

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        if (null != userInfo) {
            if (null != userInfo.getUserName()) criteria.andUserNameLike("%" + userInfo.getUserName() + "%");
            else if (null != userInfo.getUserType()) criteria.andUserTypeEqualTo(userInfo.getUserType());
            else if (null != userInfo.getUserAge()) criteria.andUserAgeEqualTo(userInfo.getUserAge());
            else if (null != userInfo.getUserGender()) criteria.andUserGenderEqualTo(userInfo.getUserGender());
            else if (null != userInfo.getUserNation()) criteria.andUserNationEqualTo(userInfo.getUserNation());
            else if (null != userInfo.getUserAppellation()) criteria.andUserAppellationLike("%" + userInfo.getUserAppellation() + "%");
            else if (null != userInfo.getUserNationality()) criteria.andUserNationalityLike("%" + userInfo.getUserNationality() + "%");
            else if (null != userInfo.getUserAddress()) criteria.andUserAddressLike("%" + userInfo.getUserAddress() + "%");
            else if (null != userInfo.getUserAddressNow()) criteria.andUserAddressNowLike("%" + userInfo.getUserAddressNow() + "%");
            else if (null != userInfo.getUserPhone()) criteria.andUserPhoneLike("%" + userInfo.getUserPhone() + "%");
            else if (null != userInfo.getUserQq()) criteria.andUserQqLike("%" + userInfo.getUserQq() + "%");
            else if (null != userInfo.getUserWechat()) criteria.andUserWechatLike("%" + userInfo.getUserWechat() + "%");
            else if (null != userInfo.getUserEmail()) criteria.andUserEmailLike("%" + userInfo.getUserEmail() + "%");
            else if (null != userInfo.getUserCompanyName()) criteria.andUserCompanyNameLike("%" + userInfo.getUserCompanyName() + "%");
            else if (null != userInfo.getUserCompanyPost()) criteria.andUserCompanyPostLike("%" + userInfo.getUserCompanyPost() + "%");
            else if (null != userInfo.getUserCompanyAddress()) criteria.andUserCompanyAddressLike("%" + userInfo.getUserCompanyAddress() + "%");
            else if (null != userInfo.getUserCompanyPhone()) criteria.andUserCompanyPhoneLike("%" + userInfo.getUserCompanyPhone() + "%");
            else if (null != userInfo.getUserCompanyPhoneFix()) criteria.andUserCompanyPhoneFixLike("%" + userInfo.getUserCompanyPhoneFix() + "%");
            else if (null != userInfo.getUserCompanyEmail()) criteria.andUserCompanyEmailLike("%" + userInfo.getUserCompanyEmail() + "%");
            else if (null != userInfo.getUserInfoRemark()) criteria.andUserInfoRemarkLike("%" + userInfo.getUserInfoRemark() + "%");
        }
        return userInfoMapper.selectByExample(userInfoExample);
    }

    @Override
    public int insertUserInfoByUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public int deleteUserInfoByUserInfoId(List<Integer> idList) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUserIdIn(idList);
        return userInfoMapper.deleteByExample(userInfoExample);
    }

    @Override
    public int updateUserInfoByUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public MessageUser selectMessageUserByMessageUserId(Integer MessageUserId) {
        return messageUserMapper.selectByPrimaryKey(MessageUserId);
    }

    @Override
    public List<MessageUser> selectMessageUserListByMessageUser(MessageUser messageUser) {
        MessageUserExample messageUserExample = new MessageUserExample();
        MessageUserExample.Criteria criteria = messageUserExample.createCriteria();
        if (null != messageUser) {
            if (null != messageUser.getMessageUserName()) criteria.andMessageUserNameLike("%" + messageUser.getMessageUserName() + "%");
            else if (null != messageUser.getMessageUserType()) criteria.andMessageUserTypeEqualTo(messageUser.getMessageUserType());
            else if (null != messageUser.getMessageUserAge()) criteria.andMessageUserAgeEqualTo(messageUser.getMessageUserAge());
            else if (null != messageUser.getMessageUserGender()) criteria.andMessageUserGenderEqualTo(messageUser.getMessageUserGender());
            else if (null != messageUser.getMessageUserNation()) criteria.andMessageUserNationEqualTo(messageUser.getMessageUserNation());
            else if (null != messageUser.getMessageUserAppellation())
                criteria.andMessageUserAppellationLike("%" + messageUser.getMessageUserAppellation() + "%");
            else if (null != messageUser.getMessageUserNationality())
                criteria.andMessageUserNationalityLike("%" + messageUser.getMessageUserNationality() + "%");
            else if (null != messageUser.getMessageUserAddress()) criteria.andMessageUserAddressLike("%" + messageUser.getMessageUserAddress() + "%");
            else if (null != messageUser.getMessageUserAddressNow()) criteria.andMessageUserAddressNowLike("%" + messageUser.getMessageUserAddressNow() + "%");
            else if (null != messageUser.getMessageUserPhone()) criteria.andMessageUserPhoneLike("%" + messageUser.getMessageUserPhone() + "%");
            else if (null != messageUser.getMessageUserQq()) criteria.andMessageUserQqLike("%" + messageUser.getMessageUserQq() + "%");
            else if (null != messageUser.getMessageUserWechat()) criteria.andMessageUserWechatLike("%" + messageUser.getMessageUserWechat() + "%");
            else if (null != messageUser.getMessageUserEmail()) criteria.andMessageUserEmailLike("%" + messageUser.getMessageUserEmail() + "%");
            else if (null != messageUser.getMessageUserCompanyName())
                criteria.andMessageUserCompanyNameLike("%" + messageUser.getMessageUserCompanyName() + "%");
            else if (null != messageUser.getMessageUserCompanyPost())
                criteria.andMessageUserCompanyPostLike("%" + messageUser.getMessageUserCompanyPost() + "%");
            else if (null != messageUser.getMessageUserCompanyAddress())
                criteria.andMessageUserCompanyAddressLike("%" + messageUser.getMessageUserCompanyAddress() + "%");
            else if (null != messageUser.getMessageUserCompanyPhone())
                criteria.andMessageUserCompanyPhoneLike("%" + messageUser.getMessageUserCompanyPhone() + "%");
            else if (null != messageUser.getMessageUserCompanyPhoneFix())
                criteria.andMessageUserCompanyPhoneFixLike("%" + messageUser.getMessageUserCompanyPhoneFix() +
                        "%");
            else if (null != messageUser.getMessageUserCompanyEmail())
                criteria.andMessageUserCompanyEmailLike("%" + messageUser.getMessageUserCompanyEmail() + "%");
            else if (null != messageUser.getMessageUserInfoRemark()) criteria.andMessageUserInfoRemarkLike("%" + messageUser.getMessageUserInfoRemark() + "%");
        }
        return messageUserMapper.selectByExample(messageUserExample);

    }

    @Override
    public int insertMessageUserByMessageUser(MessageUser messageUser) {
        return messageUserMapper.insertSelective(messageUser);
    }

    @Override
    public int deleteMessageUserByMessageUserId(List<Integer> idList) {
        MessageUserExample messageUserExample = new MessageUserExample();
        MessageUserExample.Criteria criteria = messageUserExample.createCriteria();
        criteria.andMessageUserIdIn(idList);
        return messageUserMapper.deleteByExample(messageUserExample);
    }

    @Override
    public int updateMessageUserByMessageUser(MessageUser messageUser) {
        return messageUserMapper.updateByPrimaryKeySelective(messageUser);
    }
}

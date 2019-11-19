package com.ivlai.templates.ssm.service.impl;

import com.ivlai.templates.ssm.entity.UserInfo;
import com.ivlai.templates.ssm.entity.UserInfoExample;
import com.ivlai.templates.ssm.mapper.UserInfoMapper;
import com.ivlai.templates.ssm.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectUserInfoByUserInfoId(UserInfo userInfo) {
        return userInfoMapper.selectByPrimaryKey(userInfo.getUserId());
    }

    @Override
    public List<UserInfo> selectUserInfoListByUserInfo(UserInfo userInfo) {

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
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

        return userInfoMapper.selectByExample(userInfoExample);
    }

    @Override
    public int insertUserInfoByUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public int deleteUserInfoByUserInfoId(UserInfo userInfo) {
        return userInfoMapper.deleteByPrimaryKey(userInfo.getUserId());
    }

    @Override
    public int updateUserInfoByUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }
}

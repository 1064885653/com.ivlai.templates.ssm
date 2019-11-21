package com.ivlai.templates.ssm.service.impl;

import com.ivlai.templates.ssm.entity.*;
import com.ivlai.templates.ssm.mapper.AdminMenuMapper;
import com.ivlai.templates.ssm.mapper.AdminParameterMapper;
import com.ivlai.templates.ssm.mapper.AdminUserMapper;
import com.ivlai.templates.ssm.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private AdminUserMapper adminUserMapper;
    @Resource
    private AdminParameterMapper adminParameterMapper;
    @Resource
    private AdminMenuMapper adminMenuMapper;

    @Override
    public AdminUser selectAdminUserByAdminUser(AdminUser adminUser) {
        return adminUserMapper.selectByPrimaryKey(adminUser.getAdminAccount());
    }

    @Override
    public List<AdminUser> selectAdminUserListByAdminUser(AdminUser adminUser) {
        return adminUserMapper.selectByExample(null);
    }

    @Override
    public int insertAdminUserByAdminUser(AdminUser adminUser) {
        return adminUserMapper.insertSelective(adminUser);
    }

    @Override
    public int deleteAdminUserByAdminUser(List<AdminUser> adminUserList) {
        AdminUserExample adminUserExample = new AdminUserExample();
        AdminUserExample.Criteria criteria = adminUserExample.createCriteria();
        criteria.andAdminAccountIn(adminUserList.stream().map(AdminUser::getAdminAccount).collect(Collectors.toList()));
        return adminUserMapper.deleteByExample(adminUserExample);
    }

    @Override
    public int updateAdminUserByAdminUser(AdminUser adminUser) {
        return adminUserMapper.updateByPrimaryKeySelective(adminUser);
    }

    @Override
    public List<AdminParameter> selectAdminParameterList() {
        return adminParameterMapper.selectByExample(null);
    }

    @Override
    public int insertAdminParameter(AdminParameter adminParameter) {
        return adminParameterMapper.insertSelective(adminParameter);
    }

    @Override
    public int deleteAdminParameterByAdminParameterId(List<Integer> adminParameterIdList) {
        AdminParameterExample adminParameterExample = new AdminParameterExample();
        AdminParameterExample.Criteria criteria = adminParameterExample.createCriteria();
        criteria.andAdminParameterIdIn(adminParameterIdList);
        return adminParameterMapper.deleteByExample(adminParameterExample);
    }


    @Override
    public int updateAdminParameterBuAdminParameter(AdminParameter adminParameter) {
        return adminParameterMapper.updateByPrimaryKeySelective(adminParameter);
    }

    @Override
    public List<AdminMenu> selectAdminMenuList(Integer upLvId, List<Integer> idList) {
        AdminMenuExample adminMenuExample = new AdminMenuExample();
        AdminMenuExample.Criteria criteria = adminMenuExample.createCriteria();
        if (null != upLvId) {
            criteria.andAdminMenuUpLvEqualTo(upLvId);
        }
        if (null != idList && idList.size() > 0) {
            criteria.andAdminMenuIdIn(idList);
        }
        return adminMenuMapper.selectByExample(adminMenuExample);
    }

    @Override
    public int insertAdminMenuByAdminMenu(AdminMenu adminMenu) {
        return adminMenuMapper.insertSelective(adminMenu);
    }

    @Override
    public int deleteAdminMenuByAdminMenuId(List<Integer> adminMenuIdList) {
        AdminMenuExample adminMenuExample = new AdminMenuExample();
        AdminMenuExample.Criteria criteria = adminMenuExample.createCriteria();
        criteria.andAdminMenuUpLvIn(adminMenuIdList);
        return adminMenuMapper.deleteByExample(adminMenuExample);
    }

    @Override
    public int updateAdminMenuByAdminMenuId(AdminMenu adminMenu) {
        return adminMenuMapper.updateByPrimaryKeySelective(adminMenu);
    }

}

package com.ivlai.templates.ssm.service.impl;

import com.ivlai.templates.ssm.entity.AdminUser;
import com.ivlai.templates.ssm.entity.AdminUserExample;
import com.ivlai.templates.ssm.mapper.AdminUserMapper;
import com.ivlai.templates.ssm.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    private AdminUserMapper adminUserMapper;

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
    public int deleteAdminUserByAdminUser(AdminUser adminUser) {
        AdminUserExample adminUserExample = new AdminUserExample();
        AdminUserExample.Criteria criteria = adminUserExample.createCriteria();
        criteria.andAdminAccountEqualTo(adminUser.getAdminAccount());

        return adminUserMapper.deleteByExample(adminUserExample);
    }

    @Override
    public int updateAdminUserByAdminUser(AdminUser adminUser) {
        return adminUserMapper.updateByPrimaryKeySelective(adminUser);
    }
}

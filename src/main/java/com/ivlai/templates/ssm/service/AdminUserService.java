package com.ivlai.templates.ssm.service;

import com.ivlai.templates.ssm.entity.AdminUser;

import java.util.List;

public interface AdminUserService {

    AdminUser selectAdminUserByAdminUser(AdminUser adminUser);

    List<AdminUser> selectAdminUserListByAdminUser(AdminUser adminUser);

    int insertAdminUserByAdminUser(AdminUser adminUser);

    int deleteAdminUserByAdminUser(AdminUser adminUser);

    int updateAdminUserByAdminUser(AdminUser adminUser);

}

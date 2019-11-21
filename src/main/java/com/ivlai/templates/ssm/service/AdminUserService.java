package com.ivlai.templates.ssm.service;

import com.ivlai.templates.ssm.entity.AdminMenu;
import com.ivlai.templates.ssm.entity.AdminParameter;
import com.ivlai.templates.ssm.entity.AdminUser;

import java.util.List;

public interface AdminUserService {

    AdminUser selectAdminUserByAdminUser(AdminUser adminUser);

    List<AdminUser> selectAdminUserListByAdminUser(AdminUser adminUser);

    int insertAdminUserByAdminUser(AdminUser adminUser);

    int deleteAdminUserByAdminUser(List<AdminUser> adminUserList);

    int updateAdminUserByAdminUser(AdminUser adminUser);

    /* 参数 */
    List<AdminParameter> selectAdminParameterList();

    int insertAdminParameter(AdminParameter adminParameter);

    int deleteAdminParameterByAdminParameterId(List<Integer> adminParameterIdList);

    int updateAdminParameterBuAdminParameter(AdminParameter adminParameter);

    /* 菜单 */
    List<AdminMenu> selectAdminMenuList(Integer upLvId, List<Integer> idList);

    int insertAdminMenuByAdminMenu(AdminMenu adminMenu);

    int deleteAdminMenuByAdminMenuId(List<Integer> adminMenuIdList);

    int updateAdminMenuByAdminMenuId(AdminMenu adminMenu);
}

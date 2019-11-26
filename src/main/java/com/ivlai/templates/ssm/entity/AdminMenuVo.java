package com.ivlai.templates.ssm.entity;

import java.util.List;

public class AdminMenuVo {

    private AdminMenu adminMenu;

    private List<AdminMenu> adminMenuList;

    public AdminMenu getAdminMenu() {
        return adminMenu;
    }

    public void setAdminMenu(AdminMenu adminMenu) {
        this.adminMenu = adminMenu;
    }

    public List<AdminMenu> getAdminMenuList() {
        return adminMenuList;
    }

    public void setAdminMenuList(List<AdminMenu> adminMenuList) {
        this.adminMenuList = adminMenuList;
    }

    @Override
    public String toString() {
        return "AdminMenuVo{" +
                "adminMenu=" + adminMenu +
                ", adminMenuList=" + adminMenuList +
                '}';
    }
}

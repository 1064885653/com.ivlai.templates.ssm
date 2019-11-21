package com.ivlai.templates.ssm.entity;

public class AdminMenu {
    private Integer adminMenuId;

    private String adminMenuName;

    private String adminMenuUrl;

    private Integer adminMenuUpLv;

    private String adminMenuIconClass;

    private String adminMenuInfo;

    public Integer getAdminMenuId() {
        return adminMenuId;
    }

    public void setAdminMenuId(Integer adminMenuId) {
        this.adminMenuId = adminMenuId;
    }

    public String getAdminMenuName() {
        return adminMenuName;
    }

    public void setAdminMenuName(String adminMenuName) {
        this.adminMenuName = adminMenuName == null ? null : adminMenuName.trim();
    }

    public String getAdminMenuUrl() {
        return adminMenuUrl;
    }

    public void setAdminMenuUrl(String adminMenuUrl) {
        this.adminMenuUrl = adminMenuUrl == null ? null : adminMenuUrl.trim();
    }

    public Integer getAdminMenuUpLv() {
        return adminMenuUpLv;
    }

    public void setAdminMenuUpLv(Integer adminMenuUpLv) {
        this.adminMenuUpLv = adminMenuUpLv;
    }

    public String getAdminMenuIconClass() {
        return adminMenuIconClass;
    }

    public void setAdminMenuIconClass(String adminMenuIconClass) {
        this.adminMenuIconClass = adminMenuIconClass == null ? null : adminMenuIconClass.trim();
    }

    public String getAdminMenuInfo() {
        return adminMenuInfo;
    }

    public void setAdminMenuInfo(String adminMenuInfo) {
        this.adminMenuInfo = adminMenuInfo == null ? null : adminMenuInfo.trim();
    }

    @Override
    public String toString() {
        return "AdminMenu{" +
                "adminMenuId=" + adminMenuId +
                ", adminMenuName='" + adminMenuName + '\'' +
                ", adminMenuUrl='" + adminMenuUrl + '\'' +
                ", adminMenuUpLv=" + adminMenuUpLv +
                ", adminMenuIconClass='" + adminMenuIconClass + '\'' +
                ", adminMenuInfo='" + adminMenuInfo + '\'' +
                '}';
    }
}
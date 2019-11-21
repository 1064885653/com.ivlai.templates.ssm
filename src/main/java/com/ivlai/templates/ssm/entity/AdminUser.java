package com.ivlai.templates.ssm.entity;

public class AdminUser {
    private String adminAccount;

    private String adminPassword;

    private String adminName;

    private Integer adminUser;

    private String adminContact;

    private String adminMessage;

    private String adminMenu;

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Integer getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(Integer adminUser) {
        this.adminUser = adminUser;
    }

    public String getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(String adminContact) {
        this.adminContact = adminContact == null ? null : adminContact.trim();
    }

    public String getAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(String adminMessage) {
        this.adminMessage = adminMessage == null ? null : adminMessage.trim();
    }

    public String getAdminMenu() {
        return adminMenu;
    }

    public void setAdminMenu(String adminMenu) {
        this.adminMenu = adminMenu == null ? null : adminMenu.trim();
    }
}
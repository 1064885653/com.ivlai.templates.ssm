package com.ivlai.templates.ssm.entity;

public class Content {
    private Integer contentId;

    private Integer contentMenu;

    private String contentTitle;

    private String contentTitleEn;

    private String contentUser;

    private String contentCreateTime;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getContentMenu() {
        return contentMenu;
    }

    public void setContentMenu(Integer contentMenu) {
        this.contentMenu = contentMenu;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle == null ? null : contentTitle.trim();
    }

    public String getContentTitleEn() {
        return contentTitleEn;
    }

    public void setContentTitleEn(String contentTitleEn) {
        this.contentTitleEn = contentTitleEn == null ? null : contentTitleEn.trim();
    }

    public String getContentUser() {
        return contentUser;
    }

    public void setContentUser(String contentUser) {
        this.contentUser = contentUser == null ? null : contentUser.trim();
    }

    public String getContentCreateTime() {
        return contentCreateTime;
    }

    public void setContentCreateTime(String contentCreateTime) {
        this.contentCreateTime = contentCreateTime == null ? null : contentCreateTime.trim();
    }
}
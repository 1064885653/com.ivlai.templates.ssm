package com.ivlai.templates.ssm.entity;

public class Content {
    private Integer contentId;

    private String contentMenuLv1;

    private String contentMenuLv1En;

    private String contentMenuLv2;

    private String contentMenuLv2En;

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

    public String getContentMenuLv1() {
        return contentMenuLv1;
    }

    public void setContentMenuLv1(String contentMenuLv1) {
        this.contentMenuLv1 = contentMenuLv1 == null ? null : contentMenuLv1.trim();
    }

    public String getContentMenuLv1En() {
        return contentMenuLv1En;
    }

    public void setContentMenuLv1En(String contentMenuLv1En) {
        this.contentMenuLv1En = contentMenuLv1En == null ? null : contentMenuLv1En.trim();
    }

    public String getContentMenuLv2() {
        return contentMenuLv2;
    }

    public void setContentMenuLv2(String contentMenuLv2) {
        this.contentMenuLv2 = contentMenuLv2 == null ? null : contentMenuLv2.trim();
    }

    public String getContentMenuLv2En() {
        return contentMenuLv2En;
    }

    public void setContentMenuLv2En(String contentMenuLv2En) {
        this.contentMenuLv2En = contentMenuLv2En == null ? null : contentMenuLv2En.trim();
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
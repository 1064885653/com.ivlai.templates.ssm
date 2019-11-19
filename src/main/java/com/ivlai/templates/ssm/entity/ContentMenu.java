package com.ivlai.templates.ssm.entity;

public class ContentMenu {
    private Integer contentMenuId;

    private String contentMenuType;

    private String contentMenuTypeEn;

    private String contentMenuTitle;

    private String contentMenuTitleEn;

    public Integer getContentMenuId() {
        return contentMenuId;
    }

    public void setContentMenuId(Integer contentMenuId) {
        this.contentMenuId = contentMenuId;
    }

    public String getContentMenuType() {
        return contentMenuType;
    }

    public void setContentMenuType(String contentMenuType) {
        this.contentMenuType = contentMenuType == null ? null : contentMenuType.trim();
    }

    public String getContentMenuTypeEn() {
        return contentMenuTypeEn;
    }

    public void setContentMenuTypeEn(String contentMenuTypeEn) {
        this.contentMenuTypeEn = contentMenuTypeEn == null ? null : contentMenuTypeEn.trim();
    }

    public String getContentMenuTitle() {
        return contentMenuTitle;
    }

    public void setContentMenuTitle(String contentMenuTitle) {
        this.contentMenuTitle = contentMenuTitle == null ? null : contentMenuTitle.trim();
    }

    public String getContentMenuTitleEn() {
        return contentMenuTitleEn;
    }

    public void setContentMenuTitleEn(String contentMenuTitleEn) {
        this.contentMenuTitleEn = contentMenuTitleEn == null ? null : contentMenuTitleEn.trim();
    }
}
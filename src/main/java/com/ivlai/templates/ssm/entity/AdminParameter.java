package com.ivlai.templates.ssm.entity;

public class AdminParameter {
    private Integer adminParameterId;

    private String fontIconJsUrl;

    private String fontIconWebPageUrl;

    public Integer getAdminParameterId() {
        return adminParameterId;
    }

    public void setAdminParameterId(Integer adminParameterId) {
        this.adminParameterId = adminParameterId;
    }

    public String getFontIconJsUrl() {
        return fontIconJsUrl;
    }

    public void setFontIconJsUrl(String fontIconJsUrl) {
        this.fontIconJsUrl = fontIconJsUrl == null ? null : fontIconJsUrl.trim();
    }

    public String getFontIconWebPageUrl() {
        return fontIconWebPageUrl;
    }

    public void setFontIconWebPageUrl(String fontIconWebPageUrl) {
        this.fontIconWebPageUrl = fontIconWebPageUrl == null ? null : fontIconWebPageUrl.trim();
    }
}
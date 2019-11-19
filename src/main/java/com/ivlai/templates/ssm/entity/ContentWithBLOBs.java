package com.ivlai.templates.ssm.entity;

public class ContentWithBLOBs extends Content {
    private String contentInfo;

    private String contentInfoEn;

    public String getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo == null ? null : contentInfo.trim();
    }

    public String getContentInfoEn() {
        return contentInfoEn;
    }

    public void setContentInfoEn(String contentInfoEn) {
        this.contentInfoEn = contentInfoEn == null ? null : contentInfoEn.trim();
    }
}
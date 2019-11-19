package com.ivlai.templates.ssm.entity;

public class UserNation {
    private Integer userNationId;

    private String userNationName;

    private String userNationNameEn;

    public Integer getUserNationId() {
        return userNationId;
    }

    public void setUserNationId(Integer userNationId) {
        this.userNationId = userNationId;
    }

    public String getUserNationName() {
        return userNationName;
    }

    public void setUserNationName(String userNationName) {
        this.userNationName = userNationName == null ? null : userNationName.trim();
    }

    public String getUserNationNameEn() {
        return userNationNameEn;
    }

    public void setUserNationNameEn(String userNationNameEn) {
        this.userNationNameEn = userNationNameEn == null ? null : userNationNameEn.trim();
    }
}
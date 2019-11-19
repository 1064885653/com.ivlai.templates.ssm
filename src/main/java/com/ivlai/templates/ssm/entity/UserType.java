package com.ivlai.templates.ssm.entity;

public class UserType {
    private Integer userTypeId;

    private String userTypeName;

    private String userTypeNameEn;

    private Integer userTypeUpId;

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName == null ? null : userTypeName.trim();
    }

    public String getUserTypeNameEn() {
        return userTypeNameEn;
    }

    public void setUserTypeNameEn(String userTypeNameEn) {
        this.userTypeNameEn = userTypeNameEn == null ? null : userTypeNameEn.trim();
    }

    public Integer getUserTypeUpId() {
        return userTypeUpId;
    }

    public void setUserTypeUpId(Integer userTypeUpId) {
        this.userTypeUpId = userTypeUpId;
    }
}
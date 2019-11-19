package com.ivlai.templates.ssm.entity;

public class Nationality {
    private String nationalityEnglish;

    private String nationalityChinese;

    private String countryOrRegion;

    public String getNationalityEnglish() {
        return nationalityEnglish;
    }

    public void setNationalityEnglish(String nationalityEnglish) {
        this.nationalityEnglish = nationalityEnglish == null ? null : nationalityEnglish.trim();
    }

    public String getNationalityChinese() {
        return nationalityChinese;
    }

    public void setNationalityChinese(String nationalityChinese) {
        this.nationalityChinese = nationalityChinese == null ? null : nationalityChinese.trim();
    }

    public String getCountryOrRegion() {
        return countryOrRegion;
    }

    public void setCountryOrRegion(String countryOrRegion) {
        this.countryOrRegion = countryOrRegion == null ? null : countryOrRegion.trim();
    }
}
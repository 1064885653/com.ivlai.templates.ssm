package com.ivlai.templates.ssm.entity;

public class Menu {
    private Integer menuId;

    private String menuName;

    private String menuNameForI18n;

    private String menuUrl;

    private String menuIcon;

    private Integer menuWeight;

    private boolean selected = false;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuNameForI18n() {
        return menuNameForI18n;
    }

    public void setMenuNameForI18n(String menuNameForI18n) {
        this.menuNameForI18n = menuNameForI18n == null ? null : menuNameForI18n.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public Integer getMenuWeight() {
        return menuWeight;
    }

    public void setMenuWeight(Integer menuWeight) {
        this.menuWeight = menuWeight;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
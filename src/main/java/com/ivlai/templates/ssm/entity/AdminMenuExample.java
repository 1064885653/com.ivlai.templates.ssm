package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminMenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAdminMenuIdIsNull() {
            addCriterion("admin_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdIsNotNull() {
            addCriterion("admin_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdEqualTo(Integer value) {
            addCriterion("admin_menu_id =", value, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdNotEqualTo(Integer value) {
            addCriterion("admin_menu_id <>", value, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdGreaterThan(Integer value) {
            addCriterion("admin_menu_id >", value, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_menu_id >=", value, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdLessThan(Integer value) {
            addCriterion("admin_menu_id <", value, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_menu_id <=", value, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdIn(List<Integer> values) {
            addCriterion("admin_menu_id in", values, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdNotIn(List<Integer> values) {
            addCriterion("admin_menu_id not in", values, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_menu_id between", value1, value2, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_menu_id not between", value1, value2, "adminMenuId");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameIsNull() {
            addCriterion("admin_menu_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameIsNotNull() {
            addCriterion("admin_menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameEqualTo(String value) {
            addCriterion("admin_menu_name =", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameNotEqualTo(String value) {
            addCriterion("admin_menu_name <>", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameGreaterThan(String value) {
            addCriterion("admin_menu_name >", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_menu_name >=", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameLessThan(String value) {
            addCriterion("admin_menu_name <", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameLessThanOrEqualTo(String value) {
            addCriterion("admin_menu_name <=", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameLike(String value) {
            addCriterion("admin_menu_name like", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameNotLike(String value) {
            addCriterion("admin_menu_name not like", value, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameIn(List<String> values) {
            addCriterion("admin_menu_name in", values, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameNotIn(List<String> values) {
            addCriterion("admin_menu_name not in", values, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameBetween(String value1, String value2) {
            addCriterion("admin_menu_name between", value1, value2, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNameNotBetween(String value1, String value2) {
            addCriterion("admin_menu_name not between", value1, value2, "adminMenuName");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlIsNull() {
            addCriterion("admin_menu_url is null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlIsNotNull() {
            addCriterion("admin_menu_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlEqualTo(String value) {
            addCriterion("admin_menu_url =", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlNotEqualTo(String value) {
            addCriterion("admin_menu_url <>", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlGreaterThan(String value) {
            addCriterion("admin_menu_url >", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("admin_menu_url >=", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlLessThan(String value) {
            addCriterion("admin_menu_url <", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("admin_menu_url <=", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlLike(String value) {
            addCriterion("admin_menu_url like", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlNotLike(String value) {
            addCriterion("admin_menu_url not like", value, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlIn(List<String> values) {
            addCriterion("admin_menu_url in", values, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlNotIn(List<String> values) {
            addCriterion("admin_menu_url not in", values, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlBetween(String value1, String value2) {
            addCriterion("admin_menu_url between", value1, value2, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUrlNotBetween(String value1, String value2) {
            addCriterion("admin_menu_url not between", value1, value2, "adminMenuUrl");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvIsNull() {
            addCriterion("admin_menu_up_lv is null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvIsNotNull() {
            addCriterion("admin_menu_up_lv is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvEqualTo(Integer value) {
            addCriterion("admin_menu_up_lv =", value, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvNotEqualTo(Integer value) {
            addCriterion("admin_menu_up_lv <>", value, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvGreaterThan(Integer value) {
            addCriterion("admin_menu_up_lv >", value, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_menu_up_lv >=", value, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvLessThan(Integer value) {
            addCriterion("admin_menu_up_lv <", value, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvLessThanOrEqualTo(Integer value) {
            addCriterion("admin_menu_up_lv <=", value, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvIn(List<Integer> values) {
            addCriterion("admin_menu_up_lv in", values, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvNotIn(List<Integer> values) {
            addCriterion("admin_menu_up_lv not in", values, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvBetween(Integer value1, Integer value2) {
            addCriterion("admin_menu_up_lv between", value1, value2, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuUpLvNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_menu_up_lv not between", value1, value2, "adminMenuUpLv");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassIsNull() {
            addCriterion("admin_menu_icon_class is null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassIsNotNull() {
            addCriterion("admin_menu_icon_class is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassEqualTo(String value) {
            addCriterion("admin_menu_icon_class =", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassNotEqualTo(String value) {
            addCriterion("admin_menu_icon_class <>", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassGreaterThan(String value) {
            addCriterion("admin_menu_icon_class >", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassGreaterThanOrEqualTo(String value) {
            addCriterion("admin_menu_icon_class >=", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassLessThan(String value) {
            addCriterion("admin_menu_icon_class <", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassLessThanOrEqualTo(String value) {
            addCriterion("admin_menu_icon_class <=", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassLike(String value) {
            addCriterion("admin_menu_icon_class like", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassNotLike(String value) {
            addCriterion("admin_menu_icon_class not like", value, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassIn(List<String> values) {
            addCriterion("admin_menu_icon_class in", values, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassNotIn(List<String> values) {
            addCriterion("admin_menu_icon_class not in", values, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassBetween(String value1, String value2) {
            addCriterion("admin_menu_icon_class between", value1, value2, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIconClassNotBetween(String value1, String value2) {
            addCriterion("admin_menu_icon_class not between", value1, value2, "adminMenuIconClass");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoIsNull() {
            addCriterion("admin_menu_info is null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoIsNotNull() {
            addCriterion("admin_menu_info is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoEqualTo(String value) {
            addCriterion("admin_menu_info =", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoNotEqualTo(String value) {
            addCriterion("admin_menu_info <>", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoGreaterThan(String value) {
            addCriterion("admin_menu_info >", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoGreaterThanOrEqualTo(String value) {
            addCriterion("admin_menu_info >=", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoLessThan(String value) {
            addCriterion("admin_menu_info <", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoLessThanOrEqualTo(String value) {
            addCriterion("admin_menu_info <=", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoLike(String value) {
            addCriterion("admin_menu_info like", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoNotLike(String value) {
            addCriterion("admin_menu_info not like", value, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoIn(List<String> values) {
            addCriterion("admin_menu_info in", values, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoNotIn(List<String> values) {
            addCriterion("admin_menu_info not in", values, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoBetween(String value1, String value2) {
            addCriterion("admin_menu_info between", value1, value2, "adminMenuInfo");
            return (Criteria) this;
        }

        public Criteria andAdminMenuInfoNotBetween(String value1, String value2) {
            addCriterion("admin_menu_info not between", value1, value2, "adminMenuInfo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
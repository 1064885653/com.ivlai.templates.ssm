package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminUserExample() {
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

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminUserIsNull() {
            addCriterion("admin_user is null");
            return (Criteria) this;
        }

        public Criteria andAdminUserIsNotNull() {
            addCriterion("admin_user is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUserEqualTo(Integer value) {
            addCriterion("admin_user =", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotEqualTo(Integer value) {
            addCriterion("admin_user <>", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserGreaterThan(Integer value) {
            addCriterion("admin_user >", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_user >=", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLessThan(Integer value) {
            addCriterion("admin_user <", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserLessThanOrEqualTo(Integer value) {
            addCriterion("admin_user <=", value, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserIn(List<Integer> values) {
            addCriterion("admin_user in", values, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotIn(List<Integer> values) {
            addCriterion("admin_user not in", values, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserBetween(Integer value1, Integer value2) {
            addCriterion("admin_user between", value1, value2, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminUserNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_user not between", value1, value2, "adminUser");
            return (Criteria) this;
        }

        public Criteria andAdminContactIsNull() {
            addCriterion("admin_contact is null");
            return (Criteria) this;
        }

        public Criteria andAdminContactIsNotNull() {
            addCriterion("admin_contact is not null");
            return (Criteria) this;
        }

        public Criteria andAdminContactEqualTo(String value) {
            addCriterion("admin_contact =", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactNotEqualTo(String value) {
            addCriterion("admin_contact <>", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactGreaterThan(String value) {
            addCriterion("admin_contact >", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactGreaterThanOrEqualTo(String value) {
            addCriterion("admin_contact >=", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactLessThan(String value) {
            addCriterion("admin_contact <", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactLessThanOrEqualTo(String value) {
            addCriterion("admin_contact <=", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactLike(String value) {
            addCriterion("admin_contact like", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactNotLike(String value) {
            addCriterion("admin_contact not like", value, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactIn(List<String> values) {
            addCriterion("admin_contact in", values, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactNotIn(List<String> values) {
            addCriterion("admin_contact not in", values, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactBetween(String value1, String value2) {
            addCriterion("admin_contact between", value1, value2, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminContactNotBetween(String value1, String value2) {
            addCriterion("admin_contact not between", value1, value2, "adminContact");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIsNull() {
            addCriterion("admin_message is null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIsNotNull() {
            addCriterion("admin_message is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageEqualTo(String value) {
            addCriterion("admin_message =", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotEqualTo(String value) {
            addCriterion("admin_message <>", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageGreaterThan(String value) {
            addCriterion("admin_message >", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageGreaterThanOrEqualTo(String value) {
            addCriterion("admin_message >=", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLessThan(String value) {
            addCriterion("admin_message <", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLessThanOrEqualTo(String value) {
            addCriterion("admin_message <=", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageLike(String value) {
            addCriterion("admin_message like", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotLike(String value) {
            addCriterion("admin_message not like", value, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIn(List<String> values) {
            addCriterion("admin_message in", values, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotIn(List<String> values) {
            addCriterion("admin_message not in", values, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageBetween(String value1, String value2) {
            addCriterion("admin_message between", value1, value2, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMessageNotBetween(String value1, String value2) {
            addCriterion("admin_message not between", value1, value2, "adminMessage");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIsNull() {
            addCriterion("admin_menu is null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIsNotNull() {
            addCriterion("admin_menu is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMenuEqualTo(String value) {
            addCriterion("admin_menu =", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNotEqualTo(String value) {
            addCriterion("admin_menu <>", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuGreaterThan(String value) {
            addCriterion("admin_menu >", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuGreaterThanOrEqualTo(String value) {
            addCriterion("admin_menu >=", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuLessThan(String value) {
            addCriterion("admin_menu <", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuLessThanOrEqualTo(String value) {
            addCriterion("admin_menu <=", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuLike(String value) {
            addCriterion("admin_menu like", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNotLike(String value) {
            addCriterion("admin_menu not like", value, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuIn(List<String> values) {
            addCriterion("admin_menu in", values, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNotIn(List<String> values) {
            addCriterion("admin_menu not in", values, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuBetween(String value1, String value2) {
            addCriterion("admin_menu between", value1, value2, "adminMenu");
            return (Criteria) this;
        }

        public Criteria andAdminMenuNotBetween(String value1, String value2) {
            addCriterion("admin_menu not between", value1, value2, "adminMenu");
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
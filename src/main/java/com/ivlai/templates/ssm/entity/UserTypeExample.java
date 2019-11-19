package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class UserTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTypeExample() {
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

        public Criteria andUserTypeIdIsNull() {
            addCriterion("user_type_id is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdIsNotNull() {
            addCriterion("user_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdEqualTo(Integer value) {
            addCriterion("user_type_id =", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdNotEqualTo(Integer value) {
            addCriterion("user_type_id <>", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdGreaterThan(Integer value) {
            addCriterion("user_type_id >", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type_id >=", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdLessThan(Integer value) {
            addCriterion("user_type_id <", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_type_id <=", value, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdIn(List<Integer> values) {
            addCriterion("user_type_id in", values, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdNotIn(List<Integer> values) {
            addCriterion("user_type_id not in", values, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("user_type_id between", value1, value2, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type_id not between", value1, value2, "userTypeId");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameIsNull() {
            addCriterion("user_type_name is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameIsNotNull() {
            addCriterion("user_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEqualTo(String value) {
            addCriterion("user_type_name =", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameNotEqualTo(String value) {
            addCriterion("user_type_name <>", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameGreaterThan(String value) {
            addCriterion("user_type_name >", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_type_name >=", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameLessThan(String value) {
            addCriterion("user_type_name <", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameLessThanOrEqualTo(String value) {
            addCriterion("user_type_name <=", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameLike(String value) {
            addCriterion("user_type_name like", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameNotLike(String value) {
            addCriterion("user_type_name not like", value, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameIn(List<String> values) {
            addCriterion("user_type_name in", values, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameNotIn(List<String> values) {
            addCriterion("user_type_name not in", values, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameBetween(String value1, String value2) {
            addCriterion("user_type_name between", value1, value2, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameNotBetween(String value1, String value2) {
            addCriterion("user_type_name not between", value1, value2, "userTypeName");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnIsNull() {
            addCriterion("user_type_name_en is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnIsNotNull() {
            addCriterion("user_type_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnEqualTo(String value) {
            addCriterion("user_type_name_en =", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnNotEqualTo(String value) {
            addCriterion("user_type_name_en <>", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnGreaterThan(String value) {
            addCriterion("user_type_name_en >", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("user_type_name_en >=", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnLessThan(String value) {
            addCriterion("user_type_name_en <", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnLessThanOrEqualTo(String value) {
            addCriterion("user_type_name_en <=", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnLike(String value) {
            addCriterion("user_type_name_en like", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnNotLike(String value) {
            addCriterion("user_type_name_en not like", value, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnIn(List<String> values) {
            addCriterion("user_type_name_en in", values, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnNotIn(List<String> values) {
            addCriterion("user_type_name_en not in", values, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnBetween(String value1, String value2) {
            addCriterion("user_type_name_en between", value1, value2, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeNameEnNotBetween(String value1, String value2) {
            addCriterion("user_type_name_en not between", value1, value2, "userTypeNameEn");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdIsNull() {
            addCriterion("user_type_up_id is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdIsNotNull() {
            addCriterion("user_type_up_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdEqualTo(Integer value) {
            addCriterion("user_type_up_id =", value, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdNotEqualTo(Integer value) {
            addCriterion("user_type_up_id <>", value, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdGreaterThan(Integer value) {
            addCriterion("user_type_up_id >", value, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type_up_id >=", value, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdLessThan(Integer value) {
            addCriterion("user_type_up_id <", value, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_type_up_id <=", value, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdIn(List<Integer> values) {
            addCriterion("user_type_up_id in", values, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdNotIn(List<Integer> values) {
            addCriterion("user_type_up_id not in", values, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdBetween(Integer value1, Integer value2) {
            addCriterion("user_type_up_id between", value1, value2, "userTypeUpId");
            return (Criteria) this;
        }

        public Criteria andUserTypeUpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type_up_id not between", value1, value2, "userTypeUpId");
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
package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class UserNationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserNationExample() {
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

        public Criteria andUserNationIdIsNull() {
            addCriterion("user_nation_id is null");
            return (Criteria) this;
        }

        public Criteria andUserNationIdIsNotNull() {
            addCriterion("user_nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationIdEqualTo(Integer value) {
            addCriterion("user_nation_id =", value, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdNotEqualTo(Integer value) {
            addCriterion("user_nation_id <>", value, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdGreaterThan(Integer value) {
            addCriterion("user_nation_id >", value, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_nation_id >=", value, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdLessThan(Integer value) {
            addCriterion("user_nation_id <", value, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_nation_id <=", value, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdIn(List<Integer> values) {
            addCriterion("user_nation_id in", values, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdNotIn(List<Integer> values) {
            addCriterion("user_nation_id not in", values, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdBetween(Integer value1, Integer value2) {
            addCriterion("user_nation_id between", value1, value2, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_nation_id not between", value1, value2, "userNationId");
            return (Criteria) this;
        }

        public Criteria andUserNationNameIsNull() {
            addCriterion("user_nation_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNationNameIsNotNull() {
            addCriterion("user_nation_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEqualTo(String value) {
            addCriterion("user_nation_name =", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameNotEqualTo(String value) {
            addCriterion("user_nation_name <>", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameGreaterThan(String value) {
            addCriterion("user_nation_name >", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nation_name >=", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameLessThan(String value) {
            addCriterion("user_nation_name <", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameLessThanOrEqualTo(String value) {
            addCriterion("user_nation_name <=", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameLike(String value) {
            addCriterion("user_nation_name like", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameNotLike(String value) {
            addCriterion("user_nation_name not like", value, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameIn(List<String> values) {
            addCriterion("user_nation_name in", values, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameNotIn(List<String> values) {
            addCriterion("user_nation_name not in", values, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameBetween(String value1, String value2) {
            addCriterion("user_nation_name between", value1, value2, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameNotBetween(String value1, String value2) {
            addCriterion("user_nation_name not between", value1, value2, "userNationName");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnIsNull() {
            addCriterion("user_nation_name_en is null");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnIsNotNull() {
            addCriterion("user_nation_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnEqualTo(String value) {
            addCriterion("user_nation_name_en =", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnNotEqualTo(String value) {
            addCriterion("user_nation_name_en <>", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnGreaterThan(String value) {
            addCriterion("user_nation_name_en >", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("user_nation_name_en >=", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnLessThan(String value) {
            addCriterion("user_nation_name_en <", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnLessThanOrEqualTo(String value) {
            addCriterion("user_nation_name_en <=", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnLike(String value) {
            addCriterion("user_nation_name_en like", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnNotLike(String value) {
            addCriterion("user_nation_name_en not like", value, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnIn(List<String> values) {
            addCriterion("user_nation_name_en in", values, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnNotIn(List<String> values) {
            addCriterion("user_nation_name_en not in", values, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnBetween(String value1, String value2) {
            addCriterion("user_nation_name_en between", value1, value2, "userNationNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNationNameEnNotBetween(String value1, String value2) {
            addCriterion("user_nation_name_en not between", value1, value2, "userNationNameEn");
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
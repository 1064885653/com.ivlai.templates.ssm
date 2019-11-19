package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class NationalityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NationalityExample() {
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

        public Criteria andNationalityEnglishIsNull() {
            addCriterion("nationality_english is null");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishIsNotNull() {
            addCriterion("nationality_english is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishEqualTo(String value) {
            addCriterion("nationality_english =", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishNotEqualTo(String value) {
            addCriterion("nationality_english <>", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishGreaterThan(String value) {
            addCriterion("nationality_english >", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("nationality_english >=", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishLessThan(String value) {
            addCriterion("nationality_english <", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishLessThanOrEqualTo(String value) {
            addCriterion("nationality_english <=", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishLike(String value) {
            addCriterion("nationality_english like", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishNotLike(String value) {
            addCriterion("nationality_english not like", value, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishIn(List<String> values) {
            addCriterion("nationality_english in", values, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishNotIn(List<String> values) {
            addCriterion("nationality_english not in", values, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishBetween(String value1, String value2) {
            addCriterion("nationality_english between", value1, value2, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityEnglishNotBetween(String value1, String value2) {
            addCriterion("nationality_english not between", value1, value2, "nationalityEnglish");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseIsNull() {
            addCriterion("nationality_chinese is null");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseIsNotNull() {
            addCriterion("nationality_chinese is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseEqualTo(String value) {
            addCriterion("nationality_chinese =", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseNotEqualTo(String value) {
            addCriterion("nationality_chinese <>", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseGreaterThan(String value) {
            addCriterion("nationality_chinese >", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseGreaterThanOrEqualTo(String value) {
            addCriterion("nationality_chinese >=", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseLessThan(String value) {
            addCriterion("nationality_chinese <", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseLessThanOrEqualTo(String value) {
            addCriterion("nationality_chinese <=", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseLike(String value) {
            addCriterion("nationality_chinese like", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseNotLike(String value) {
            addCriterion("nationality_chinese not like", value, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseIn(List<String> values) {
            addCriterion("nationality_chinese in", values, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseNotIn(List<String> values) {
            addCriterion("nationality_chinese not in", values, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseBetween(String value1, String value2) {
            addCriterion("nationality_chinese between", value1, value2, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andNationalityChineseNotBetween(String value1, String value2) {
            addCriterion("nationality_chinese not between", value1, value2, "nationalityChinese");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionIsNull() {
            addCriterion("country_or_region is null");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionIsNotNull() {
            addCriterion("country_or_region is not null");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionEqualTo(String value) {
            addCriterion("country_or_region =", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionNotEqualTo(String value) {
            addCriterion("country_or_region <>", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionGreaterThan(String value) {
            addCriterion("country_or_region >", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionGreaterThanOrEqualTo(String value) {
            addCriterion("country_or_region >=", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionLessThan(String value) {
            addCriterion("country_or_region <", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionLessThanOrEqualTo(String value) {
            addCriterion("country_or_region <=", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionLike(String value) {
            addCriterion("country_or_region like", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionNotLike(String value) {
            addCriterion("country_or_region not like", value, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionIn(List<String> values) {
            addCriterion("country_or_region in", values, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionNotIn(List<String> values) {
            addCriterion("country_or_region not in", values, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionBetween(String value1, String value2) {
            addCriterion("country_or_region between", value1, value2, "countryOrRegion");
            return (Criteria) this;
        }

        public Criteria andCountryOrRegionNotBetween(String value1, String value2) {
            addCriterion("country_or_region not between", value1, value2, "countryOrRegion");
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
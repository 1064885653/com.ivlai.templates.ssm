package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminParameterExample() {
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

        public Criteria andAdminParameterIdIsNull() {
            addCriterion("admin_parameter_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdIsNotNull() {
            addCriterion("admin_parameter_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdEqualTo(Integer value) {
            addCriterion("admin_parameter_id =", value, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdNotEqualTo(Integer value) {
            addCriterion("admin_parameter_id <>", value, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdGreaterThan(Integer value) {
            addCriterion("admin_parameter_id >", value, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_parameter_id >=", value, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdLessThan(Integer value) {
            addCriterion("admin_parameter_id <", value, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_parameter_id <=", value, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdIn(List<Integer> values) {
            addCriterion("admin_parameter_id in", values, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdNotIn(List<Integer> values) {
            addCriterion("admin_parameter_id not in", values, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_parameter_id between", value1, value2, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andAdminParameterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_parameter_id not between", value1, value2, "adminParameterId");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlIsNull() {
            addCriterion("font_icon_js_url is null");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlIsNotNull() {
            addCriterion("font_icon_js_url is not null");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlEqualTo(String value) {
            addCriterion("font_icon_js_url =", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlNotEqualTo(String value) {
            addCriterion("font_icon_js_url <>", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlGreaterThan(String value) {
            addCriterion("font_icon_js_url >", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("font_icon_js_url >=", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlLessThan(String value) {
            addCriterion("font_icon_js_url <", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlLessThanOrEqualTo(String value) {
            addCriterion("font_icon_js_url <=", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlLike(String value) {
            addCriterion("font_icon_js_url like", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlNotLike(String value) {
            addCriterion("font_icon_js_url not like", value, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlIn(List<String> values) {
            addCriterion("font_icon_js_url in", values, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlNotIn(List<String> values) {
            addCriterion("font_icon_js_url not in", values, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlBetween(String value1, String value2) {
            addCriterion("font_icon_js_url between", value1, value2, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconJsUrlNotBetween(String value1, String value2) {
            addCriterion("font_icon_js_url not between", value1, value2, "fontIconJsUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlIsNull() {
            addCriterion("font_icon_web_page_url is null");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlIsNotNull() {
            addCriterion("font_icon_web_page_url is not null");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlEqualTo(String value) {
            addCriterion("font_icon_web_page_url =", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlNotEqualTo(String value) {
            addCriterion("font_icon_web_page_url <>", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlGreaterThan(String value) {
            addCriterion("font_icon_web_page_url >", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("font_icon_web_page_url >=", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlLessThan(String value) {
            addCriterion("font_icon_web_page_url <", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlLessThanOrEqualTo(String value) {
            addCriterion("font_icon_web_page_url <=", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlLike(String value) {
            addCriterion("font_icon_web_page_url like", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlNotLike(String value) {
            addCriterion("font_icon_web_page_url not like", value, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlIn(List<String> values) {
            addCriterion("font_icon_web_page_url in", values, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlNotIn(List<String> values) {
            addCriterion("font_icon_web_page_url not in", values, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlBetween(String value1, String value2) {
            addCriterion("font_icon_web_page_url between", value1, value2, "fontIconWebPageUrl");
            return (Criteria) this;
        }

        public Criteria andFontIconWebPageUrlNotBetween(String value1, String value2) {
            addCriterion("font_icon_web_page_url not between", value1, value2, "fontIconWebPageUrl");
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
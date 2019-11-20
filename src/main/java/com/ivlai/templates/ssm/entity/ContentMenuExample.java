package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class ContentMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentMenuExample() {
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

        public Criteria andContentMenuIdIsNull() {
            addCriterion("content_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdIsNotNull() {
            addCriterion("content_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdEqualTo(Integer value) {
            addCriterion("content_menu_id =", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdNotEqualTo(Integer value) {
            addCriterion("content_menu_id <>", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdGreaterThan(Integer value) {
            addCriterion("content_menu_id >", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_menu_id >=", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdLessThan(Integer value) {
            addCriterion("content_menu_id <", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_menu_id <=", value, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdIn(List<Integer> values) {
            addCriterion("content_menu_id in", values, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdNotIn(List<Integer> values) {
            addCriterion("content_menu_id not in", values, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("content_menu_id between", value1, value2, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_menu_id not between", value1, value2, "contentMenuId");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeIsNull() {
            addCriterion("content_menu_type is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeIsNotNull() {
            addCriterion("content_menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEqualTo(String value) {
            addCriterion("content_menu_type =", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeNotEqualTo(String value) {
            addCriterion("content_menu_type <>", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeGreaterThan(String value) {
            addCriterion("content_menu_type >", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("content_menu_type >=", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeLessThan(String value) {
            addCriterion("content_menu_type <", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("content_menu_type <=", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeLike(String value) {
            addCriterion("content_menu_type like", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeNotLike(String value) {
            addCriterion("content_menu_type not like", value, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeIn(List<String> values) {
            addCriterion("content_menu_type in", values, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeNotIn(List<String> values) {
            addCriterion("content_menu_type not in", values, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeBetween(String value1, String value2) {
            addCriterion("content_menu_type between", value1, value2, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeNotBetween(String value1, String value2) {
            addCriterion("content_menu_type not between", value1, value2, "contentMenuType");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnIsNull() {
            addCriterion("content_menu_type_en is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnIsNotNull() {
            addCriterion("content_menu_type_en is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnEqualTo(String value) {
            addCriterion("content_menu_type_en =", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnNotEqualTo(String value) {
            addCriterion("content_menu_type_en <>", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnGreaterThan(String value) {
            addCriterion("content_menu_type_en >", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnGreaterThanOrEqualTo(String value) {
            addCriterion("content_menu_type_en >=", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnLessThan(String value) {
            addCriterion("content_menu_type_en <", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnLessThanOrEqualTo(String value) {
            addCriterion("content_menu_type_en <=", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnLike(String value) {
            addCriterion("content_menu_type_en like", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnNotLike(String value) {
            addCriterion("content_menu_type_en not like", value, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnIn(List<String> values) {
            addCriterion("content_menu_type_en in", values, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnNotIn(List<String> values) {
            addCriterion("content_menu_type_en not in", values, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnBetween(String value1, String value2) {
            addCriterion("content_menu_type_en between", value1, value2, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeEnNotBetween(String value1, String value2) {
            addCriterion("content_menu_type_en not between", value1, value2, "contentMenuTypeEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlIsNull() {
            addCriterion("content_menu_type_url is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlIsNotNull() {
            addCriterion("content_menu_type_url is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlEqualTo(String value) {
            addCriterion("content_menu_type_url =", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlNotEqualTo(String value) {
            addCriterion("content_menu_type_url <>", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlGreaterThan(String value) {
            addCriterion("content_menu_type_url >", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("content_menu_type_url >=", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlLessThan(String value) {
            addCriterion("content_menu_type_url <", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlLessThanOrEqualTo(String value) {
            addCriterion("content_menu_type_url <=", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlLike(String value) {
            addCriterion("content_menu_type_url like", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlNotLike(String value) {
            addCriterion("content_menu_type_url not like", value, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlIn(List<String> values) {
            addCriterion("content_menu_type_url in", values, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlNotIn(List<String> values) {
            addCriterion("content_menu_type_url not in", values, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlBetween(String value1, String value2) {
            addCriterion("content_menu_type_url between", value1, value2, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTypeUrlNotBetween(String value1, String value2) {
            addCriterion("content_menu_type_url not between", value1, value2, "contentMenuTypeUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleIsNull() {
            addCriterion("content_menu_title is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleIsNotNull() {
            addCriterion("content_menu_title is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEqualTo(String value) {
            addCriterion("content_menu_title =", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleNotEqualTo(String value) {
            addCriterion("content_menu_title <>", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleGreaterThan(String value) {
            addCriterion("content_menu_title >", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("content_menu_title >=", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleLessThan(String value) {
            addCriterion("content_menu_title <", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleLessThanOrEqualTo(String value) {
            addCriterion("content_menu_title <=", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleLike(String value) {
            addCriterion("content_menu_title like", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleNotLike(String value) {
            addCriterion("content_menu_title not like", value, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleIn(List<String> values) {
            addCriterion("content_menu_title in", values, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleNotIn(List<String> values) {
            addCriterion("content_menu_title not in", values, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleBetween(String value1, String value2) {
            addCriterion("content_menu_title between", value1, value2, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleNotBetween(String value1, String value2) {
            addCriterion("content_menu_title not between", value1, value2, "contentMenuTitle");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnIsNull() {
            addCriterion("content_menu_title_en is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnIsNotNull() {
            addCriterion("content_menu_title_en is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnEqualTo(String value) {
            addCriterion("content_menu_title_en =", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnNotEqualTo(String value) {
            addCriterion("content_menu_title_en <>", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnGreaterThan(String value) {
            addCriterion("content_menu_title_en >", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("content_menu_title_en >=", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnLessThan(String value) {
            addCriterion("content_menu_title_en <", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnLessThanOrEqualTo(String value) {
            addCriterion("content_menu_title_en <=", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnLike(String value) {
            addCriterion("content_menu_title_en like", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnNotLike(String value) {
            addCriterion("content_menu_title_en not like", value, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnIn(List<String> values) {
            addCriterion("content_menu_title_en in", values, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnNotIn(List<String> values) {
            addCriterion("content_menu_title_en not in", values, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnBetween(String value1, String value2) {
            addCriterion("content_menu_title_en between", value1, value2, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleEnNotBetween(String value1, String value2) {
            addCriterion("content_menu_title_en not between", value1, value2, "contentMenuTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlIsNull() {
            addCriterion("content_menu_title_url is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlIsNotNull() {
            addCriterion("content_menu_title_url is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlEqualTo(String value) {
            addCriterion("content_menu_title_url =", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlNotEqualTo(String value) {
            addCriterion("content_menu_title_url <>", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlGreaterThan(String value) {
            addCriterion("content_menu_title_url >", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("content_menu_title_url >=", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlLessThan(String value) {
            addCriterion("content_menu_title_url <", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlLessThanOrEqualTo(String value) {
            addCriterion("content_menu_title_url <=", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlLike(String value) {
            addCriterion("content_menu_title_url like", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlNotLike(String value) {
            addCriterion("content_menu_title_url not like", value, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlIn(List<String> values) {
            addCriterion("content_menu_title_url in", values, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlNotIn(List<String> values) {
            addCriterion("content_menu_title_url not in", values, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlBetween(String value1, String value2) {
            addCriterion("content_menu_title_url between", value1, value2, "contentMenuTitleUrl");
            return (Criteria) this;
        }

        public Criteria andContentMenuTitleUrlNotBetween(String value1, String value2) {
            addCriterion("content_menu_title_url not between", value1, value2, "contentMenuTitleUrl");
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
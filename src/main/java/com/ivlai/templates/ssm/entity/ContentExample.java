package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class ContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentExample() {
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

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Integer value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Integer value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Integer value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Integer value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Integer> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Integer> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Integer value1, Integer value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentMenuIsNull() {
            addCriterion("content_menu is null");
            return (Criteria) this;
        }

        public Criteria andContentMenuIsNotNull() {
            addCriterion("content_menu is not null");
            return (Criteria) this;
        }

        public Criteria andContentMenuEqualTo(Integer value) {
            addCriterion("content_menu =", value, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuNotEqualTo(Integer value) {
            addCriterion("content_menu <>", value, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuGreaterThan(Integer value) {
            addCriterion("content_menu >", value, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_menu >=", value, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuLessThan(Integer value) {
            addCriterion("content_menu <", value, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuLessThanOrEqualTo(Integer value) {
            addCriterion("content_menu <=", value, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuIn(List<Integer> values) {
            addCriterion("content_menu in", values, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuNotIn(List<Integer> values) {
            addCriterion("content_menu not in", values, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuBetween(Integer value1, Integer value2) {
            addCriterion("content_menu between", value1, value2, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentMenuNotBetween(Integer value1, Integer value2) {
            addCriterion("content_menu not between", value1, value2, "contentMenu");
            return (Criteria) this;
        }

        public Criteria andContentTitleIsNull() {
            addCriterion("content_title is null");
            return (Criteria) this;
        }

        public Criteria andContentTitleIsNotNull() {
            addCriterion("content_title is not null");
            return (Criteria) this;
        }

        public Criteria andContentTitleEqualTo(String value) {
            addCriterion("content_title =", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotEqualTo(String value) {
            addCriterion("content_title <>", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThan(String value) {
            addCriterion("content_title >", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("content_title >=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThan(String value) {
            addCriterion("content_title <", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThanOrEqualTo(String value) {
            addCriterion("content_title <=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLike(String value) {
            addCriterion("content_title like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotLike(String value) {
            addCriterion("content_title not like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleIn(List<String> values) {
            addCriterion("content_title in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotIn(List<String> values) {
            addCriterion("content_title not in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleBetween(String value1, String value2) {
            addCriterion("content_title between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotBetween(String value1, String value2) {
            addCriterion("content_title not between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnIsNull() {
            addCriterion("content_title_en is null");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnIsNotNull() {
            addCriterion("content_title_en is not null");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnEqualTo(String value) {
            addCriterion("content_title_en =", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnNotEqualTo(String value) {
            addCriterion("content_title_en <>", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnGreaterThan(String value) {
            addCriterion("content_title_en >", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("content_title_en >=", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnLessThan(String value) {
            addCriterion("content_title_en <", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnLessThanOrEqualTo(String value) {
            addCriterion("content_title_en <=", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnLike(String value) {
            addCriterion("content_title_en like", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnNotLike(String value) {
            addCriterion("content_title_en not like", value, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnIn(List<String> values) {
            addCriterion("content_title_en in", values, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnNotIn(List<String> values) {
            addCriterion("content_title_en not in", values, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnBetween(String value1, String value2) {
            addCriterion("content_title_en between", value1, value2, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentTitleEnNotBetween(String value1, String value2) {
            addCriterion("content_title_en not between", value1, value2, "contentTitleEn");
            return (Criteria) this;
        }

        public Criteria andContentUserIsNull() {
            addCriterion("content_user is null");
            return (Criteria) this;
        }

        public Criteria andContentUserIsNotNull() {
            addCriterion("content_user is not null");
            return (Criteria) this;
        }

        public Criteria andContentUserEqualTo(String value) {
            addCriterion("content_user =", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserNotEqualTo(String value) {
            addCriterion("content_user <>", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserGreaterThan(String value) {
            addCriterion("content_user >", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserGreaterThanOrEqualTo(String value) {
            addCriterion("content_user >=", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserLessThan(String value) {
            addCriterion("content_user <", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserLessThanOrEqualTo(String value) {
            addCriterion("content_user <=", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserLike(String value) {
            addCriterion("content_user like", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserNotLike(String value) {
            addCriterion("content_user not like", value, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserIn(List<String> values) {
            addCriterion("content_user in", values, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserNotIn(List<String> values) {
            addCriterion("content_user not in", values, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserBetween(String value1, String value2) {
            addCriterion("content_user between", value1, value2, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentUserNotBetween(String value1, String value2) {
            addCriterion("content_user not between", value1, value2, "contentUser");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeIsNull() {
            addCriterion("content_create_time is null");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeIsNotNull() {
            addCriterion("content_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeEqualTo(String value) {
            addCriterion("content_create_time =", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeNotEqualTo(String value) {
            addCriterion("content_create_time <>", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeGreaterThan(String value) {
            addCriterion("content_create_time >", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("content_create_time >=", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeLessThan(String value) {
            addCriterion("content_create_time <", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("content_create_time <=", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeLike(String value) {
            addCriterion("content_create_time like", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeNotLike(String value) {
            addCriterion("content_create_time not like", value, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeIn(List<String> values) {
            addCriterion("content_create_time in", values, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeNotIn(List<String> values) {
            addCriterion("content_create_time not in", values, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeBetween(String value1, String value2) {
            addCriterion("content_create_time between", value1, value2, "contentCreateTime");
            return (Criteria) this;
        }

        public Criteria andContentCreateTimeNotBetween(String value1, String value2) {
            addCriterion("content_create_time not between", value1, value2, "contentCreateTime");
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
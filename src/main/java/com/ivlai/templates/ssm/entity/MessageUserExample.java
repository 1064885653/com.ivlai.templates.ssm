package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class MessageUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageUserExample() {
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

        public Criteria andMessageUserIdIsNull() {
            addCriterion("message_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIsNotNull() {
            addCriterion("message_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdEqualTo(Integer value) {
            addCriterion("message_user_id =", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotEqualTo(Integer value) {
            addCriterion("message_user_id <>", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThan(Integer value) {
            addCriterion("message_user_id >", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_user_id >=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThan(Integer value) {
            addCriterion("message_user_id <", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_user_id <=", value, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdIn(List<Integer> values) {
            addCriterion("message_user_id in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotIn(List<Integer> values) {
            addCriterion("message_user_id not in", values, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdBetween(Integer value1, Integer value2) {
            addCriterion("message_user_id between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_user_id not between", value1, value2, "messageUserId");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameIsNull() {
            addCriterion("message_user_name is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameIsNotNull() {
            addCriterion("message_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameEqualTo(String value) {
            addCriterion("message_user_name =", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotEqualTo(String value) {
            addCriterion("message_user_name <>", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameGreaterThan(String value) {
            addCriterion("message_user_name >", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_name >=", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameLessThan(String value) {
            addCriterion("message_user_name <", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameLessThanOrEqualTo(String value) {
            addCriterion("message_user_name <=", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameLike(String value) {
            addCriterion("message_user_name like", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotLike(String value) {
            addCriterion("message_user_name not like", value, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameIn(List<String> values) {
            addCriterion("message_user_name in", values, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotIn(List<String> values) {
            addCriterion("message_user_name not in", values, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameBetween(String value1, String value2) {
            addCriterion("message_user_name between", value1, value2, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserNameNotBetween(String value1, String value2) {
            addCriterion("message_user_name not between", value1, value2, "messageUserName");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeIsNull() {
            addCriterion("message_user_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeIsNotNull() {
            addCriterion("message_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeEqualTo(Integer value) {
            addCriterion("message_user_type =", value, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeNotEqualTo(Integer value) {
            addCriterion("message_user_type <>", value, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeGreaterThan(Integer value) {
            addCriterion("message_user_type >", value, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_user_type >=", value, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeLessThan(Integer value) {
            addCriterion("message_user_type <", value, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("message_user_type <=", value, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeIn(List<Integer> values) {
            addCriterion("message_user_type in", values, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeNotIn(List<Integer> values) {
            addCriterion("message_user_type not in", values, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("message_user_type between", value1, value2, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("message_user_type not between", value1, value2, "messageUserType");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationIsNull() {
            addCriterion("message_user_appellation is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationIsNotNull() {
            addCriterion("message_user_appellation is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationEqualTo(String value) {
            addCriterion("message_user_appellation =", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationNotEqualTo(String value) {
            addCriterion("message_user_appellation <>", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationGreaterThan(String value) {
            addCriterion("message_user_appellation >", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_appellation >=", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationLessThan(String value) {
            addCriterion("message_user_appellation <", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationLessThanOrEqualTo(String value) {
            addCriterion("message_user_appellation <=", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationLike(String value) {
            addCriterion("message_user_appellation like", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationNotLike(String value) {
            addCriterion("message_user_appellation not like", value, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationIn(List<String> values) {
            addCriterion("message_user_appellation in", values, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationNotIn(List<String> values) {
            addCriterion("message_user_appellation not in", values, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationBetween(String value1, String value2) {
            addCriterion("message_user_appellation between", value1, value2, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAppellationNotBetween(String value1, String value2) {
            addCriterion("message_user_appellation not between", value1, value2, "messageUserAppellation");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeIsNull() {
            addCriterion("message_user_age is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeIsNotNull() {
            addCriterion("message_user_age is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeEqualTo(Integer value) {
            addCriterion("message_user_age =", value, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeNotEqualTo(Integer value) {
            addCriterion("message_user_age <>", value, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeGreaterThan(Integer value) {
            addCriterion("message_user_age >", value, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_user_age >=", value, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeLessThan(Integer value) {
            addCriterion("message_user_age <", value, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("message_user_age <=", value, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeIn(List<Integer> values) {
            addCriterion("message_user_age in", values, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeNotIn(List<Integer> values) {
            addCriterion("message_user_age not in", values, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("message_user_age between", value1, value2, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("message_user_age not between", value1, value2, "messageUserAge");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderIsNull() {
            addCriterion("message_user_gender is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderIsNotNull() {
            addCriterion("message_user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderEqualTo(Integer value) {
            addCriterion("message_user_gender =", value, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderNotEqualTo(Integer value) {
            addCriterion("message_user_gender <>", value, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderGreaterThan(Integer value) {
            addCriterion("message_user_gender >", value, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_user_gender >=", value, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderLessThan(Integer value) {
            addCriterion("message_user_gender <", value, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderLessThanOrEqualTo(Integer value) {
            addCriterion("message_user_gender <=", value, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderIn(List<Integer> values) {
            addCriterion("message_user_gender in", values, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderNotIn(List<Integer> values) {
            addCriterion("message_user_gender not in", values, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderBetween(Integer value1, Integer value2) {
            addCriterion("message_user_gender between", value1, value2, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("message_user_gender not between", value1, value2, "messageUserGender");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationIsNull() {
            addCriterion("message_user_nation is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationIsNotNull() {
            addCriterion("message_user_nation is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationEqualTo(Integer value) {
            addCriterion("message_user_nation =", value, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationNotEqualTo(Integer value) {
            addCriterion("message_user_nation <>", value, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationGreaterThan(Integer value) {
            addCriterion("message_user_nation >", value, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_user_nation >=", value, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationLessThan(Integer value) {
            addCriterion("message_user_nation <", value, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationLessThanOrEqualTo(Integer value) {
            addCriterion("message_user_nation <=", value, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationIn(List<Integer> values) {
            addCriterion("message_user_nation in", values, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationNotIn(List<Integer> values) {
            addCriterion("message_user_nation not in", values, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationBetween(Integer value1, Integer value2) {
            addCriterion("message_user_nation between", value1, value2, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationNotBetween(Integer value1, Integer value2) {
            addCriterion("message_user_nation not between", value1, value2, "messageUserNation");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityIsNull() {
            addCriterion("message_user_nationality is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityIsNotNull() {
            addCriterion("message_user_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityEqualTo(String value) {
            addCriterion("message_user_nationality =", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityNotEqualTo(String value) {
            addCriterion("message_user_nationality <>", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityGreaterThan(String value) {
            addCriterion("message_user_nationality >", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_nationality >=", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityLessThan(String value) {
            addCriterion("message_user_nationality <", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityLessThanOrEqualTo(String value) {
            addCriterion("message_user_nationality <=", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityLike(String value) {
            addCriterion("message_user_nationality like", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityNotLike(String value) {
            addCriterion("message_user_nationality not like", value, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityIn(List<String> values) {
            addCriterion("message_user_nationality in", values, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityNotIn(List<String> values) {
            addCriterion("message_user_nationality not in", values, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityBetween(String value1, String value2) {
            addCriterion("message_user_nationality between", value1, value2, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserNationalityNotBetween(String value1, String value2) {
            addCriterion("message_user_nationality not between", value1, value2, "messageUserNationality");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressIsNull() {
            addCriterion("message_user_address is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressIsNotNull() {
            addCriterion("message_user_address is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressEqualTo(String value) {
            addCriterion("message_user_address =", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNotEqualTo(String value) {
            addCriterion("message_user_address <>", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressGreaterThan(String value) {
            addCriterion("message_user_address >", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_address >=", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressLessThan(String value) {
            addCriterion("message_user_address <", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressLessThanOrEqualTo(String value) {
            addCriterion("message_user_address <=", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressLike(String value) {
            addCriterion("message_user_address like", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNotLike(String value) {
            addCriterion("message_user_address not like", value, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressIn(List<String> values) {
            addCriterion("message_user_address in", values, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNotIn(List<String> values) {
            addCriterion("message_user_address not in", values, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressBetween(String value1, String value2) {
            addCriterion("message_user_address between", value1, value2, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNotBetween(String value1, String value2) {
            addCriterion("message_user_address not between", value1, value2, "messageUserAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowIsNull() {
            addCriterion("message_user_address_now is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowIsNotNull() {
            addCriterion("message_user_address_now is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowEqualTo(String value) {
            addCriterion("message_user_address_now =", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowNotEqualTo(String value) {
            addCriterion("message_user_address_now <>", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowGreaterThan(String value) {
            addCriterion("message_user_address_now >", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_address_now >=", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowLessThan(String value) {
            addCriterion("message_user_address_now <", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowLessThanOrEqualTo(String value) {
            addCriterion("message_user_address_now <=", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowLike(String value) {
            addCriterion("message_user_address_now like", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowNotLike(String value) {
            addCriterion("message_user_address_now not like", value, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowIn(List<String> values) {
            addCriterion("message_user_address_now in", values, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowNotIn(List<String> values) {
            addCriterion("message_user_address_now not in", values, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowBetween(String value1, String value2) {
            addCriterion("message_user_address_now between", value1, value2, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserAddressNowNotBetween(String value1, String value2) {
            addCriterion("message_user_address_now not between", value1, value2, "messageUserAddressNow");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneIsNull() {
            addCriterion("message_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneIsNotNull() {
            addCriterion("message_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneEqualTo(String value) {
            addCriterion("message_user_phone =", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneNotEqualTo(String value) {
            addCriterion("message_user_phone <>", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneGreaterThan(String value) {
            addCriterion("message_user_phone >", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_phone >=", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneLessThan(String value) {
            addCriterion("message_user_phone <", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("message_user_phone <=", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneLike(String value) {
            addCriterion("message_user_phone like", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneNotLike(String value) {
            addCriterion("message_user_phone not like", value, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneIn(List<String> values) {
            addCriterion("message_user_phone in", values, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneNotIn(List<String> values) {
            addCriterion("message_user_phone not in", values, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneBetween(String value1, String value2) {
            addCriterion("message_user_phone between", value1, value2, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserPhoneNotBetween(String value1, String value2) {
            addCriterion("message_user_phone not between", value1, value2, "messageUserPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqIsNull() {
            addCriterion("message_user_qq is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqIsNotNull() {
            addCriterion("message_user_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqEqualTo(String value) {
            addCriterion("message_user_qq =", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqNotEqualTo(String value) {
            addCriterion("message_user_qq <>", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqGreaterThan(String value) {
            addCriterion("message_user_qq >", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_qq >=", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqLessThan(String value) {
            addCriterion("message_user_qq <", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqLessThanOrEqualTo(String value) {
            addCriterion("message_user_qq <=", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqLike(String value) {
            addCriterion("message_user_qq like", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqNotLike(String value) {
            addCriterion("message_user_qq not like", value, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqIn(List<String> values) {
            addCriterion("message_user_qq in", values, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqNotIn(List<String> values) {
            addCriterion("message_user_qq not in", values, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqBetween(String value1, String value2) {
            addCriterion("message_user_qq between", value1, value2, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserQqNotBetween(String value1, String value2) {
            addCriterion("message_user_qq not between", value1, value2, "messageUserQq");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatIsNull() {
            addCriterion("message_user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatIsNotNull() {
            addCriterion("message_user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatEqualTo(String value) {
            addCriterion("message_user_wechat =", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatNotEqualTo(String value) {
            addCriterion("message_user_wechat <>", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatGreaterThan(String value) {
            addCriterion("message_user_wechat >", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_wechat >=", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatLessThan(String value) {
            addCriterion("message_user_wechat <", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatLessThanOrEqualTo(String value) {
            addCriterion("message_user_wechat <=", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatLike(String value) {
            addCriterion("message_user_wechat like", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatNotLike(String value) {
            addCriterion("message_user_wechat not like", value, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatIn(List<String> values) {
            addCriterion("message_user_wechat in", values, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatNotIn(List<String> values) {
            addCriterion("message_user_wechat not in", values, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatBetween(String value1, String value2) {
            addCriterion("message_user_wechat between", value1, value2, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserWechatNotBetween(String value1, String value2) {
            addCriterion("message_user_wechat not between", value1, value2, "messageUserWechat");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailIsNull() {
            addCriterion("message_user_email is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailIsNotNull() {
            addCriterion("message_user_email is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailEqualTo(String value) {
            addCriterion("message_user_email =", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailNotEqualTo(String value) {
            addCriterion("message_user_email <>", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailGreaterThan(String value) {
            addCriterion("message_user_email >", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_email >=", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailLessThan(String value) {
            addCriterion("message_user_email <", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailLessThanOrEqualTo(String value) {
            addCriterion("message_user_email <=", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailLike(String value) {
            addCriterion("message_user_email like", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailNotLike(String value) {
            addCriterion("message_user_email not like", value, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailIn(List<String> values) {
            addCriterion("message_user_email in", values, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailNotIn(List<String> values) {
            addCriterion("message_user_email not in", values, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailBetween(String value1, String value2) {
            addCriterion("message_user_email between", value1, value2, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserEmailNotBetween(String value1, String value2) {
            addCriterion("message_user_email not between", value1, value2, "messageUserEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameIsNull() {
            addCriterion("message_user_company_name is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameIsNotNull() {
            addCriterion("message_user_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameEqualTo(String value) {
            addCriterion("message_user_company_name =", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameNotEqualTo(String value) {
            addCriterion("message_user_company_name <>", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameGreaterThan(String value) {
            addCriterion("message_user_company_name >", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_company_name >=", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameLessThan(String value) {
            addCriterion("message_user_company_name <", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("message_user_company_name <=", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameLike(String value) {
            addCriterion("message_user_company_name like", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameNotLike(String value) {
            addCriterion("message_user_company_name not like", value, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameIn(List<String> values) {
            addCriterion("message_user_company_name in", values, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameNotIn(List<String> values) {
            addCriterion("message_user_company_name not in", values, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameBetween(String value1, String value2) {
            addCriterion("message_user_company_name between", value1, value2, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyNameNotBetween(String value1, String value2) {
            addCriterion("message_user_company_name not between", value1, value2, "messageUserCompanyName");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostIsNull() {
            addCriterion("message_user_company_post is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostIsNotNull() {
            addCriterion("message_user_company_post is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostEqualTo(String value) {
            addCriterion("message_user_company_post =", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostNotEqualTo(String value) {
            addCriterion("message_user_company_post <>", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostGreaterThan(String value) {
            addCriterion("message_user_company_post >", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_company_post >=", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostLessThan(String value) {
            addCriterion("message_user_company_post <", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostLessThanOrEqualTo(String value) {
            addCriterion("message_user_company_post <=", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostLike(String value) {
            addCriterion("message_user_company_post like", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostNotLike(String value) {
            addCriterion("message_user_company_post not like", value, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostIn(List<String> values) {
            addCriterion("message_user_company_post in", values, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostNotIn(List<String> values) {
            addCriterion("message_user_company_post not in", values, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostBetween(String value1, String value2) {
            addCriterion("message_user_company_post between", value1, value2, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPostNotBetween(String value1, String value2) {
            addCriterion("message_user_company_post not between", value1, value2, "messageUserCompanyPost");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressIsNull() {
            addCriterion("message_user_company_address is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressIsNotNull() {
            addCriterion("message_user_company_address is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressEqualTo(String value) {
            addCriterion("message_user_company_address =", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressNotEqualTo(String value) {
            addCriterion("message_user_company_address <>", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressGreaterThan(String value) {
            addCriterion("message_user_company_address >", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_company_address >=", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressLessThan(String value) {
            addCriterion("message_user_company_address <", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("message_user_company_address <=", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressLike(String value) {
            addCriterion("message_user_company_address like", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressNotLike(String value) {
            addCriterion("message_user_company_address not like", value, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressIn(List<String> values) {
            addCriterion("message_user_company_address in", values, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressNotIn(List<String> values) {
            addCriterion("message_user_company_address not in", values, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressBetween(String value1, String value2) {
            addCriterion("message_user_company_address between", value1, value2, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("message_user_company_address not between", value1, value2, "messageUserCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneIsNull() {
            addCriterion("message_user_company_phone is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneIsNotNull() {
            addCriterion("message_user_company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneEqualTo(String value) {
            addCriterion("message_user_company_phone =", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneNotEqualTo(String value) {
            addCriterion("message_user_company_phone <>", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneGreaterThan(String value) {
            addCriterion("message_user_company_phone >", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_company_phone >=", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneLessThan(String value) {
            addCriterion("message_user_company_phone <", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("message_user_company_phone <=", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneLike(String value) {
            addCriterion("message_user_company_phone like", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneNotLike(String value) {
            addCriterion("message_user_company_phone not like", value, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneIn(List<String> values) {
            addCriterion("message_user_company_phone in", values, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneNotIn(List<String> values) {
            addCriterion("message_user_company_phone not in", values, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneBetween(String value1, String value2) {
            addCriterion("message_user_company_phone between", value1, value2, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("message_user_company_phone not between", value1, value2, "messageUserCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixIsNull() {
            addCriterion("message_user_company_phone_fix is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixIsNotNull() {
            addCriterion("message_user_company_phone_fix is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixEqualTo(String value) {
            addCriterion("message_user_company_phone_fix =", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixNotEqualTo(String value) {
            addCriterion("message_user_company_phone_fix <>", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixGreaterThan(String value) {
            addCriterion("message_user_company_phone_fix >", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_company_phone_fix >=", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixLessThan(String value) {
            addCriterion("message_user_company_phone_fix <", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixLessThanOrEqualTo(String value) {
            addCriterion("message_user_company_phone_fix <=", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixLike(String value) {
            addCriterion("message_user_company_phone_fix like", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixNotLike(String value) {
            addCriterion("message_user_company_phone_fix not like", value, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixIn(List<String> values) {
            addCriterion("message_user_company_phone_fix in", values, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixNotIn(List<String> values) {
            addCriterion("message_user_company_phone_fix not in", values, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixBetween(String value1, String value2) {
            addCriterion("message_user_company_phone_fix between", value1, value2, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyPhoneFixNotBetween(String value1, String value2) {
            addCriterion("message_user_company_phone_fix not between", value1, value2, "messageUserCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailIsNull() {
            addCriterion("message_user_company_email is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailIsNotNull() {
            addCriterion("message_user_company_email is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailEqualTo(String value) {
            addCriterion("message_user_company_email =", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailNotEqualTo(String value) {
            addCriterion("message_user_company_email <>", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailGreaterThan(String value) {
            addCriterion("message_user_company_email >", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_company_email >=", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailLessThan(String value) {
            addCriterion("message_user_company_email <", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("message_user_company_email <=", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailLike(String value) {
            addCriterion("message_user_company_email like", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailNotLike(String value) {
            addCriterion("message_user_company_email not like", value, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailIn(List<String> values) {
            addCriterion("message_user_company_email in", values, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailNotIn(List<String> values) {
            addCriterion("message_user_company_email not in", values, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailBetween(String value1, String value2) {
            addCriterion("message_user_company_email between", value1, value2, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("message_user_company_email not between", value1, value2, "messageUserCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkIsNull() {
            addCriterion("message_user_info_remark is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkIsNotNull() {
            addCriterion("message_user_info_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkEqualTo(String value) {
            addCriterion("message_user_info_remark =", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkNotEqualTo(String value) {
            addCriterion("message_user_info_remark <>", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkGreaterThan(String value) {
            addCriterion("message_user_info_remark >", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_info_remark >=", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkLessThan(String value) {
            addCriterion("message_user_info_remark <", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkLessThanOrEqualTo(String value) {
            addCriterion("message_user_info_remark <=", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkLike(String value) {
            addCriterion("message_user_info_remark like", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkNotLike(String value) {
            addCriterion("message_user_info_remark not like", value, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkIn(List<String> values) {
            addCriterion("message_user_info_remark in", values, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkNotIn(List<String> values) {
            addCriterion("message_user_info_remark not in", values, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkBetween(String value1, String value2) {
            addCriterion("message_user_info_remark between", value1, value2, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoRemarkNotBetween(String value1, String value2) {
            addCriterion("message_user_info_remark not between", value1, value2, "messageUserInfoRemark");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageIsNull() {
            addCriterion("message_user_info_message is null");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageIsNotNull() {
            addCriterion("message_user_info_message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageEqualTo(String value) {
            addCriterion("message_user_info_message =", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageNotEqualTo(String value) {
            addCriterion("message_user_info_message <>", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageGreaterThan(String value) {
            addCriterion("message_user_info_message >", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message_user_info_message >=", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageLessThan(String value) {
            addCriterion("message_user_info_message <", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageLessThanOrEqualTo(String value) {
            addCriterion("message_user_info_message <=", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageLike(String value) {
            addCriterion("message_user_info_message like", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageNotLike(String value) {
            addCriterion("message_user_info_message not like", value, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageIn(List<String> values) {
            addCriterion("message_user_info_message in", values, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageNotIn(List<String> values) {
            addCriterion("message_user_info_message not in", values, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageBetween(String value1, String value2) {
            addCriterion("message_user_info_message between", value1, value2, "messageUserInfoMessage");
            return (Criteria) this;
        }

        public Criteria andMessageUserInfoMessageNotBetween(String value1, String value2) {
            addCriterion("message_user_info_message not between", value1, value2, "messageUserInfoMessage");
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
package com.ivlai.templates.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserAppellationIsNull() {
            addCriterion("user_appellation is null");
            return (Criteria) this;
        }

        public Criteria andUserAppellationIsNotNull() {
            addCriterion("user_appellation is not null");
            return (Criteria) this;
        }

        public Criteria andUserAppellationEqualTo(String value) {
            addCriterion("user_appellation =", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationNotEqualTo(String value) {
            addCriterion("user_appellation <>", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationGreaterThan(String value) {
            addCriterion("user_appellation >", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationGreaterThanOrEqualTo(String value) {
            addCriterion("user_appellation >=", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationLessThan(String value) {
            addCriterion("user_appellation <", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationLessThanOrEqualTo(String value) {
            addCriterion("user_appellation <=", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationLike(String value) {
            addCriterion("user_appellation like", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationNotLike(String value) {
            addCriterion("user_appellation not like", value, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationIn(List<String> values) {
            addCriterion("user_appellation in", values, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationNotIn(List<String> values) {
            addCriterion("user_appellation not in", values, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationBetween(String value1, String value2) {
            addCriterion("user_appellation between", value1, value2, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAppellationNotBetween(String value1, String value2) {
            addCriterion("user_appellation not between", value1, value2, "userAppellation");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(Integer value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(Integer value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(Integer value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(Integer value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(Integer value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<Integer> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<Integer> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(Integer value1, Integer value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserNationIsNull() {
            addCriterion("user_nation is null");
            return (Criteria) this;
        }

        public Criteria andUserNationIsNotNull() {
            addCriterion("user_nation is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationEqualTo(Integer value) {
            addCriterion("user_nation =", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotEqualTo(Integer value) {
            addCriterion("user_nation <>", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationGreaterThan(Integer value) {
            addCriterion("user_nation >", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_nation >=", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLessThan(Integer value) {
            addCriterion("user_nation <", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLessThanOrEqualTo(Integer value) {
            addCriterion("user_nation <=", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationIn(List<Integer> values) {
            addCriterion("user_nation in", values, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotIn(List<Integer> values) {
            addCriterion("user_nation not in", values, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationBetween(Integer value1, Integer value2) {
            addCriterion("user_nation between", value1, value2, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotBetween(Integer value1, Integer value2) {
            addCriterion("user_nation not between", value1, value2, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationalityIsNull() {
            addCriterion("user_nationality is null");
            return (Criteria) this;
        }

        public Criteria andUserNationalityIsNotNull() {
            addCriterion("user_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationalityEqualTo(String value) {
            addCriterion("user_nationality =", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotEqualTo(String value) {
            addCriterion("user_nationality <>", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityGreaterThan(String value) {
            addCriterion("user_nationality >", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("user_nationality >=", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityLessThan(String value) {
            addCriterion("user_nationality <", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityLessThanOrEqualTo(String value) {
            addCriterion("user_nationality <=", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityLike(String value) {
            addCriterion("user_nationality like", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotLike(String value) {
            addCriterion("user_nationality not like", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityIn(List<String> values) {
            addCriterion("user_nationality in", values, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotIn(List<String> values) {
            addCriterion("user_nationality not in", values, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityBetween(String value1, String value2) {
            addCriterion("user_nationality between", value1, value2, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotBetween(String value1, String value2) {
            addCriterion("user_nationality not between", value1, value2, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowIsNull() {
            addCriterion("user_address_now is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowIsNotNull() {
            addCriterion("user_address_now is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowEqualTo(String value) {
            addCriterion("user_address_now =", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowNotEqualTo(String value) {
            addCriterion("user_address_now <>", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowGreaterThan(String value) {
            addCriterion("user_address_now >", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_now >=", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowLessThan(String value) {
            addCriterion("user_address_now <", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowLessThanOrEqualTo(String value) {
            addCriterion("user_address_now <=", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowLike(String value) {
            addCriterion("user_address_now like", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowNotLike(String value) {
            addCriterion("user_address_now not like", value, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowIn(List<String> values) {
            addCriterion("user_address_now in", values, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowNotIn(List<String> values) {
            addCriterion("user_address_now not in", values, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowBetween(String value1, String value2) {
            addCriterion("user_address_now between", value1, value2, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserAddressNowNotBetween(String value1, String value2) {
            addCriterion("user_address_now not between", value1, value2, "userAddressNow");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("user_qq is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("user_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(String value) {
            addCriterion("user_qq =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(String value) {
            addCriterion("user_qq <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(String value) {
            addCriterion("user_qq >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("user_qq >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(String value) {
            addCriterion("user_qq <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(String value) {
            addCriterion("user_qq <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLike(String value) {
            addCriterion("user_qq like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotLike(String value) {
            addCriterion("user_qq not like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<String> values) {
            addCriterion("user_qq in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<String> values) {
            addCriterion("user_qq not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(String value1, String value2) {
            addCriterion("user_qq between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(String value1, String value2) {
            addCriterion("user_qq not between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("user_wechat =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("user_wechat <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("user_wechat >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("user_wechat >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("user_wechat <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("user_wechat <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("user_wechat like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("user_wechat not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("user_wechat in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("user_wechat not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("user_wechat between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("user_wechat not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameIsNull() {
            addCriterion("user_company_name is null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameIsNotNull() {
            addCriterion("user_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameEqualTo(String value) {
            addCriterion("user_company_name =", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameNotEqualTo(String value) {
            addCriterion("user_company_name <>", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameGreaterThan(String value) {
            addCriterion("user_company_name >", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_company_name >=", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameLessThan(String value) {
            addCriterion("user_company_name <", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("user_company_name <=", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameLike(String value) {
            addCriterion("user_company_name like", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameNotLike(String value) {
            addCriterion("user_company_name not like", value, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameIn(List<String> values) {
            addCriterion("user_company_name in", values, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameNotIn(List<String> values) {
            addCriterion("user_company_name not in", values, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameBetween(String value1, String value2) {
            addCriterion("user_company_name between", value1, value2, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyNameNotBetween(String value1, String value2) {
            addCriterion("user_company_name not between", value1, value2, "userCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostIsNull() {
            addCriterion("user_company_post is null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostIsNotNull() {
            addCriterion("user_company_post is not null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostEqualTo(String value) {
            addCriterion("user_company_post =", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostNotEqualTo(String value) {
            addCriterion("user_company_post <>", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostGreaterThan(String value) {
            addCriterion("user_company_post >", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostGreaterThanOrEqualTo(String value) {
            addCriterion("user_company_post >=", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostLessThan(String value) {
            addCriterion("user_company_post <", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostLessThanOrEqualTo(String value) {
            addCriterion("user_company_post <=", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostLike(String value) {
            addCriterion("user_company_post like", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostNotLike(String value) {
            addCriterion("user_company_post not like", value, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostIn(List<String> values) {
            addCriterion("user_company_post in", values, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostNotIn(List<String> values) {
            addCriterion("user_company_post not in", values, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostBetween(String value1, String value2) {
            addCriterion("user_company_post between", value1, value2, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPostNotBetween(String value1, String value2) {
            addCriterion("user_company_post not between", value1, value2, "userCompanyPost");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressIsNull() {
            addCriterion("user_company_address is null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressIsNotNull() {
            addCriterion("user_company_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressEqualTo(String value) {
            addCriterion("user_company_address =", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressNotEqualTo(String value) {
            addCriterion("user_company_address <>", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressGreaterThan(String value) {
            addCriterion("user_company_address >", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_company_address >=", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressLessThan(String value) {
            addCriterion("user_company_address <", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("user_company_address <=", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressLike(String value) {
            addCriterion("user_company_address like", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressNotLike(String value) {
            addCriterion("user_company_address not like", value, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressIn(List<String> values) {
            addCriterion("user_company_address in", values, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressNotIn(List<String> values) {
            addCriterion("user_company_address not in", values, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressBetween(String value1, String value2) {
            addCriterion("user_company_address between", value1, value2, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("user_company_address not between", value1, value2, "userCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneIsNull() {
            addCriterion("user_company_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneIsNotNull() {
            addCriterion("user_company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneEqualTo(String value) {
            addCriterion("user_company_phone =", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneNotEqualTo(String value) {
            addCriterion("user_company_phone <>", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneGreaterThan(String value) {
            addCriterion("user_company_phone >", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_company_phone >=", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneLessThan(String value) {
            addCriterion("user_company_phone <", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_company_phone <=", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneLike(String value) {
            addCriterion("user_company_phone like", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneNotLike(String value) {
            addCriterion("user_company_phone not like", value, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneIn(List<String> values) {
            addCriterion("user_company_phone in", values, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneNotIn(List<String> values) {
            addCriterion("user_company_phone not in", values, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneBetween(String value1, String value2) {
            addCriterion("user_company_phone between", value1, value2, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("user_company_phone not between", value1, value2, "userCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixIsNull() {
            addCriterion("user_company_phone_fix is null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixIsNotNull() {
            addCriterion("user_company_phone_fix is not null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixEqualTo(String value) {
            addCriterion("user_company_phone_fix =", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixNotEqualTo(String value) {
            addCriterion("user_company_phone_fix <>", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixGreaterThan(String value) {
            addCriterion("user_company_phone_fix >", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixGreaterThanOrEqualTo(String value) {
            addCriterion("user_company_phone_fix >=", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixLessThan(String value) {
            addCriterion("user_company_phone_fix <", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixLessThanOrEqualTo(String value) {
            addCriterion("user_company_phone_fix <=", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixLike(String value) {
            addCriterion("user_company_phone_fix like", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixNotLike(String value) {
            addCriterion("user_company_phone_fix not like", value, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixIn(List<String> values) {
            addCriterion("user_company_phone_fix in", values, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixNotIn(List<String> values) {
            addCriterion("user_company_phone_fix not in", values, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixBetween(String value1, String value2) {
            addCriterion("user_company_phone_fix between", value1, value2, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyPhoneFixNotBetween(String value1, String value2) {
            addCriterion("user_company_phone_fix not between", value1, value2, "userCompanyPhoneFix");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailIsNull() {
            addCriterion("user_company_email is null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailIsNotNull() {
            addCriterion("user_company_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailEqualTo(String value) {
            addCriterion("user_company_email =", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailNotEqualTo(String value) {
            addCriterion("user_company_email <>", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailGreaterThan(String value) {
            addCriterion("user_company_email >", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_company_email >=", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailLessThan(String value) {
            addCriterion("user_company_email <", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("user_company_email <=", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailLike(String value) {
            addCriterion("user_company_email like", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailNotLike(String value) {
            addCriterion("user_company_email not like", value, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailIn(List<String> values) {
            addCriterion("user_company_email in", values, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailNotIn(List<String> values) {
            addCriterion("user_company_email not in", values, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailBetween(String value1, String value2) {
            addCriterion("user_company_email between", value1, value2, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("user_company_email not between", value1, value2, "userCompanyEmail");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkIsNull() {
            addCriterion("user_info_remark is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkIsNotNull() {
            addCriterion("user_info_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkEqualTo(String value) {
            addCriterion("user_info_remark =", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkNotEqualTo(String value) {
            addCriterion("user_info_remark <>", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkGreaterThan(String value) {
            addCriterion("user_info_remark >", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("user_info_remark >=", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkLessThan(String value) {
            addCriterion("user_info_remark <", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkLessThanOrEqualTo(String value) {
            addCriterion("user_info_remark <=", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkLike(String value) {
            addCriterion("user_info_remark like", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkNotLike(String value) {
            addCriterion("user_info_remark not like", value, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkIn(List<String> values) {
            addCriterion("user_info_remark in", values, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkNotIn(List<String> values) {
            addCriterion("user_info_remark not in", values, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkBetween(String value1, String value2) {
            addCriterion("user_info_remark between", value1, value2, "userInfoRemark");
            return (Criteria) this;
        }

        public Criteria andUserInfoRemarkNotBetween(String value1, String value2) {
            addCriterion("user_info_remark not between", value1, value2, "userInfoRemark");
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
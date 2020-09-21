package com.account.back.Proj;

import java.util.ArrayList;
import java.util.List;

public class AssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetExample() {
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

        public Criteria andAssetIdIsNull() {
            addCriterion("Asset_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetIdIsNotNull() {
            addCriterion("Asset_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetIdEqualTo(Integer value) {
            addCriterion("Asset_id =", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotEqualTo(Integer value) {
            addCriterion("Asset_id <>", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThan(Integer value) {
            addCriterion("Asset_id >", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Asset_id >=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThan(Integer value) {
            addCriterion("Asset_id <", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThanOrEqualTo(Integer value) {
            addCriterion("Asset_id <=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdIn(List<Integer> values) {
            addCriterion("Asset_id in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotIn(List<Integer> values) {
            addCriterion("Asset_id not in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdBetween(Integer value1, Integer value2) {
            addCriterion("Asset_id between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Asset_id not between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNull() {
            addCriterion("Asset_name is null");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNotNull() {
            addCriterion("Asset_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNameEqualTo(String value) {
            addCriterion("Asset_name =", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotEqualTo(String value) {
            addCriterion("Asset_name <>", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThan(String value) {
            addCriterion("Asset_name >", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("Asset_name >=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThan(String value) {
            addCriterion("Asset_name <", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThanOrEqualTo(String value) {
            addCriterion("Asset_name <=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLike(String value) {
            addCriterion("Asset_name like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotLike(String value) {
            addCriterion("Asset_name not like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameIn(List<String> values) {
            addCriterion("Asset_name in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotIn(List<String> values) {
            addCriterion("Asset_name not in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameBetween(String value1, String value2) {
            addCriterion("Asset_name between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotBetween(String value1, String value2) {
            addCriterion("Asset_name not between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetAccountIsNull() {
            addCriterion("Asset_account is null");
            return (Criteria) this;
        }

        public Criteria andAssetAccountIsNotNull() {
            addCriterion("Asset_account is not null");
            return (Criteria) this;
        }

        public Criteria andAssetAccountEqualTo(String value) {
            addCriterion("Asset_account =", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountNotEqualTo(String value) {
            addCriterion("Asset_account <>", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountGreaterThan(String value) {
            addCriterion("Asset_account >", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Asset_account >=", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountLessThan(String value) {
            addCriterion("Asset_account <", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountLessThanOrEqualTo(String value) {
            addCriterion("Asset_account <=", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountLike(String value) {
            addCriterion("Asset_account like", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountNotLike(String value) {
            addCriterion("Asset_account not like", value, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountIn(List<String> values) {
            addCriterion("Asset_account in", values, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountNotIn(List<String> values) {
            addCriterion("Asset_account not in", values, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountBetween(String value1, String value2) {
            addCriterion("Asset_account between", value1, value2, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetAccountNotBetween(String value1, String value2) {
            addCriterion("Asset_account not between", value1, value2, "assetAccount");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumIsNull() {
            addCriterion("Asset_moneyNum is null");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumIsNotNull() {
            addCriterion("Asset_moneyNum is not null");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumEqualTo(Double value) {
            addCriterion("Asset_moneyNum =", value, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumNotEqualTo(Double value) {
            addCriterion("Asset_moneyNum <>", value, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumGreaterThan(Double value) {
            addCriterion("Asset_moneyNum >", value, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumGreaterThanOrEqualTo(Double value) {
            addCriterion("Asset_moneyNum >=", value, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumLessThan(Double value) {
            addCriterion("Asset_moneyNum <", value, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumLessThanOrEqualTo(Double value) {
            addCriterion("Asset_moneyNum <=", value, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumIn(List<Double> values) {
            addCriterion("Asset_moneyNum in", values, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumNotIn(List<Double> values) {
            addCriterion("Asset_moneyNum not in", values, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumBetween(Double value1, Double value2) {
            addCriterion("Asset_moneyNum between", value1, value2, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetMoneynumNotBetween(Double value1, Double value2) {
            addCriterion("Asset_moneyNum not between", value1, value2, "assetMoneynum");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkIsNull() {
            addCriterion("Asset_remark is null");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkIsNotNull() {
            addCriterion("Asset_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkEqualTo(String value) {
            addCriterion("Asset_remark =", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotEqualTo(String value) {
            addCriterion("Asset_remark <>", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkGreaterThan(String value) {
            addCriterion("Asset_remark >", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Asset_remark >=", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkLessThan(String value) {
            addCriterion("Asset_remark <", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkLessThanOrEqualTo(String value) {
            addCriterion("Asset_remark <=", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkLike(String value) {
            addCriterion("Asset_remark like", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotLike(String value) {
            addCriterion("Asset_remark not like", value, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkIn(List<String> values) {
            addCriterion("Asset_remark in", values, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotIn(List<String> values) {
            addCriterion("Asset_remark not in", values, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkBetween(String value1, String value2) {
            addCriterion("Asset_remark between", value1, value2, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andAssetRemarkNotBetween(String value1, String value2) {
            addCriterion("Asset_remark not between", value1, value2, "assetRemark");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_id not between", value1, value2, "userId");
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
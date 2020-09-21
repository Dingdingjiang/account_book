package com.account.back.Proj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DebtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DebtExample() {
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

        public Criteria andDebtIdIsNull() {
            addCriterion("Debt_id is null");
            return (Criteria) this;
        }

        public Criteria andDebtIdIsNotNull() {
            addCriterion("Debt_id is not null");
            return (Criteria) this;
        }

        public Criteria andDebtIdEqualTo(Integer value) {
            addCriterion("Debt_id =", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdNotEqualTo(Integer value) {
            addCriterion("Debt_id <>", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdGreaterThan(Integer value) {
            addCriterion("Debt_id >", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Debt_id >=", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdLessThan(Integer value) {
            addCriterion("Debt_id <", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdLessThanOrEqualTo(Integer value) {
            addCriterion("Debt_id <=", value, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdIn(List<Integer> values) {
            addCriterion("Debt_id in", values, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdNotIn(List<Integer> values) {
            addCriterion("Debt_id not in", values, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdBetween(Integer value1, Integer value2) {
            addCriterion("Debt_id between", value1, value2, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Debt_id not between", value1, value2, "debtId");
            return (Criteria) this;
        }

        public Criteria andDebtNameIsNull() {
            addCriterion("Debt_name is null");
            return (Criteria) this;
        }

        public Criteria andDebtNameIsNotNull() {
            addCriterion("Debt_name is not null");
            return (Criteria) this;
        }

        public Criteria andDebtNameEqualTo(String value) {
            addCriterion("Debt_name =", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotEqualTo(String value) {
            addCriterion("Debt_name <>", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameGreaterThan(String value) {
            addCriterion("Debt_name >", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameGreaterThanOrEqualTo(String value) {
            addCriterion("Debt_name >=", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameLessThan(String value) {
            addCriterion("Debt_name <", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameLessThanOrEqualTo(String value) {
            addCriterion("Debt_name <=", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameLike(String value) {
            addCriterion("Debt_name like", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotLike(String value) {
            addCriterion("Debt_name not like", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameIn(List<String> values) {
            addCriterion("Debt_name in", values, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotIn(List<String> values) {
            addCriterion("Debt_name not in", values, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameBetween(String value1, String value2) {
            addCriterion("Debt_name between", value1, value2, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotBetween(String value1, String value2) {
            addCriterion("Debt_name not between", value1, value2, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtAccountIsNull() {
            addCriterion("Debt_account is null");
            return (Criteria) this;
        }

        public Criteria andDebtAccountIsNotNull() {
            addCriterion("Debt_account is not null");
            return (Criteria) this;
        }

        public Criteria andDebtAccountEqualTo(String value) {
            addCriterion("Debt_account =", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountNotEqualTo(String value) {
            addCriterion("Debt_account <>", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountGreaterThan(String value) {
            addCriterion("Debt_account >", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Debt_account >=", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountLessThan(String value) {
            addCriterion("Debt_account <", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountLessThanOrEqualTo(String value) {
            addCriterion("Debt_account <=", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountLike(String value) {
            addCriterion("Debt_account like", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountNotLike(String value) {
            addCriterion("Debt_account not like", value, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountIn(List<String> values) {
            addCriterion("Debt_account in", values, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountNotIn(List<String> values) {
            addCriterion("Debt_account not in", values, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountBetween(String value1, String value2) {
            addCriterion("Debt_account between", value1, value2, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtAccountNotBetween(String value1, String value2) {
            addCriterion("Debt_account not between", value1, value2, "debtAccount");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumIsNull() {
            addCriterion("Debt_moneyNum is null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumIsNotNull() {
            addCriterion("Debt_moneyNum is not null");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumEqualTo(Double value) {
            addCriterion("Debt_moneyNum =", value, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumNotEqualTo(Double value) {
            addCriterion("Debt_moneyNum <>", value, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumGreaterThan(Double value) {
            addCriterion("Debt_moneyNum >", value, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumGreaterThanOrEqualTo(Double value) {
            addCriterion("Debt_moneyNum >=", value, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumLessThan(Double value) {
            addCriterion("Debt_moneyNum <", value, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumLessThanOrEqualTo(Double value) {
            addCriterion("Debt_moneyNum <=", value, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumIn(List<Double> values) {
            addCriterion("Debt_moneyNum in", values, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumNotIn(List<Double> values) {
            addCriterion("Debt_moneyNum not in", values, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumBetween(Double value1, Double value2) {
            addCriterion("Debt_moneyNum between", value1, value2, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtMoneynumNotBetween(Double value1, Double value2) {
            addCriterion("Debt_moneyNum not between", value1, value2, "debtMoneynum");
            return (Criteria) this;
        }

        public Criteria andDebtDateIsNull() {
            addCriterion("Debt_date is null");
            return (Criteria) this;
        }

        public Criteria andDebtDateIsNotNull() {
            addCriterion("Debt_date is not null");
            return (Criteria) this;
        }

        public Criteria andDebtDateEqualTo(Date value) {
            addCriterion("Debt_date =", value, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateNotEqualTo(Date value) {
            addCriterion("Debt_date <>", value, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateGreaterThan(Date value) {
            addCriterion("Debt_date >", value, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Debt_date >=", value, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateLessThan(Date value) {
            addCriterion("Debt_date <", value, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateLessThanOrEqualTo(Date value) {
            addCriterion("Debt_date <=", value, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateIn(List<Date> values) {
            addCriterion("Debt_date in", values, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateNotIn(List<Date> values) {
            addCriterion("Debt_date not in", values, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateBetween(Date value1, Date value2) {
            addCriterion("Debt_date between", value1, value2, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtDateNotBetween(Date value1, Date value2) {
            addCriterion("Debt_date not between", value1, value2, "debtDate");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkIsNull() {
            addCriterion("Debt_remark is null");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkIsNotNull() {
            addCriterion("Debt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkEqualTo(String value) {
            addCriterion("Debt_remark =", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkNotEqualTo(String value) {
            addCriterion("Debt_remark <>", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkGreaterThan(String value) {
            addCriterion("Debt_remark >", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Debt_remark >=", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkLessThan(String value) {
            addCriterion("Debt_remark <", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkLessThanOrEqualTo(String value) {
            addCriterion("Debt_remark <=", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkLike(String value) {
            addCriterion("Debt_remark like", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkNotLike(String value) {
            addCriterion("Debt_remark not like", value, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkIn(List<String> values) {
            addCriterion("Debt_remark in", values, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkNotIn(List<String> values) {
            addCriterion("Debt_remark not in", values, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkBetween(String value1, String value2) {
            addCriterion("Debt_remark between", value1, value2, "debtRemark");
            return (Criteria) this;
        }

        public Criteria andDebtRemarkNotBetween(String value1, String value2) {
            addCriterion("Debt_remark not between", value1, value2, "debtRemark");
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
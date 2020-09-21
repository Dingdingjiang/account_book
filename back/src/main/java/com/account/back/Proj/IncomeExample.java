package com.account.back.Proj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncomeExample() {
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

        public Criteria andIncomeIdIsNull() {
            addCriterion("Income_id is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIdIsNotNull() {
            addCriterion("Income_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeIdEqualTo(Integer value) {
            addCriterion("Income_id =", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdNotEqualTo(Integer value) {
            addCriterion("Income_id <>", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdGreaterThan(Integer value) {
            addCriterion("Income_id >", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Income_id >=", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdLessThan(Integer value) {
            addCriterion("Income_id <", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Income_id <=", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdIn(List<Integer> values) {
            addCriterion("Income_id in", values, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdNotIn(List<Integer> values) {
            addCriterion("Income_id not in", values, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdBetween(Integer value1, Integer value2) {
            addCriterion("Income_id between", value1, value2, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Income_id not between", value1, value2, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumIsNull() {
            addCriterion("Income_moneyNum is null");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumIsNotNull() {
            addCriterion("Income_moneyNum is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumEqualTo(Double value) {
            addCriterion("Income_moneyNum =", value, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumNotEqualTo(Double value) {
            addCriterion("Income_moneyNum <>", value, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumGreaterThan(Double value) {
            addCriterion("Income_moneyNum >", value, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumGreaterThanOrEqualTo(Double value) {
            addCriterion("Income_moneyNum >=", value, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumLessThan(Double value) {
            addCriterion("Income_moneyNum <", value, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumLessThanOrEqualTo(Double value) {
            addCriterion("Income_moneyNum <=", value, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumIn(List<Double> values) {
            addCriterion("Income_moneyNum in", values, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumNotIn(List<Double> values) {
            addCriterion("Income_moneyNum not in", values, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumBetween(Double value1, Double value2) {
            addCriterion("Income_moneyNum between", value1, value2, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeMoneynumNotBetween(Double value1, Double value2) {
            addCriterion("Income_moneyNum not between", value1, value2, "incomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andIncomeDateIsNull() {
            addCriterion("Income_date is null");
            return (Criteria) this;
        }

        public Criteria andIncomeDateIsNotNull() {
            addCriterion("Income_date is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeDateEqualTo(Date value) {
            addCriterion("Income_date =", value, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateNotEqualTo(Date value) {
            addCriterion("Income_date <>", value, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateGreaterThan(Date value) {
            addCriterion("Income_date >", value, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Income_date >=", value, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateLessThan(Date value) {
            addCriterion("Income_date <", value, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateLessThanOrEqualTo(Date value) {
            addCriterion("Income_date <=", value, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateIn(List<Date> values) {
            addCriterion("Income_date in", values, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateNotIn(List<Date> values) {
            addCriterion("Income_date not in", values, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateBetween(Date value1, Date value2) {
            addCriterion("Income_date between", value1, value2, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeDateNotBetween(Date value1, Date value2) {
            addCriterion("Income_date not between", value1, value2, "incomeDate");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageIsNull() {
            addCriterion("Income_usage is null");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageIsNotNull() {
            addCriterion("Income_usage is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageEqualTo(String value) {
            addCriterion("Income_usage =", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageNotEqualTo(String value) {
            addCriterion("Income_usage <>", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageGreaterThan(String value) {
            addCriterion("Income_usage >", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Income_usage >=", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageLessThan(String value) {
            addCriterion("Income_usage <", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageLessThanOrEqualTo(String value) {
            addCriterion("Income_usage <=", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageLike(String value) {
            addCriterion("Income_usage like", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageNotLike(String value) {
            addCriterion("Income_usage not like", value, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageIn(List<String> values) {
            addCriterion("Income_usage in", values, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageNotIn(List<String> values) {
            addCriterion("Income_usage not in", values, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageBetween(String value1, String value2) {
            addCriterion("Income_usage between", value1, value2, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeUsageNotBetween(String value1, String value2) {
            addCriterion("Income_usage not between", value1, value2, "incomeUsage");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkIsNull() {
            addCriterion("Income_remark is null");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkIsNotNull() {
            addCriterion("Income_remark is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkEqualTo(String value) {
            addCriterion("Income_remark =", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkNotEqualTo(String value) {
            addCriterion("Income_remark <>", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkGreaterThan(String value) {
            addCriterion("Income_remark >", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Income_remark >=", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkLessThan(String value) {
            addCriterion("Income_remark <", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkLessThanOrEqualTo(String value) {
            addCriterion("Income_remark <=", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkLike(String value) {
            addCriterion("Income_remark like", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkNotLike(String value) {
            addCriterion("Income_remark not like", value, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkIn(List<String> values) {
            addCriterion("Income_remark in", values, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkNotIn(List<String> values) {
            addCriterion("Income_remark not in", values, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkBetween(String value1, String value2) {
            addCriterion("Income_remark between", value1, value2, "incomeRemark");
            return (Criteria) this;
        }

        public Criteria andIncomeRemarkNotBetween(String value1, String value2) {
            addCriterion("Income_remark not between", value1, value2, "incomeRemark");
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
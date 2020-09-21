package com.account.back.Proj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutcomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutcomeExample() {
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

        public Criteria andOutcomeIdIsNull() {
            addCriterion("Outcome_id is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdIsNotNull() {
            addCriterion("Outcome_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdEqualTo(Integer value) {
            addCriterion("Outcome_id =", value, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdNotEqualTo(Integer value) {
            addCriterion("Outcome_id <>", value, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdGreaterThan(Integer value) {
            addCriterion("Outcome_id >", value, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Outcome_id >=", value, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdLessThan(Integer value) {
            addCriterion("Outcome_id <", value, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Outcome_id <=", value, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdIn(List<Integer> values) {
            addCriterion("Outcome_id in", values, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdNotIn(List<Integer> values) {
            addCriterion("Outcome_id not in", values, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdBetween(Integer value1, Integer value2) {
            addCriterion("Outcome_id between", value1, value2, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Outcome_id not between", value1, value2, "outcomeId");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumIsNull() {
            addCriterion("Outcome_moneyNum is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumIsNotNull() {
            addCriterion("Outcome_moneyNum is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumEqualTo(Double value) {
            addCriterion("Outcome_moneyNum =", value, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumNotEqualTo(Double value) {
            addCriterion("Outcome_moneyNum <>", value, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumGreaterThan(Double value) {
            addCriterion("Outcome_moneyNum >", value, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumGreaterThanOrEqualTo(Double value) {
            addCriterion("Outcome_moneyNum >=", value, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumLessThan(Double value) {
            addCriterion("Outcome_moneyNum <", value, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumLessThanOrEqualTo(Double value) {
            addCriterion("Outcome_moneyNum <=", value, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumIn(List<Double> values) {
            addCriterion("Outcome_moneyNum in", values, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumNotIn(List<Double> values) {
            addCriterion("Outcome_moneyNum not in", values, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumBetween(Double value1, Double value2) {
            addCriterion("Outcome_moneyNum between", value1, value2, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeMoneynumNotBetween(Double value1, Double value2) {
            addCriterion("Outcome_moneyNum not between", value1, value2, "outcomeMoneynum");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateIsNull() {
            addCriterion("Outcome_date is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateIsNotNull() {
            addCriterion("Outcome_date is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateEqualTo(Date value) {
            addCriterion("Outcome_date =", value, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateNotEqualTo(Date value) {
            addCriterion("Outcome_date <>", value, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateGreaterThan(Date value) {
            addCriterion("Outcome_date >", value, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Outcome_date >=", value, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateLessThan(Date value) {
            addCriterion("Outcome_date <", value, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateLessThanOrEqualTo(Date value) {
            addCriterion("Outcome_date <=", value, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateIn(List<Date> values) {
            addCriterion("Outcome_date in", values, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateNotIn(List<Date> values) {
            addCriterion("Outcome_date not in", values, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateBetween(Date value1, Date value2) {
            addCriterion("Outcome_date between", value1, value2, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeDateNotBetween(Date value1, Date value2) {
            addCriterion("Outcome_date not between", value1, value2, "outcomeDate");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageIsNull() {
            addCriterion("Outcome_usage is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageIsNotNull() {
            addCriterion("Outcome_usage is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageEqualTo(String value) {
            addCriterion("Outcome_usage =", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageNotEqualTo(String value) {
            addCriterion("Outcome_usage <>", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageGreaterThan(String value) {
            addCriterion("Outcome_usage >", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Outcome_usage >=", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageLessThan(String value) {
            addCriterion("Outcome_usage <", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageLessThanOrEqualTo(String value) {
            addCriterion("Outcome_usage <=", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageLike(String value) {
            addCriterion("Outcome_usage like", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageNotLike(String value) {
            addCriterion("Outcome_usage not like", value, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageIn(List<String> values) {
            addCriterion("Outcome_usage in", values, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageNotIn(List<String> values) {
            addCriterion("Outcome_usage not in", values, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageBetween(String value1, String value2) {
            addCriterion("Outcome_usage between", value1, value2, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeUsageNotBetween(String value1, String value2) {
            addCriterion("Outcome_usage not between", value1, value2, "outcomeUsage");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkIsNull() {
            addCriterion("Outcome_remark is null");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkIsNotNull() {
            addCriterion("Outcome_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkEqualTo(String value) {
            addCriterion("Outcome_remark =", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkNotEqualTo(String value) {
            addCriterion("Outcome_remark <>", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkGreaterThan(String value) {
            addCriterion("Outcome_remark >", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Outcome_remark >=", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkLessThan(String value) {
            addCriterion("Outcome_remark <", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkLessThanOrEqualTo(String value) {
            addCriterion("Outcome_remark <=", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkLike(String value) {
            addCriterion("Outcome_remark like", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkNotLike(String value) {
            addCriterion("Outcome_remark not like", value, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkIn(List<String> values) {
            addCriterion("Outcome_remark in", values, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkNotIn(List<String> values) {
            addCriterion("Outcome_remark not in", values, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkBetween(String value1, String value2) {
            addCriterion("Outcome_remark between", value1, value2, "outcomeRemark");
            return (Criteria) this;
        }

        public Criteria andOutcomeRemarkNotBetween(String value1, String value2) {
            addCriterion("Outcome_remark not between", value1, value2, "outcomeRemark");
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
package com.account.back.Proj;

import java.util.ArrayList;
import java.util.List;

public class BudgetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BudgetExample() {
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

        public Criteria andBudgetIdIsNull() {
            addCriterion("Budget_id is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIsNotNull() {
            addCriterion("Budget_id is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdEqualTo(Integer value) {
            addCriterion("Budget_id =", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotEqualTo(Integer value) {
            addCriterion("Budget_id <>", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThan(Integer value) {
            addCriterion("Budget_id >", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Budget_id >=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThan(Integer value) {
            addCriterion("Budget_id <", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThanOrEqualTo(Integer value) {
            addCriterion("Budget_id <=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIn(List<Integer> values) {
            addCriterion("Budget_id in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotIn(List<Integer> values) {
            addCriterion("Budget_id not in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdBetween(Integer value1, Integer value2) {
            addCriterion("Budget_id between", value1, value2, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Budget_id not between", value1, value2, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetNameIsNull() {
            addCriterion("Budget_name is null");
            return (Criteria) this;
        }

        public Criteria andBudgetNameIsNotNull() {
            addCriterion("Budget_name is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetNameEqualTo(String value) {
            addCriterion("Budget_name =", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameNotEqualTo(String value) {
            addCriterion("Budget_name <>", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameGreaterThan(String value) {
            addCriterion("Budget_name >", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameGreaterThanOrEqualTo(String value) {
            addCriterion("Budget_name >=", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameLessThan(String value) {
            addCriterion("Budget_name <", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameLessThanOrEqualTo(String value) {
            addCriterion("Budget_name <=", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameLike(String value) {
            addCriterion("Budget_name like", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameNotLike(String value) {
            addCriterion("Budget_name not like", value, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameIn(List<String> values) {
            addCriterion("Budget_name in", values, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameNotIn(List<String> values) {
            addCriterion("Budget_name not in", values, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameBetween(String value1, String value2) {
            addCriterion("Budget_name between", value1, value2, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetNameNotBetween(String value1, String value2) {
            addCriterion("Budget_name not between", value1, value2, "budgetName");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageIsNull() {
            addCriterion("Budget_usage is null");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageIsNotNull() {
            addCriterion("Budget_usage is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageEqualTo(String value) {
            addCriterion("Budget_usage =", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageNotEqualTo(String value) {
            addCriterion("Budget_usage <>", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageGreaterThan(String value) {
            addCriterion("Budget_usage >", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Budget_usage >=", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageLessThan(String value) {
            addCriterion("Budget_usage <", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageLessThanOrEqualTo(String value) {
            addCriterion("Budget_usage <=", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageLike(String value) {
            addCriterion("Budget_usage like", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageNotLike(String value) {
            addCriterion("Budget_usage not like", value, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageIn(List<String> values) {
            addCriterion("Budget_usage in", values, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageNotIn(List<String> values) {
            addCriterion("Budget_usage not in", values, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageBetween(String value1, String value2) {
            addCriterion("Budget_usage between", value1, value2, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetUsageNotBetween(String value1, String value2) {
            addCriterion("Budget_usage not between", value1, value2, "budgetUsage");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumIsNull() {
            addCriterion("Budget_moneyNum is null");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumIsNotNull() {
            addCriterion("Budget_moneyNum is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumEqualTo(Double value) {
            addCriterion("Budget_moneyNum =", value, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumNotEqualTo(Double value) {
            addCriterion("Budget_moneyNum <>", value, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumGreaterThan(Double value) {
            addCriterion("Budget_moneyNum >", value, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumGreaterThanOrEqualTo(Double value) {
            addCriterion("Budget_moneyNum >=", value, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumLessThan(Double value) {
            addCriterion("Budget_moneyNum <", value, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumLessThanOrEqualTo(Double value) {
            addCriterion("Budget_moneyNum <=", value, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumIn(List<Double> values) {
            addCriterion("Budget_moneyNum in", values, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumNotIn(List<Double> values) {
            addCriterion("Budget_moneyNum not in", values, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumBetween(Double value1, Double value2) {
            addCriterion("Budget_moneyNum between", value1, value2, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneynumNotBetween(Double value1, Double value2) {
            addCriterion("Budget_moneyNum not between", value1, value2, "budgetMoneynum");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkIsNull() {
            addCriterion("Budget_remark is null");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkIsNotNull() {
            addCriterion("Budget_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkEqualTo(String value) {
            addCriterion("Budget_remark =", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkNotEqualTo(String value) {
            addCriterion("Budget_remark <>", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkGreaterThan(String value) {
            addCriterion("Budget_remark >", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Budget_remark >=", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkLessThan(String value) {
            addCriterion("Budget_remark <", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkLessThanOrEqualTo(String value) {
            addCriterion("Budget_remark <=", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkLike(String value) {
            addCriterion("Budget_remark like", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkNotLike(String value) {
            addCriterion("Budget_remark not like", value, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkIn(List<String> values) {
            addCriterion("Budget_remark in", values, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkNotIn(List<String> values) {
            addCriterion("Budget_remark not in", values, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkBetween(String value1, String value2) {
            addCriterion("Budget_remark between", value1, value2, "budgetRemark");
            return (Criteria) this;
        }

        public Criteria andBudgetRemarkNotBetween(String value1, String value2) {
            addCriterion("Budget_remark not between", value1, value2, "budgetRemark");
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
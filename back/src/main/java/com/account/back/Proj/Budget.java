package com.account.back.Proj;

public class Budget {
    private Integer budgetId;

    private String budgetName;

    private String budgetUsage;

    private Double budgetMoneynum;

    private String budgetRemark;

    private Integer userId;

    public Integer getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Integer budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName == null ? null : budgetName.trim();
    }

    public String getBudgetUsage() {
        return budgetUsage;
    }

    public void setBudgetUsage(String budgetUsage) {
        this.budgetUsage = budgetUsage == null ? null : budgetUsage.trim();
    }

    public Double getBudgetMoneynum() {
        return budgetMoneynum;
    }

    public void setBudgetMoneynum(Double budgetMoneynum) {
        this.budgetMoneynum = budgetMoneynum;
    }

    public String getBudgetRemark() {
        return budgetRemark;
    }

    public void setBudgetRemark(String budgetRemark) {
        this.budgetRemark = budgetRemark == null ? null : budgetRemark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
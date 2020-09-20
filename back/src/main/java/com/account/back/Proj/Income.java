package com.account.back.Proj;

import java.util.Date;

public class Income {
    private Integer incomeId;

    private Double incomeMoneynum;

    private Date incomeDate;

    private String incomeUsage;

    private String incomeRemark;

    private Integer userId;

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }

    public Double getIncomeMoneynum() {
        return incomeMoneynum;
    }

    public void setIncomeMoneynum(Double incomeMoneynum) {
        this.incomeMoneynum = incomeMoneynum;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    public String getIncomeUsage() {
        return incomeUsage;
    }

    public void setIncomeUsage(String incomeUsage) {
        this.incomeUsage = incomeUsage == null ? null : incomeUsage.trim();
    }

    public String getIncomeRemark() {
        return incomeRemark;
    }

    public void setIncomeRemark(String incomeRemark) {
        this.incomeRemark = incomeRemark == null ? null : incomeRemark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
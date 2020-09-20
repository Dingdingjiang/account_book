package com.account.back.Proj;

import java.util.Date;

public class Outcome {
    private Integer outcomeId;

    private Double outcomeMoneynum;

    private Date outcomeDate;

    private String outcomeUsage;

    private String outcomeRemark;

    private Integer userId;

    public Integer getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
    }

    public Double getOutcomeMoneynum() {
        return outcomeMoneynum;
    }

    public void setOutcomeMoneynum(Double outcomeMoneynum) {
        this.outcomeMoneynum = outcomeMoneynum;
    }

    public Date getOutcomeDate() {
        return outcomeDate;
    }

    public void setOutcomeDate(Date outcomeDate) {
        this.outcomeDate = outcomeDate;
    }

    public String getOutcomeUsage() {
        return outcomeUsage;
    }

    public void setOutcomeUsage(String outcomeUsage) {
        this.outcomeUsage = outcomeUsage == null ? null : outcomeUsage.trim();
    }

    public String getOutcomeRemark() {
        return outcomeRemark;
    }

    public void setOutcomeRemark(String outcomeRemark) {
        this.outcomeRemark = outcomeRemark == null ? null : outcomeRemark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
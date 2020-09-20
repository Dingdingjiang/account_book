package com.account.back.Proj;

import java.util.Date;

public class Debt {
    private Integer debtId;

    private String debtName;

    private String debtAccount;

    private Double debtMoneynum;

    private Date debtDate;

    private String debtRemark;

    private Integer userId;

    public Integer getDebtId() {
        return debtId;
    }

    public void setDebtId(Integer debtId) {
        this.debtId = debtId;
    }

    public String getDebtName() {
        return debtName;
    }

    public void setDebtName(String debtName) {
        this.debtName = debtName == null ? null : debtName.trim();
    }

    public String getDebtAccount() {
        return debtAccount;
    }

    public void setDebtAccount(String debtAccount) {
        this.debtAccount = debtAccount == null ? null : debtAccount.trim();
    }

    public Double getDebtMoneynum() {
        return debtMoneynum;
    }

    public void setDebtMoneynum(Double debtMoneynum) {
        this.debtMoneynum = debtMoneynum;
    }

    public Date getDebtDate() {
        return debtDate;
    }

    public void setDebtDate(Date debtDate) {
        this.debtDate = debtDate;
    }

    public String getDebtRemark() {
        return debtRemark;
    }

    public void setDebtRemark(String debtRemark) {
        this.debtRemark = debtRemark == null ? null : debtRemark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
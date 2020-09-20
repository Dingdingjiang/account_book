package com.account.back.Proj;

import javax.xml.crypto.Data;
import java.util.Date;

public class Debt {
    private Integer id;
    private String name;
    private String account;
    private Double moneyNum;
    private Date date;
    private String remark;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getMoneyNum() {
        return moneyNum;
    }

    public void setMoneyNum(Double moneyNum) {
        this.moneyNum = moneyNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

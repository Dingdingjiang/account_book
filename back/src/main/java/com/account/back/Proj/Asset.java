package com.account.back.Proj;

public class Asset {
    private Integer id;
    private String name;
    private String account;
    private Double moneyNum;
    private String reamrk;
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

    public String getReamrk() {
        return reamrk;
    }

    public void setReamrk(String reamrk) {
        this.reamrk = reamrk;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

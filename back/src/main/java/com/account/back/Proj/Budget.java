package com.account.back.Proj;

public class Budget {
    private Integer id;
    private String name;
    private String usage;
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

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
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

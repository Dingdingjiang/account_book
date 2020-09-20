package com.account.back.Proj;

import javax.xml.crypto.Data;
import java.util.zip.DataFormatException;

public class Outcome {
    private Integer id;
    private Double moneyNum;
    private Data date;
    private String usage;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoneyNum() {
        return moneyNum;
    }

    public void setMoneyNum(Double moneyNum) {
        this.moneyNum = moneyNum;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

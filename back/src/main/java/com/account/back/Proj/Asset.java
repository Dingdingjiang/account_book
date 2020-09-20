package com.account.back.Proj;

public class Asset {
    private Integer assetId;

    private String assetName;

    private String assetAccount;

    private Double assetMoneynum;

    private String assetRemark;

    private Integer userId;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public String getAssetAccount() {
        return assetAccount;
    }

    public void setAssetAccount(String assetAccount) {
        this.assetAccount = assetAccount == null ? null : assetAccount.trim();
    }

    public Double getAssetMoneynum() {
        return assetMoneynum;
    }

    public void setAssetMoneynum(Double assetMoneynum) {
        this.assetMoneynum = assetMoneynum;
    }

    public String getAssetRemark() {
        return assetRemark;
    }

    public void setAssetRemark(String assetRemark) {
        this.assetRemark = assetRemark == null ? null : assetRemark.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
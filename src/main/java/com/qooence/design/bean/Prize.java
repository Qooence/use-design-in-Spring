package com.qooence.design.bean;

import com.qooence.design.service.common.PrizeTypeEnum;

public class Prize {

    private PrizeTypeEnum prizeType;
    private int amount;
    private String userId;

    public PrizeTypeEnum getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(PrizeTypeEnum prizeType) {
        this.prizeType = prizeType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

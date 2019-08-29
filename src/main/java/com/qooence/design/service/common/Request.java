package com.qooence.design.service.common;

public abstract class Request {

    private PrizeTypeEnum prizeType;

    public PrizeTypeEnum getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(PrizeTypeEnum prizeType) {
        this.prizeType = prizeType;
    }
}

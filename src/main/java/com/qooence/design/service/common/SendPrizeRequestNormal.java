package com.qooence.design.service.common;


import com.qooence.design.bean.Prize;

/**
 * 数据组装类
 */
public class SendPrizeRequestNormal extends Request{

    private PrizeTypeEnum prizeType;

    public PrizeTypeEnum getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(PrizeTypeEnum prizeType) {
        this.prizeType = prizeType;
    }

    public SendPrizeRequestNormal(Prize prize){
        this.prizeType = prize.getPrizeType();
    }
}

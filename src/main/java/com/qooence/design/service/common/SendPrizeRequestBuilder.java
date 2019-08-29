package com.qooence.design.service.common;


import com.qooence.design.bean.Prize;
import com.qooence.design.service.PrizeSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Builder模式
 */
public class SendPrizeRequestBuilder extends Request{

    private final int amount;
    private final String userId;
    private final PrizeTypeEnum prizeType;

    public SendPrizeRequestBuilder(int amount, String userId, PrizeTypeEnum prizeType) {
        this.amount = amount;
        this.userId = userId;
        this.prizeType = prizeType;
    }

    @Component
    @Scope("prototype")
    public static class Builder{

        @Autowired
        PrizeSenderService prizeSenderService;

        private int prizeId;
        private String userId;

        public Builder prizeId(int prizeId){
            this.prizeId = prizeId;
            return this;
        }

        public Builder userId(String userId){
            this.userId = userId;
            return this;
        }

        public SendPrizeRequestBuilder build(){
            Prize prize = prizeSenderService.findById(1);
            return new SendPrizeRequestBuilder(prize.getAmount(),prize.getUserId(),prize.getPrizeType());
        }
    }

    public PrizeTypeEnum getPrizeType() {
        return prizeType;
    }

    public int getAmount() {
        return amount;
    }

    public String getUserId() {
        return userId;
    }
}

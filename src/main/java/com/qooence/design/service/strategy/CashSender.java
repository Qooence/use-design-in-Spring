package com.qooence.design.service.strategy;

import com.qooence.design.service.common.PrizeTypeEnum;
import com.qooence.design.service.common.Request;
import org.springframework.stereotype.Component;

@Component
public class CashSender implements PrizeSender {
    @Override
    public boolean support(Request request) {
        return PrizeTypeEnum.CASH == request.getPrizeType();
    }

    @Override
    public void sendPrize(Request request) {
        System.out.println("发放现金");
    }
}

package com.qooence.design.service.strategy;

import com.qooence.design.service.common.PrizeTypeEnum;
import com.qooence.design.service.common.Request;
import org.springframework.stereotype.Component;

@Component
public class VirtualCurrencySender implements PrizeSender {

    @Override
    public boolean support(Request request) {
        return PrizeTypeEnum.VIRTUAL_CURRENCY == request.getPrizeType();
    }

    @Override
    public void sendPrize(Request request) {
        System.out.println("发放虚拟币");
    }
}

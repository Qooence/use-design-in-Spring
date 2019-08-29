package com.qooence.design.service;

import com.qooence.design.bean.Prize;
import com.qooence.design.service.common.SendPrizeRequestBuilder;
import com.qooence.design.service.common.SendPrizeRequestNormal;
import com.qooence.design.service.factory.PrizeSenderFactory;
import com.qooence.design.service.strategy.PrizeSender;
import com.qooence.design.service.common.PrizeTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class PrizeSenderService {
    @Autowired
    private PrizeSenderFactory prizeSenderFactory;

    @Autowired
    private ApplicationContext context;

    public void mockedClient_normal(){
        Prize prize = findById(1);
        SendPrizeRequestNormal request = new SendPrizeRequestNormal(prize);
        PrizeSender prizeSender = prizeSenderFactory.getPrizeSender(request);
        prizeSender.sendPrize(request);
    }

    public void mockedClient_builder(){

        SendPrizeRequestBuilder request = newPrizeSenderRequestBuilder()
                .prizeId(1)
                .userId("1")
                .build();
        PrizeSender prizeSender = prizeSenderFactory.getPrizeSender(request);
        prizeSender.sendPrize(request);
    }

    public SendPrizeRequestBuilder.Builder newPrizeSenderRequestBuilder(){
        return context.getBean(SendPrizeRequestBuilder.Builder.class);
    }


    public Prize findById(int id){
       Prize prize =  new Prize();
       prize.setUserId("1");
       prize.setPrizeType(PrizeTypeEnum.VIRTUAL_CURRENCY);
       prize.setAmount(id);
       return prize;
    }
}

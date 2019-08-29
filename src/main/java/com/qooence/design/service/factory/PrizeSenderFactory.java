package com.qooence.design.service.factory;

import com.qooence.design.service.common.Request;
import com.qooence.design.service.strategy.PrizeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 工厂模式
 */
@Component
public class PrizeSenderFactory {

    @Autowired
    private List<PrizeSender> prizeSenders;

    public PrizeSender getPrizeSender(Request request){
        for (PrizeSender prizeSender : prizeSenders) {
            if(prizeSender.support(request)){
                return prizeSender;
            }
        }
        throw new UnsupportedOperationException("unsupported request");
    }
}

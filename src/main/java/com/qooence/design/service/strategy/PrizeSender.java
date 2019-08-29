package com.qooence.design.service.strategy;

import com.qooence.design.service.common.Request;

/**
 * 策略模式
 */
public interface PrizeSender {

    /**
     * 用户判断当前实例是否支持当前奖励的发放
     * @param request
     * @return
     */
    boolean support(Request request);

    /**
     * 发放奖励
     * @param request
     */
    void sendPrize(Request request);

}

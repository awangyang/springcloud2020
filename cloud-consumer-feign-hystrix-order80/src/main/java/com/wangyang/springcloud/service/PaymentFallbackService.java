package com.wangyang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author wangyang
 * @date 2020/06/23
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK";
    }

    @Override
    public String paymentInfo_timeOut(Integer id) {
        return "paymentInfo_timeOut";
    }
}

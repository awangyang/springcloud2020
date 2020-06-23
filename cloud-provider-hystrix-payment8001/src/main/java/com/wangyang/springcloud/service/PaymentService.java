package com.wangyang.springcloud.service;

/**
 * @author wangyang
 * @date 2020/06/23
 */
public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_timeOut(Integer id);
}

package com.wangyang.springcloud.service;

import com.wangyang.springcloud.entites.Payment;

/**
 * @author Wang Yang
 * @date 2020/6/17 19:25
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(long id);
}

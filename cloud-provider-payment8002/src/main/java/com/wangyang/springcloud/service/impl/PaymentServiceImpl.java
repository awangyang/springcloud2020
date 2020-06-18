package com.wangyang.springcloud.service.impl;

import com.wangyang.springcloud.dao.PaymentDao;
import com.wangyang.springcloud.entites.Payment;
import com.wangyang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Wang Yang
 * @date 2020/6/17 19:26
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}

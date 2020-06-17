package com.wangyang.springcloud.controller;

import com.wangyang.springcloud.commom.CommonResult;
import com.wangyang.springcloud.entites.Payment;
import com.wangyang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Wang Yang
 * @date 2020/6/17 19:27
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        int i = paymentService.create(payment);
        if (i > 0) {
            return CommonResult.success("成功", i);
        } else {
            return CommonResult.fail("失败");
        }
    }

    @GetMapping("/payment/getPayment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return CommonResult.success("成功", payment);
        } else {
            return CommonResult.fail("无数据");
        }
    }

}

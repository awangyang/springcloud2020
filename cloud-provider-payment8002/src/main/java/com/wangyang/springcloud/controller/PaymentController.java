package com.wangyang.springcloud.controller;

import com.wangyang.springcloud.commom.CommonResult;
import com.wangyang.springcloud.entites.Payment;
import com.wangyang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Wang Yang
 * @date 2020/6/17 19:27
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        log.info("创建结果 " + serverPort + ": " + payment);
        if (i > 0) {
            log.info("创建成功: " + payment);
            return CommonResult.success(i);
        } else {
            return CommonResult.fail("失败");
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果 " + serverPort + ": " + payment);
        if (payment != null) {
            return CommonResult.success("成功", payment);
        } else {
            return CommonResult.fail("无数据");
        }
    }

}

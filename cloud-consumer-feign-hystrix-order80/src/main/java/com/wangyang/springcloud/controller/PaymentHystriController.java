package com.wangyang.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wangyang.springcloud.service.PaymentHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @date 2020/06/23
 */
@RestController
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class PaymentHystriController {

    @Resource
    private PaymentHystrixService paymentHystrixService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
//    })
    public String paymentInfo_timeOut(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfo_timeOut(id);
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentTimeOutFallbackMethod ,id=" + id;
    }


    public String payment_Global_FallbackMethod() {
        return "线程池：" + Thread.currentThread().getName() + "payment_Global_FallbackMethod ";
    }
}

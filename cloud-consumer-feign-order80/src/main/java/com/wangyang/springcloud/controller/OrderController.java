package com.wangyang.springcloud.controller;

import com.wangyang.springcloud.commom.CommonResult;
import com.wangyang.springcloud.entites.Payment;
import com.wangyang.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @date 2020/06/18
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        return paymentFeignService.get(id);
    }
}

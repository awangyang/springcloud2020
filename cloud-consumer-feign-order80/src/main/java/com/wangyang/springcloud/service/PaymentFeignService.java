package com.wangyang.springcloud.service;

import com.wangyang.springcloud.commom.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Wang Yang
 * @date 2020/6/20 17:15
 */
@Component
@FeignClient(value="CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult get(@PathVariable("id") Long id);
}

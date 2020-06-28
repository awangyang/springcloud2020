package com.wangyang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @date 2020/06/23
 */
@RestController
public class PaymentController {

    @Value("${service-url.nacos-user-service}")
    private String url;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(url + "/payment/" + id, String.class);
    }

}

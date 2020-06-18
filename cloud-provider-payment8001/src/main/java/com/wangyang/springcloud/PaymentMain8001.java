package com.wangyang.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangyang
 * @date 2020/06/17
 */
@SpringBootApplication(scanBasePackages = "com.wangyang.springcloud")
@EnableEurekaClient
@MapperScan("com.wangyang.springcloud.dao")
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}

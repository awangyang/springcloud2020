package com.wangyang.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangyang
 * @date 2020/06/17
 */
@SpringBootApplication(scanBasePackages = "com.wangyang.springcloud")
@MapperScan("com.wangyang.springcloud.dao")
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}

package com.wangyang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Wang Yang
 * @date 2020/6/27 15:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerDemoMain83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerDemoMain83.class, args);
    }
}

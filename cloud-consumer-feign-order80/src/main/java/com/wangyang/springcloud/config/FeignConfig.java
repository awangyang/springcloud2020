package com.wangyang.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wang Yang
 * @date 2020/6/20 17:27
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level getFeignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

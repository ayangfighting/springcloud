package com.ayang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CfgBean {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

package com.ayang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserConsumerApplication_9002 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication_9002.class);
    }
}

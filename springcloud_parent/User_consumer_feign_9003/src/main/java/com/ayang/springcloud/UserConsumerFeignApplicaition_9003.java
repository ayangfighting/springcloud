package com.ayang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.ayang.springcloud")
public class UserConsumerFeignApplicaition_9003 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerFeignApplicaition_9003.class);
    }
}

package com.ayang.springcloud.client;

import com.ayang.springcloud.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/provider")
@FeignClient(value = "USER-PROVIDER")
public interface UserClient {

    @RequestMapping("/user/{id}")
    User getUser(@PathVariable("id") Long id);
}

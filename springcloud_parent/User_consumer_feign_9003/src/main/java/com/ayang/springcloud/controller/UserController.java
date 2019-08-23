package com.ayang.springcloud.controller;

import com.ayang.springcloud.client.UserClient;
import com.ayang.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/consumer")
@RestController
public class UserController implements UserClient {
    @Autowired
    private UserClient userClient;
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userClient.getUser(id);
    }
}

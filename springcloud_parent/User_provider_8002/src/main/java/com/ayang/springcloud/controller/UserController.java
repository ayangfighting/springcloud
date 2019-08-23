package com.ayang.springcloud.controller;

import com.ayang.springcloud.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){

        return new User(id,"ayang2",20);
    }
}

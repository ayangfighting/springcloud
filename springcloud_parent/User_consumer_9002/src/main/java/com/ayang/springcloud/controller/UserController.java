package com.ayang.springcloud.controller;

import com.ayang.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class UserController {
    public static final  String URL_PREFIX="http://USER-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id){
        String url = URL_PREFIX+"/provider/user/"+id;
        return restTemplate.getForObject(url,User.class);
    }
}

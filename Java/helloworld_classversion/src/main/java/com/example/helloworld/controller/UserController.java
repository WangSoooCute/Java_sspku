package com.example.helloworld.controller;

import com.example.helloworld.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/user")
    public String save(User user){
        return "添加用户";
    }
}
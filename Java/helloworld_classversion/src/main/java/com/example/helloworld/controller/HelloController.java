package com.example.helloworld.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @ApiOperation("获取用户")
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}
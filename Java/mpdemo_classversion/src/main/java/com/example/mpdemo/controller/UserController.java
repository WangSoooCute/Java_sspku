package com.example.mpdemo.controller;

import com.example.mpdemo.entity.User;
import com.example.mpdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin //Axios
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user")
    public List query(){
        List<User> list=userMapper.find();
        System.out.println(list);
        return list;
    }
}

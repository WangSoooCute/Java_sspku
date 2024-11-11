package com.example.mpdemo.controller;

import com.example.mpdemo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order/findAll")
    public List findAll(){

        List orders = orderMapper.selectAllOrdersAndUser();
        return orders;
    }

}

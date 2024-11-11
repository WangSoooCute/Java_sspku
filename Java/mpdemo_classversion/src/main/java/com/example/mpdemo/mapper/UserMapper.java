package com.example.mpdemo.mapper;

import com.example.mpdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//用于操作用户表，MyBaits会根据Mapper注解，动态实现UserMapper接口（实现类），动态代理技术
//Spring会自动创建UserMapper接口实现类对应的实例
@Mapper
public interface UserMapper{
    @Select("select * from user")
    public List<User> find();
}

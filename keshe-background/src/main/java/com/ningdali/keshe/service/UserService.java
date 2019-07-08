package com.ningdali.keshe.service;

import com.ningdali.keshe.mapper.UserMapper;
import com.ningdali.keshe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService {
    @Autowired
    UserMapper userMapper;


    public User getUser(){
        User user = userMapper.getUserByIdAndPassword("001", "123456");
        return user;
    }



}

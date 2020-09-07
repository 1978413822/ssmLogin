package com.ssm.service;

import com.ssm.pojo.User;
//编写Service层的接口
public interface UserService {

    //登录
    User log(User user);
    //注册
    void reg(User user);
}

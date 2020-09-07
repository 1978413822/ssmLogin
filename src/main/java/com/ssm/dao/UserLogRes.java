package com.ssm.dao;

import com.ssm.pojo.User;

//登录注册dao接口
public interface UserLogRes {
    //登录
    User log(User user);
    //注册
    void reg(User user);
}

package com.ssm.service;

import com.ssm.dao.UserLogRes;
import com.ssm.pojo.User;
//编写Service实现类
public class UserServiceImp implements  UserService {
    private UserLogRes userLogRes;

    public void setUserLogRes(UserLogRes userLogRes) {
        this.userLogRes = userLogRes;
    }
//登录
    public User log(User user) {
        return userLogRes.log(user);
    }
//注册
    public void reg(User user) {
          userLogRes.reg(user);
    }
}

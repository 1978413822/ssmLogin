package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //登录
@RequestMapping("/login")
@ResponseBody
    public String login(User user) {
       if (userService.log(user)!=null){
           return "success";
       }
    System.out.println("失败，login");
           return "login";
  }
    //注册
    @RequestMapping("/res")
    @ResponseBody
    public String res(User user) {
     userService.reg(user);
     return "login";
  }
}

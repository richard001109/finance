package com.chinasofti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    //项目启动时跳转到登陆页面
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }
}

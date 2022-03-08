package com.chinasofti.controller;

import com.chinasofti.pojo.Users;
import com.chinasofti.service.UserService;
import com.chinasofti.util.ResultModel;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.IOException;

@Controller
public class LoginController {

    //注入UserService实例
    @Autowired
    private UserService userService;
    //项目启动时跳转到登陆页面
    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }

    //生成验证码
    @RequestMapping("/captcha")
    public void captcha(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        CaptchaUtil.out(req,resp);
    }

    //用户登录
    @RequestMapping("login")
    @ResponseBody
    public ResultModel login(Users users,String verCode,HttpServletRequest req){
        ResultModel result = new ResultModel();
        if(!CaptchaUtil.ver(verCode,req)){
            result.setCode(1001);
            result.setMsg("请填写正确的验证码");
            result.setData(null);
        }else{
            //将用户名和密码发送到数据库查询
            Users user = userService.login(users);
            if (null!=user){
                result.setCode(200);
                result.setMsg("登陆成功，页面即将跳转...");
            }else{
                result.setCode(1001);
                result.setMsg("用户名或者密码错误");
            }

        }
        return result;
    }
    //登陆成功跳转首页
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    @RequestMapping("/income")
    public  String toIncome(){
        return "income";
    }
}

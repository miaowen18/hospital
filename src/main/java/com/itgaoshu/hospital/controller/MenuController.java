package com.itgaoshu.hospital.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/sel")
public class MenuController {

    @RequestMapping("toLogin")
    public String toLogin(){
        return "view/login";
    }

    @RequestMapping("login")
    public String login(String loginname, String pwd, HttpServletRequest req){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginname,pwd);
        try {
            subject.login(token);
            return "view/index";
        }catch (UnknownAccountException e){
            req.setAttribute("msg","用户名不存在");
            return "view/login";
        }catch (IncorrectCredentialsException e){
            req.setAttribute("msg","密码错误");
            return "view/login";
        }
    }
}
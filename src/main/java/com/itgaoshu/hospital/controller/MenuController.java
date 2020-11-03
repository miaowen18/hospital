package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.bean.SysUser;
import com.itgaoshu.hospital.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/sel")
public class MenuController {

    @Autowired
    public SysUserService sysUserService;

    @RequestMapping("toLogin")
    public String toLogin() {
        return "view/login";
    }
    //登陆   shiro登陆
    @RequestMapping("login")
    public String login(Model model, HttpServletRequest request,String loginname,String pwd) {


        //第一步：建立subject
        Subject subject = SecurityUtils.getSubject();
        //第二步：封装token  凭证
        UsernamePasswordToken token = new UsernamePasswordToken(loginname, pwd);
        //第三步：登陆
        try {
            //只要能通过认证就能通过了
            subject.login(token);
            SysUser sysUser = new SysUser();
            sysUser.setLoginname(loginname);
            SysUser users=sysUserService.selectByLoginname(sysUser);
            //把user放进session
            request.getSession().setAttribute("user", users);
            model.addAttribute("loginname",users.getRealname());
            model.addAttribute("id",users.getUserid());
            //把yonghu放进session
            request.getSession().setAttribute("yonghu", users.getRealname());
            return "view/index";//跳转首页
        } catch (UnknownAccountException e) {
            //用户为空或不存在
            model.addAttribute("msg", "不存在这样的用户!");
            return "view/login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码输入不对!");
            return "view/login";
        }
    }
}
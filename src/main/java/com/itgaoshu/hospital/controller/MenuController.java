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

    @RequestMapping("login")
    public String login(Model model, HttpServletRequest request,String loginname,String pwd) {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginname, pwd);
        try {
            subject.login(token);
            SysUser sysUser = new SysUser();
            sysUser.setLoginname(loginname);
            SysUser users=sysUserService.selectByLoginname(sysUser);
            request.getSession().setAttribute("user", users);
            model.addAttribute("loginname",users.getRealname());
            model.addAttribute("id",users.getUserid());
            request.getSession().setAttribute("yonghu", users.getRealname());
            return "view/index";
        } catch (UnknownAccountException e) {
            //用户为空或不存在
            model.addAttribute("msg", "用户名不存在");
            return "view/login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            return "view/login";
        }
    }
}
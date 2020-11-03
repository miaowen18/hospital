package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.bean.DataGridView;
import com.itgaoshu.hospital.bean.SysMenu;
import com.itgaoshu.hospital.bean.SysMenuVo;
import com.itgaoshu.hospital.bean.SysUser;
import com.itgaoshu.hospital.service.SysMenuService;
import com.itgaoshu.hospital.service.SysUserService;
import com.itgaoshu.hospital.util.TreeUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sel")
public class MenuController {

    @Autowired
    public SysUserService sysUserService;

    @Autowired
    public SysMenuService sysMenuService;

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

    @RequestMapping("toTreeLoad")
    @ResponseBody
    public List<SysMenuVo> toTreeLoad(HttpSession session){
        SysUser user = (SysUser) session.getAttribute("user");
        System.out.println(user);
        List<SysMenu> sysMenus = sysMenuService.selectByUserId(user.getUserid());
        List<SysMenuVo> trees = new ArrayList<>();
        for (SysMenu menu : sysMenus) {
            SysMenuVo sysMenuVo = new SysMenuVo();
            BeanUtils.copyProperties(menu,sysMenuVo);
            trees.add(sysMenuVo);
        }
        TreeUtil treeUtil = new TreeUtil();
        return treeUtil.toTree(trees);
    }

    @RequestMapping("loadMenuMangerLeftTreeJson")
    @ResponseBody
    public DataGridView loadMenuMangerLeftTreeJson(){
        List<SysMenu> sysMenus = sysMenuService.selectAllMenu();
        List<SysMenuVo> trees = new ArrayList<>();
        for (SysMenu menu : sysMenus) {
            SysMenuVo sysMenuVo = new SysMenuVo();
            BeanUtils.copyProperties(menu,sysMenuVo);
            trees.add(sysMenuVo);
        }
        return new DataGridView(trees);
    }
}
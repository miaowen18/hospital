package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.*;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String,Object> loadMenuMangerLeftTreeJson(){
        List<SysMenu> sysMenus = sysMenuService.selectAllMenu();
        List<TreeNode> trees = new ArrayList<>();
        for (SysMenu menu : sysMenus) {
            TreeNode treeNode = new TreeNode();
            treeNode.setSpread(true);
            BeanUtils.copyProperties(menu,treeNode);
            trees.add(treeNode);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",null);
        map.put("data",trees);
        return map;
    }

    @RequestMapping("queryMenuAllList")
    @ResponseBody
    public Map<String,Object> queryMenuAllList(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<SysMenu> sysMenus = sysMenuService.selectAllMenu();
        PageInfo pageInfo = new PageInfo(sysMenus);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("selectMenuById")
    @ResponseBody
    public Map<String,Object> selectMenuById(Integer id){
        SysMenu menu = sysMenuService.selectMenuById(id);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",null);
        map.put("data",menu);
        return map;
    }

    @RequestMapping("addMenu")
    @ResponseBody
    public String addMenu(SysMenu menu){
        int result = sysMenuService.addMenu(menu);
        if (result==0){
            return "添加失败";
        }else {
            return "添加成功";
        }
    }

    @RequestMapping("updateMenu")
    @ResponseBody
    public String updateMenu(SysMenu menu){
        System.out.println(menu.getId());
        int result = sysMenuService.updateMenu(menu);
        if (result==0){
            return "修改失败";
        }else {
            return "修改成功";
        }
    }

    @RequestMapping("checkMenuHasChildren")
    @ResponseBody
    public Integer checkMenuHasChildren(Integer id){
        return sysMenuService.selectPid(id);
    }

    @RequestMapping("deleteMenu")
    @ResponseBody
    public String deleteMenu(Integer id){
        int result = sysMenuService.deleteByPrimaryKey(id);
        if (result==0){
            return "删除失败";
        }else {
            return "删除成功";
        }
    }

    @RequestMapping("selectChooseMenu")
    @ResponseBody
    public Map<String,Object> selectChooseMenu(Integer page,Integer limit,String title){
        PageHelper.startPage(page,limit);
        String newTitle="%"+title+"%";
        List<SysMenu> menus = sysMenuService.selectChooseMenu(newTitle);
        PageInfo pageInfo = new PageInfo(menus);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

}
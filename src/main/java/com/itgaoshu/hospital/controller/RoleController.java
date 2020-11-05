package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.SysRole;
import com.itgaoshu.hospital.bean.SysRoleMenuKey;
import com.itgaoshu.hospital.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("loadAllRole")
    @ResponseBody
    public Map<String,Object> loadAllRole(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<SysRole> roles = sysRoleService.selectAllRole();
        PageInfo pageInfo = new PageInfo(roles);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("insertRole")
    @ResponseBody
    public String insertRole(SysRole sysRole){
        int result = sysRoleService.addRole(sysRole);
        if (result==0){
            return "添加失败";
        }else {
            return "添加成功";
        }
    }

    @RequestMapping("updateRole")
    @ResponseBody
    public String updateRole(SysRole sysRole){
        int result = sysRoleService.updateRole(sysRole);
        if (result==0){
            return "修改失败";
        }else {
            return "修改成功";
        }
    }

    @RequestMapping("deleteRole")
    @ResponseBody
    public String deleteRole(Integer roleid){
        int result = sysRoleService.deleteRole(roleid);
        if (result==0){
            return "删除失败";
        }else {
            return "删除成功";
        }
    }

    @RequestMapping("loadAllRole2")
    @ResponseBody
    public Map<String,Object> loadAllRole2(Integer page,Integer limit,SysRole role){
        PageHelper.startPage(page,limit);
        List<SysRole> roles = sysRoleService.selectAllRole2(role);
        PageInfo pageInfo = new PageInfo(roles);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("initRoleMenuTreeJson")
    @ResponseBody
    public Map<String, Object> initRoleMenuTreeJson(Integer roleid){
        return sysRoleService.initRoleMenuTreeJson(roleid);
    }

    @RequestMapping("saveRoleMenu")
    @ResponseBody
    public String saveRoleMenu(Integer roleid,Integer[] ids){
        sysRoleService.saveRoleMenu(roleid, ids);
        return "加入成功";
    }
}
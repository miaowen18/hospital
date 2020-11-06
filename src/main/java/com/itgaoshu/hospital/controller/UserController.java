package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.SysUser;
import com.itgaoshu.hospital.config.UserCredentialsMatcher;
import com.itgaoshu.hospital.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("selectAllUser")
    @ResponseBody
    public Map<String,Object> selectAllUser(Integer page,Integer limit,SysUser user){
        PageHelper.startPage(page,limit);
        List<SysUser> users = sysUserService.selectAllUser(user);
        PageInfo pageInfo = new PageInfo(users);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("addUser")
    @ResponseBody
    public String addUser(SysUser user){
        String salt = UserCredentialsMatcher.generateSalt(6);
        user.setPwd(UserCredentialsMatcher.encryptPassword("md5","123456",salt));
        user.setType(2);
        user.setSalt(salt);
        int result = sysUserService.insert(user);
        if (result==0){
            return "添加失败";
        }else {
            return "添加成功";
        }
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(SysUser user){
        int result = sysUserService.updateByPrimaryKey(user);
        if (result==0){
            return "修改失败";
        }else {
            return "修改成功";
        }
    }

    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser(Integer userid){
        int result = sysUserService.deleteByPrimaryKey(userid);
        if (result==0){
            return "删除失败";
        }else {
            return "删除成功";
        }
    }

    @RequestMapping("resetUserPwd")
    @ResponseBody
    public String resetUserPwd(SysUser user){
        String salt = UserCredentialsMatcher.generateSalt(6);
        user.setPwd(UserCredentialsMatcher.encryptPassword("md5","123456",salt,2));
        user.setSalt(salt);
        int result = sysUserService.updateByPrimaryKey(user);
        if (result==0){
            return "修改失败";
        }else {
            return "修改成功";
        }
    }

    @RequestMapping("initUserRole")
    @ResponseBody
    public Map<String,Object> initUserRole(Integer userid){
        return sysUserService.initUserRole(userid);
    }

    @RequestMapping("saveUserRole")
    @ResponseBody
    public String saveUserRole(Integer userid,Integer[] ids){
        sysUserService.saveUserRole(userid, ids);
        return "加入成功";
    }
}

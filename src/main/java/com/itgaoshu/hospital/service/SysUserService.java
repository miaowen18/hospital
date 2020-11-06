package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserService {
    SysUser selectByLoginname(SysUser user);
    List<SysUser> selectAllUser(SysUser user);
    int insert(SysUser record);
    int updateByPrimaryKey(SysUser record);
    int deleteByPrimaryKey(Integer userid);
    Map<String,Object> initUserRole(Integer userid);
    void saveUserRole(Integer userid,Integer[] ids);
}

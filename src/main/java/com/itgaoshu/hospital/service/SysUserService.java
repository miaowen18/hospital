package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysUser;

import java.util.List;

public interface SysUserService {
    SysUser selectByLoginname(SysUser user);
    List<SysUser> selectAllUser(SysUser user);
    int insert(SysUser record);
    int updateByPrimaryKey(SysUser record);
    int deleteByPrimaryKey(Integer userid);
}

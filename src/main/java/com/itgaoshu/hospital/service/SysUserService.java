package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysUser;

import java.util.List;

public interface SysUserService {
    SysUser selectByLoginname(SysUser user);
    List<SysUser> selectAllUser();
    int insert(SysUser record);
}

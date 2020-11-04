package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysRole;

import java.util.List;

public interface SysRoleService {
    List<SysRole> selectAllRole();
    int addRole(SysRole record);
    int updateRole(SysRole sysRole);
    int deleteRole(Integer roleid);
    List<SysRole> selectAllRole2(SysRole role);
}

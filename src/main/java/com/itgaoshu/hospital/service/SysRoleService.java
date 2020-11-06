package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysMenu;
import com.itgaoshu.hospital.bean.SysRole;
import com.itgaoshu.hospital.bean.SysRoleMenuKey;

import java.util.List;
import java.util.Map;

public interface SysRoleService {
    List<SysRole> selectAllRole();
    int addRole(SysRole record);
    int updateRole(SysRole sysRole);
    int deleteRole(Integer roleid);
    List<SysRole> selectAllRole2(SysRole role);
    Map<String,Object> initRoleMenuTreeJson(Integer rid);
    void saveRoleMenu(Integer roleid,Integer[] ids);
}

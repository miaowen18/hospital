package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysMenu;

import java.util.List;

public interface SysMenuService {
    List<SysMenu> selectAllMenu();
    List<SysMenu> selectMenuByPid(Integer pid);
    List<SysMenu> selectByUserId(Integer userid);

}

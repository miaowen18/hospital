package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysMenu;

import java.util.List;

public interface SysMenuService {
    List<SysMenu> selectAllMenu();
    List<SysMenu> selectMenuByPid(Integer pid);
    List<SysMenu> selectByUserId(Integer userid);
    List<SysMenu> selectMenuById(Integer id);
    int addMenu(SysMenu sysMenu);
    int updateMenu(SysMenu sysMenu);
    int deleteByPrimaryKey(Integer id);
    Integer selectPid(Integer id);
    List<SysMenu> selectChooseMenu(String title);
}

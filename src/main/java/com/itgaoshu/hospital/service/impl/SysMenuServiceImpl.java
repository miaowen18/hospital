package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.SysMenu;
import com.itgaoshu.hospital.mapper.SysMenuMapper;
import com.itgaoshu.hospital.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> selectAllMenu() {
        return sysMenuMapper.selectAllMenu();
    }

    @Override
    public List<SysMenu> selectMenuByPid(Integer pid) {
        return sysMenuMapper.selectMenuByPid(pid);
    }

    @Override
    public List<SysMenu> selectByUserId(Integer userid) {
        return sysMenuMapper.selectByUserId(userid);
    }
}
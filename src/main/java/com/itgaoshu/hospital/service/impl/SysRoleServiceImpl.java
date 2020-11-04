package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.SysRole;
import com.itgaoshu.hospital.mapper.SysRoleMapper;
import com.itgaoshu.hospital.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> selectAllRole() {
        return sysRoleMapper.selectAllRole();
    }

    @Override
    public int addRole(SysRole record) {
        return sysRoleMapper.addRole(record);
    }

    @Override
    public int updateRole(SysRole sysRole) {
        return sysRoleMapper.updateRole(sysRole);
    }

    @Override
    public int deleteRole(Integer roleid) {
        return sysRoleMapper.deleteRole(roleid);
    }

    @Override
    public List<SysRole> selectAllRole2(SysRole role) {
        return sysRoleMapper.selectAllRole2(role);
    }

}
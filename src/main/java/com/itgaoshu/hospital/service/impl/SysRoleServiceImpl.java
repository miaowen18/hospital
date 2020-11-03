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
}
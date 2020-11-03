package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.SysUser;
import com.itgaoshu.hospital.mapper.SysUserMapper;
import com.itgaoshu.hospital.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectByLoginname(SysUser user) {
        return sysUserMapper.selectByLoginname(user);
    }
}
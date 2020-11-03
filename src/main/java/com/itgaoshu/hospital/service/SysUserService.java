package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.SysUser;

public interface SysUserService {
    SysUser selectByLoginname(SysUser user);
}

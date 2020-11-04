package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.SysUser;
import com.itgaoshu.hospital.mapper.SysUserMapper;
import com.itgaoshu.hospital.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectByLoginname(SysUser user) {
        return sysUserMapper.selectByLoginname(user);
    }

    @Override
    public List<SysUser> selectAllUser(SysUser user) {
        return sysUserMapper.selectAllUser(user);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return sysUserMapper.deleteByPrimaryKey(userid);
    }
}
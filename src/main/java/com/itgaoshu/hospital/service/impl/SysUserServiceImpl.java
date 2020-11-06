package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.SysRole;
import com.itgaoshu.hospital.bean.SysRoleUserKey;
import com.itgaoshu.hospital.bean.SysUser;
import com.itgaoshu.hospital.bean.TreeNode;
import com.itgaoshu.hospital.mapper.SysRoleMapper;
import com.itgaoshu.hospital.mapper.SysUserMapper;
import com.itgaoshu.hospital.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

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

    @Override
    public Map<String, Object> initUserRole(Integer userid) {
        List<SysRole> roles = sysRoleMapper.selectAllRole();
        List<SysRole> roleUser = sysRoleMapper.selectRoleUser(userid);
        List<Map<String,Object>> mapList = new ArrayList<>();
        for (SysRole role : roles) {
            Boolean LAY_CHECKED = false;
            for (SysRole sysRole : roleUser) {
                System.out.println(sysRole);
                if (sysRole.getRoleid()==role.getRoleid()){
                    LAY_CHECKED = true;
                    break;
                }
            }
            Map<String,Object> map = new HashMap<>();
            map.put("roleid", role.getRoleid());
            map.put("rolename", role.getRolename());
            map.put("roledesc", role.getRoledesc());
            map.put("LAY_CHECKED", LAY_CHECKED);
            mapList.add(map);
        }

        Map<String,Object> newMap = new HashMap<>();
        newMap.put("code",0);
        newMap.put("msg","");
        newMap.put("count",null);
        newMap.put("data",mapList);
        return newMap;
    }

    @Override
    public void saveUserRole(Integer userid, Integer[] ids) {
        sysUserMapper.deleteRoleUser(userid);
        for (Integer id : ids) {
            sysUserMapper.insertRoleUser(userid,id);
        }
    }


}
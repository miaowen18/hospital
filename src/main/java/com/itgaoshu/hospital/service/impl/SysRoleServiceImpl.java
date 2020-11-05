package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.SysMenu;
import com.itgaoshu.hospital.bean.SysRole;
import com.itgaoshu.hospital.bean.SysRoleMenuKey;
import com.itgaoshu.hospital.bean.TreeNode;
import com.itgaoshu.hospital.mapper.SysMenuMapper;
import com.itgaoshu.hospital.mapper.SysRoleMapper;
import com.itgaoshu.hospital.service.SysRoleService;
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
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysMenuMapper sysMenuMapper;

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

    @Override
    public Map<String,Object> initRoleMenuTreeJson(Integer rid) {
        List<SysMenu> menus = sysMenuMapper.selectAvailableMenu();
        List<SysMenu> roleMenus = sysMenuMapper.selectRoleMenu(rid);
        List<TreeNode> trees = new ArrayList<>();
        for (SysMenu menu : menus) {
            TreeNode treeNode = new TreeNode();
            treeNode.setSpread(true);
            BeanUtils.copyProperties(menu,treeNode);

            for (SysMenu roleMenu : roleMenus) {
                if (roleMenu.getId()== treeNode.getId()){
                    treeNode.setCheckArr("1");
                    break;
                }
            }
            trees.add(treeNode);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",null);
        map.put("data",trees);
        return map;
    }

    @Override
    public void saveRoleMenu(Integer roleid,Integer[] ids){
        sysRoleMapper.deleteRoleByRid(roleid);
        for (Integer mid : ids) {
            sysRoleMapper.insertRoleByRid(roleid,mid);
        }
    }

}
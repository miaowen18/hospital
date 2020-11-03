package com.itgaoshu.hospital.util;

import com.itgaoshu.hospital.bean.SysMenuVo;

import java.util.ArrayList;
import java.util.List;

public class TreeUtil {
    private static List<SysMenuVo> all = null;

    /**
     * 转换为树形
     * @param list 所有节点
     * @return 转换后的树结构菜单
     */
    public List<SysMenuVo> toTree(List<SysMenuVo> list){
        all = list;

        // 拿到所有的父级 "菜单"
        List<SysMenuVo> parents = new ArrayList<>();
        for (SysMenuVo sysMenuVo : list) {
            if (sysMenuVo.getPid() == 1){
                parents.add(sysMenuVo);
            }
        }
        // 将所有父级菜单从 "待用菜单列表" 中删除
        all.removeAll(parents);

        for (SysMenuVo parent : parents) {
            parent.setChildren(getCurrentNodeChildren(parent));
        }
        
        return parents;
    }

    /**
     * 递归函数：
     *      递归目的：拿到子节点
     *      递归终止条件：没有子节点
     * @param parent 父节点
     * @return 子节点
     */
    public List<SysMenuVo> getCurrentNodeChildren(SysMenuVo parent) {
        // 判断当前节点有没有子节点, 没有则创建一个空长度的 List, 有就使用之前已有的所有子节点.
        List<SysMenuVo> children = parent.getChildren() == null ? new ArrayList<>(): parent.getChildren();
//      List<SysMenuVo> children = new ArrayList<>();
        // 从 "待用菜单列表" 中找到当前节点的所有子节点
        for (SysMenuVo child : all) {
            if (parent.getId().equals(child.getPid())&&child.getPid()!=0){
                children.add(child);
            }
        }

        // 将当前节点的所有子节点从 "待用菜单列表" 中删除
        all.removeAll(children);

        for (SysMenuVo child : children) {
            child.setChildren(getCurrentNodeChildren(child));
        }
        return children;
    }
}
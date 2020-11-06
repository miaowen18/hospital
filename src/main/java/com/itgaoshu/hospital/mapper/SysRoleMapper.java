package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface SysRoleMapper {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    @Select("select * from sys_role")
    List<SysRole> selectAllRole();

    @Insert("insert into sys_role values(null,#{rolename},#{roledesc},#{available})")
    int addRole(SysRole record);

    @Update("update sys_role set rolename=#{rolename},roledesc=#{roledesc},available=#{available} where roleid=#{roleid}")
    int updateRole(SysRole sysRole);

    @Delete("delete from sys_role where roleid=#{roleid}")
    int deleteRole(Integer roleid);

    List<SysRole> selectAllRole2(SysRole role);

    Map<String,Object> initRoleMenuTreeJson(Integer rid);

    @Delete("DELETE FROM sys_role_menu WHERE rid=#{rid}")
    int deleteRoleByRid(Integer rid);

    @Insert("insert into sys_role_menu(rid,mid) values(#{rid},#{mid})")
    int insertRoleByRid(@Param("rid") Integer rid,@Param("mid") Integer mid);

    void saveRoleMenu(Integer roleid,Integer[] ids);

    @Select("SELECT r.*,ru.uid FROM sys_role_user ru RIGHT JOIN sys_role r ON ru.rid=r.roleid WHERE ru.uid=#{uid}")
    List<SysRole> selectRoleUser(@Param("uid") Integer uid);
}
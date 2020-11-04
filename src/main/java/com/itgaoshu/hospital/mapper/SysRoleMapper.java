package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.SysRole;
import com.itgaoshu.hospital.bean.SysRoleExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

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
}
package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.SysUser;
import com.itgaoshu.hospital.bean.SysUserExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    @Select("SELECT * FROM sys_user WHERE loginname=#{loginname}")
    SysUser selectByLoginname(SysUser user);

//    @Select("select * from sys_user")
    List<SysUser> selectAllUser(SysUser user);

    @Delete("delete FROM sys_role_user where uid=#{uid}")
    int deleteRoleUser(Integer uid);

    @Insert("insert into sys_role_user(uid,rid) values(#{uid},#{rid})")
    int insertRoleUser(Integer uid,Integer rid);
}
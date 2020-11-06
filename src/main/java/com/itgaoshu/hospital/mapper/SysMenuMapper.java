package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.SysMenu;
import com.itgaoshu.hospital.bean.SysMenuExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SysMenuMapper {
    int countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    @Select("select * from sys_menu")
    List<SysMenu> selectAllMenu();

    @Select("select * from sys_menu where pid=#{pid}")
    List<SysMenu> selectMenuByPid(Integer pid);

    @Select("SELECT s1.* FROM sys_menu s1, sys_role_menu s2 , sys_role s3 , sys_role_user s4 , sys_user s5 WHERE s1.id=s2.mid AND s2.rid=s3.roleid AND s3.roleid=s4.rid AND s4.uid=s5.userid AND s5.userid=#{userid}")
    List<SysMenu> selectByUserId(Integer userid);

    @Select("select * from sys_menu where id=#{id}")
    SysMenu selectMenuById(Integer id);
    
    @Insert("insert into sys_menu values(null,#{pid},#{title},#{href},#{spread},null,#{icon},#{available})")
    int addMenu(SysMenu sysMenu);

    @Update("update sys_menu set pid=#{pid},title=#{title},href=#{href},spread=#{spread},icon=#{icon},available=#{available} where id=#{id}")
    int updateMenu(SysMenu sysMenu);

    @Select("select pid from sys_menu where id=#{id}")
    Integer selectPid(Integer id);

    @Select("select * from sys_menu where title like #{title}")
    List<SysMenu> selectChooseMenu(String title);

    @Select("select * from sys_menu where available=1")
    List<SysMenu> selectAvailableMenu();

    @Select("SELECT m.* FROM sys_menu m,sys_role_menu rm WHERE m.id=rm.mid AND available=1 AND rm.rid=#{rid}")
    List<SysMenu> selectRoleMenu(Integer rid);
}
package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Home;
import com.itgaoshu.hospital.bean.HomeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HomeMapper {
    int countByExample(HomeExample example);

    int deleteByExample(HomeExample example);

    int deleteByPrimaryKey(Integer homeid);

    int insert(Home record);

    int insertSelective(Home record);

    List<Home> selectByExample(HomeExample example);

    Home selectByPrimaryKey(Integer homeid);

    int updateByExampleSelective(@Param("record") Home record, @Param("example") HomeExample example);

    int updateByExample(@Param("record") Home record, @Param("example") HomeExample example);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
}
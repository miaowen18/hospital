package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Warehuose;
import com.itgaoshu.hospital.bean.WarehuoseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehuoseMapper {
    //查询所有库房
    public List<Warehuose> queryAllList(Warehuose warehuose);
    int countByExample(WarehuoseExample example);
    int count(Warehuose warehuose);

    int deleteByExample(WarehuoseExample example);

    int deleteByPrimaryKey(Integer warehouseid);

    int insert(Warehuose record);

    int insertSelective(Warehuose record);

    List<Warehuose> selectByExample(WarehuoseExample example);

    Warehuose selectByPrimaryKey(Integer warehouseid);

    int updateByExampleSelective(@Param("record") Warehuose record, @Param("example") WarehuoseExample example);

    int updateByExample(@Param("record") Warehuose record, @Param("example") WarehuoseExample example);

    int updateByPrimaryKeySelective(Warehuose record);

    int updateByPrimaryKey(Warehuose record);
}
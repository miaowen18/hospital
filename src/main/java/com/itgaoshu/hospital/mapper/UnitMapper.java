package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Unit;
import com.itgaoshu.hospital.bean.UnitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitMapper {
    int countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(Integer unitid);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(Integer unitid);

    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}
package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Bed;
import com.itgaoshu.hospital.bean.BedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BedMapper {
    int countByExample(BedExample example);

    int deleteByExample(BedExample example);

    int deleteByPrimaryKey(Integer bedid);

    int insert(Bed record);

    int insertSelective(Bed record);

    List<Bed> selectByExample(BedExample example);

    Bed selectByPrimaryKey(Integer bedid);

    int updateByExampleSelective(@Param("record") Bed record, @Param("example") BedExample example);

    int updateByExample(@Param("record") Bed record, @Param("example") BedExample example);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}
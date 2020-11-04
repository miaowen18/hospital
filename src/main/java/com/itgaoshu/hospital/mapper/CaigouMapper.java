package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Caigou;
import com.itgaoshu.hospital.bean.CaigouExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaigouMapper {

    List<Caigou> queryList();
    int countByExample(CaigouExample example);

    int deleteByExample(CaigouExample example);

    int deleteByPrimaryKey(Integer caigouid);

    int insert(Caigou record);

    int insertSelective(Caigou record);

    List<Caigou> selectByExample(CaigouExample example);

    Caigou selectByPrimaryKey(Integer caigouid);

    int updateByExampleSelective(@Param("record") Caigou record, @Param("example") CaigouExample example);

    int updateByExample(@Param("record") Caigou record, @Param("example") CaigouExample example);

    int updateByPrimaryKeySelective(Caigou record);

    int updateByPrimaryKey(Caigou record);
}
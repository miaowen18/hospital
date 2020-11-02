package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Skull;
import com.itgaoshu.hospital.bean.SkullExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkullMapper {
    int countByExample(SkullExample example);

    int deleteByExample(SkullExample example);

    int deleteByPrimaryKey(Integer skullid);

    int insert(Skull record);

    int insertSelective(Skull record);

    List<Skull> selectByExample(SkullExample example);

    Skull selectByPrimaryKey(Integer skullid);

    int updateByExampleSelective(@Param("record") Skull record, @Param("example") SkullExample example);

    int updateByExample(@Param("record") Skull record, @Param("example") SkullExample example);

    int updateByPrimaryKeySelective(Skull record);

    int updateByPrimaryKey(Skull record);
}
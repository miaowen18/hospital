package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Paiban;
import com.itgaoshu.hospital.bean.PaibanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaibanMapper {
    int countByExample(PaibanExample example);

    int deleteByExample(PaibanExample example);

    int deleteByPrimaryKey(Integer paiid);

    int insert(Paiban record);

    int insertSelective(Paiban record);

    List<Paiban> selectByExample(Paiban paiban);

    Paiban selectByPrimaryKey(Integer paiid);

    int updateByExampleSelective(@Param("record") Paiban record, @Param("example") PaibanExample example);

    int updateByExample(@Param("record") Paiban record, @Param("example") PaibanExample example);

    int updateByPrimaryKeySelective(Paiban record);

    int updateByPrimaryKey(Paiban record);
}
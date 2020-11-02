package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Moneytype;
import com.itgaoshu.hospital.bean.MoneytypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MoneytypeMapper {
    int countByExample(MoneytypeExample example);

    int deleteByExample(MoneytypeExample example);

    int deleteByPrimaryKey(Integer moneyid);

    int insert(Moneytype record);

    int insertSelective(Moneytype record);

    List<Moneytype> selectByExample(MoneytypeExample example);

    Moneytype selectByPrimaryKey(Integer moneyid);

    int updateByExampleSelective(@Param("record") Moneytype record, @Param("example") MoneytypeExample example);

    int updateByExample(@Param("record") Moneytype record, @Param("example") MoneytypeExample example);

    int updateByPrimaryKeySelective(Moneytype record);

    int updateByPrimaryKey(Moneytype record);
}
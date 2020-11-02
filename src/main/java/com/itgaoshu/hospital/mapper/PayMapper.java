package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Pay;
import com.itgaoshu.hospital.bean.PayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PayMapper {
    int countByExample(PayExample example);

    int deleteByExample(PayExample example);

    int deleteByPrimaryKey(Integer payid);

    int insert(Pay record);

    int insertSelective(Pay record);

    List<Pay> selectByExample(PayExample example);

    Pay selectByPrimaryKey(Integer payid);

    int updateByExampleSelective(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByExample(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}
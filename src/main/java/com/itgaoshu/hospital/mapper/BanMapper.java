package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Ban;
import com.itgaoshu.hospital.bean.BanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BanMapper {
    int countByExample(BanExample example);

    int deleteByExample(BanExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Ban record);

    int insertSelective(Ban record);

    List<Ban> selectByExample(BanExample example);

    Ban selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByExample(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByPrimaryKeySelective(Ban record);

    int updateByPrimaryKey(Ban record);
}
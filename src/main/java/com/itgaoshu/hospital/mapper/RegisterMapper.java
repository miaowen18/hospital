package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Register;
import com.itgaoshu.hospital.bean.RegisterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterMapper {
    int countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(Integer registerid);

    int insert(Register record);

    int insertSelective(Register record);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(Integer registerid);

    List<Register> select();

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}
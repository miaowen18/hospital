package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.*;
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

    List<Register> select(Register register);

    List<Register> select2();

    List<Departments> select3();

    List<Doctor> select4(Integer departmentId);

    List<Bed> select5(Integer departmentId);

    List<Moneytype> select6();

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}
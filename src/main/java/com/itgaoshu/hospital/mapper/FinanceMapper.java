package com.itgaoshu.hospital.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FinanceMapper {

    @Select("")
    List<Double> selectAllTotalFinanceByYear(Double value);
}

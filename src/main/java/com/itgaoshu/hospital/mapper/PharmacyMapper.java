package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.PharmacyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PharmacyMapper {
    int countByExample(PharmacyExample example);

    int deleteByExample(PharmacyExample example);

    int deleteByPrimaryKey(Integer pharmacyid);

    int insert(Pharmacy record);

    int insertSelective(Pharmacy record);

    List<Pharmacy> selectByExample(PharmacyExample example);

    Pharmacy selectByPrimaryKey(Integer pharmacyid);

    int updateByExampleSelective(@Param("record") Pharmacy record, @Param("example") PharmacyExample example);

    int updateByExample(@Param("record") Pharmacy record, @Param("example") PharmacyExample example);

    int updateByPrimaryKeySelective(Pharmacy record);

    int updateByPrimaryKey(Pharmacy record);
}
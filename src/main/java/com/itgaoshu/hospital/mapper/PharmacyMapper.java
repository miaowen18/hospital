package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PharmacyMapper {
    int uppharmacynumber(Drugstore drugstore);
    List<PharmacyVo> queryList(Pharmacy pharmacy);
    int selpharymacyname(Pharmacy pharmacy);
    int uppharymacy(Pharmacy pharmacy);

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
package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Upplier;
import com.itgaoshu.hospital.bean.UpplierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UpplierMapper {
    List<Upplier> queryList();
    int countByExample(UpplierExample example);

    int deleteByExample(UpplierExample example);

    int deleteByPrimaryKey(Integer supplierid);

    int insert(Upplier record);

    int insertSelective(Upplier record);

    List<Upplier> selectByExample(UpplierExample example);

    Upplier selectByPrimaryKey(Integer supplierid);

    int updateByExampleSelective(@Param("record") Upplier record, @Param("example") UpplierExample example);

    int updateByExample(@Param("record") Upplier record, @Param("example") UpplierExample example);

    int updateByPrimaryKeySelective(Upplier record);

    int updateByPrimaryKey(Upplier record);
}
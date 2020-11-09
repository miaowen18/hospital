package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.bean.CashierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CashierMapper {
    List<Cashier>  queryList(Integer reportid);
    int countByExample(CashierExample example);

    int deleteByExample(CashierExample example);

    int deleteByPrimaryKey(Integer cashier);

    int insert(Cashier record);

    int insertSelective(Cashier record);

    List<Cashier> selectByExample(CashierExample example);

    Cashier selectByPrimaryKey(Integer cashier);

    int updateByExampleSelective(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByExample(@Param("record") Cashier record, @Param("example") CashierExample example);

    int updateByPrimaryKeySelective(Cashier record);

    int updateByPrimaryKey(Cashier record);
}
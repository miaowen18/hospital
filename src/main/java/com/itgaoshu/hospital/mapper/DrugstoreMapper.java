package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Drugstore;
import com.itgaoshu.hospital.bean.DrugstoreExample;
import com.itgaoshu.hospital.bean.DrugstoreVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugstoreMapper {
    List<Drugstore> seldrugDateguoqi();
    List<Drugstore> queryQue();
    List<DrugstoreVo> queryList(DrugstoreVo drugstoreVo);
    List<Drugstore> queryList1(Drugstore drugstore);
    int countByExample(DrugstoreExample example);

    int deleteByExample(DrugstoreExample example);

    int deleteByPrimaryKey(Integer rugstoreid);
    int update(Drugstore drugstore);
    int insert(Drugstore record);
    Integer queryList2(Drugstore drugstore);
    int insertSelective(Drugstore record);
    Integer selnumer(Drugstore drugstore);
    List<Drugstore> selectByExample(DrugstoreExample example);

    Drugstore selectByPrimaryKey(Integer rugstoreid);

    int updateByExampleSelective(@Param("record") Drugstore record, @Param("example") DrugstoreExample example);

    int updateByExample(@Param("record") Drugstore record, @Param("example") DrugstoreExample example);

    int updateByPrimaryKeySelective(Drugstore record);

    int updateByPrimaryKey(Drugstore record);
}
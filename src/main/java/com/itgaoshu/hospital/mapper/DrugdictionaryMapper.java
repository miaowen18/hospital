package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Drugdictionary;
import com.itgaoshu.hospital.bean.DrugdictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugdictionaryMapper {
    List<Drugdictionary> queryList(Drugdictionary drugdictionary);
    int countByExample(DrugdictionaryExample example);

    int deleteByExample(DrugdictionaryExample example);

    int deleteByPrimaryKey(Integer drugid);

    int insert(Drugdictionary record);

    int insertSelective(Drugdictionary record);

    List<Drugdictionary> selectByExample(DrugdictionaryExample example);

    Drugdictionary selectByPrimaryKey(Integer drugid);

    int updateByExampleSelective(@Param("record") Drugdictionary record, @Param("example") DrugdictionaryExample example);

    int updateByExample(@Param("record") Drugdictionary record, @Param("example") DrugdictionaryExample example);

    int updateByPrimaryKeySelective(Drugdictionary record);

    int updateByPrimaryKey(Drugdictionary record);
}
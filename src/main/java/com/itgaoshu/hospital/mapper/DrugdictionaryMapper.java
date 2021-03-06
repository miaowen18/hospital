package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugdictionaryMapper {
    List<Drugdictionary> findAllSdrugdictionary(Drugdictionary drugdictionary);
    int addSdrugdictionary(Drugdictionary drugdictionary);
    int editSdrugdictionary(Drugdictionary drugdictionary);
    int deleteSdrugdictionary(Integer drugid);
    int count(Drugdictionary drugdictionary);
    List<Unit> findAllUnit();
    List<Area> findAllArea();
    List<Type> findAllType();
    List<Drugdictionary> queryList(Drugdictionary drugdictionary);
}
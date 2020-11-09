package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Area;
import com.itgaoshu.hospital.bean.Drugdictionary;
import com.itgaoshu.hospital.bean.Type;
import com.itgaoshu.hospital.bean.Unit;

import java.util.List;

public interface DrugdictionaryService {
    List<Drugdictionary> findAllSdrugdictionary(Drugdictionary drugdictionary);
    int addSdrugdictionary(Drugdictionary drugdictionary);
    int editSdrugdictionary(Drugdictionary drugdictionary);
    int deleteSdrugdictionary(Integer drugid);
    int count(Drugdictionary drugdictionary);
    List<Unit> findAllUnit();
    List<Area> findAllArea();
    List<Type> findAllType();
}

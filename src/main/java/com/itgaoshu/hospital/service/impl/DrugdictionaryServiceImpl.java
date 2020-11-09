package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Area;
import com.itgaoshu.hospital.bean.Drugdictionary;
import com.itgaoshu.hospital.bean.Type;
import com.itgaoshu.hospital.bean.Unit;
import com.itgaoshu.hospital.mapper.DrugdictionaryMapper;
import com.itgaoshu.hospital.service.DrugdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugdictionaryServiceImpl implements DrugdictionaryService {
    @Autowired
    private DrugdictionaryMapper drugdictionaryMapper;

    @Override
    public List<Drugdictionary> findAllSdrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.findAllSdrugdictionary(drugdictionary);
    }

    @Override
    public int addSdrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.addSdrugdictionary(drugdictionary);
    }

    @Override
    public int editSdrugdictionary(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.editSdrugdictionary(drugdictionary);
    }

    @Override
    public int deleteSdrugdictionary(Integer drugid) {
        return drugdictionaryMapper.deleteSdrugdictionary(drugid);
    }

    @Override
    public int count(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.count(drugdictionary);
    }

    @Override
    public List<Unit> findAllUnit() {
        return drugdictionaryMapper.findAllUnit();
    }

    @Override
    public List<Area> findAllArea() {
        return drugdictionaryMapper.findAllArea();
    }

    @Override
    public List<Type> findAllType() {
        return drugdictionaryMapper.findAllType();
    }
}

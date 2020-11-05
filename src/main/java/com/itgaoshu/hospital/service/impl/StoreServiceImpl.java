package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.*;
import com.itgaoshu.hospital.mapper.*;
import com.itgaoshu.hospital.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private DrugstoreMapper drugstoreMapper;
    @Autowired
    private CaigouMapper caigouMapper;
    @Autowired
    private DrugdictionaryMapper drugdictionaryMapper;
    @Autowired
    private AreaMapper areaMapper;
    @Autowired
    private SkullMapper skullMapper;
    @Autowired
    private TypeMapper typeMapper;
    @Autowired
    private UnitMapper unitMapper;
    @Autowired
    private UpplierMapper upplierMapper;
    @Override
    public List<Area> queryList1() {return areaMapper.queryList();}
    @Override
    public List<Skull> queryList2() {return skullMapper.queryList();}
    @Override
    public List<Type> queryList3() {return typeMapper.queryList();}

    @Override
    public List<Unit> queryList4() { return unitMapper.queryList();}

    @Override
    public List<Upplier> queryList5() {
        return upplierMapper.queryList();
    }

    @Override
    public List<Drugdictionary> selectdgty(Drugdictionary drugdictionary) {
        return drugdictionaryMapper.queryList(drugdictionary);
    }

    @Override
    public List<Drugstore> seldrugDateguoqi() {
        return drugstoreMapper.seldrugDateguoqi();
    }

    @Override
    public List<Drugstore> queryList(Drugstore drugstore) {
        List<Drugstore> list=drugstoreMapper.queryList1(drugstore);
        for (Drugstore drugstore1 : list) {
            System.out.println(drugstore1);
        }
        return list;
    }

    @Override
    public List<DrugstoreVo> queryList(DrugstoreVo drugstoreVo) {
        List<DrugstoreVo> list1=drugstoreMapper.queryList(drugstoreVo);
        for (DrugstoreVo drugstore1 : list1) {
            System.out.println(drugstore1);
        }
        return list1;
    }

    @Override
    public List<Drugstore> queryQue() {
        return drugstoreMapper.queryQue();
    }

    @Override
    public List<Caigou> queryList() {
        return caigouMapper.queryList();
    }
}

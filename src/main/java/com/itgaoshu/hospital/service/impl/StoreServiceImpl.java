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
    public int selnumer(Drugstore drugstore) {

        Integer num=drugstoreMapper.selnumer(drugstore);
        if(num==null){
            return 0;
        }else{
            return num;
        }
    }

    @Override
    public int update(Drugstore drugstore) {
        return drugstoreMapper.updateByPrimaryKeySelective(drugstore);
    }

    @Override
    public int queryList1(Drugstore drugstore) {
        return drugstoreMapper.queryList2(drugstore);
    }

    @Override
    public int addStore(Drugstore drugstore) {
        return drugstoreMapper.insert(drugstore);
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
        return drugstoreMapper.queryList1(drugstore);
    }

    @Override
    public List<Drugstore> queryQue() {
        return drugstoreMapper.queryQue();
    }

    @Override
    public int delguoqidurg(Integer rugstoreid) {
        return drugstoreMapper.deleteByPrimaryKey(rugstoreid);
    }


}

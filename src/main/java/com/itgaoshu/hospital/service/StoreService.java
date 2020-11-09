package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.*;

import java.util.List;

public interface StoreService {
    List<Area> queryList1();
    List<Skull> queryList2();
    List<Type> queryList3();
    List<Unit> queryList4();
    List<Upplier> queryList5();
    int selnumer(Drugstore drugstore);
    int update(Drugstore drugstore);
    int queryList1(Drugstore drugstore);
    int addStore(Drugstore drugstore);
    List<Drugdictionary> selectdgty(Drugdictionary drugdictionary);
    List<Drugstore> seldrugDateguoqi();
    List<Drugstore> queryList(Drugstore drugstore);
    List<Drugstore> queryQue();
    int delguoqidurg(Integer rugstoreid);
    int selbaoqueName(Pharmacy pharmacy);
    int seldrugnamenum(Drugstore drugstore);
    int updatedrugnumber(Drugstore drugstore);
    int deldrugnamenum(Drugstore drugstore);
}

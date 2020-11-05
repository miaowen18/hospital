package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.*;

import java.util.List;

public interface StoreService {
    List<Area> queryList1();
    List<Skull> queryList2();
    List<Type> queryList3();
    List<Unit> queryList4();
    List<Upplier> queryList5();
    List<Drugdictionary> selectdgty(Drugdictionary drugdictionary);
    List<Drugstore> seldrugDateguoqi();
    List<Drugstore> queryList(Drugstore drugstore);
    List<DrugstoreVo> queryList(DrugstoreVo drugstoreVo);
    List<Drugstore> queryQue();
    List<Caigou> queryList();
}

package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Drugstore;
import com.itgaoshu.hospital.bean.DrugstoreVo;

import java.util.List;

public interface StoreService {
    List<Drugstore> queryList(Drugstore drugstore);
    List<DrugstoreVo> queryList(DrugstoreVo drugstoreVo);
}

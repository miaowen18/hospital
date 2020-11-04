package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Caigou;
import com.itgaoshu.hospital.bean.Drugstore;
import com.itgaoshu.hospital.bean.DrugstoreVo;
import com.itgaoshu.hospital.mapper.CaigouMapper;
import com.itgaoshu.hospital.mapper.DrugstoreMapper;
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

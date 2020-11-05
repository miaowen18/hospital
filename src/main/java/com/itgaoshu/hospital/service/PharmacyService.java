package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Huishou;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.PharmacyVo;

import java.util.List;

public interface PharmacyService {
    //查询药房的所有的药品信息
    public List<PharmacyVo> queryList(Pharmacy pharmacy);
    //查询所有从库房调来的药品

    //根据药品的数量报缺
    public List<Huishou> queryList();
}

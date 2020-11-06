package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.bean.Huishou;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.PharmacyVo;

import java.util.List;

public interface PharmacyService {
    //查询药房的所有的药品信息
    List<PharmacyVo> queryList(Pharmacy pharmacy);
    //查询所有从库房调来的药品

    //根据药品的数量报缺
    List<Huishou> queryList();
    int  delpharymacy(Pharmacy pharmacy);
    int addhuishou(Huishou huishou);
    int selbaoqueName(Baoque baoque);
    int addbaoque(Baoque baoque);
    int upbaoquenum(Baoque baoque);
}

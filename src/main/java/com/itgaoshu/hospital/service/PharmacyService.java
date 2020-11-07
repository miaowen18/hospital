package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.*;

import java.util.List;

public interface PharmacyService {
    //查询药房的所有的药品信息
    List<PharmacyVo> queryList(Pharmacy pharmacy);
    //查询所有从库房调来的药品

    //根据药品的数量报缺
    List<Huishou> queryList();
    int  delpharymacy(Pharmacy pharmacy);
    int addhuishou(Huishou huishou);
    int delhuishou(Integer huishouid);
    int selbaoqueName(Baoque baoque);
    int addbaoque(Baoque baoque);
    int upbaoquenum(Baoque baoque);
    int upbaoquenumber(Drugstore drugstore);
    int selbaoquenamenum(Drugstore drugstore);
    int delbaoquenamenum();
    int uppharmacynumber(Drugstore drugstore);
    int selpharymacyname(Pharmacy pharmacy);
    int uppharymacy(Pharmacy pharmacy);
    int upbaoquenumber1(Pharmacy pharmacy);
    int addpharmacy(Pharmacy pharmacy);
}

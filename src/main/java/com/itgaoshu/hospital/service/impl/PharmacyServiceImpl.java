package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.bean.Huishou;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.PharmacyVo;
import com.itgaoshu.hospital.mapper.BaoqueMapper;
import com.itgaoshu.hospital.mapper.HuishouMapper;
import com.itgaoshu.hospital.mapper.PharmacyMapper;
import com.itgaoshu.hospital.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    private PharmacyMapper pharmacyMapper;
    @Autowired
    private HuishouMapper huishouMapper;
    @Autowired
    private BaoqueMapper baoqueMapper;
    @Override
    public List<PharmacyVo> queryList(Pharmacy pharmacy) {
        return pharmacyMapper.queryList(pharmacy);
    }

    @Override
    public List<Huishou> queryList() {
        return huishouMapper.queryList();
    }

    @Override
    public int delpharymacy(Pharmacy pharmacy) {
        Integer pharmacyId=pharmacy.getPharmacyid();
        return pharmacyMapper.deleteByPrimaryKey(pharmacyId);

    }

    @Override
    public int addhuishou(Huishou huishou) {
        return huishouMapper.insert(huishou);
    }

    @Override
    public int selbaoqueName(Baoque baoque) {
        return baoqueMapper.selectCount(baoque);
    }

    @Override
    public int addbaoque(Baoque baoque) {
        return baoqueMapper.insert(baoque);
    }

    @Override
    public int upbaoquenum(Baoque baoque) {
        return baoqueMapper.updateNum(baoque);
    }
}

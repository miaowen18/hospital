package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.PharmacyVo;
import com.itgaoshu.hospital.mapper.PharmacyMapper;
import com.itgaoshu.hospital.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    private PharmacyMapper pharmacyMapper;
    @Override
    public List<PharmacyVo> queryList(Pharmacy pharmacy) {
        return pharmacyMapper.queryList(pharmacy);
    }
}

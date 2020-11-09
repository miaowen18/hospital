package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.mapper.CashierMapper;
import com.itgaoshu.hospital.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CashierServiceImpl implements CashierService {
    @Autowired
    private CashierMapper cashierMapper;
    @Override
    public List<Cashier> queryList(Integer reportid) {
        return cashierMapper.queryList(reportid);
    }
}

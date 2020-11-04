package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Finance;
import com.itgaoshu.hospital.mapper.FinanceMapper;
import com.itgaoshu.hospital.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    private FinanceMapper financeMapper;

    @Override
    public List<Double> selectAllTotalFinanceByYear(String year) {
        return financeMapper.selectAllTotalFinanceByYear(year);
    }

    @Override
    public List<Double> selectAllZhuYuanFinanceByYear(String year) {
        System.out.println(year);
        return financeMapper.selectAllZhuYuanFinanceByYear(year);
    }

    @Override
    public List<Finance> reportYearBingFinance() {
        return financeMapper.reportYearBingFinance();
    }

    @Override
    public List<Finance> zhuYuanYearBingFinance() {
        return financeMapper.zhuYuanYearBingFinance();
    }
}
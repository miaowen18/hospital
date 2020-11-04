package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Finance;

import java.util.List;

public interface FinanceService {
    List<Double> selectAllTotalFinanceByYear(String year);
    List<Double> selectAllZhuYuanFinanceByYear(String year);
    List<Finance> reportYearBingFinance();
    List<Finance> zhuYuanYearBingFinance();
}

package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Finance;

import java.util.List;

public interface FinanceService {
    List<Double> selectAllTotalFinanceByYear(String year);
    List<Double> selectAllZhuYuanFinanceByYear(String year);
    List<Finance> reportYearBingFinance();
    List<Finance> zhuYuanYearBingFinance();
    List<Finance> doctorDuibi();
    List<Finance> selectDoctorDuiBi(String doctorName);
    List<Finance> zDoctorDuibi();
    List<Finance> selectZDoctorDuiBi(String doctorName);
    List<Finance> currentFinance(String ctime);
}

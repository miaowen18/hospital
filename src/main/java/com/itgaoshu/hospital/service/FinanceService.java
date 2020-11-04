package com.itgaoshu.hospital.service;

import java.util.List;

public interface FinanceService {
    List<Double> selectAllTotalFinanceByYear(String year);
    List<Double> selectAllZhuYuanFinanceByYear(String year);
}

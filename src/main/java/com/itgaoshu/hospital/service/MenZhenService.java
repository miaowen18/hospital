package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Report;

import java.util.List;

public interface MenZhenService {
    List<Report> selectReportByState();
}

package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Report;

import java.util.List;

public interface ReportMapper {
    List<Report> selectReportByState();
}
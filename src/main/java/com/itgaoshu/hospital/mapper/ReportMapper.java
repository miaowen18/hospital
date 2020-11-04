package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.bean.ReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportMapper {
    List<Report> selectReportByState();
}
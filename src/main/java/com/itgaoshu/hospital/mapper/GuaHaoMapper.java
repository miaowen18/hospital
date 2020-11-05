package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Report;

import java.util.List;

public interface GuaHaoMapper {
    List<Report> select(Report report);
    int updateState();
}

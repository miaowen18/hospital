package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Report;

import java.util.List;

public interface GuaHaoService {
    List<Report> select(Report report);
    int updateState();
}

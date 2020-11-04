package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.mapper.ReportMapper;
import com.itgaoshu.hospital.service.MenZhenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenZhenServiceImpl implements MenZhenService {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<Report> selectReportByState() {
        return reportMapper.selectReportByState();
    }
}

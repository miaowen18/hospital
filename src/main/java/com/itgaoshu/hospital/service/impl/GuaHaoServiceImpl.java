package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.mapper.GuaHaoMapper;
import com.itgaoshu.hospital.service.GuaHaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuaHaoServiceImpl implements GuaHaoService {
    @Autowired
    private GuaHaoMapper guaHaoMapper;

    @Override
    public List<Report> select(Report report) {
        return guaHaoMapper.select(report);
    }

    @Override
    public int updateState() {
        return guaHaoMapper.updateState();
    }
}

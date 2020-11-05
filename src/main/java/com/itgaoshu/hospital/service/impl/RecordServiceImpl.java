package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Jilu;
import com.itgaoshu.hospital.mapper.JiluMapper;
import com.itgaoshu.hospital.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {
    @Autowired
    private JiluMapper jiluMapper;

    @Override
    public int insert(Jilu record) {
        return jiluMapper.insert(record);
    }

    @Override
    public List<Jilu> queryList(Jilu jilu) {
        return jiluMapper.queryList(jilu);
    }
}

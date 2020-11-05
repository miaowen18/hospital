package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Jilu;

import java.util.List;

public interface RecordService {
    int insert(Jilu record);
    List<Jilu> queryList(Jilu jilu);
}

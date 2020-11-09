package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Caigou;

import java.util.List;

public interface CaiGouService {
    int addCaiGou(Caigou caigou);
    int delcaigou(Integer caigouid);
    List<Caigou> queryList();
}

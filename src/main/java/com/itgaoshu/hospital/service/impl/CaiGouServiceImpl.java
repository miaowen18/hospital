package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Caigou;
import com.itgaoshu.hospital.mapper.CaigouMapper;
import com.itgaoshu.hospital.service.CaiGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CaiGouServiceImpl implements CaiGouService {

    @Autowired
    private CaigouMapper caigouMapper;

    @Override
    public int addCaiGou(Caigou caigou) {
        return caigouMapper.insert(caigou);
    }

    @Override
    public int delcaigou(Integer caigouid) {
        return caigouMapper.deleteByPrimaryKey(caigouid);
    }

    @Override
    public List<Caigou> queryList() {
        return caigouMapper.queryList();
    }
}

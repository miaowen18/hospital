package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.mapper.BaoqueMapper;
import com.itgaoshu.hospital.service.OutStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OutStoreServiceImpl implements OutStoreService {
    @Autowired
    private BaoqueMapper baoqueMapper;
    @Override
    public List<Baoque> queryList() {
        return baoqueMapper.queryList();
    }
}

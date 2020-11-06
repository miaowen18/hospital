package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.mapper.MainMapper;
import com.itgaoshu.hospital.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MainServiceImpl implements MainService {

    @Autowired
    private MainMapper mainMapper;

    @Override
    public List<Doctor> one() {
        return mainMapper.one();
    }

    @Override
    public List<Doctor> two() {
        return mainMapper.two();
    }

    @Override
    public List<Doctor> three() {
        return mainMapper.three();
    }

    @Override
    public List<Doctor> four() {
        return mainMapper.four();
    }

    @Override
    public List<Doctor> five() {
        return mainMapper.five();
    }

    @Override
    public List<Doctor> six() {
        return mainMapper.six();
    }

    @Override
    public List<Doctor> seven() {
        return mainMapper.seven();
    }

    @Override
    public int zhuyuanTotal() {
        return mainMapper.zhuyuanTotal();
    }

    @Override
    public int currentZhuYuan() {
        return mainMapper.currentZhuYuan();
    }

    @Override
    public int currentNum() {
        return mainMapper.currentNum();
    }

    @Override
    public int Total() {
        return mainMapper.Total();
    }
}
package com.itgaoshu.hospital.service.impl;


import com.itgaoshu.hospital.bean.*;
import com.itgaoshu.hospital.mapper.RegisterMapper;
import com.itgaoshu.hospital.service.ZhuYuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ZhuYuanServiceImpl implements ZhuYuanService {
    @Autowired
    private RegisterMapper registerMapper;


    @Override
    public List<Register> select(Register register) {
        return registerMapper.select(register);
    }

    @Override
    public List<Register> select2() {
        return registerMapper.select2();
    }

    @Override
    public int insert(Register record) {
        return registerMapper.insert(record);
    }

    @Override
    public List<Departments> select3() {
        return registerMapper.select3();
    }

    @Override
    public List<Doctor> select4(Integer departmentId) {
        return registerMapper.select4(departmentId);
    }

    @Override
    public List<Bed> select5(Integer departmentId) {
        return registerMapper.select5(departmentId);
    }

    @Override
    public List<Moneytype> select6() {
        return registerMapper.select6();
    }
}

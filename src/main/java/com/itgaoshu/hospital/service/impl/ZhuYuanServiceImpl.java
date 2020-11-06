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
    public int insert(Register register) {
        return registerMapper.insert(register);
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

    @Override
    public int deleteByPrimaryKey(String phone) {
        return registerMapper.deleteByPrimaryKey(phone);
    }

    @Override
    public Register selectByPrimaryKey(Integer registerid) {
        return registerMapper.selectByPrimaryKey(registerid);
    }

    @Override
    public List<Pay> selectPay() {
        return registerMapper.selectPay();
    }

    @Override
    public int updatePay(Register register) {
        return registerMapper.updatePay(register);
    }

    @Override
    public int insertPay(Register register) {
        return registerMapper.insertPay(register);
    }



    @Override
    public Double selectPrice(Integer bedNum) {
        return registerMapper.selectPrice(bedNum);
    }

    @Override
    public Register select8(String userName) {
        return registerMapper.select8(userName);
    }

    @Override
    public List<Pharmacy> select10(Pharmacy pharmacy) {
        return registerMapper.select10(pharmacy);
    }

    @Override
    public List<Hospitalprice> select11(Register register) {
        return registerMapper.select11(register);
    }

    @Override
    public int insertDrug(Hospitalprice hospitalprice) {
        return registerMapper.insertDrug(hospitalprice);
    }

    @Override
    public int updatePrice(Register register) {
        return registerMapper.updatePrice(register);
    }

    @Override
    public int updateDrug(Hospitalprice hospitalprice) {
        return registerMapper.updateDrug(hospitalprice);
    }

    @Override
    public List<Inoutpatienttype> select12(Inoutpatienttype inoutpatienttype) {
        return registerMapper.select12(inoutpatienttype);
    }

    @Override
    public int updateInout(Hospitalprice hospitalprice) {
        return registerMapper.updateInout(hospitalprice);
    }

    @Override
    public int updateState(Register register) {
        return registerMapper.updateState(register);
    }


}

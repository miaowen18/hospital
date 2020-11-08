package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.mapper.CFHuaJiaMapper;
import com.itgaoshu.hospital.service.CFHuaJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CFHuaJiaServiceImpl implements CFHuaJiaService {
    @Autowired
    private CFHuaJiaMapper cfHuaJiaMapper;

    @Override
    public List<Report> select() {
        return cfHuaJiaMapper.select();
    }

    @Override
    public List<Pharmacy> selectDrug() {
        return cfHuaJiaMapper.selectDrug();
    }

    @Override
    public List<Cashier> selall(Integer perid) {
        return cfHuaJiaMapper.selall(perid);
    }

    @Override
    public String selbing(Integer reid) {
        return cfHuaJiaMapper.selbing(reid);
    }

    @Override
    public Integer selcf(Cashier cashier) {
        return cfHuaJiaMapper.selcf(cashier);
    }

    @Override
    public Integer addchu(Cashier cashier) {
        return cfHuaJiaMapper.addchu(cashier);
    }

    @Override
    public Integer deldrunum(Pharmacy pharmacy) {
        return cfHuaJiaMapper.deldrunum(pharmacy);
    }

    @Override
    public Integer updatecf(Cashier cashier) {
        return cfHuaJiaMapper.updatecf(cashier);
    }

    @Override
    public Integer del(Cashier cashier) {
        return cfHuaJiaMapper.del(cashier);
    }

    @Override
    public Integer adddrunum(Pharmacy pharmacy) {
        return cfHuaJiaMapper.adddrunum(pharmacy);
    }

    @Override
    public String lookbing(Integer reid) {
        return cfHuaJiaMapper.lookbing(reid);
    }

    @Override
    public Integer addbing(Report report) {
        return cfHuaJiaMapper.addbing(report);
    }

    @Override
    public int seljiao(Integer reid) {
        return cfHuaJiaMapper.seljiao(reid);
    }

    @Override
    public Integer selyi(Integer reid) {
        return cfHuaJiaMapper.selyi(reid);
    }

    @Override
    public Integer selgong(Integer reid) {
        return cfHuaJiaMapper.selgong(reid);
    }

    @Override
    public List<Cashier> selximu(Integer perid) {
        return cfHuaJiaMapper.selximu(perid);
    }

    @Override
    public List<Cashier> selpepi(Integer perid) {
        return cfHuaJiaMapper.selpepi(perid);
    }


}

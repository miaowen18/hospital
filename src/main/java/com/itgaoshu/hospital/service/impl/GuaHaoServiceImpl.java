package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.bean.Registeredtype;
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

    @Override
    public List<Report> one(Doctor doctor) {
        return guaHaoMapper.one(doctor);
    }

    @Override
    public List<Report> two(Doctor doctor) {
        return guaHaoMapper.two(doctor);
    }

    @Override
    public List<Report> three(Doctor doctor) {
        return guaHaoMapper.three(doctor);
    }

    @Override
    public List<Report> four(Doctor doctor) {
        return guaHaoMapper.four(doctor);
    }

    @Override
    public List<Report> five(Doctor doctor) {
        return guaHaoMapper.five(doctor);
    }

    @Override
    public List<Report> six(Doctor doctor) {
        return guaHaoMapper.six(doctor);
    }

    @Override
    public List<Report> seven(Doctor doctor) {
        return guaHaoMapper.seven(doctor);
    }

    @Override
    public List<Registeredtype> selreg() {
        return guaHaoMapper.selreg();
    }

    @Override
    public Integer seltymo(Registeredtype registeredtype) {
        return guaHaoMapper.seltymo(registeredtype);
    }

    @Override
    public List<Departments> seldep() {
        return guaHaoMapper.seldep();
    }

    @Override
    public Integer addre(Report report) {
        return guaHaoMapper.addre(report);
    }

    @Override
    public Integer phone(Report report) {
        return guaHaoMapper.phone(report);
    }

    @Override
    public Integer carid(Report report) {
        return guaHaoMapper.carid(report);
    }

    @Override
    public Integer delre(Integer id) {
        return guaHaoMapper.delre(id);
    }

    @Override
    public Integer zhuanyuan(Report report) {
        return guaHaoMapper.zhuanyuan(report);
    }
}

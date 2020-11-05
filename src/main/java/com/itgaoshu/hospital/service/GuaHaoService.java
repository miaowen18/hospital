package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.bean.Registeredtype;
import com.itgaoshu.hospital.bean.Report;

import java.util.List;

public interface GuaHaoService {
    List<Report> select(Report report);
    int updateState();
    List<Report> one(Doctor doctor);
    List<Report> two(Doctor doctor);
    List<Report> three(Doctor doctor);
    List<Report> four(Doctor doctor);
    List<Report> five(Doctor doctor);
    List<Report> six(Doctor doctor);
    List<Report> seven(Doctor doctor);
    List<Registeredtype> selreg();
    Integer seltymo(Registeredtype registeredtype);
    List<Departments> seldep();
    Integer addre(Report report);
    Integer phone(Report report);
    Integer carid(Report report);
    Integer delre(Integer id);
    Integer zhuanyuan(Report report);
}

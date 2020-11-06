package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Doctor;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MainService {
    List<Doctor> one();
    List<Doctor> two();
    List<Doctor> three();
    List<Doctor> four();
    List<Doctor> five();
    List<Doctor> six();
    List<Doctor> seven();
    int zhuyuanTotal();
    int currentZhuYuan();
    int currentNum();
    int Total();
}

package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Doctor;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MainMapper {
    @Select("SELECT d.doctorName FROM paiban p LEFT JOIN doctor d ON p.doctorId=d.doctorId WHERE ONE='有班' ORDER BY d.doctorid")
    List<Doctor> one();

    @Select("SELECT d.doctorName FROM paiban p LEFT JOIN doctor d ON p.doctorId=d.doctorId WHERE two='有班' ORDER BY d.doctorid")
    List<Doctor> two();

    @Select("SELECT d.doctorName FROM paiban p LEFT JOIN doctor d ON p.doctorId=d.doctorId WHERE three='有班' ORDER BY d.doctorid")
    List<Doctor> three();

    @Select("SELECT d.doctorName FROM paiban p LEFT JOIN doctor d ON p.doctorId=d.doctorId WHERE four='有班' ORDER BY d.doctorid")
    List<Doctor> four();

    @Select("SELECT d.doctorName FROM paiban p LEFT JOIN doctor d ON p.doctorId=d.doctorId WHERE five='有班' ORDER BY d.doctorid")
    List<Doctor> five();

    @Select("SELECT d.doctorName FROM paiban p LEFT JOIN doctor d ON p.doctorId=d.doctorId WHERE six='有班' ORDER BY d.doctorid")
    List<Doctor> six();

    @Select("SELECT d.doctorName FROM paiban p LEFT JOIN doctor d ON p.doctorId=d.doctorId WHERE seven='有班' ORDER BY d.doctorid")
    List<Doctor> seven();

    @Select("SELECT COUNT(*) FROM register WHERE state!=0")
    int zhuyuanTotal();

    @Select("SELECT COUNT(*) FROM register WHERE  NOW() LIKE CONCAT(CONCAT('%',DATE_FORMAT(registerDate,'%Y-%m-%d')),'%')")
    int currentZhuYuan();

    @Select("SELECT COUNT(*) FROM report WHERE  NOW() LIKE CONCAT(CONCAT('%',DATE_FORMAT(TIME,'%Y-%m-%d')),'%')")
    int currentNum();

    @Select("SELECT COUNT(*) FROM report WHERE state!=0")
    int Total();
}

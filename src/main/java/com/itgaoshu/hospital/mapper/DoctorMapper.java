package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.bean.DoctorExample;
import com.itgaoshu.hospital.bean.Registeredtype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper {
    List<Doctor> doctorList(Doctor doctor);
    int deleteDoctor(Integer doctorId);
    int checkCount(Integer doctorId);
    int addDoctor(Doctor doctor);
    int count(Doctor doctor);
    int editDoctor(Doctor doctor);
    List<Departments> findAllDepartments();
    List<Registeredtype>findAllRegisteredtype();
}
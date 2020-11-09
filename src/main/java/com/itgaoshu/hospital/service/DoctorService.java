package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.bean.Registeredtype;

import java.util.List;

public interface DoctorService {
    List<Doctor> doctorList(Doctor doctor);
    int deleteDoctor(Integer doctorId);
    int checkCount(Integer doctorId);
    int addDoctor(Doctor doctor);
    int count(Doctor doctor);
    int editDoctor(Doctor doctor);
    List<Departments> findAllDepartments();
    List<Registeredtype>findAllRegisteredtype();
}

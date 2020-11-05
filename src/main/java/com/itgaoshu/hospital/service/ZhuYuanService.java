package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.*;

import java.util.List;

public interface ZhuYuanService {
    List<Register> select(Register register);
    List<Register> select2();
    int insert(Register record);
    List<Departments> select3();
    List<Doctor> select4(Integer departmentId);
    List<Bed> select5(Integer departmentId);
    List<Moneytype> select6();
    int deleteByPrimaryKey(Integer registerid);
    Register selectByPrimaryKey(Integer registerid);
}

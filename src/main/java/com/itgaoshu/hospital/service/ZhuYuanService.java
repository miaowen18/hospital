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
    int deleteByPrimaryKey(String phone);
    Register selectByPrimaryKey(Integer registerid);
    List<Pay> selectPay();
    int updatePay(Register register);
    int insertPay(Register register);
    Double selectPrice(Integer bedNum);
    Register select8(String userName);
    List<Pharmacy> select10(Pharmacy pharmacy);
    List<Hospitalprice> select11(Register register);
    int  insertDrug(Hospitalprice hospitalprice);
    int updatePrice(Register register);
    int updateDrug(Hospitalprice hospitalprice);
    List<Inoutpatienttype> select12(Inoutpatienttype inoutpatienttype);
    int updateInout(Hospitalprice hospitalprice);
    int updateState(Register register);
    int deleteDrug(Hospitalprice hospitalprice);
}

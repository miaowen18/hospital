package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterMapper {
    int countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(String phone);

    int insert(Register register);

    int insertSelective(Register record);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(Integer registerid);

    List<Register> select(Register register);

    List<Register> select2();

    List<Departments> select3();

    List<Doctor> select4(Integer departmentId);

    List<Bed> select5(Integer departmentId);

    List<Moneytype> select6();

    Register select8(String userName);

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);

    List<Pay> selectPay();

    int updatePay(Register register);

    int insertPay(Register register);

    Double selectPrice(Integer bedNum);

    List<Pharmacy> select10(Pharmacy pharmacy);

    List<Hospitalprice> select11(Register register);

    int  insertDrug(Hospitalprice hospitalprice);

    int updatePrice(Register register);

    int updateDrug(Hospitalprice hospitalprice);

    int updateInout(Hospitalprice hospitalprice);

    List<Inoutpatienttype> select12(Inoutpatienttype inoutpatienttype);

    int updateState(Register register);

    int deleteDrug(Hospitalprice hospitalprice);

    List<Registeredtype> selectRegisteredType();

    int insertRegisteredType(Registeredtype registeredtype);

    int updateRegisteredType(Registeredtype registeredtype);

    List<Projecttype> select15();

    int insertProjectType(String projectname);

    List<Outpatienttype> select16();

    List<Inoutpatienttype> select17();

}
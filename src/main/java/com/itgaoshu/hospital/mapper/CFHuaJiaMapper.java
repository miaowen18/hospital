package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.Report;

import java.util.List;

public interface CFHuaJiaMapper {
    List<Report> select();
    List<Pharmacy> selectDrug();
    List<Cashier> selall(Integer perid);
    String selbing(Integer reid);
    Integer selcf(Cashier cashier);
    Integer addchu(Cashier cashier);
    Integer deldrunum(Pharmacy pharmacy);
    Integer updatecf(Cashier cashier);
    Integer del(Cashier cashier);
    Integer adddrunum(Pharmacy pharmacy);
    String lookbing(Integer reid);
    Integer addbing(Report report);
    int seljiao(Integer reid);
    Integer selyi(Integer reid);
    Integer selgong(Integer reid);
    List<Cashier> selximu(Integer perid);
    List<Cashier> selpepi(Integer perid);
}

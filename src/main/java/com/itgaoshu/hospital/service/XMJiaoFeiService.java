package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Cashier;

import java.util.List;

public interface XMJiaoFeiService {
    List<Cashier> selxiang(Integer perid);
    Integer selshoux(Integer perid);
    Integer updxiang(Integer perid);
    List<Cashier> selcha(Integer perid);
    Integer addjie(Cashier cashier);
}

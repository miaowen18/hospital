package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Cashier;

import java.util.List;

public interface CashierService {
    List<Cashier> queryList(Integer reportid);
}

package com.itgaoshu.hospital.mapper;

import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.bean.Outpatienttype;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.Report;

import java.util.List;

public interface XMHuaJiaMapper {
    List<Pharmacy> selout(Outpatienttype outpatienttype);
    Integer addchuo(Cashier cashier);
    Integer delo(Cashier cashier);
    Double selch(Cashier cashier);
    Integer shoufei(Report report);
    Integer guafei(Report report);
}

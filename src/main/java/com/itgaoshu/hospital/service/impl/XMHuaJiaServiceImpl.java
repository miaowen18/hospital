package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.bean.Outpatienttype;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.mapper.XMHuaJiaMapper;
import com.itgaoshu.hospital.service.XMHuaJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XMHuaJiaServiceImpl implements XMHuaJiaService {

    @Autowired
    private XMHuaJiaMapper xmHuaJiaMapper;

    @Override
    public List<Pharmacy> selout(Outpatienttype outpatienttype) {
        return xmHuaJiaMapper.selout(outpatienttype);
    }

    @Override
    public Integer addchuo(Cashier cashier) {
        return xmHuaJiaMapper.addchuo(cashier);
    }

    @Override
    public Integer delo(Cashier cashier) {
        return xmHuaJiaMapper.delo(cashier);
    }

    @Override
    public Double selch(Cashier cashier) {
        return xmHuaJiaMapper.selch(cashier);
    }

    @Override
    public Integer shoufei(Report report) {
        return xmHuaJiaMapper.shoufei(report);
    }

    @Override
    public Integer guafei(Report report) {
        return xmHuaJiaMapper.guafei(report);
    }
}

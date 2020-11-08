package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.mapper.XMJiaoFeiMapper;
import com.itgaoshu.hospital.service.XMJiaoFeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XMJiaoFeiServiceImpl implements XMJiaoFeiService {

    @Autowired
    private XMJiaoFeiMapper xmJiaoFeiMapper;

    @Override
    public List<Cashier> selxiang(Integer perid) {
        return xmJiaoFeiMapper.selxiang(perid);
    }

    @Override
    public Integer selshoux(Integer perid) {
        return xmJiaoFeiMapper.selshoux(perid);
    }

    @Override
    public Integer updxiang(Integer perid) {
        return xmJiaoFeiMapper.updxiang(perid);
    }

    @Override
    public List<Cashier> selcha(Integer perid) {
        return xmJiaoFeiMapper.selcha(perid);
    }

    @Override
    public Integer addjie(Cashier cashier) {
        return xmJiaoFeiMapper.addjie(cashier);
    }
}

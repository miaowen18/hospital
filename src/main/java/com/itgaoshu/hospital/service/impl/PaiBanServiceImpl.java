package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Ban;
import com.itgaoshu.hospital.bean.Paiban;
import com.itgaoshu.hospital.bean.PaibanExample;
import com.itgaoshu.hospital.mapper.PaibanMapper;
import com.itgaoshu.hospital.service.PaiBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaiBanServiceImpl implements PaiBanService {
    @Autowired
    private PaibanMapper paibanmapper;
    @Override
    public List<Paiban> selectByExample(Paiban paiban) {

        return paibanmapper.selectByExample(paiban);
    }

    @Override
    public List<Ban> select2() {
        return paibanmapper.select2();
    }

    @Override
    public int updateByPrimaryKeySelective(Paiban paiban) {
        return paibanmapper.updateByPrimaryKeySelective(paiban);
    }
}

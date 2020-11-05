package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Paiban;
import com.itgaoshu.hospital.bean.PaibanExample;

import java.util.List;

public interface PaiBanService {
    List<Paiban> selectByExample(Paiban paiban);
}

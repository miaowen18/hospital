package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Skull;

import java.util.List;

public interface SkullService {
    List<Skull> findAllSkull(Skull skull);
    int deleteSkull(Integer skullid);
    int  addSkull(Skull skull);
    int  editSkull(Skull skull);
}

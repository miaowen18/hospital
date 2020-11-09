package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Skull;
import com.itgaoshu.hospital.mapper.SkullMapper;
import com.itgaoshu.hospital.service.SkullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkullServiceImpl implements SkullService {
    @Autowired
    private SkullMapper skullMapper;
    @Override
    public List<Skull> findAllSkull(Skull skull) {
        return skullMapper.findAllSkull(skull);
    }

    @Override
    public int deleteSkull(Integer skullid) {
        return skullMapper.deleteByPrimaryKey(skullid);
    }

    @Override
    public int addSkull(Skull skull) {
        return skullMapper.addSkull(skull);
    }

    @Override
    public int editSkull(Skull skull) {
        return skullMapper.editSkull(skull);
    }
}

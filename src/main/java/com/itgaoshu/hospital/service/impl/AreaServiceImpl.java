package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Area;
import com.itgaoshu.hospital.mapper.AreaMapper;
import com.itgaoshu.hospital.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> findAllArea(Area area) {
        return areaMapper.findAllArea(area);
    }

    @Override
    public int deleteArea(Integer areaid) {
        return areaMapper.deleteByPrimaryKey(areaid);
    }

    @Override
    public int addArea(Area area) {
        return areaMapper.addArea(area);
    }


}

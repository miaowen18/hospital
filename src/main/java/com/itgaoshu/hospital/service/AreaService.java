package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Area;

import java.util.List;

public interface AreaService {
    List<Area> findAllArea(Area area);
    int deleteArea(Integer areaid);
    int  addArea(Area area);
}

package com.itgaoshu.hospital.service;

import com.itgaoshu.hospital.bean.Warehuose;

import java.util.List;


public interface WareHuoseService {
    //查询仓库所有信息
    public List<Warehuose> queryAllList();
    //添加仓库
    public int addWarehuose(Warehuose warehuose);
    //删除仓库
    public int deleteWarehuose(Integer warehouseid);
    //查询记录数
    public int count(Warehuose warehuose);
}

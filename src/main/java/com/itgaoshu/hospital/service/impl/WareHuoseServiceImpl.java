package com.itgaoshu.hospital.service.impl;

import com.itgaoshu.hospital.bean.Warehuose;
import com.itgaoshu.hospital.mapper.WarehuoseMapper;
import com.itgaoshu.hospital.service.WareHuoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class WareHuoseServiceImpl implements WareHuoseService {
    //药房:id name
    @Autowired
    private WarehuoseMapper warehuoseMapper;
    /**
     * 查询所有药品
     * @return
     */
    @Override
    public List<Warehuose> queryAllList(Warehuose warehuose) {
        return warehuoseMapper.queryAllList(warehuose);
    }

    /**
     * 添加仓库
     * @param warehuose
     * @return
     */
    @Override
    public int addWarehuose(Warehuose warehuose) {
        return warehuoseMapper.insert(warehuose);
    }

    /**
     * 删除仓库
     * @param warehouseid
     * @return
     */
    @Override
    public int deleteWarehuose(Integer warehouseid) {
        return warehuoseMapper.deleteByPrimaryKey(warehouseid);
    }

    /**
     * 查询记录数
     * @param warehuose
     * @return
     */
    @Override
    public int count(Warehuose warehuose) {
        return warehuoseMapper.count(warehuose);
    }
}

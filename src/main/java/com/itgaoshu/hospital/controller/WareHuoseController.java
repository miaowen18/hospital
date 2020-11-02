package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.bean.Warehuose;
import com.itgaoshu.hospital.service.WareHuoseService;
import com.itgaoshu.hospital.service.impl.WareHuoseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WareHuoseController {
    @Autowired
    private WareHuoseServiceImpl wareHuoseService;

    /**
     * 查询仓库
     * @return
     */
    @RequestMapping()
    @ResponseBody
    public Object queryALLWareList(Warehuose warehuose){
        List<Warehuose> warelists=wareHuoseService.queryAllList(warehuose);

        return null;
    }

}

package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.service.ZhuYuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ZhuYuanController {
    @Autowired
    private ZhuYuanService zhuYuanService;

    //查询患者信息
    @RequestMapping("liao/selRegister")
    @ResponseBody
    public Object select(){
        return zhuYuanService.select();
    }
}

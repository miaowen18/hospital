package com.itgaoshu.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysController {

    @RequestMapping("/toMenuManager")
    public String toMenuManager(){
        return "view/menu/menuManager";
    }
    
    @RequestMapping("/toMenuLeft")
    public String toMenuLeft(){
        return "view/menu/menuLeft";
    }

    @RequestMapping("/toMenuRight")
    public String toMenuRight(){
        return "view/menu/menuRight";
    }

    @RequestMapping("/toLoadAllRole")
    public String toLoadAllRole(){
        return "view/role/roleManager";
    }

    @RequestMapping("/toLoadAllUser")
    public String toLoadAllUser(){
        return "view/user/userManager";
    }

    @RequestMapping("/icon")
    public String icon(){
        return "view/center/icon";
    }

    @RequestMapping("/toReportFinance")
    public String toReportFinance(){
        return "view/finance/reportManage";
    }

    @RequestMapping("/toZhuYaunManage")
    public String toZhuYuanManage(){
        return "view/finance/zhuYuanManage";
    }

    @RequestMapping("/toBingYear")
    public String toBingYear(){
        return "view/finance/reportBing";
    }

    @RequestMapping("/toBing2")
    public String toBing2(){
        return "view/finance/zhuYuanBing";
    }

    @RequestMapping("/toDoctorDuibi")
    public String toDoctorDuiBi(){
        return "view/finance/doctorDuibi";
    }
}
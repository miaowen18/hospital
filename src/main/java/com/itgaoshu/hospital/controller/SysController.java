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

    @RequestMapping("/toCurrent")
    public String toCurrent(){
        return "view/finance/current";
    }

    @RequestMapping("/toMain")
    public String toMain(){
        return "view/main/main";
    }


    @RequestMapping("toDoctor")
    public String toDoctor() {
        return "view/center/doctor";
    }

    @RequestMapping("toDepartments")
    public String toDepartments() {
        return "view/center/departments";
    }

    @RequestMapping("toRegisteredType")
    public String toRegisteredtype() {
        return "view/center/registeredType";
    }

    @RequestMapping("toType")
    public String toType() {
        return "view/center/type";
    }

    @RequestMapping("toArea")
    public String toArea() {
        return "view/center/area";
    }

    @RequestMapping("toSkull")
    public String toSkull() {
        return "view/center/skull";
    }

    @RequestMapping("toWarehuose")
    public String toWarehuose() {
        return "view/center/warehuose";
    }

    @RequestMapping("toSupplyManage")
    public String toSupplyManage() {
        return "view/center/supplyManage";
    }

    @RequestMapping("toSupply")
    public String toSupply() {
        return "view/center/supply";
    }

    @RequestMapping("toUnit")
    public String toUnit() {
        return "view/center/unit";
    }

    @RequestMapping("toProjectTypeManage")
    public String toProjectTypeManage() {
        return "view/center/projectTypeManage";
    }

//    @RequestMapping("toPaiban")
//    public String toPaiban() {
//        return "view/center/paiban";
//    }

    @RequestMapping("toDrugdictionary")
    public String toDrugdictionary() {
        return "view/center/drugdictionary";
    }
}
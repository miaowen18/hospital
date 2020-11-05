package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Finance;
import com.itgaoshu.hospital.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/finance")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @RequestMapping("reportYearFinance")
    @ResponseBody
    public List<Double> reportYearFinance(String year){
        List<Double> prices = financeService.selectAllTotalFinanceByYear(year);
        Collections.replaceAll(prices,null,0.0);
        return prices;
    }

    @RequestMapping("zhuYuanYearFinance")
    @ResponseBody
    public List<Double> zhuYuanYearFinance(String year){
        List<Double> prices = financeService.selectAllZhuYuanFinanceByYear(year);
        Collections.replaceAll(prices,null,0.0);
        return prices;
    }

    @RequestMapping("reportYearBingFinance")
    @ResponseBody
    public List<Finance> reportYearBingFinance(){
        return financeService.reportYearBingFinance();
    }

    @RequestMapping("zhuYuanYearBingFinance")
    @ResponseBody
    public List<Finance> zhuYuanYearBingFinance(){
        return financeService.zhuYuanYearBingFinance();
    }

    @RequestMapping("doctorDuibi")
    @ResponseBody
    public Map<String,Object> doctorDuibi(Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Finance> doctors = financeService.doctorDuibi();
        PageInfo pageInfo = new PageInfo(doctors);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("selectDoctorDuiBi")
    @ResponseBody
    public Map<String,Object> selectDoctorDuiBi(Integer page, Integer limit, String doctorName){
        PageHelper.startPage(page,limit);
        String newDoctorName= "%"+doctorName+"%";
        List<Finance> doctors = financeService.selectDoctorDuiBi(newDoctorName);
        PageInfo pageInfo = new PageInfo(doctors);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("zDoctorDuibi")
    @ResponseBody
    public Map<String,Object> zDoctorDuibi(Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Finance> doctors = financeService.zDoctorDuibi();
        PageInfo pageInfo = new PageInfo(doctors);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("selectZDoctorDuiBi")
    @ResponseBody
    public Map<String,Object> selectZDoctorDuiBi(Integer page, Integer limit, String doctorName){
        PageHelper.startPage(page,limit);
        String newDoctorName= "%"+doctorName+"%";
        List<Finance> doctors = financeService.selectZDoctorDuiBi(newDoctorName);
        PageInfo pageInfo = new PageInfo(doctors);
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    @RequestMapping("currentFinance")
    @ResponseBody
    public List<Finance> currentFinance(String current){
        System.out.println(current);
        return financeService.currentFinance(current);
    }

}
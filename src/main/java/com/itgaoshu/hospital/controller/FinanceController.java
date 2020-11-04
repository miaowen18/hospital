package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

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
}
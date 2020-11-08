package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.service.XMJiaoFeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("xpay")
public class XMJiaoFeiController {
    @Autowired
    private XMJiaoFeiService xmJiaoFeiService;

    @RequestMapping("xiangpay")
    public String xiangpay(){
        return "cao/xaingmupay";
    }

    @RequestMapping("selxiang")
    @ResponseBody
    public Object selxiang(Integer page,Integer limit,Integer perid){
        PageHelper.startPage(page, limit);
        List<Cashier> mohu = xmJiaoFeiService.selxiang(perid);
        PageInfo pageInfo = new PageInfo(mohu);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("selshoux")
    @ResponseBody
    public Object selshoux(Integer perid){
        Integer selshoux = xmJiaoFeiService.selshoux(perid);
        return  selshoux;
    }

    @RequestMapping("shoufei")
    @ResponseBody
    public Object shoufei(Integer perid){
        Integer updxiang = xmJiaoFeiService.updxiang(perid);
        return updxiang;
    }

    @RequestMapping("seljian")
    public Object seljian(){
        return "cao/jiancha";
    }

    @RequestMapping("selcha")
    @ResponseBody
    public Object selcha(Integer page,Integer limit,Integer perid){
        PageHelper.startPage(page, limit);
        List<Cashier> selcha = xmJiaoFeiService.selcha(perid);
        PageInfo pageInfo = new PageInfo(selcha);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("addbing")
    @ResponseBody
    public Object addbing(Cashier cashier,Integer reid,String bing,Integer cashier2){
        cashier.setReportid(reid);
        cashier.setJie(bing);
        cashier.setCashier(cashier2);
        Integer addjie = xmJiaoFeiService.addjie(cashier);
        return addjie;
    }
}

package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.service.CFHuaJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("caocc")
public class CFHuaJiaController {
    @Autowired
    private CFHuaJiaService cfHuaJiaService;

    @RequestMapping("selpreson")
    @ResponseBody
    public Object selperson(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Report> sel = cfHuaJiaService.select();
        PageInfo pageInfo = new PageInfo(sel);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("cc")
    public Object CFHJ(){
        return  "cao/cashier";
    }

    @RequestMapping("seldrug")
    @ResponseBody
    public Object seldrug(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Pharmacy> selpharm = cfHuaJiaService.selectDrug();
        PageInfo pageInfo = new PageInfo(selpharm);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("selall")
    @ResponseBody
    public Object selall(Integer perid,Integer page, Integer limit){
        List<Cashier> selall = cfHuaJiaService.selall(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selall);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("selbing")
    @ResponseBody
    public Object selbing(Integer reid){
        String selbing = cfHuaJiaService.selbing(reid);
        return selbing;
    }

    @RequestMapping("selchu")
    @ResponseBody
    public Object seslchu(Cashier cashier,Integer reid, String mename){
        cashier.setReportid(reid);//把用户id存入数据库
        cashier.setDurgname(mename);//把药品名称存入实体类
        Integer selcadr = cfHuaJiaService.selcf(cashier);
        return selcadr;
    }

    @RequestMapping("addchu")
    @ResponseBody
    public Object addchu(Cashier cashier,Pharmacy pharmacy){
        //向处方添加药品
        Integer addchu = cfHuaJiaService.addchu(cashier);
        String pharmacyName=cashier.getDurgname();
        pharmacy.setPharmacyname(pharmacyName);
        //减少药房中的数量
        Integer deldrunum = cfHuaJiaService.deldrunum(pharmacy);
        return addchu;
    }

    @RequestMapping("updchu")
    @ResponseBody
    public Object updchu(Cashier cashier,Pharmacy pharmacy){
        //修改处方中药品的数量
        Integer updchu = cfHuaJiaService.updatecf(cashier);
        String pharmacyName=cashier.getDurgname();
        pharmacy.setPharmacyname(pharmacyName);
        //修改仓库中药品的数量
        Integer deldrunum = cfHuaJiaService.deldrunum(pharmacy);
        return updchu;
    }

    @RequestMapping("del")
    @ResponseBody
    public Object del(Cashier cashier,String durnme,Integer durnum,Pharmacy pharmacy){
        Integer del = cfHuaJiaService.del(cashier);
        pharmacy.setPharmacyname(durnme);
        pharmacy.setDrugstorenum(durnum);
        cfHuaJiaService.adddrunum(pharmacy);
        if(del==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }

    @RequestMapping("lookbing")
    @ResponseBody
    public Object lookbing(Integer reid){
        String lookbing = cfHuaJiaService.lookbing(reid);
        return lookbing;
    }

    @RequestMapping("addbing")
    @ResponseBody
    public Object addbing(Integer reid, String bing, Report report){
        report.setZhuan(bing);
        report.setReportId(reid);
        Integer addbing = cfHuaJiaService.addbing(report);
        return addbing;
    }

    @RequestMapping("seljiao")
    @ResponseBody()
    public Object seljiao(Integer reid){
        int seljiao = cfHuaJiaService.seljiao(reid);
        return seljiao;
    }

    @RequestMapping("selwei")
    @ResponseBody
    public Object selwei(Integer reid){
        //查询该用户有几个做过的项目
        Integer selyi = cfHuaJiaService.selyi(reid);
        //查询该用户有几个缴费的项目
        Integer selgong = cfHuaJiaService.selgong(reid);
        if(selyi==selgong){
            return 1;
        }else {
            return 0;
        }
    }

    @RequestMapping("selximu")
    @ResponseBody
    public Object selximu(Integer perid,Integer page, Integer limit){
        List<Cashier> selximu = cfHuaJiaService.selximu(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selximu);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("selpepi")
    @ResponseBody
    public Object selpepi(Integer perid,Integer page, Integer limit){
        List<Cashier> selpepi = cfHuaJiaService.selpepi(perid);
        PageHelper.startPage(page, limit);
        PageInfo pageInfo = new PageInfo(selpepi);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
}

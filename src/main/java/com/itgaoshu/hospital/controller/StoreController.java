package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.*;
import com.itgaoshu.hospital.service.impl.CaiGouServiceImpl;
import com.itgaoshu.hospital.service.impl.RecordServiceImpl;
import com.itgaoshu.hospital.service.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("seldrugstore")
public class StoreController {//查询药品仓库
    @Autowired
    private StoreServiceImpl storeService;
    @Autowired
    private RecordServiceImpl recordService;
    @Autowired
    private CaiGouServiceImpl caiGouService;
    //入库单
    @RequestMapping("adddrugs")
    @ResponseBody
    public Object adddrugs(lDrug lDrug,Jilu jilu) throws ParseException {
        Integer store=0;
        Integer upstore=0;
        Drugstore drugstore=new Drugstore();
      //  drugstoreName, supplierId,skullId, warehouseId, unit,tradePrice, sellingPrice, area,
       // type, produceDate, validDate,drugstorenum, batch
        drugstore.setDrugstorename(lDrug.getDrugstoreName());
        drugstore.setSupplierid(lDrug.getSupplierId());
        drugstore.setSkullid(lDrug.getSkullId());
        drugstore.setWarehouseid(lDrug.getWarehouseId());
        drugstore.setUnit(lDrug.getUnit());
        drugstore.setTradeprice(lDrug.getTradePrice());
        drugstore.setSellingprice(lDrug.getSellingPrice());
        drugstore.setArea(lDrug.getArea());
        drugstore.setType(lDrug.getType());
        String produceDate=lDrug.getProduceDate();
        String validDate=lDrug.getValidDate();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date produceDate1=format.parse(produceDate);
        Date validDate1=format.parse(validDate);
        drugstore.setProducedate(produceDate1);
        drugstore.setValiddate(validDate1);
        drugstore.setDrugstorenum(lDrug.getDrugstorenum());
        drugstore.setBatch(lDrug.getBatch());
        //查询是否已存在该药品
        int count=storeService.queryList1(drugstore);
       if(count==1){
            //修改 添加
            upstore=storeService.update(drugstore);
            System.out.println("up"+upstore);
            int cord=recordService.insert(jilu);
            System.out.println(cord);
        }
        if(count!=1){
            //添加记录
          int cord=recordService.insert(jilu);
            System.out.println(cord);
            //添加方法
            store=storeService.addStore(drugstore);
            System.out.println("st"+store);
        }
        return store+upstore;
    }

    @RequestMapping("selectdgty")
    @ResponseBody//查询药品
    public Object selectdgty(Drugdictionary drugdictionary,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Drugdictionary> list=storeService.selectdgty(drugdictionary);
        for (Drugdictionary dg: list) {
            System.out.println(dg);
        }
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("selnumber")
    @ResponseBody//查询当前库存
    public Object selnumber(Drugstore drugstore){
        int drugstorenum=storeService.selnumer(drugstore);
        return drugstorenum;
    }

    //出库单页面
    @RequestMapping("selectdrugstore")
    @ResponseBody
    public Object selectdrugstore(Drugstore drugstore,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Drugstore> lists=storeService.queryList(drugstore);
        PageInfo pageInfo=new PageInfo(lists);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    //库存查询页面
    @RequestMapping("updrug")
    @ResponseBody//编辑
    public Object updrug(Drugstore drugstore){
        int num=storeService.update(drugstore);
        if(num==1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }


    //type药品类型
    @RequestMapping("seltype")
    @ResponseBody
    public Object seltype(){
       List<Type> list=storeService.queryList3();
        return list;
    }
    //unit单位
    @RequestMapping("selunit")
    @ResponseBody
    public Object selunit(){
        List<Unit> list=storeService.queryList4();
        return list;
    }
    //area类
    @RequestMapping("selarea")
    @ResponseBody//产地
    public Object selarea(){
        List<Area> list=storeService.queryList1();
        return list;
    }
    @RequestMapping("selskull")
    @ResponseBody//经办人
    public Object selskull(){
        List<Skull> list=storeService.queryList2();
        return list;
    }
    @RequestMapping("selupplier")
    @ResponseBody//查询供货单位
    public Object selupplier(){
        List<Upplier> list=storeService.queryList5();
        return list;
    }


    //库存不足页面
    @RequestMapping("selectlackdrug")
    @ResponseBody//查询仓库不足的药品
    public Object selectlackdrug(Integer page,Integer limit){
     PageHelper.startPage(page,limit);
     List<Drugstore>  lists=storeService.queryQue();
     PageInfo pageInfo=new PageInfo(lists);
     Map<String,Object> map=new HashMap<>();
     map.put("code",0);
     map.put("msg","");

     map.put("count",pageInfo.getTotal());
     map.put("data",pageInfo.getList());
        return map;
    }
    //库存不足页面
    @RequestMapping("addcaigou")
    @ResponseBody//添加采购
    public Object addcaigou(Caigou caigou){
        int num=caiGouService.addCaiGou(caigou);
        return num;
    }
    //库存不足页面
    @RequestMapping("selcaigou")
    @ResponseBody//查询采购
    public Object selcaigou(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Caigou> list=caiGouService.queryList();
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //库存不足页面
    @RequestMapping("delcaigou")
    @ResponseBody//删除
    public Object delcaigou(Integer caigouid){
        int num=caiGouService.delcaigou(caigouid);
        return num;
    }

    //过期提醒
    @RequestMapping("seldrugDateguoqi")
    @ResponseBody//查询过期药品
    public Object seldrugDateguoqi(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Drugstore> list=storeService.seldrugDateguoqi();
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }
    @RequestMapping("delguoqidurg")
    @ResponseBody//删除过期药品
    public int delguoqidurg(Integer rugstoreid,Jilu jilu){
        int num=storeService.delguoqidurg(rugstoreid);
        if(num==1){
            recordService.insert(jilu);
        }
        return num;
    }

}

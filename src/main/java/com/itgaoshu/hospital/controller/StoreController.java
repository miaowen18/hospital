package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.*;
import com.itgaoshu.hospital.service.impl.RecordServiceImpl;
import com.itgaoshu.hospital.service.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
    //入库单
    @RequestMapping("adddrugs")
    @ResponseBody
    public Object adddrugs(Drugstore drugstore,Jilu jilu){
        Integer store=0;
        Integer upstore=0;
        System.out.println(drugstore);
        System.out.println(jilu);
        int count=storeService.queryList1(drugstore);
        System.out.println(count);
       /*if(count==1){
            //修改 添加
            upstore=storeService.update(drugstore);
            System.out.println("up"+upstore);
            int cord=recordService.insert(jilu);
            System.out.println(cord);
        }else{
            //添加记录
          int cord=recordService.insert(jilu);
            System.out.println(cord);
            //添加方法
            store=storeService.addStore(drugstore);
            System.out.println("st"+store);
        }*/
        return store+upstore;
    }
    @RequestMapping("selectdgty")
    @ResponseBody//查询药品
    public Object selectdgty(Drugdictionary drugdictionary,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Drugdictionary> list=storeService.selectdgty(drugdictionary);
        for (Drugdictionary dru:list) {
            System.out.println(dru);
        }
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    //库存查询
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
    //修改页面
    @RequestMapping("updrug")
    @ResponseBody//编辑
    public Object updrug(){

        return "";
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
        System.out.println(list);
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
    @RequestMapping("addcaigou")
    @ResponseBody//添加采购
    public Object addcaigou(){

        return "";
    }
    @RequestMapping("selcaigou")
    @ResponseBody//查询采购
    public Object selcaigou(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Caigou> list=storeService.queryList();
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
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
    @RequestMapping("selnumber")
    @ResponseBody
    public Object selnumber(Drugstore drugstore){
        int drugstorenum=storeService.selnumer(drugstore);

        return drugstorenum;
    }
    @RequestMapping("delguoqidurg")
    @ResponseBody//删除过期药品
    public int delguoqidurg(){
        return 0;
    }

}

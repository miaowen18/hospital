package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Caigou;
import com.itgaoshu.hospital.bean.Drugdictionary;
import com.itgaoshu.hospital.bean.Drugstore;
import com.itgaoshu.hospital.bean.DrugstoreVo;
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
    //入库单
    @RequestMapping("adddrugs")
    @ResponseBody
    public Object adddrugs(){
        return "";
    }
    @RequestMapping("selectdgty")
    @ResponseBody
    public Object selectdgty(Integer page,Integer limit){
        List<Drugdictionary> list=null;
        return "";
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
    @ResponseBody
    public Object updrug(){
        return "";
    }
    //type药品类型
    @RequestMapping("seltype")
    @ResponseBody
    public Object seltype(){
       return "";
    }
    //unit单位
    @RequestMapping("selunit")
    @ResponseBody
    public Object selunit(){
        return "";
    }
    //area类
    @RequestMapping("selarea")
    @ResponseBody
    public Object selarea(){
        return "";
    }
    @RequestMapping("selskull")
    @ResponseBody
    public Object selskull(){
        return "";
    }
    @RequestMapping("selupplier")
    @ResponseBody
    public Object selupplier(){
        return "";
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
    @ResponseBody
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
    @RequestMapping("delguoqidurg")
    @ResponseBody//删除过期药品
    public int delguoqidurg(){
        return 0;
    }

}

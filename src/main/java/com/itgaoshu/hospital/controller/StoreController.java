package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public Object updrug(){
        return "";
    }
    //type药品类型
    @RequestMapping("seltype")
    public Object seltype(){
       return "";
    }
    //unit单位
    @RequestMapping("selunit")
    public Object selunit(){
        return "";
    }
    //area类
    @RequestMapping("selarea")
    public Object selarea(){
        return "";
    }
    @RequestMapping("selskull")
    public Object selskull(){
        return "";
    }
    @RequestMapping("selupplier")
    public Object selupplier(){
        return "";
    }
}

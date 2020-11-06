package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.bean.Drugstore;
import com.itgaoshu.hospital.bean.Jilu;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.service.impl.OutStoreServiceImpl;
import com.itgaoshu.hospital.service.impl.PharmacyServiceImpl;
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
@RequestMapping("chuku")
public class OutStoreController {
    @Autowired
    private OutStoreServiceImpl outStoreService;
    @Autowired
    private StoreServiceImpl storeService;
    @Autowired
    private RecordServiceImpl recordService;
    @Autowired
    private PharmacyServiceImpl pharmacyService;

    //根据报缺的药名找到对应的药品批次
    @RequestMapping("selbaoquedrugname")
    @ResponseBody
    public Object selbaoquedrugname(Integer page,Integer limit,String drugstorename){
        PageHelper.startPage(page,limit);
        Drugstore dg=new Drugstore();
        dg.setDrugstorename(drugstorename);
        List<Drugstore> list=storeService.queryList(dg);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //补给的数量大于需要报缺的数量
    @RequestMapping("updatedrugnumber")
    @ResponseBody
    public Object updatedrugnumber(Drugstore drugstore,Pharmacy pharmacy,Jilu jilu){
        System.out.println(drugstore+"   "+pharmacy+"     "+jilu);
        int uppharmacynumber=0;
        /*int seldrugnamenum = storeService.seldrugnamenum(drugstore);
        //先修改仓库数据number
        int updatedrugnumber = storeService.updatedrugnumber(drugstore);
        if(seldrugnamenum==1){//数量减空 删除此行药
            //再删除
            int deldrugnamenum = storeService.deldrugnamenum(drugstore);

        }
        if(updatedrugnumber==1){//如果仓库数量修改成功
            System.out.print("添加记录表");
            int addjilu = recordService.insert(jilu);//添加一条记录
            //修改报缺表数量
            int upbaoquenumber = pharmacyService.upbaoquenumber(drugstore);
            //查询报缺表数量是否有补给完毕的数据 即number 小于等于0 的数据
            int selbaoquenamenum = pharmacyService.selbaoquenamenum(drugstore);
            if(selbaoquenamenum>=1){//查询到有为number0的报缺数据
                //删除
                int delbaoquenamenum = pharmacyService.delbaoquenamenum();
            }
            if(upbaoquenumber==1){//报缺表减数成功则执行药房加数
                uppharmacynumber = pharmacyService.uppharmacynumber(drugstore);
            }
        }*/
        return uppharmacynumber;
    }
    //补给的数量小于需要报缺的数量---
    @RequestMapping("addpharmacy")
    @ResponseBody//
    public Object addpharmacy(Jilu jilu,Pharmacy pharmacy,Drugstore drugstore){
        System.out.println(jilu+"  "+pharmacy+"   "+drugstore);

        return 0;
    }
    //查询报缺药品
    @RequestMapping("selbaoquedan")
    @ResponseBody
    public Object selbaoquedan(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Baoque> lists=outStoreService.queryList();
        PageInfo pageInfo=new PageInfo(lists);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);

        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }


}

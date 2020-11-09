package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.*;
import com.itgaoshu.hospital.mapper.PharmacyMapper;
import com.itgaoshu.hospital.service.impl.PharmacyServiceImpl;
import com.itgaoshu.hospital.service.impl.RecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("pharmacy")
public class PharmacyController {
    @Autowired
    private PharmacyServiceImpl pharmacyService;
    @Autowired
    private RecordServiceImpl recordService;
    //查询库房药品表
    //模糊查询selectpharmacy
    @RequestMapping("selectpharmacy")
    @ResponseBody
    public Object selectpharmacy(Pharmacy pharmacy,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<PharmacyVo> lists=pharmacyService.queryList(pharmacy);
        PageInfo pageInfo=new PageInfo(lists);
        Map<String,Object> map=new HashMap<>();
        //UI
        map.put("msg","");
        map.put("code",0);
        //分页
        //记录数("总记录数")
        map.put("count",pageInfo.getTotal());
        //列表(每页显示的数据)
        map.put("data",pageInfo.getList());
        return map;
    }
    //添加报缺单
    @RequestMapping("addbaoque")
    @ResponseBody
    public int addbaoque(Baoque baoque){
        //查询报缺单是否已经有此条药品
        Integer num = pharmacyService.selbaoqueName(baoque);
        if(num==0){
            //添加药品
            int addbaoque =pharmacyService.addbaoque(baoque);
            return addbaoque;
        }else {
            //修改药品数量
            int upnum= pharmacyService.upbaoquenum(baoque);
            return upnum;
        }
    }
    //删除药,回收到仓库
    @RequestMapping("delhuishou")
    @ResponseBody
    public int delhuishou(Integer huishouid, Jilu jilu){
        System.out.println(huishouid+"  "+jilu);
       int num=pharmacyService.delhuishou(huishouid);
       if(num==1){
           recordService.insert(jilu);
       }
        return num;
    }

    //查询药品仓库
    @RequestMapping("selecthuishou")
    @ResponseBody
    public Object selecthuishou(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Huishou> list=pharmacyService.queryList();
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        //UI JSON数组
        map.put("msg","");
        map.put("code",0);

        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //回收表删除
    @RequestMapping("delpharymary")
    public int delpharymary(Pharmacy pharmacy,Huishou huishou){
        int delpharymacy = pharmacyService.delpharymacy(pharmacy);
        if(delpharymacy==1){
            pharmacyService.addhuishou(huishou);
        }
        return delpharymacy;
    }
}

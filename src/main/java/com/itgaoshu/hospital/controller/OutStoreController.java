package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.service.impl.OutStoreServiceImpl;
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

    //根据报缺的药名找到对应的药品批次
    @RequestMapping("selbaoquedrugname")
    @ResponseBody
    public Object selbaoquedrugname(String drugstoreName){
        return "";
    }
    //如果输入的数量大于需要报缺的数量
    @RequestMapping("updatedrugnumber")
    @ResponseBody
    public Object updatedrugnumber(){
        return "";
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
    @RequestMapping("addpharmacy")
    @ResponseBody
    public Object addpharmacy(){
        return "";
    }

}

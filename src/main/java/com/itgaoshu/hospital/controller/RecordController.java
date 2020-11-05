package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Jilu;
import com.itgaoshu.hospital.service.impl.RecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("record")
public class RecordController {
    @Autowired
    private RecordServiceImpl recordService;

    @RequestMapping("selrecord")
    @ResponseBody
    public Object selrecord(Jilu jilu,Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Jilu> list=recordService.queryList(jilu);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }

}

package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Area;
import com.itgaoshu.hospital.bean.Warehuose;
import com.itgaoshu.hospital.service.impl.AreaServiceImpl;
import com.itgaoshu.hospital.service.impl.WareHuoseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ShuJuController {
    @Autowired
    private AreaServiceImpl areaService;
    @Autowired
    private WareHuoseServiceImpl wareHuoseService;
    @RequestMapping("toArea")
    public String toArea(){
        return "view/center/area";
    }
    @RequestMapping("toWarehuose")
    public String toWarehuose(){
        return "view/center/warehuose";
    }

    @RequestMapping("area/findAllArea")
    @ResponseBody
    public Object findAllArea(Integer page,Integer limit,Area area){
        PageHelper.startPage(page,limit);
        List<Area> list=areaService.findAllArea(area);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap<>();
        map.put("msg","");
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }
    @RequestMapping("area/deleteArea")
    @ResponseBody
    public Object deleteArea(Integer areaid){
        int num=areaService.deleteArea(areaid);
        if(num==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }
    @RequestMapping("area/addArea")
    @ResponseBody
    public Object addArea(Area area){
        int num=areaService.addArea(area);
        if(num==0){
            return "添加失败";
        }else{
            return "添加成功";
        }
    }

    @RequestMapping("warehouse/findAllWarehuose")
    @ResponseBody
    public Object findAllWarehuose(Integer page, Integer limit, Warehuose warehuose){
        PageHelper.startPage(page,limit);
        List<Warehuose> list=wareHuoseService.queryAllList(warehuose);
        PageInfo pageInfo=new PageInfo(list);
        Map<String,Object> map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("warehouse/deleteWarehuose")
    @ResponseBody
    public Object deleteWarehuose(int warehouseid){
        int num=wareHuoseService.deleteWarehuose(warehouseid);
        if(num==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }
    @RequestMapping("warehouse/addWarehuose")
    @ResponseBody
    public Object addWarehuose(Warehuose warehuose){
        int num=wareHuoseService.addWarehuose(warehuose);
        if(num==0){
            return "添加失败";
        }else{
            return "添加成功";
        }
    }
}

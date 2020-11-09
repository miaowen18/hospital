package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Area;
import com.itgaoshu.hospital.bean.Drugdictionary;
import com.itgaoshu.hospital.bean.Type;
import com.itgaoshu.hospital.bean.Unit;
import com.itgaoshu.hospital.service.DrugdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("drugdictionary")
public class DrugdictionaryController {

    @Autowired
    private DrugdictionaryService drugdictionaryService;

    @RequestMapping("findAllSdrugdictionary")
    @ResponseBody
    public Object SdrugdictionaryList(Drugdictionary drugdictionary, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Drugdictionary> listAll = drugdictionaryService.findAllSdrugdictionary(drugdictionary);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("addSdrugdictionary")
    @ResponseBody
    public Object addSdrugdictionary(Drugdictionary drugdictionary){
        int count = drugdictionaryService.count(drugdictionary);
        if(count==0){
            int i = drugdictionaryService.addSdrugdictionary(drugdictionary);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else {
            return drugdictionary.getDrugname()+"已存在";
        }
    }

    @RequestMapping("editSdrugdictionary")
    @ResponseBody
    public Object editSdrugdictionary(Drugdictionary drugdictionary){
        int i = drugdictionaryService.editSdrugdictionary(drugdictionary);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    @RequestMapping("deleteSdrugdictionary")
    @ResponseBody
    public Object deleteSdrugdictionary(Integer drugid){
        int i = drugdictionaryService.deleteSdrugdictionary(drugid);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping("findAllArea")
    @ResponseBody
    public Object findAllArea(){
        List<Area> allArea = drugdictionaryService.findAllArea();
        return allArea;
    }
    @RequestMapping("findAllType")
    @ResponseBody
    public Object findAllType(){
        List<Type> allType = drugdictionaryService.findAllType();
        return allType;
    }
    @RequestMapping("findAllUnit")
    @ResponseBody
    public Object findAllUnit(){
        List<Unit> allUnit = drugdictionaryService.findAllUnit();
        return allUnit;
    }
}

package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.bean.Skull;
import com.itgaoshu.hospital.bean.Upplier;
import com.itgaoshu.hospital.bean.Warehuose;
import com.itgaoshu.hospital.service.impl.StoreServiceImpl;
import com.itgaoshu.hospital.service.impl.WareHuoseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("dsnavigation")//仓库管理跳转页面
public class PathDrugstoreController {
    @Autowired
    private StoreServiceImpl storeService;
    @Autowired
    private WareHuoseServiceImpl wareHuoseService;

    //跳转到入库单页面
    @RequestMapping("beputinstorage")
    public Object beputinstorage(Warehuose warehuose,Model model){
        List<Upplier> list=storeService.queryList5();
        List<Skull> list1=storeService.queryList2();
        List<Warehuose> list2=wareHuoseService.queryAllList(warehuose);
        model.addAttribute("selupp",list);
        model.addAttribute("selsku",list1);
        model.addAttribute("selwar",list2);
        return "drugstore/c_beputinstorage";
    }
    //跳转到库存查询页面
    @RequestMapping("selectdurg")
    public Object selectdurg(){
        return "drugstore/c_selectDrug";
    }
    //跳转到出库单页面
    @RequestMapping("selectchuku")
    public Object selectchuku(){
        return "drugstore/c_gooutstore";
    }
    //跳转到库存不足页面
    @RequestMapping("selectless")
    public Object selectless(){
        return "drugstore/c_lackdrug";
    }
    //跳转到过期提醒页面
    @RequestMapping("seldrugDate")
    public Object seldrugDate(){
        return "drugstore/c_storedrugDate";
    }
    //跳转到药房详情页面
    @RequestMapping("pharymacyhtml")
    public Object pharymacyhtml(){
        return "drugstore/c_pharmacy";
    }
    //跳转到操作记录页面
    @RequestMapping("record")
    public Object record(){
        return "drugstore/c_record";
    }
    //跳转到药品回收页面
    @RequestMapping("recycle")
    public Object recycle(){
        return "drugstore/c_recycle";
    }


}

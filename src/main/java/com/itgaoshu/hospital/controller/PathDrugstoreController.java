package com.itgaoshu.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dsnavigation")//仓库管理跳转页面
public class PathDrugstoreController {
    //跳转到入库单页面
    @RequestMapping("beputinstorage")
    public Object beputinstorage(){
        return "drugstore/c_beputinstorage";
    }
    //跳转到库存查询页面
    @RequestMapping("selectdurg")
    public Object selectdurg(){
        return "liao/selNum";
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

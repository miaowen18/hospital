package com.itgaoshu.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("chuku")
public class OutStoreController {
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
    //数量过少的药品有哪些
    @RequestMapping("selbaoquedan")
    @ResponseBody
    public Object selbaoquedan(){
        return "";
    }
    @RequestMapping("addpharmacy")
    @ResponseBody
    public Object addpharmacy(){
        return "";
    }

}

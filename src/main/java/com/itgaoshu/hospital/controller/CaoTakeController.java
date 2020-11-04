package com.itgaoshu.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("caotake")
public class CaoTakeController {

    @RequestMapping("seltake")
    @ResponseBody//转取药页面
    public Object seltake(){
        return "cao/Cquyao";
    }
    @RequestMapping("tselpreson")
    @ResponseBody
    public Object tselpreson(Integer page,Integer limit){

        return "";
    }
}

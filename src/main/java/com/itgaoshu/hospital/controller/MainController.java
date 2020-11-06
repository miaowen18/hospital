package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping("one")
    @ResponseBody
    public List<Doctor> one(){
        List<Doctor> data = mainService.one();
        return data;
    }

    @RequestMapping("two")
    @ResponseBody
    public List<Doctor> two(){
        List<Doctor> data = mainService.two();
        return data;
    }

    @RequestMapping("three")
    @ResponseBody
    public List<Doctor> three(){
        List<Doctor> data = mainService.three();
        return data;
    }

    @RequestMapping("four")
    @ResponseBody
    public List<Doctor> four(){
        List<Doctor> data = mainService.four();
        return data;
    }

    @RequestMapping("five")
    @ResponseBody
    public List<Doctor> five(){
        List<Doctor> data = mainService.five();
        return data;
    }

    @RequestMapping("six")
    @ResponseBody
    public List<Doctor> six(){
        List<Doctor> data = mainService.six();
        return data;
    }

    @RequestMapping("seven")
    @ResponseBody
    public List<Doctor> seven(){
        List<Doctor> data = mainService.seven();
        return data;
    }

    @RequestMapping("zhuyuanTotal")
    @ResponseBody
    public int zhuyuanTotal(){
        int data = mainService.zhuyuanTotal();
        return data;
    }

    @RequestMapping("currentZhuYuan")
    @ResponseBody
    public int currentZhuYuan(){
        int data = mainService.currentZhuYuan();
        return data;
    }

    @RequestMapping("currentNum")
    @ResponseBody
    public int currentNum(){
        int data = mainService.currentNum();
        return data;
    }
    @RequestMapping("Total")
    @ResponseBody
    public int Total(){
        int data = mainService.Total();
        return data;
    }

}
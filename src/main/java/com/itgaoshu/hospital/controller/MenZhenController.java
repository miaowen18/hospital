package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.service.MenZhenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("caotake")
public class MenZhenController {
    @Autowired
    private MenZhenService menZhenService;

    @RequestMapping("selhuan")
    @ResponseBody
    public Object selhuan(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Report> selhuan = menZhenService.selectReportByState();
        PageInfo pageInfo = new PageInfo(selhuan);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("haun")
    public String tiaoZhuan1(){
        return "cao/chuanzhe";
    }

    @RequestMapping("seltake")//转取药页面
    public String seltake(){
        return "cao/Cquyao";
    }

    @RequestMapping("tselpreson")
    @ResponseBody
    public Object tselpreson(Integer page,Integer limit){
        PageHelper.startPage(page, limit);
        List<Report> list = menZhenService.selectReportByState();
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> map= new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }
}

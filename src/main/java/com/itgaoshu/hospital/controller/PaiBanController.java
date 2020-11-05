package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Paiban;
import com.itgaoshu.hospital.bean.Register;
import com.itgaoshu.hospital.service.PaiBanService;
import com.itgaoshu.hospital.service.ZhuYuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PaiBanController {
    @Autowired
    private PaiBanService paiBanService;
    @RequestMapping("toPaiban")
    public String tiao(){
        return "view/center/paiban";
    }

    //查询门诊传过来的信息
    @RequestMapping("paiban/findAllPaiban")
    @ResponseBody
    public Object select2(int page, int limit, Paiban paiban){
        //分页查询
        PageHelper.startPage(page,limit);
        List<Paiban> selreg=paiBanService.selectByExample(paiban);
        //把查到的信息放入分页插件中
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        //把数据返回到layui中
        return tableData;
    }
}

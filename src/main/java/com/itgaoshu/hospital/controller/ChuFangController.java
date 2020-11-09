package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Cashier;

import com.itgaoshu.hospital.service.impl.CashierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("caocc")
public class ChuFangController {
    @Autowired
    private CashierServiceImpl cashierService;

    @RequestMapping("selpepi")
    @ResponseBody
    public Object selpepi(Integer reportid,Integer page,Integer limit){
        PageHelper.startPage(page, limit);
        List<Cashier> list = cashierService.queryList(reportid);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        map.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        map.put("data", pageInfo.getList());
        return map;
    }
}

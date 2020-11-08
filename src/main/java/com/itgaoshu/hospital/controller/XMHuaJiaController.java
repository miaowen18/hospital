package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Cashier;
import com.itgaoshu.hospital.bean.Outpatienttype;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.service.XMHuaJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("caoout")
public class XMHuaJiaController {
    @Autowired
    private XMHuaJiaService xmHuaJiaService;

    @RequestMapping("xiang")
    public Object xiang(Model model){
        return  "cao/Cxiangmu";
    }

    @RequestMapping("selout")
    @ResponseBody
    public Object seldrug(Outpatienttype outpatienttype, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Pharmacy> selout = xmHuaJiaService.selout(outpatienttype);
        PageInfo pageInfo = new PageInfo(selout);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("addchuo")
    @ResponseBody
    public Object addchuo(Cashier cashier, Integer ostate){
        cashier.setOstate(ostate);
        Integer addchuo = xmHuaJiaService.addchuo(cashier);
        return addchuo;
    }

    @RequestMapping("delo")
    @ResponseBody
    public Object del(Cashier cashier){
        Integer del = xmHuaJiaService.delo(cashier);
        if(del==0){
            return "删除失败";
        }else{
            return "删除成功";
        }
    }

    @RequestMapping("selch")
    @ResponseBody
    public Object selch(Cashier cashier){
        Double selch = xmHuaJiaService.selch(cashier);
        return selch;
    }

    @RequestMapping("out")
    public Object look(Model model){
        return  "cao/Ctoll";
    }

    @RequestMapping("shoufei")
    @ResponseBody
    public Object shoufei(Report report){
        Integer shoufei = xmHuaJiaService.shoufei(report);
        //把挂号费添加到收费表上
        Integer guafei = xmHuaJiaService.guafei(report);
        return  shoufei;
    }
}

package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Baoque;
import com.itgaoshu.hospital.bean.Huishou;
import com.itgaoshu.hospital.bean.Pharmacy;
import com.itgaoshu.hospital.bean.PharmacyVo;
import com.itgaoshu.hospital.mapper.PharmacyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("pharmacy")
public class PharmacyController {
    @Autowired
    private PharmacyMapper pharmacyMapper;
    //查询库房药品表
    //模糊查询selecthuishou
    @RequestMapping("selectpharmacy")
    @ResponseBody
    public Object selectpharmacy(Pharmacy pharmacy,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<PharmacyVo> lists=pharmacyMapper.queryList(pharmacy);
        PageInfo pageInfo=new PageInfo(lists);
        Map<String,Object> map=new HashMap<>();
        //UI
        map.put("msg","");
        map.put("code",0);
        //分页
        //记录数("总记录数")
        map.put("count",pageInfo.getTotal());
        //列表(每页显示的数据)
        map.put("data",pageInfo.getList());
        return map;
    }
    //添加报缺单
    @RequestMapping("addbaoque")
    @ResponseBody
    public int addbaoque(Baoque baoque){
        //查询是否补足
        //补足:添加药品
        //没补足:修改药品数量
        return 0;
    }
    //删除药,回收到仓库
    @RequestMapping("delhuishou")
    public int delhuishou(Huishou huishou){
        return 0;
    }

    //查询药品仓库
    @RequestMapping("selecthuishou")
    public Object selecthuishou(Integer page,Integer limit){

        return "";
    }
    //回收表删除
    @RequestMapping("delpharymary")
    public int delpharymary(){
        return 0;
    }
}

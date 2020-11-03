package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    //查询所有从库房调过来的药品
    @RequestMapping("selectpharmacy")
    @ResponseBody
    public Object queryList(Pharmacy pharmacy,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<PharmacyVo> lists=pharmacyMapper.queryList(pharmacy);
        PageInfo pageInfo=new PageInfo(lists);
        Map<String,Object> map=new HashMap<>();
        //uI
        map.put("msg","");
        map.put("code",0);

        //分页
        //记录数("总记录数")
        map.put("count",pageInfo.getTotal());
        //列表(每页显示的数据)
        map.put("data",pageInfo.getList());

        return map;
    }
}

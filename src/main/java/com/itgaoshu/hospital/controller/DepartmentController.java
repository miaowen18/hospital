package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("departmentList")
    @ResponseBody
    public Object DepartmentList(Departments departments, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Departments> listAll = departmentService.departmentList(departments);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("deleteDepartment")
    @ResponseBody
    public Object deleteDepartment(Integer departmentId){
        int i = departmentService.deleteDepartment(departmentId);
        if(i==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping("addDepartment")
    @ResponseBody
    public Object addDepartment(Departments departments){
        int count = departmentService.count(departments);
        if(count==0){
            int i = departmentService.addDepartment(departments);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return departments.getDepartment()+"已存在";
        }
    }


}

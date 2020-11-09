package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.bean.Paiban;
import com.itgaoshu.hospital.bean.Registeredtype;
import com.itgaoshu.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping("doctorList")
    @ResponseBody
    public Object doctorList(Doctor doctor, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Doctor> listAll = doctorService.doctorList(doctor);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        tableData.put("code", 0);
        tableData.put("msg", "");
        tableData.put("count", pageInfo.getTotal());
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    @RequestMapping("deleteDoctor")
    @ResponseBody
    public Object deleteDoctor(Integer doctorId){
        int i1 = doctorService.checkCount(doctorId);
        if(i1>0){
            return "该医生还有病人";
        }else{
            int i = doctorService.deleteDoctor(doctorId);
            if(i==1){
                return "删除成功";
            }else{
                return "删除失败";
            }
        }
    }

    @RequestMapping("addDoctor")
    @ResponseBody
    public Object addDoctor(Doctor doctor, Paiban paiban){
        int count = doctorService.count(doctor);
        if(count==0){
            int i = doctorService.addDoctor(doctor);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return doctor.getDoctorName()+"已存在";
        }
    }

    @RequestMapping("editDoctor")
    @ResponseBody
    public Object editDoctor(Doctor doctor){
        int i = doctorService.editDoctor(doctor);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    @RequestMapping("findAllDepartments")
    @ResponseBody
    public Object findAllDepartments(){
        List<Departments> allDepartments = doctorService.findAllDepartments();
        return allDepartments;
    }

    @RequestMapping("findAllRegisteredtype")
    @ResponseBody
    public Object findAllRegisteredtype(){
        List<Registeredtype> allRegisteredtype = doctorService.findAllRegisteredtype();
        return allRegisteredtype;
    }
}

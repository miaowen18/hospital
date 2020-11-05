package com.itgaoshu.hospital.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.hospital.bean.Register;
import com.itgaoshu.hospital.service.ZhuYuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ZhuYuanController {
    @Autowired
    private ZhuYuanService zhuYuanService;

    @RequestMapping("liao/admin")
    public String inadmin(){
        return "liao/admin";
    }
    @RequestMapping("liao/pay")
    public String inpay(){
        return "liao/pay";
    }
    @RequestMapping("liao/drug")
    public String indrug(){
        return "liao/drug";
    }
    @RequestMapping("liao/item")
    public String initem(){
        return "liao/item";
    }
    @RequestMapping("liao/leave")
    public String inleave(){
        return "liao/leave";
    }
    @RequestMapping("liao/pharmacy")
    public String pharmacy(){
        return "liao/pharmacy";
    }

    //查询患者信息
    @RequestMapping("liao/selRegister")
    @ResponseBody
    public Object select(int page,int limit,Register register){
        register.setState(0);
        //分页查询
        PageHelper.startPage(page,limit);
        //查询未出院的患者信息
        List<Register> selreg=zhuYuanService.select(register);
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
    //查询门诊传过来的信息
    @RequestMapping("liao/selDoor")
    @ResponseBody
    public Object select2(int page,int limit){
        //分页查询
        PageHelper.startPage(page,limit);
        //查询未出院的患者信息
        List<Register> selreg=zhuYuanService.select2();
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
    //增加患者
    @RequestMapping("liao/addRegister")
    @ResponseBody
    public Object insert(Register register){
        System.out.println(register);
        if(zhuYuanService.select(register)!=null){
            return "患者已存在";
        }
        int result=zhuYuanService.insert(register);
        if(result>0){
            //把入院的患者从门诊库中删除
            int r=zhuYuanService.deleteByPrimaryKey(register.getRegisterid());
            return "添加成功";
        }else{
            return "添加失败";
        }
    }
    //科室下拉框
    @RequestMapping("liao/selDepartment")
    @ResponseBody
    public Object select3(){
        return zhuYuanService.select3();
    }
    //医生下拉框
    @RequestMapping("liao/selDoctor")
    @ResponseBody
    public Object select4(Integer departmentId){
        return zhuYuanService.select4(departmentId);
    }
    //床位下拉框
    @RequestMapping("liao/selBed")
    @ResponseBody
    public Object select5(Integer departmentId){
        return zhuYuanService.select5(departmentId);
    }
    //医保下拉框
    @RequestMapping("liao/selDis")
    @ResponseBody
    public Object select6(){
        return zhuYuanService.select6();
    }

    //换科室
    @RequestMapping("")
    @ResponseBody
    public Object update(){
        return 45;
    }
    //查询已出院的患者信息
    @RequestMapping("liao/selRegisters")
    @ResponseBody
    public Object select7(int page,int limit,String userNames){
        //分页查询
        PageHelper.startPage(page,limit);
        Register register=new Register();
        register.setState(1);
        register.setUserName(userNames);
        List<Register> selreg=zhuYuanService.select(register);
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
    //查询要结算的患者信息
    @RequestMapping("liao/selPay")
    @ResponseBody
    public Object select8(Integer registerid){

        Register register=new Register();
        register.setRegisterid(registerid);
        register.setState(0);

        return zhuYuanService.select(register);
    }


}

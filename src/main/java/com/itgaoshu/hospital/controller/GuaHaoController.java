package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.bean.Departments;
import com.itgaoshu.hospital.bean.Doctor;
import com.itgaoshu.hospital.bean.Registeredtype;
import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.service.GuaHaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("cao")
public class GuaHaoController {
    @Autowired
    private GuaHaoService guaHaoService;

    @RequestMapping("index")
    public Object GuaHao(Report report, Model model, String params, Integer cc, HttpServletRequest request){
        report.setCc(cc);
        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("ban",cc);
        guaHaoService.updateState();
        String reportName=params;
        report.setReportName(reportName);
        List<Report> select = guaHaoService.select(report);
        model.addAttribute("report",select);
        return "cao/report";
    }

    @RequestMapping("seldoctor")
    @ResponseBody
    public Object seldoctor(Doctor doctor){
        Calendar calendar = Calendar.getInstance();
        Integer data=calendar.get(Calendar.DAY_OF_WEEK)-1;//获取当前是星期几
        if(data==1){
            List<Report> one = guaHaoService.one(doctor);
            return one;
        }else if(data==2){
            List<Report> two = guaHaoService.two(doctor);
            return two;
        }else if(data==3){
            List<Report> three = guaHaoService.three(doctor);
            return three;
        }else if(data==4){
            List<Report> four = guaHaoService.four(doctor);
            return four;
        }else if(data==5){
            System.out.println(data);
            List<Report> five = guaHaoService.five(doctor);
            return five;
        }else if(data==6){
            List<Report> six = guaHaoService.six(doctor);
            return six;
        }else{
            List<Report> seven = guaHaoService.seven(doctor);
            return seven;
        }
    }

    @RequestMapping("/selreg")
    @ResponseBody
    public Object selreg(){
        List<Registeredtype> selreg = guaHaoService.selreg();
        return selreg;
    }

    @RequestMapping("seltymo")
    @ResponseBody
    public Object seltymo(Registeredtype registeredtype){
        Integer seltymo = guaHaoService.seltymo(registeredtype);
        return seltymo;
    }

    @RequestMapping("seldep")
    @ResponseBody
    public Object seldep(){
        List<Departments> seldep = guaHaoService.seldep();
        return  seldep;
    }

    @RequestMapping("addre")
    @ResponseBody
    public Object addre(Report report){
        int addre = guaHaoService.addre(report);
        if(addre==1){
            return "添加成功";
        }else{
            return "添加失败，阿巴阿巴阿巴";
        }

    }

    @RequestMapping("phone")
    @ResponseBody
    public Object phone(Report report){
        int carid = guaHaoService.carid(report);
        int phone = guaHaoService.phone(report);
        if(carid>=1){
            return 2;
        }else if(phone>=1){
            return 1;
        }else{
            return 3;
        }
    }

    @RequestMapping("delre")
    @ResponseBody
    public Object delre(Integer id){
        int delre = guaHaoService.delre(id);
        if(delre==1){
            return  "删除成功";
        }else{
            return  "删除失败";
        }
    }

    @RequestMapping("zhuanyuan")
    @ResponseBody
    public Object zhuanyuan(Integer id,Report report,String zhuan){
        report.setReportId(id);
        report.setZhuan(zhuan);
        Integer zhuanyuan = guaHaoService.zhuanyuan(report);
        return zhuanyuan;
    }
}

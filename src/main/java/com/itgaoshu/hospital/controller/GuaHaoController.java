package com.itgaoshu.hospital.controller;

import com.itgaoshu.hospital.bean.Report;
import com.itgaoshu.hospital.service.GuaHaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("cao")
public class GuaHaoController {
    @Autowired
    private GuaHaoService guaHaoService;

    @RequestMapping("index")
    @ResponseBody
    public String GuaHao(Report report, Model model, String params, Integer cc, HttpServletRequest request){
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
}

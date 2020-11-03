package com.itgaoshu.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sel")
public class MenuController {

    @RequestMapping("toLogin")
    public String toLogin(){
        return "view/login";
    }
}
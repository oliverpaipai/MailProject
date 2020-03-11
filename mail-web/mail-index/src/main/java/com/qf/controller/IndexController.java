package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {





    @RequestMapping("ok")
    @ResponseBody
    public String showIndex() {


        return "test";
    }





}

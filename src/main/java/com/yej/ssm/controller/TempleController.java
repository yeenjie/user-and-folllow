package com.yej.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempleController {
    @RequestMapping("jump")
    public String jump(){
        return "addUser";
    }
}

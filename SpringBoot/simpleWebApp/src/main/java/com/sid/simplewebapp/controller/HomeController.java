package com.sid.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "Welcome to Simple Web App";
    }

    @RequestMapping("/about")
    public String about(){
        return "about section body called here";
    }
}

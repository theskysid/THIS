package com.theskysid.firstspringmvcproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

  @RequestMapping
   public String message(){
      return "home";
   }

}

package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //will give priority to desktop
public class Desktop implements Computer {

    public void compile(){

        System.out.println("Compiling with 404 bugs on desktop..");

    }
}

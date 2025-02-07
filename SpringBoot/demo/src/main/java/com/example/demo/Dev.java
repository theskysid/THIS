package com.example.demo;

import org.springframework.stereotype.Component;

@Component //telling spring that it is maintained by spring to user
public class Dev {


    public void build(){
        System.out.println("Working on awesome project");
    }

}

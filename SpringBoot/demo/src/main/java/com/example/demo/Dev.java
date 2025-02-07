package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //telling spring that it is maintained by spring to user
public class Dev {

    @Autowired //field injection
    @Qualifier("laptop")//giving priority to laptop
    private Computer comp;

    //constructer injection
//    public Dev(laptop laptop) {
//        this.laptop = laptop;
//    }

    //setter injection
//    @Autowired
//    public void setLaptop(laptop laptop) {
//        this.laptop = laptop;
//    }


    //for construcer injection no need of autowired but for field and setter injection we have to autowire the shit

    public void build(){

        comp.compile();

        System.out.println("Working on awesome project");
    }

}

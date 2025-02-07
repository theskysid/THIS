package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);//creates container in the jvm

        // Dev obj = new Dev(); //manually creating a object in the jvm outide the IOC container(spring  container).... its our responsibility to maintain this object...

        Dev obj = context.getBean(Dev.class); //spring injection

        obj.build();

    }

}

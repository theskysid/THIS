package com.theskysid.cardealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class CarDealerApplication {

    public static void main(String[] args) {

        // SpringApplication.run(CarDealerApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Scanner sc = new Scanner(System.in);

        //here what we are doing is that we are asking spring to bring us the bean that we need ... using id
        //we are matching the id of the bean in the context object of ApplicationContext.xml
        System.out.println("Choose your car\n1. Family Car\n2. Sports Car\n3. Cyber Truck\n");
        int userSelect = sc.nextInt();

        String beanId = "";
        switch (userSelect) {
            case 1:
                beanId = "family";
                break;
            case 2:
                beanId = "sports";
                break;
            case 3:
                beanId = "cyber";
                break;
        }
        Car car1 = (Car) context.getBean(beanId);
        car1.defaultmessage();
    }
}

package com.theskysid.laptopdealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class LaptopDealerApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LaptopDealerApplication.class, args);


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Scanner sc =  new Scanner(System.in);

        System.out.println("Choose the brand you want to buy\n1. HP\n2. Asus\n3. Dell");
        int choice = sc.nextInt();

        System.out.println("Choose the processor for your laptop\n1. i3\n2. i5\n3. i7");
        int processor = sc.nextInt();

        String beanId = "";

        switch (choice) {
            case 1:
                switch (processor) {
                    case 1:
                        beanId = "hpwithi3";
                        break;
                    case 2:
                        beanId = "hpwithi5";
                        break;
                    case 3:
                        beanId = "hpwithi7";
                        break;
                }
                break;
            case 2:
                switch (processor) {
                    case 1:
                        beanId = "Asuswithi3";
                        break;
                    case 2:
                        beanId = "Asuswithi5";
                        break;
                    case 3:
                        beanId = "Asuswithi7";
                        break;
                }
                break;
            case 3:
                switch (processor) {
                    case 1:
                        beanId = "dellwithi3";
                        break;
                    case 2:
                        beanId = "dellwithi5";
                        break;
                    case 3:
                        beanId = "dellwithi7";
                        break;

                }
                break;
        }

        Brand laptop = (Brand) context.getBean(beanId);
        laptop.showDetails();
    }

}

package com.theskysid.diusingannotation_stage4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class DIusingAnnotationStage4Application {

   public static void main(String[] args) {

      //SpringApplication.run(DIusingAnnotationStage4Application.class, args);

      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.theskysid.diusingannotation_stage4");
      Scanner sc= new Scanner(System.in);

      System.out.println("Choose\n1. Btech\n2. MBA");
      int userSelect =  sc.nextInt();
      String userSelected = "";
      switch (userSelect) {
         case 1:
            userSelected = "btech";
            break;
         case 2:
            userSelected = "mba";
            break;
      }
      Student student = (Student) context.getBean(userSelected);
      StudentInfo si = context.getBean(StudentInfo.class); //does the same as above but takes the class name as parameter
      si.student = student;
      si.showDetails();
   }

}

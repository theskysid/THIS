package com.theskysid.diusingannotationexplanation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DIusingAnnotationExplanationApplication {

   public static void main(String[] args) {
      //SpringApplication.run(DIusingAnnotationExplanationApplication.class, args);
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.theskysid.diusingannotationexplanation");
      StudentInfo studentInfo= (StudentInfo) context.getBean("studentinfo");
      studentInfo.showDetails();

   }
}

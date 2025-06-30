package com.theskysid.diusingannotationexplanation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("studentinfo")
public class StudentInfo {

   @Autowired
   Student student;
   //here autowiring goes straight to the component that implements the Student Interface - as ScienceStudent

   //ScienceStudent student;
   //this also works and also give the bean because here we are directly connecting it to the ScienceStudent

   public void showDetails(){
      System.out.println(student.College());
   }
}

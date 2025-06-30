package com.theskysid.diusingannotationexplanation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("studentinfo")
public class StudentInfo {

   @Autowired
   @Qualifier("science") //this will return the designated qualifier bean to the main...
   Student student;
   //if we don't qualify the same components that implements the student interface it will give errors

   public void showDetails(){
      System.out.println(student.College());
   }
}

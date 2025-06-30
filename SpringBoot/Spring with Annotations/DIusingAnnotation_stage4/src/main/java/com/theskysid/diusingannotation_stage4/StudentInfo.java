package com.theskysid.diusingannotation_stage4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentInfo {

   Student student;

   public void showDetails(){
      System.out.println(student.college());
   }

}

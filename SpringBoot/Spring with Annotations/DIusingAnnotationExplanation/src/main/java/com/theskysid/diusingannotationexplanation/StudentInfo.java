package com.theskysid.diusingannotationexplanation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("studentinfo")
public class StudentInfo {

   // This field-level injection tells Spring to inject a suitable 'Student' bean.
   // It removes the need for manual constructor/setter-based injection.
   // The 'Student' bean must also be a component in the scanned package.
   @Autowired
   Student student;

   // Uses the injected Student object to call its business logic.
   public void showDetails(){
      System.out.println(student.College());
   }
}

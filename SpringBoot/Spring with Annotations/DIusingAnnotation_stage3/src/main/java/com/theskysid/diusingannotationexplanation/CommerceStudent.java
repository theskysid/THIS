package com.theskysid.diusingannotationexplanation;

import org.springframework.stereotype.Component;

@Component("commerce")
public class CommerceStudent implements  Student {

   @Override
   public String College() {
      return "i am a commerce student from ABES EC";
   }
}

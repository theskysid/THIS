package com.theskysid.diusingannotationexplanation;

import org.springframework.stereotype.Component;

@Component
public class ScienceStudent implements  Student {

   @Override
   public String College() {
      return "I am Science Student from ABES EC";
   }
}

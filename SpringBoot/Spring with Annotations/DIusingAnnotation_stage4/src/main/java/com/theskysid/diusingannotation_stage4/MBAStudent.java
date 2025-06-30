package com.theskysid.diusingannotation_stage4;

import org.springframework.stereotype.Component;

@Component("mba")
public class MBAStudent implements Student {

   @Override
   public String college() {
      return "I am a MBA Student from ABES Engineering College";
   }
}

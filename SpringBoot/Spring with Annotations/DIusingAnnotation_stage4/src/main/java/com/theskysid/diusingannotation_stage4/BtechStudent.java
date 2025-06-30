package com.theskysid.diusingannotation_stage4;

import org.springframework.stereotype.Component;

@Component("btech")
public class BtechStudent implements Student {

   @Override
   public String college() {
      return "I am a Btech Student from ABES Engineering College";
   }
}

package com.theskysid.votingapplication;

import org.springframework.stereotype.Component;

@Component("republic")
public class Republic implements PoliticalParty {
   private String partyName = "Republic";

   @Override
   public String getPartyName() {
      return partyName;
   }
}

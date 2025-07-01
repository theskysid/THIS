package com.theskysid.votingapplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("democratic")
public class Democratic implements PoliticalParty {

   private String partyName = "Democratic";

   @Override
    public String getPartyName() {
      return partyName;
   }
}

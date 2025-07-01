package com.theskysid.votingapplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class SimpleUser implements User {

   String username;
   PoliticalParty politicalParty;

   @Override
   public void setUsername(String username) {
      this.username = username;
   }

   @Override
   public String getUsername() {
      return this.username;
   }

   @Override
   public void setPoliticalParty(PoliticalParty politicalParty) {
      this.politicalParty = politicalParty;
   }

   @Override
   public PoliticalParty getPoliticalParty() {
      return politicalParty;
   }
}

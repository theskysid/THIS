package com.theskysid.votingapplication;

public interface User {

   void setUsername(String username);
   String getUsername();

  void setPoliticalParty(PoliticalParty politicalParty);
  PoliticalParty getPoliticalParty();

}

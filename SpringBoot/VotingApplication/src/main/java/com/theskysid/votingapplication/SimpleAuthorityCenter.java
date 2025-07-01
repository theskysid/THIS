package com.theskysid.votingapplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("simpleauthoritycenter")
public class SimpleAuthorityCenter implements AuthorityCenter {

   @PostConstruct //this is for init method that we do in spring
   public void init(){
      System.out.println("Database connection successfull");
   }

   @PreDestroy //same as destroy-method in spring
   public void destroy(){
      System.out.println("Voting has been closed");
   }

   @Autowired
   UsersList usersList;


   @Override
   public UsersList getUserList() {
      return this.usersList;
   }
}

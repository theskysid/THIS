package com.theskysid.votingapplication;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("userslist")
public class SimpleUserList implements UsersList {

   List<User> listOfUsers;

   public SimpleUserList() {
      this.listOfUsers = new ArrayList<User>();
   }

   @Override
   public void adduser(User user) {
      listOfUsers.add(user);
   }

   @Override
   public List<User> getusers() {
      return this.listOfUsers; //why not listOfUser
   }
}

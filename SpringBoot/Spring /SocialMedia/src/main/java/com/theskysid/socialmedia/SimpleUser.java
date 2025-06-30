package com.theskysid.socialmedia;

// It defines how a user actually works (stores name and posts).
public class SimpleUser implements User {

   // This variable stores the name of the user.
   String username;

   // This variable holds the list of posts created by the user.
   PostList postList;

   public void init(){
      System.out.println("DB Connection successful");
   }

   public void destroy(){
      System.out.println("context object closed once it is closed it has to be openend once again");
   }

   // This method sets the user's name.
   @Override
   public void setUsername(String username) {
      this.username = username;
   }

   // This method returns the user's name.
   @Override
   public String getUsername() {
      return this.username;
   }

   // This method sets the user's post list (all their posts).
   @Override
   public void setPostList(PostList postList) {
      this.postList = postList;
   }

   // This method returns the user's post list.
   @Override
   public PostList getPostList() {
      return this.postList;
   }
}

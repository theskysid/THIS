package com.theskysid.socialmedia;

// It defines what a user should be able to do on the social media app.
public interface User {

   // Set the username of the user.
   void setUsername(String username);

   // Get (return) the username of the user.
   String getUsername();

   // Set the list of posts that belong to the user.
   void setPostList(PostList postList);

   // Get (return) the user's list of posts.
   PostList getPostList();
}

package com.theskysid.socialmedia;

import java.util.ArrayList;
import java.util.List;

// This class is used to store all the posts created by a user.
public class SimplePostList implements PostList {

   // A list that holds all the posts created by the user.
   private List<Post> listOfPosts;

   // Default constructor — required by Spring for bean creation.
   // Without this, Spring can't create this class from XML configuration.
   public SimplePostList() {
      this.listOfPosts = new ArrayList<>();
   }

   // Constructor that accepts a predefined list of posts.
   public SimplePostList(List<Post> posts) {
      this.listOfPosts = posts;
   }

   // Adds a post to the user's list of posts.
   @Override
   public void setPost(Post post) {
      listOfPosts.add(post);
   }

   // Returns all posts in the list.
   @Override
   public List<Post> getAllPosts() {
      return this.listOfPosts;
   }
}

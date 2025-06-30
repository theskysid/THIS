package com.theskysid.socialmedia;

import java.util.List;

// It is meant for handling a list of posts (like a post collection on a user's profile).
public interface PostList {

   // This method adds a post to the list.
   void setPost(Post post);

   // This method returns the list of all posts added so far.
   List<Post> getAllPosts();
}

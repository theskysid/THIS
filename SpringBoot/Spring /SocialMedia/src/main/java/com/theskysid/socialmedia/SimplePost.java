package com.theskysid.socialmedia;

// This class SimplePost is the actual working version of a Post.
// It follows the Post interface and gives real code for setMessage and getMessage.
public class SimplePost implements Post {

   // This variable stores the content/message of the post.
   String message;

   // This method sets (stores) the message in the post.
   @Override
   public void setMessage(String message) {
      this.message = message;
   }

   // This method returns (shows) the message stored in the post.
   @Override
   public String getMessage() {
      return this.message;
   }
}

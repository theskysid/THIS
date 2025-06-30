package com.theskysid.socialmedia;

// must have these two methods: setMessage() and getMessage().
public interface Post {

   // This method is used to set the post's message (like writing a post).
   void setMessage(String message);

   // This method is used to get the message that was set (like reading the post).
   String getMessage();
}

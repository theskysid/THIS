package com.theskysid.socialmedia;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class SocialMediaApplication {

   public static void main(String[] args) {

      // Load Spring configuration from ApplicationContext.xml
      ClassPathXmlApplicationContext contextObject = new ClassPathXmlApplicationContext("ApplicationContext.xml");

      Scanner sc  = new Scanner(System.in);

      // Get the 'user' bean from Spring container
      User user = (User) contextObject.getBean("user");

      // Ask for the user's name
      System.out.println("Please enter your username:\n");
      String username = sc.nextLine();
      user.setUsername(username); // Set the username

      // Get the 'postList' bean from Spring (used to store posts)
      PostList postList = (PostList) contextObject.getBean("postList");

      while (true) {
         System.out.println("Choose from below\n1. Create a post\n2. See all your post\n3. Exit");
         int userSelection = sc.nextInt();
         sc.nextLine(); // Consume leftover newline character

         switch (userSelection) {
            case 1:
               // Create a new post object
               Post post = (Post) contextObject.getBean("post");

               // Ask for post content
               System.out.println("Write your post message:");
               String msg = sc.nextLine();

               // Set the message to the post
               post.setMessage(msg);

               // Add post to the post list
               postList.setPost(post);

               // Assign this post list to the user this links the list to that user
               user.setPostList(postList);
               break;

            case 2:
               // Print all posts made by the user
               postList.getAllPosts().forEach(item -> System.out.println(item.getMessage()));
               break;
            case 3:
               contextObject.close();
         }
      }
   }
}

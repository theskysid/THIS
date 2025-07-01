package com.theskysid.votingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class VotingApplication {

   public static void main(String[] args) {
      //SpringApplication.run(VotingApplication.class, args);

      AnnotationConfigApplicationContext contextObject = new AnnotationConfigApplicationContext("com.theskysid.votingapplication");
      Scanner sc =  new Scanner(System.in);

      System.out.println("Voting Application Started");

      //auhtority bean
      AuthorityCenter authorityCenter = (AuthorityCenter) contextObject.getBean("simpleauthoritycenter");
      while (true) {

         System.out.println("New Vote Initialized");

      System.out.println("Choose from below : \n1. I want to vote\n2. See Votes(ADMIN ONLY PANEL IN FUTURE)");
      int userSelection = sc.nextInt();
      String beanID = "";

      switch (userSelection) {
         case 1:

            sc.nextLine();
            System.out.println("Enter Username : ");
            String username = sc.next();


            //User user = contextObject.getBean(User.class); //gets the bean of the user class
            User user = (User) contextObject.getBean("user");
            user.setUsername(username);


            System.out.println("Choose the party you want to vote: \n1. Democratic\n2. Independent\n3. Republic");
            int userParty = sc.nextInt();

            switch (userParty) {
               case 1:
                  beanID = "democratic";
                  break;
               case 2:
                  beanID = "independent";
                  break;
               case 3:
                  beanID = "republic";
                  break;
            }

            PoliticalParty politicalParty = (PoliticalParty) contextObject.getBean(beanID);
            user.setPoliticalParty(politicalParty);

            UsersList usersList = (UsersList) contextObject.getBean("userslist");
            usersList.adduser(user);

            System.out.println("Thank you for voting :)");
            System.out.println();
            break;
         case 2:
            authorityCenter.getUserList().getusers().forEach(item -> System.out.println(item.getUsername() + " voted for " + item.getPoliticalParty().getPartyName()));
            contextObject.close();
            System.out.println();1
            break;
      }
      }
   }

}

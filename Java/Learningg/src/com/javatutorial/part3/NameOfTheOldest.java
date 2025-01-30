package com.javatutorial.part3;

import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String oldestName = ""; //flag to store the name
            int maxAge = -1; // initializing to a value less than any valid age


            while(true) {
                String data = sc.nextLine();
                if (data.isEmpty()) {
                    break;
                }

                // Split the input into name and age
                String[] parts = data.split(",");
                String name  = parts[0];
                int age = Integer.valueOf(parts[1]); //vse to Integer.valueof object banata h but java usko automatically primary int m convert kr deta h

                //finding the oldest one
                if (age>maxAge){
                    maxAge = age;
                    oldestName = name;
                }

            }
            System.out.println("Name of the oldest: " + oldestName);
    }
}

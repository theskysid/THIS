package com.javatutorial.part3;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String largestName = "";
        double average = 0;
        int length = -1;
        int count  = 0;
        int sumOfBirthyear = 0;
        while(true) {
            String data = sc.nextLine();
            if (data.isEmpty()) {
                break;
            }
            count++;
            // Split the input into name and age
            String[] parts = data.split(",");

            String name  = parts[0];
            int nameLenght = name.length();

            int birthyear = Integer.valueOf(parts[1]); //vse to Integer.valueof object banata h but java usko automatically primary int m convert kr deta h
            sumOfBirthyear = sumOfBirthyear + birthyear;

            if (nameLenght>length){
                length = nameLenght;
                largestName = name;
            }

        }
        average = (double) sumOfBirthyear / count;
        System.out.println("Longest name:"+ largestName);
        System.out.println("Average of the birth years is : "+ average);
    }
}

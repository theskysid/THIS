package com.javatutorial.part1;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String characterName = sc.nextLine();
        System.out.println("What is their job?");
        String job = sc.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was " + characterName + ",who was a "+job+".\nOn the way to work, "+characterName+" reflected on life.\n" +
                "Perhaps "+characterName+"will not be a "+job+" forever.");

    }
}

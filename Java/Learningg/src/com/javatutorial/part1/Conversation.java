package com.javatutorial.part1;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String input1 = sc.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String input2 = sc.nextLine();
        System.out.println("Thanks for sharing!");
    }
}

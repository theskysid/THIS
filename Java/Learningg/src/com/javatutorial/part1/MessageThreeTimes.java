package com.javatutorial.part1;
import java.util.Scanner;


public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a message: ");
        // Write your program here
        String message = scanner.nextLine();
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
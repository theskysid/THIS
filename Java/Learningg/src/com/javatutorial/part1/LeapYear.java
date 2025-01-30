package com.javatutorial.part1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = scanner.nextInt();
        if ((year%4==0 && year%100!=0) || year%400==0) System.out.println("This year is a leap year");
        else System.out.println("This is not a leap year");
    }
}

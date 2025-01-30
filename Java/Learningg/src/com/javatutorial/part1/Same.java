package com.javatutorial.part1;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = scanner.nextLine();
        System.out.println("Enter second string");
        String s2 = scanner.nextLine();
        if (s1.equals(s2)){
            System.out.println("same");
        } else System.out.println("different");
    }
}

package com.javatutorial.part1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
        System.out.println("Give a number");
        int n = reader.nextInt();
        if (n>=0) {
            if (n % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}

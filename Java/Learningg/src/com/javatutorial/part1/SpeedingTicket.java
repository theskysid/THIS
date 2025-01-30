package com.javatutorial.part1;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed:");
        double givenSpeed = scanner.nextDouble();
        if (givenSpeed<120){
            System.out.println("");
        } else {
            System.out.println("Speeding ticket!");
        }


    }
}

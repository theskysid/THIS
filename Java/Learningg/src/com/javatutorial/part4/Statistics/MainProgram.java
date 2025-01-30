package com.javatutorial.part4.Statistics;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        Statistics statistics = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();


        //sum of all numbers
        System.out.println("Enter Numbers: ");
        while (true){
            int input = sc.nextInt();
            if (input==-1){
                break;
            }
            statistics.addNumber(input);

            if (input%2==0){
                evenSum.addNumber(input);

            } else {
                oddSum.addNumber(input);

            }


        }

        //sum of odd numbers

        System.out.println("Sum: "+ statistics.sum());
        System.out.println("Sum of even numbers: "+evenSum.sum());
        System.out.println("Sum of odd numbers: "+oddSum.sum());

    }
}

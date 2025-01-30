package Learningg.src.com.javatutorial.part3;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] spilt = input.split(" ");
        for (String i : spilt) {
            System.out.println(i);
        }
    }
}

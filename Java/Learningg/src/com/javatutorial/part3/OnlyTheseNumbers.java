package com.javatutorial.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            list.add(n);
        }
        System.out.println("From where?");
        int firstIndex = scanner.nextInt();
        System.out.println("To where?");
        int lastIndex = scanner.nextInt();
        for (int i = firstIndex; i<=lastIndex;i++) System.out.println(list.get(i));
    }
}

package com.javatutorial.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            list.add(name);
        }
        System.out.println("In total:"+ list.size());
    }
}
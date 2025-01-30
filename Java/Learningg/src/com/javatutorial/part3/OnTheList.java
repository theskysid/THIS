package Learningg.src.com.javatutorial.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
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
        System.out.print("Search for?");
        String search = scanner.nextLine();
        for (String i : list){
            if (i.equals(search)){
                System.out.println(search+" was found!");
            } else System.out.println(search+" was not found!");

        }
    }
}

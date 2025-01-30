package Learningg.src.com.javatutorial.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        //findng index of a specific number
        System.out.println("Search for?");
        int num = scanner.nextInt();
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            if (num== list.get(i)){
                index = i;
                System.out.println(num+" is at the index "+index);
            }
        }


    }
}

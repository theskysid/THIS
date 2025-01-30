package Learningg.src.com.javatutorial.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
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
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum+ list.get(i);
        }
        System.out.println("Sum:"+sum);

    }
}

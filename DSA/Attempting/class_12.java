package Attempting;

import java.util.Scanner;

public class class_12 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // Read n and m
      int n = sc.nextInt();
      int m = sc.nextInt();

      int totalPeople = n * m;
      long totalSalary = 0;

      for (int i = 0; i < totalPeople; i++) {
         totalSalary += sc.nextLong();
      }

      System.out.println(totalSalary);
      sc.close();
   }
}

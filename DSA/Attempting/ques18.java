package Attempting;

import java.util.Scanner;
import java.util.Arrays;

public class ques18 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();

      int[] arr1 = new int[m];
      int[] arr2 = new int[n];

      for (int i = 0; i < m; i++) {
         arr1[i] = sc.nextInt();
      }
      for (int i = 0; i < n; i++) {
         arr2[i] = sc.nextInt();
      }

      int[] ans = new int[n];

      for (int i = 0; i < n; i++) {
         int count = 0;
         for (int j = 0; j < m; j++) {
            if (arr1[j] > arr2[i]) {
               count++;
            }
         }
         ans[i] = count;
      }

      System.out.println(Arrays.toString(ans));
   }
}

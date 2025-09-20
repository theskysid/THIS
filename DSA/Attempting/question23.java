package Attempting;

import java.util.*;

public class question23 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      List<List<Integer>> matrix = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         List<Integer> row = new ArrayList<>();
         for (int j = 0; j < m; j++) {
            row.add(sc.nextInt());
         }
         matrix.add(row);
      }
      for (List<Integer> row : matrix) {
         int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
         for (int num : row) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
         }
         System.out.println(sum + " " + max + " " + min);
      }
   }
}
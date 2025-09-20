package Leetcode.Math;

import java.util.Arrays;

public class M_countprimes_204 {
   public static int countPrimes(int n) {
      if (n <= 2) return 0;

      boolean[] isPrime = new boolean[n];
      Arrays.fill(isPrime, true);

      isPrime[0] = false;
      isPrime[1] = false;

      // Only go up to sqrt(n)
      for (int i = 2; i * i < n; i++) {
         if (isPrime[i]) {
            // Start marking from i*i
            for (int j = i * i; j < n; j = j + i) {
               isPrime[j] = false;
            }
         }
      }

      int count = 0;
      for (int i = 2; i < n; i++) {
         if (isPrime[i]) count++;
      }
      return count;
   }

   public static void main(String[] args) {
      int n = 20;
      System.out.println(countPrimes(n));
   }
   // we can optimize it more by skipping the case of 2 only check the odd numbers likewise count the odd places only
}

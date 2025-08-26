package Leetcode.SlidingWindow;

public class M_MaximumNumberOfVowelInaSubstringOfGivenLength_1456 {
   //this is correct but gives TLE on leetcode we have to use sliding window
//   public static int maxVowels(String s, int k) {
//      int max= 0;
//      for (int i = 0; i <= s.length()-k; i++) {
//         int count = 0;
//         String sub = s.substring(i, i + k);
//         for (int j = 0; j < k; j++) {
//            if (sub.charAt(j) == 'a' || sub.charAt(j) == 'e' || sub.charAt(j) == 'i' || sub.charAt(j) == 'o' || sub.charAt(j) == 'u') {
//               count++;
//            }
//            if (count >= max) {
//               max = count;
//            }
//         }
//      }
//      return max;
//   }



   public static int maxVowels(String s, int k) {
      int n = s.length();
      int count = 0, max = 0;
      //first window
      for (int i = 0; i < k; i++) {
         if (isVowel(s.charAt(i))) {
            count++;
         }
      }
      max = count;
      //now sliding the window
      for (int i = k; i < n; i++) {
         //removing the leftest element from the window
         if (isVowel(s.charAt(i - k))) {
            count--;
         }
         //checking the fresh element in the window
         if (isVowel(s.charAt(i))) {
            count++;
         }
         max = Math.max(max, count);
      }

      return max;
   }
   private static boolean isVowel(char c) {
      return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
   }

   public static void main(String[] args) {
      int a = maxVowels("weallloveyou",7);
      System.out.println(a);
   }
}

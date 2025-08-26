package Leetcode.SlidingWindow;

import java.util.*;

public class M_FindAllAnagramsInAString_438 {
   public static List<Integer> findAnagrams(String s, String p) {
      List<Integer> res = new ArrayList<>();
      if (s.length() < p.length()) return res;

      int[] pCount = new int[26];
      int[] sCount = new int[26];

      for (char c : p.toCharArray()) {
         pCount[c - 'a']++;
      }

      for (int i = 0; i < s.length(); i++) {
         sCount[s.charAt(i) - 'a']++;

         if (i >= p.length()) {
            sCount[s.charAt(i - p.length()) - 'a']--; // shrink window
         }

         if (Arrays.equals(pCount, sCount)) {
            res.add(i - p.length() + 1);
         }
      }

      return res;
   }




   public static void main(String[] args) {
      List<Integer> ans = new ArrayList<>();
      ans = findAnagrams("cbaebabacd", "abc");
      System.out.println(ans);
   }
}

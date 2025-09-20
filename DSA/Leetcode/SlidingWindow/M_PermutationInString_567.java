package Leetcode.SlidingWindow;

import java.util.Arrays;
//same code as of M_FindAllAnagramsInAString exact same
public class M_PermutationInString_567 {
   public boolean checkInclusion(String s1, String s2) {
      if (s1.length() > s2.length()) return false;
      int[] cnt1 = new int[26], cnt2 = new int[26];

      for (char c : s1.toCharArray()) cnt1[c - 'a']++;

      for (int i = 0; i < s2.length(); i++) {
         cnt2[s2.charAt(i) - 'a']++;
         if (i >= s1.length()) cnt2[s2.charAt(i - s1.length()) - 'a']--;
         if (Arrays.equals(cnt1, cnt2)) return true;
      }
      return false;
   }
}

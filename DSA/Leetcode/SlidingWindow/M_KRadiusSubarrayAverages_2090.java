package Leetcode.SlidingWindow;

import java.util.Arrays;

public class M_KRadiusSubarrayAverages_2090 {
   public int[] getAverages(int[] nums, int k) {
      int n = nums.length;
      int m = 2*k+1;
      int[] res = new int[n];
      Arrays.fill(res, -1);
      if (m > n) return res;

      long[] pref = new long[n+1];
      for (int i = 0; i < n; i++) pref[i+1] = pref[i] + nums[i];

      for (int i = k; i + k < n; i++) {

         long sum = pref[i+k+1] - pref[i-k];

         res[i] = (int)(sum / m);
      }
      return res;
   }
}

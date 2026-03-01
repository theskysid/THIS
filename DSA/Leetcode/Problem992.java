package Leetcode;

import java.util.HashMap;

public class Problem992 {
   public int subarraysWithKDistinct(int[] nums, int k) {
      return solve(nums, k) - solve(nums, k - 1);
   }

   private int solve(int[] nums, int k) {
      if(k<0) return 0;
      HashMap<Integer, Integer> map = new HashMap<>();
      int left = 0, count = 0;
      for (int right = 0; right < nums.length; right++) {
         map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
         while (map.size() > k) {
            map.put(nums[left], map.get(nums[left]) - 1);
            if (map.get(nums[left]) == 0) {
               map.remove(nums[left]);
            }
            left++;
         }
         count += right - left + 1;
      }
      return count;
   }
}

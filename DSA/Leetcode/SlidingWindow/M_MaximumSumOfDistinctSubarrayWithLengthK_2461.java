package Leetcode.SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class M_MaximumSumOfDistinctSubarrayWithLengthK_2461 {
   public static long maximumSubarraySum(int[] nums, int k) {
      long max = 0, sum = 0;
      Set<Integer> set = new HashSet<>();
      int left = 0;
      for (int right = 0; right < nums.length; right++) {
         //handling the duplicate of elements
         while (set.contains(nums[right])) {
            set.remove(nums[left]);
            sum -= nums[left];
            left++;
         }
         set.add(nums[right]);
         sum += nums[right];
         //when the size of set is equal to k
         if (right - left + 1 == k) {
            max = Math.max(max, sum);
            set.remove(nums[left]);
            sum -= nums[left];
            left++;
         }
      }
      return max;
   }
   public static void main(String[] args) {
      int[] nums = new int[]{1,5,4,2,9,9,9};
      System.out.println(maximumSubarraySum(nums,3));
   }
}

package Leetcode.SlidingWindow;

public class E_MaximumAverageSubarray1_643 {
   public static double findMaxAverage(int[] nums, int k) {
      double max = 0, sum = 0;
      for (int i = 0; i < k; i++) {
         sum += nums[i];
      }
      max = sum;
      for (int i = k; i < nums.length; i++) {
         sum = sum - nums[i-k] +  nums[i];
         max = Math.max(max, sum);
      }
      return max/k;
   }

   public static void main(String[] args) {
      int[] nums = new int[]{1, 12, -5, -6, 50, 3};
      int k = 4;
      System.out.println(findMaxAverage(nums, k));
   }
}

package Leetcode.SlidingWindow;

public class M_NumberOfSubarrayOfSizeKandAverageGreaterThanOrEqualtothreshold {
   public static int numOfSubarrays(int[] nums, int k, int threshold) {
      int ans = 0;
      int sum = 0;
      for (int i = 0; i < k; i++) {
         sum += nums[i];
      }
      double average = sum/k;
      if (average >= threshold) {
         ans++;
      }
      for (int i = k; i < nums.length; i++) {
         sum = sum - nums[i-k] +  nums[i];
         average = sum/k;
         if (average >= threshold) {
            ans++;
         }
      }
      return ans;
   }

   public static void main(String[] args) {
      int[] nums = new int[]{11,13,17,23,29,31,7,5,2,3};
      int k = 3;
      int threshold = 5;
      System.out.println(numOfSubarrays(nums, k, threshold));
   }
}

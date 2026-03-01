package Leetcode;

public class Problem1248 {
      public int numberOfSubarrays(int[] nums, int k) {
         return solve(nums,k)-solve(nums,k-1);
      }
      private int solve(int[] nums, int k){
         int left=0, sum = 0, count = 0;
         for(int right = 0; right < nums.length; right++){
            sum = sum+(nums[right]%2);
            while(sum>k){
               sum = sum - (nums[right]%2);
               left++;
            }
            count  = count + (right-left+1);
         }
         return count;
      }

}

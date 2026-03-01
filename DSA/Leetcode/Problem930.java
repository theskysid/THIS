package Leetcode;

/*
* We cant use two pointer here because we dont know when to stop the left pointer
* for eg 010011001*/

public class Problem930 {
   public int numSubarraysWithSum(int[] nums, int goal) {
      return solve(nums, goal)-solve(nums,goal-1);
   }
   private int solve(int[] nums, int k) {
      if (k<0) return 0;
      int left = 0, sum = 0, count = 0;
      for (int right = 0; right < nums.length; right++) {
         sum += nums[right];
         while(sum>k){
            sum -= nums[left++];

         }
         count = count + right - left+1;
      }
      return count;
   }
}

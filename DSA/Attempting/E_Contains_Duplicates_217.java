package Leetcode;

import java.util.Arrays;

public class E_Contains_Duplicates_217 {
   public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);
      for(int i = 1; i < nums.length; i++){
         if(nums[i-1] == nums[i]){
            return true;
         }
      }
      return false;
   }
}

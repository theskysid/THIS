package Leetcode.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class E_ContainsDuplicate2_219 {

   public static boolean containsNearbyDuplicate(int[] nums, int k) {
      Set<Integer> set = new HashSet<>();
      int l = 0;
      for (int i = 0; i < nums.length; i++) {
         if (set.contains(nums[i])) {
            return true;
         }
         set.add(nums[i]);
         if(i-l >= k){
            set.remove(nums[l]);
            l++;
         }
      }
      return false;
   }


         //brute force approach --TLE
   //   public static boolean containsNearbyDuplicate(int[] nums, int k) {
//      for (int i = 0; i < nums.length-1; i++) {
//         for (int j = i+1; j < nums.length; j++) {
//            if(nums[i] == nums[j]){
//               int distance = j-i;
//               if(distance<=k){
//                  return true;
//               }
//            }
//         }
//      }
//      return false;
//   }
   public static void main(String[] args) {
      int[] nums = new int[]{1,2,3,1,2,3};
      System.out.println(containsNearbyDuplicate(nums, 2));
   }
}

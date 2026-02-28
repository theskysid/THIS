package Leetcode.MonotonicStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class M_NextGreaterElement1_496 {
   public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Map<Integer, Integer> map = new HashMap<>();
      Stack<Integer> stack = new Stack<>();
      for (int num : nums2) {
         // determining the next greater element... and poping it out putting it in map
         while (!stack.isEmpty() && num > stack.peek()) {
            map.put(stack.pop(), num);
         }
         // Push current element when there is no next greater element present
         stack.push(num);
      }

      //element present in stack have no next greater element... so putting them in map with -1
      while (!stack.isEmpty()) {
         map.put(stack.pop(), -1);
      }

      // Build result for nums1 from the values in map
      int[] result = new int[nums1.length];
      for (int i = 0; i < nums1.length; i++) {
         result[i] = map.get(nums1[i]);
      }

      return result;
   }
}

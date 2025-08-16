package Leetcode;

import java.util.Stack;

public class H_Largest_Rectangle_In_Histogram_84 {
   public int largestRectangleArea(int[] heights) {
      Stack<Integer> stack = new Stack<>();
      int max = 0;

      stack.push(0);

      for(int i = 0; i< heights.length; i++){
         while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
            max = getmax(heights, stack, max, i);
         }
         stack.push(i);
      }

      int i = heights.length;
      while(!stack.isEmpty()){
         max = getmax(heights, stack, max, i);
      }
      return max;
   }
   static int getmax(int[] arr, Stack<Integer> stack, int max, int i){
      int area;
      int popped = stack.pop();
      if(stack.isEmpty()){
         area = arr[popped] * i;
      } else {
         area = arr[popped] * (i-1-stack.peek());
      }
      return Math.max(max, area);
   }
}

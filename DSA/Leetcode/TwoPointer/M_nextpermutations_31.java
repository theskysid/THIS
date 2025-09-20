package Leetcode.TwoPointer;

public class M_nextpermutations_31 {

   public static void main(String[] args) {
//      int[] nums1 = {1, 2, 3};
//      nextPermutation(nums1);
//      printArray(nums1); // Expected: [1, 3, 2]
//
//      int[] nums2 = {3, 2, 1};
//      nextPermutation(nums2);
//      printArray(nums2); // Expected: [1, 2, 3]

      int[] nums3 = {1, 2, 3, 6, 5, 4};
      nextPermutation(nums3);
      printArray(nums3); // Expected: [1, 2, 4, 3, 5, 6]

//      int[] nums4 = {1, 1, 5};
//      nextPermutation(nums4);
//      printArray(nums4); // Expected: [1, 5, 1]
   }

   public static void nextPermutation(int[] nums) {
      int n = nums.length;
      int left = n - 2;

      // Step 1: find pivot
      while (left >= 0 && nums[left] >= nums[left + 1]) {
         left--;
      }

      if (left >= 0) {
         int right = n - 1;
         // Step 2: find the element just larger than pivot
         while (nums[right] <= nums[left]) {
            right--;
         }
         swap(nums, left, right);
      }

      // Step 3: reverse the suffix
      reverse(nums, left + 1, n - 1);
   }

   private static void swap(int[] nums, int a, int b) {
      int temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
   }

   private static void reverse(int[] nums, int start, int end) {
      while (start < end) {
         swap(nums, start, end);
         start++;
         end--;
      }
   }

   private static void printArray(int[] nums) {
      System.out.print("[");
      for (int i = 0; i < nums.length; i++) {
         System.out.print(nums[i]);
         if (i < nums.length - 1) System.out.print(", ");
      }
      System.out.println("]");
   }
}

package Leetcode;

public class M_Sort_An_Array_912 {
   public int[] sortArray(int[] nums) {
      quicksort(nums,0, nums.length-1);
      return nums;
   }
   static void quicksort(int a[], int low, int high) {
      if (low < high) {
         int pivot_index = partition(a, low, high);
         quicksort(a, low, pivot_index - 1);
         quicksort(a, pivot_index + 1, high);
      }
   }
   static int partition(int a[], int low, int high) {
      int pivot = a[high]; // Choosing last element as pivot
      int i = low - 1;     // `i` tracks the smaller element's index
      for (int j = low; j < high; j++) {
         if (a[j] < pivot) {
            i++; // Move `i` forward
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
         }
      }
      // Swap pivot with the element at i+1 to put pivot in the correct position
      int temp = a[i + 1];
      a[i + 1] = a[high];
      a[high] = temp;

      return i + 1; // Return the partition index
   }
}

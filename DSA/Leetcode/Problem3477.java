package Leetcode;

public class Problem3477 {
   public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
      int n = fruits.length;
      int unplaced = 0;

      for (int f : fruits) {
         boolean placed = false;
         for (int i = 0; i < n; i++) {
            if (baskets[i] >= f) {
               baskets[i] = -1;
               placed = true;
               break;
            }
         }
         if (!placed) unplaced++;
      }
      return unplaced;
   }
   /* time complexity - O(n2) and space complexity O(1) */
}

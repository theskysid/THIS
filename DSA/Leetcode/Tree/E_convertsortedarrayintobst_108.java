package Leetcode.Tree;

public class E_convertsortedarrayintobst_108 {
   public TreeNode sortedArrayToBST(int[] nums) {
      return helper(nums, 0, nums.length - 1);
   }

   private TreeNode helper(int[] nums, int left, int right) {
      if (left > right) return null;
      int mid = left + (right - left) / 2; // the middle node will the root
      TreeNode root = new TreeNode(nums[mid]);

      root.left = helper(nums, left, mid - 1); // left subtree
      root.right = helper(nums, mid + 1, right); //right subtree

      return root;
   }
}

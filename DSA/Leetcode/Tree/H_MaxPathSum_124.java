package Leetcode.Tree;

public class H_MaxPathSum_124 {
   static int ans = Integer.MIN_VALUE;
   public static int maxPathSum(TreeNode root) {
      helper(root);
      return ans;
   }
   public static int helper(TreeNode root){
      if (root == null) {
         return 0;
      }

      int left = helper(root.left);
      int right = helper(root.right);

      left = Math.max(left, 0);
      right = Math.max(right, 0);

      int pathSum = left + right + root.val;
      ans = Math.max(ans, pathSum);

      return Math.max(left, right) + root.val;
   }
}

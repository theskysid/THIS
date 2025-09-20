package Leetcode.Tree;

public class M_validatebinarysearchtree_98 {
   // We use Integer (object) instead of int (primitive) because Integer can be null.
// Null means "no bound yet", which is needed at the root and edges of the tree. also save times as there is no bound yet so skip the if check
// int cannot be null, so it would force fake bounds like MIN_VALUE/MAX_VALUE.

   public boolean isValidBST(TreeNode root) {
      return helper(root, null, null);
   }
   public boolean helper(TreeNode node, Integer low, Integer high){
      if(node == null){
         return true;
      }

      if(low != null && node.val <= low){
         return false;
      }
      if(high != null && node.val >= high){
         return false;
      }

      boolean leftTree = helper(node.left, low, node.val);
      boolean rightTree = helper(node.right, node.val, high);


      return leftTree && rightTree;
   }
}

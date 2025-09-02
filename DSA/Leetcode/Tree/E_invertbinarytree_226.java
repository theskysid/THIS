package Leetcode.Tree;

public class E_invertbinarytree_226 {
   public TreeNode invertTree(TreeNode root) {

      if(root == null) return null;

      TreeNode left = invertTree(root.left);
      TreeNode right = invertTree(root.right);

      root.left = right;
      root.right = left;

      return root;
   }
}

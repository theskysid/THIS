package Leetcode.Tree;

public class E_DiameterOfBinarytree_543 {

   static int diameter = 0;
   public static int diameterOfBinaryTree(TreeNode root) {
      height(root);
      return diameter-1; //this actually calculates the actual distance but we need to return the number of nodes so we return diameter-1
   }
   public static int height(TreeNode node) {
      if (node == null) return 0;

      int leftHeight = height(node.left);
      int rightHeight = height(node.right);

      int dia = leftHeight + rightHeight + 1;
      diameter = Math.max(diameter, dia);

      return Math.max(leftHeight, rightHeight) + 1;
   }
}

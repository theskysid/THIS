package Leetcode.Tree;

public class E_CousinsInBT_993 {
   public boolean isCousins(TreeNode root, int x, int y) {
      TreeNode xx = findNode(root,x); //finding the node with this value
      TreeNode yy = findNode(root,y);

      return (
              (level(root, xx, 0) == level(root, yy, 0)) &&  (!isSibling(root,xx,yy))
              );
   }

   //checking the level of the nodes if it is in same level or not
   private int level(TreeNode node, TreeNode a, int level) {
      if (node == null) {
         return 0;
      }
      if(node == a){
         return level;
      }
      //check in the left side of tree
      int l = level(node.left, a,level+1);
      if(l != 0){
         return l;
      }
      return level(node.right, a,level+1);
   }

   private boolean isSibling(TreeNode node, TreeNode xx, TreeNode yy) {
      if (node ==null){
         return false;
      }

      return (
              (node.left == xx && node.right == yy)  || (node.left == yy && node.right == xx) || isSibling(node.left, xx, yy) || isSibling(node.right, xx, yy)
              );
   }

   private TreeNode findNode(TreeNode root, int x) {
      if (root == null) {
         return null;
      }
      if (root.val == x) {
         return root;
      }
      TreeNode n = findNode(root.left, x);
      if (n != null) {
         return n;
      }
      return findNode(root.right, x);
   }
}

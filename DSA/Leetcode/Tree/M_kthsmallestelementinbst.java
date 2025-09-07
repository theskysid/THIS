package Leetcode.Tree;

public class M_kthsmallestelementinbst {

   //simply we have to do inorder traversal of the tree and return the kth element from the order
   int count = 0;
   public int kthSmallest(TreeNode root, int k) {
      return solve(root,k).val;

   }

   public TreeNode solve(TreeNode root, int k){
      if(root == null){
         return null;
      }

      TreeNode left = solve(root.left,k);

      if(left != null){
         return left;
      }

      count++;

      if(count == k){
         return root;
      }

      return solve(root.right,k);

   }
}

package Leetcode.Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//
//class TreeNode {
//   int val;
//   TreeNode left;
//   TreeNode right;
//   TreeNode() {}
//   TreeNode(int val) { this.val = val; }
//   TreeNode(int val, TreeNode left, TreeNode right) {
//      this.val = val;
//      this.left = left;
//      this.right = right;
//   }
//}

public class M_BinaryTreeLevelOrderTraversal_102 {
   public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();

      if (root == null) return result;

      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root); //at first it will only contain the root node if available

      while (!queue.isEmpty()) {
         int levelSize = queue.size(); // the size of the queue will be the size of the level means the element in the queue
         //now we need to store the elements in a local list
         List<Integer> currentLevel = new ArrayList<>(levelSize);

         //now we will traverse the child of that current node into the queue and add them into the final result
         for (int i = 0; i < levelSize; i++) {
            TreeNode currentNode = queue.poll(); //takes the current node from the queue and we dont want null in our traversal so then we have a check here
            currentLevel.add(currentNode.val); //NEED TO ADD THE values in the local list
            if (currentNode.left != null) queue.offer(currentNode.left);
            if (currentNode.right != null) queue.offer(currentNode.right);
         }
         result.add(currentLevel);
      }
      return result;
   }
}

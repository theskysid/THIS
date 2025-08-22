package Leetcode.Tree;

import java.util.*;

public class M_BT_Zigzag_Level_Order_Traversal_103 {
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> res = new ArrayList<>();
      boolean reverse = false;
      if (root == null) return res;

      Deque<TreeNode> deq = new LinkedList<>();
      deq.offer(root);

      while (!deq.isEmpty()) {
         int levelSize = deq.size();
         List<Integer> currentLevel = new ArrayList<>();

         for (int i = 0; i < levelSize; i++) {
            //normal order left to right
            if (!reverse) {
               TreeNode currentNode = deq.pollFirst();
               currentLevel.add(currentNode.val);

               if (currentNode.left != null) deq.addLast(currentNode.left);
               if (currentNode.right != null) deq.addLast(currentNode.right);

            }

            //reverse order right to left
            if (reverse){
               TreeNode currentNode = deq.pollLast();
               currentLevel.add(currentNode.val);

               if (currentNode.right != null) deq.addFirst(currentNode.right);
               if (currentNode.left != null) deq.addFirst(currentNode.left);

            }
         }
         //alteranting the reverse .... sliping this
         reverse = !reverse;
         res.add(currentLevel);
      }
      return res;
   }
}

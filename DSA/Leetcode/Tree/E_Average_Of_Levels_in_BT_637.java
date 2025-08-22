package Leetcode.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class E_Average_Of_Levels_in_BT_637 {
   public List<Double> averageOfLevels(TreeNode root) {
      List<Double> result = new LinkedList<>();
      if (root == null) return result;
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);

      while (!queue.isEmpty()) {
         int levelSize = queue.size();
         double averageLevel = 0;
         for (int i = 0; i < levelSize; i++) {
            TreeNode node = queue.poll();
            averageLevel = averageLevel + node.val; //gives the total sum of the level

            //when the item is removed from the queue we add its child from this
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
         }
         averageLevel = averageLevel / levelSize;
         result.add(averageLevel);
      }
      return result;
   }
}

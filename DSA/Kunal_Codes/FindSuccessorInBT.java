package Kunal_Codes;

import java.util.LinkedList;
import java.util.Queue;

public class FindSuccessorInBT {
   public static int findNextSuccessort(TreeNode root, int key) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);

      while (!queue.isEmpty()) {
         TreeNode currentNode = queue.poll();
         if(currentNode.left != null) queue.offer(currentNode.left);
         if(currentNode.right != null) queue.offer(currentNode.right);

         if (currentNode.val == key) {
            break;
         }
      }
      return queue.peek().val;
   }
}

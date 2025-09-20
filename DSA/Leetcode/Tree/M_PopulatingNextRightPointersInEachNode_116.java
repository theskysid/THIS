package Leetcode.Tree;

public class M_PopulatingNextRightPointersInEachNode_116 {
   class Node {
      public int val;
      public Node left;
      public Node right;
      public Node next;

      public Node() {}

      public Node(int _val) {
         val = _val;
      }

      public Node(int _val, Node _left, Node _right, Node _next) {
         val = _val;
         left = _left;
         right = _right;
         next = _next;
      }
   };

   public Node connect(Node root) {
      if (root == null) return root;

      Node leftMost = root;
      while (leftMost.left != null) { //going to the last leaf node
         Node current = leftMost;
         while (current != null) {
            current.left.next = current.right; //first connection between left and right
            if (current.next != null) { //this if is to connect the bridge between the left ka right child and right ka left child
               current.right.next = current.next.left;
            }
            current = current.next;
         }
         leftMost = leftMost.left; //pushing the pointer to left side of the tree
      }
      return root;
   }
}

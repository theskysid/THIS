package Kunal_Codes;

public class BinarySearchtree {
   public class Node {
      private int value;
      private Node left;
      private Node right;
      private int height;

      Node(int value) {
         this.value = value;
         this.left = null;
         this.right = null;
         this.height = 1;
      }

      public int getValue() {
         return value;
      }
   }

   public Node root; // Root node

   public int height(Node node) {
      if (node == null) {
         return -1;
      }
      return node.height;
   }

   public boolean isEmpty() {
      return root == null;
   }

   public void display() {
      if (root == null) {
         System.out.println("Tree is empty");
      } else {
         display(root, "Root Node: ");
      }
   }

   public void display(Node node, String details) {
      if (node == null) {
         return;
      }
      System.out.println(details + node.getValue());

      display(node.left, "Left Child of " + node.getValue() + ": ");
      display(node.right, "Right Child of " + node.getValue() + ": ");
   }

   public void insert(int value) {
      root = insert(value, root);
   }

   public Node insert(int value, Node node) {
      if (node == null) {
         node = new Node(value);
         return node;
      }
      if (value < node.getValue()) {
         node.left = insert(value, node.left);
      } else if (value > node.getValue()) {
         node.right = insert(value, node.right);
      }
      node.height = 1 + Math.max(height(node.left), height(node.right));
      return node;
   }

   public void populate(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
         this.insert(nums[i]);
      }
   }

   public void populateSorted(int[] nums){
      populateSorted(nums, 0, nums.length);
   }
   private void populateSorted(int[] nums, int start, int end) {
      if (start >= end) {
         return;
      }
      int mid = (start + end) / 2;
      this.insert(nums[mid]);
      populateSorted(nums, start, mid);
      populateSorted(nums, mid + 1, end);
   }

   public boolean balanced() {
      return balanced(root);
   }

   private boolean balanced(Node node) {
      if (node == null) {
         return true;
      }
      return Math.abs(height(node.left) - height(node.right)) <= 1 &&
              balanced(node.left) && balanced(node.right);
   }

   public static void main(String[] args) {
      BinarySearchtree tree = new BinarySearchtree();
      BinarySearchtree tree2 =  new BinarySearchtree();
      tree.populate(new int[]{5, 2, 7, 1, 4, 6, 9, 8, 3, 10});
      tree2.populateSorted(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10});
      tree.display();
      System.out.println();
      tree2.display();

   }
}

package GeeksForGeeks;
class Node{
   int data;
   Node left,right;
   Node(int d){
      data=d;
      left=right=null;
   }
}

public class RemoveHalfNodes {
   Node RemoveHalfNodes(Node root) {
      if (root == null) return null;

      root.left = RemoveHalfNodes(root.left);
      root.right = RemoveHalfNodes(root.right);

      if (root.left == null && root.right == null) return root;
      if (root.left == null) return root.right;
      if (root.right == null) return root.left;

      return root;
   }
}

package Leetcode.Tree;

import com.sun.source.tree.Tree;

import java.util.*;

public class M_Allnodesdistancekinbinarytree_863 {
   public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
      Map<TreeNode, List<TreeNode>> map = new HashMap<>();
      builder(root, null, map); //building the undirected graph since the a link is twice in the map we need to use the set to keep track of the visited node

      List<Integer> res = new ArrayList<>();// storing the final answer
      Set<TreeNode> visited = new HashSet<>(); //tracking the visited nodes
      Queue<TreeNode> queue = new LinkedList<>(); //when the distance will be matched the resulted ans will be in the queue

      queue.offer(root);
      int dist = 0;
      while (!queue.isEmpty()) {
         int size = queue.size();

         if(dist == k){
            for(TreeNode node: queue){
               res.add(node.val);
            }
            return res;
         }

         for (int i = 0; i < size; i++) {
            TreeNode curr = queue.poll();
            for(TreeNode neighbour : map.getOrDefault(curr, new ArrayList<>())){ // move to the neighbours of the current node
               // this for loop is also to visit the neighbours of the neighbours of the current node
               if(!visited.contains(neighbour)){
                  visited.add(neighbour);
                  queue.offer(neighbour); //all the neigbours of the current node will be in the queue
               }
            }
         }
         dist++;
      }
      return res;

   }

   //converting the binary into undirected graph
   public void builder(TreeNode node, TreeNode parent, Map<TreeNode, List<TreeNode>> map){
      if(node==null) return;

      map.putIfAbsent(node, new ArrayList<>());

      if(parent!= null) {
         //undirection here we can move now both the ways now from parent to node or node to parent
         map.get(node).add(parent);
         map.get(parent).add(node);
      }
      builder(node.left, node, map);
      builder(node.right, node, map);
   }
}

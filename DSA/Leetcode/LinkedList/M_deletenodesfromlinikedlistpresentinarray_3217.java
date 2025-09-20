package Leetcode.LinkedList;

import java.util.HashSet;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class M_deletenodesfromlinikedlistpresentinarray_3217 {
   public ListNode modifiedList(int[] nums, ListNode head) {
      if (head == null) return null;
      Set<Integer> set = new HashSet<>();
      for (Integer num : nums) {
         set.add(num);
      }
      //this is to find the head of the required linkedlist
      while (head != null && set.contains(head.val)) {
         head = head.next;
      }
      //skipping of elements
      ListNode temp = head;
      ListNode prev = null;
      while (temp != null) {
         if (set.contains(temp.val)) {
            prev.next = temp.next;
         } else {
            prev = temp;
         }
         temp = temp.next;
      }
      return head;
   }
}

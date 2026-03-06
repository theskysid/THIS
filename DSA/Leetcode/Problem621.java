package Leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem621 {
   //Math approach:
   //Counting frequencies → O(n)
   //Finding max frequency → O(26) = O(1)
   //Overall → O(n)
   public int leastInterval(char[] tasks, int n) {
      int[] freq = new int[26];
      for (char task : tasks) {
         freq[task - 'A']++;
      }
      int maxFreq = 0;
      for (int f : freq) {
         maxFreq = Math.max(maxFreq, f);
      }
      int maxCount = 0;
      for (int f : freq) {
         if (f == maxFreq) {
            maxCount++;
         }
      }
      int partCount = maxFreq - 1;
      int partLength = n + 1;
      int minTime = partCount * partLength + maxCount;
      return Math.max(tasks.length, minTime);
   }

   //Heap + Queue approach:

   //Building heap → O(26 log 26) = O(1)
   //Each task gets pushed/popped from heap → O(n log 26) = O(n)
   //https://www.youtube.com/watch?v=it-tqUPacgM
   public int leastInterval2(char[] tasks, int n) {
      int[] freq = new int[26];
      for (char task : tasks) {
         freq[task - 'A']++;
      }

      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
      for (int f : freq) {
         if (f > 0) maxHeap.offer(f);
      }

      Queue<int[]> cooldown = new LinkedList<>();
      int time = 0;

      while (!maxHeap.isEmpty() || !cooldown.isEmpty()) {
         time++;
         if (!maxHeap.isEmpty()) {
            int count = maxHeap.poll() - 1;
            if (count > 0) {
               cooldown.offer(new int[]{count, time + n});
            }
         }
         if (!cooldown.isEmpty() && cooldown.peek()[1] == time) {
            maxHeap.offer(cooldown.poll()[0]);
         }
      }
      return time;
   }
}

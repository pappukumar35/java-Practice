package Array;

import java.util.*;

public class priorityQueue {
     public int findKthLargest(int nums[], int k) {
          PriorityQueue<Integer> pq = new PriorityQueue();
          for (int i = 0; i < nums.length; i++) {
               if (pq.size() < k) {
                    pq.add(nums[i]);
               } else if (pq.peek() < nums[i]) {
                    pq.remove();
                    pq.add(nums[i]);
               }
               return pq.peek();
          }
     }

     public static void main(String[] args) {

     }
}
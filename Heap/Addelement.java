package Heap;

import java.util.*;

public class Addelement {
     public static void main(String[] args) {
          PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
          pq.add(3);
          pq.add(5);
          pq.add(7);
          pq.add(8);

          while (!pq.isEmpty()) {
               System.out.println(pq.peek());
               pq.remove();
          }
     }
}

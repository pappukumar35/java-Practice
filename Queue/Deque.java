package Queue;

import java.util.*;

public class Deque {
     public static void main(String[] args) {
          Deque<Integer> deque = new LinkedList<>();
          deque.addfirst(1);
          deque.addsecond(2);
          System.out.println(deque);
     }
}
package liList;

import java.util.LinkedList;
import java.util.*;

public class add {
     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();
          ll.addLast(1);
          ll.addLast(4);
          ll.addLast(5);
          ll.addFirst(0);
          ll.addFirst(1);
          ll.addFirst(2);
          System.out.println(ll);
          ll.remove(0);
          ll.remove(1);
          System.out.println(ll);
     }
}

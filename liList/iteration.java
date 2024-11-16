package liList;

import java.util.*;

public class iteration {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public static Node head;

     public int itsSearch(int key) {
          Node temp = head;
          int i = 0;
          while (temp != null) {
               if (temp.data == key) {
                    return i;
               }
               temp = temp.next;
               i++;
          }
          return -1;
     }

     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();
          ll.addFirst(12);
          ll.addFirst(14);
          ll.addFirst(15);
          ll.addFirst(16);
          ll.addFirst(17);
          ll.addFirst(18);
          ll.print();

     }
}

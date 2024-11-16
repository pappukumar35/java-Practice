package liList;

import java.util.*;

public class reverse {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public static Node head;

     public int itshelper(Node head, int key) {
          if (head == null) {
               return -1;
          }
          if (head.data == key) {
               return 0;

          }
          int idx = helper(head.next, key);
          if (idx == -1) {
               return -1;
          }
          return idx + 1;

     }

     public int recSearch(int key) {
          return helper(head, key);
     }

     public static void main(String[] args) {

     }
}

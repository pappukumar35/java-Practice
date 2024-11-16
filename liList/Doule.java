package liList;

import java.util.*;

public class Doule {
     static class Node {
          int data;
          Node next;
          Node prev;

          Node(int data) {
               this.data = data;
               this.next = next;
               this.prev = prev;
          }
     }

     static Node head;
     static Node tail;
     static Node prev;

     // display
     public void display() {
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data + "");
               temp = temp.next;
          }
          System.out.println();
     }

     public static void main(String[] args) {
          Node a = new Node(2);
          Node b = new Node(3);
          Node c = new Node(4);
          Node d = new Node(5);
          Node e = new Node(7);
          a.prev = null;
          a.next = b;
          b.prev = c;
          b.next = c;
          c.prev = d;
          c.next = d;
          d.prev = e;
          d.next = e;
          e.prev = d;
          e.next = null;
          display(a);

     }
}

package liList;

import java.util.*;

public class addMid {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public static Node head;
     public static Node tail;

     public void addmid(int idx, int data) {
          Node slow = head;
          Node fast = head;
          while (fast != null && fast.next != null) {
               fast = fast.next.next;
               slow = slow.next;
          }
     }

     // display
     public void print() {
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data + "");
               temp = temp.next;
          }
          System.out.println("null");
     }

     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();
          ll.addFirst(2);
          ll.addFirst(4);
          ll.addLast(5);
          ll.addLast(9);
          ll.add(1, 0);
          System.out.println(ll.print());
          ll.print();

     }
}

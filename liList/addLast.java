package liList;

import java.util.*;

public class addLast {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }

     public static Node head;
     public static Node tail;

     public void addLast(int data) {
          Node newNode = new Node(data);
          if (head == null) {
               head = tail = newNode;
               return;
          }
          tail.next = newNode;
          tail = newNode;
     }

     // display
     public void print() {
          Node temp = head;
          while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.next;
          }
          System.out.println("null");
     }

     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();
          ll.print();
          ll.addLast(10);
          ll.addLast(15);
          ll.print();
     }
}

package LinkedList;

import java.util.*;
import java.util.*;

public class add {
     public static class Node {
          int data;
          Node next;

          public Node(int data) {
               this.data = data;
               this.next = null;
          }

     }

     public Node tail;

     public void addFirst(int data) {
          Node newNode = new Node(data);
          if (head == null) {
               head = tail = newNode;
               return;
          }
          newNode.next = head;
          head = newNode;
     }

     // last
     public void addLast(int data) {
          Node newNode = new Node(data);
          if (head == null) {
               head = tail = newNode;
               return;
          }
          tail.next = newNode;
          tail = newNode;
     }

     public Node head;

     public void addMid(int idx, int data) {
          Node newNode = new Node(data);
          Node temp = head;
          int i = 0;
          while (i < idx - 1) {
               temp = temp.next;
               i++;
          }
          newNode.next = temp.next;
          temp.next = newNode;
     }

     public void print() {
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data + "");
               temp = temp.next;
          }
          System.out.println("null");
     }

     public static void main(String args[]) {
          LinkedList ll = new LinkedList();
          ll.print();
          ll.addFirst(2);
          ll.addFirst(1);
          ll.addLast(3);
          ll.addLast(4);
          ll.addLast(5);
          ll.addMid(4, 9);
          ll.print();
     }

}

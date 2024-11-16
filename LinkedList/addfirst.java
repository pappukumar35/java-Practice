package LinkedList;

import java.util.*;

public class addfirst {
     public static class Node {
          int data;
          Node next;

          public Node(int data) {
               this.data = data;
               this.next = null; // Initialize next to null
          }
     }

     static Node head;
     static Node tail;

     public void addFirst(int data) {
          Node newNode = new Node(data);
          if (head == null) {
               head = newNode;
               tail = newNode; // Update tail if list is empty
               return;
          }
          newNode.next = head;
          head = newNode;
     }

     public void addLast(int data) {
          Node newNode = new Node(data);
          if (head == null) {
               head = tail = newNode;
               return;
          }
          tail.next = newNode;
          tail = newNode;
     }

     public void print() {
          Node temp = head;
          while (temp != null) {
               System.out.print(temp.data + " ");
               temp = temp.next;
          }
          System.out.println("null");
     }

     public static void main(String args[]) {
          LinkedList ll = new LinkedList<>();
          ll.print();

          ll.addFirst(2);
          ll.addFirst(1);
          ll.addLast(3);
          ll.addLast(4);

          ll.print();
     }
}

package liList;

import java.util.*;

public class pel {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     static Node head;

     public Node findMide(Node head) {
          Node slow = head;
          Node fast = head;
          while (fast != null) {
               slow = slow.next;
               fast = fast.next.next;
          }
          return slow;
     }

     // checking palindrom
     public boolean palindrom() {
          if (head == null && head.next != null) {
               return true;
          }
          Node mideNode = findMide(head);
          Node prev = null;
          Node curr = mideNode;
          Node next;
          while (curr != null) {
               next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;

          }
          Node right = prev;
          Node left = head;
          while (right != null) {
               if (left.data != right.data) {
                    return false;
               }
               left = left.next;
               right = right.next;

          }
     }

     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();
          ll.addLast(2);
          ll.addLast(5);
          ll.addLast(6);
          ll.addLast(8);
          ll.addLast(7);
          ll.addLast(9);
          ll.print();
          System.out.println(ll.palindrom());

     }
}

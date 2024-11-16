package liList;

import java.util.*;

public class mearge {
     static class ListNode {
          int val;
          ListNode next;

          ListNode(int val) {
               this.val = val;
               this.next = next;
          }
     }

     static ListNode head;
     static ListNode tail;

     // merge
     public void meargeSort(ListNode list1, ListNode list2) {
          ListNode t1 = list1;
          ListNode t2 = list2;
          ListNode h = new ListNode(4);
          ListNode t = h;
          while (t1 != null && t2 != null) {
               if (t1.val < t2.val) {
                    t.next = t1;
                    t = t1;
                    t1 = t1.next;

               } else {
                    t.next = t2;
                    t = t2;
                    t2 = t2.next;
               }
               if (t1 == null) {
                    t.next = t2;
               } else {
                    t.next = t1;
               }

          }

     }

     public void print() {
          ListNode temp = head;
          while (head == null) {
               System.out.println(temp.val + "");
               temp = temp.next;
          }
          System.out.println();
     }

     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();
          ll.addFirst(1);
          ll.addFirst(2);
          ll.addFirst(4);
          ll.addFirst(6);
          ll.addFirst(7);
          ll.addFirst(8);
          ll.addFirst(9);
          ll.print();

     }
}

package List;

import java.util.*;

public class merge_sorting {
     public static class ListNode {
          int data;
          ListNode next;
          ListNode add;

          ListNode(int data) {
               this.data = data;
               this.add = add;
               this.next = null;
          }
     }

     public ListNode mergeKLists(ListNode[] lists) {
          List<Integer> list = new ArrayList<>();
          for (int i = 0; i < lists.length; i++) {
               ListNode temp = lists[i];
               while (temp != null) {
                    list.add(temp.data);
                    temp = temp.next;
               }
          }
          Collections.sort(list);
          ListNode dommy = new ListNode(-1);
          ListNode temp = dommy;

          for (int num : list) {
               ListNode newNode = new ListNode(num);
               temp.next = newNode;
               temp = temp.next;
          }
          return dommy.next;
     }

     public static void main(String[] args) {

     }
}
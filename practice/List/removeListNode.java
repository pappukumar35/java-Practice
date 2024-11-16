package List;

public class removeListNode {
     public static class ListNode {
          int val;
          ListNode next;

          ListNode(int val) {
               this.val = val;
               this.next = null;
          }
     }

     public ListNode removeElement(ListNode head, int val) {
          if (head == null) {
               return null;
          }
          ListNode dummy = new ListNode(-1);
          dummy.next = head;
          ListNode curr = dummy;

          while (curr.next != null) {
               if (curr.next.val == val) {
                    curr.next = curr.next.next;
               } else {
                    curr = curr.next;
               }
          }
          return dummy.next;
     }

     public static void main(String[] args) {

     }
}
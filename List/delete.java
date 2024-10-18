package List;

public class delete {
     public static class ListNode {
          int val;
          ListNode data;
          ListNode next;
          ListNode left;
          ListNode right;
          ListNode root;

          ListNode(int val) {
               this.val = val;
               this.next = null;
               this.left = left;
               this.right = right;
               this.root = root;
          }

     }

     public ListNode deleteMiddle(ListNode head) {
          if (head.next == null) {
               return null;
          }
          ListNode slow = head;
          ListNode fast = head;
          while (fast.next.next != null && fast.next.next.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }
          slow.next = slow.next.next;
          return head;
     }

     public static void main(String[] args) {

     }
}
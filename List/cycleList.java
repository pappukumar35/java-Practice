package List;

public class cycleList {
     static class ListNode {
          int val;
          ListNode next;

          public ListNode(int val) {
               this.val = val;
               this.next = null;
          }

          public boolean hasCycle(ListNode head) {
               if (head == null || head.next == null) {
                    return false;
               }
               ListNode slow = head;
               ListNode fast = head;
               while (fast != null && fast.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
                    if (fast == slow) {
                         return true;
                    }

               }
               return false;
          }

          public static void main(String args[]) {

          }
     }
}

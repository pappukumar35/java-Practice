package List;

public class reverse {
     public class ListNode {
          int data;
          ListNode next;

          ListNode(int data) {
               this.data = data;
               this.next = null;
          }
     }

     public ListNode reverseList(ListNode head) {
          ListNode curr = head;
          ListNode prev = null;
          while (curr != null) {
               ListNode temp = curr.next;
               curr.next = prev;
               prev = curr;
               curr = temp;
          }
          return prev;
     }

     public static void main(String[] args) {

     }
}

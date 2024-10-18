package List;

public class reverseKGroup {
     public static class ListNode {
          int val;
          ListNode data;
          ListNode left;
          ListNode right;
          ListNode next;

          ListNode(int val) {
               this.val = val;
               this.data = data;
               this.left = left;
               this.right = right;
          }
     }

     public ListNode reverseKGropu(ListNode head, int k) {
          ListNode curr = head;
          int count = 0;
          while (curr != null && count != k) {
               curr = head.next;
               count++;
          }
          if (count == k) {
               curr = reverseKGropu(curr, k);
               while (count-- > 0) {
                    ListNode temp = head.next;
                    head.next = curr;
                    curr = head;
                    head = temp;
               }
               head = curr;
          }
          return head;
     }

     public static void main(String[] args) {

     }
}

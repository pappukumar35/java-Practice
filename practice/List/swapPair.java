package List;

public class swapPair {
     public static class ListNode {
          int val = 0;
          ListNode data;
          ListNode left;
          ListNode right;
          ListNode next = null;

          ListNode(int val) {
               this.val = val;
               this.next = null;
               this.data = data;
               this.left = left;
               this.right = right;
          }
     }

     public ListNode swapPair(ListNode head) {
          if (head == null)
               return head;
          if (head.next == null)
               return head;
          ListNode temp = head.next;
          head.next = swapPair(temp.next);
          temp.next = head;
          return temp;
     }

     public static void main(String[] args) {

     }
}
package List;

public class DeleteListNode {
     public class ListNode {
          int val;
          ListNode next;

          ListNode(int val) {
               this.val = val;
               this.next = null;
          }
     }

     public void deleteNode(ListNode node) {
          node.val = node.next.val;
          node.next = node.next.next;
     }

     public static void main(String[] args) {

     }
}

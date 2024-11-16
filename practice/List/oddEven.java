package List;

public class oddEven {
     public static class ListNode {
          int data;
          ListNode next;

          ListNode(int data) {
               this.data = data;
               this.next = null;
          }
     }

     public ListNode oddEvenList(ListNode head) {
          ListNode odd = head;
          ListNode even = head.next;
          ListNode temp = even;
          while (even != null && even.next != null) {
               odd.next = even.next;
               odd = odd.next;
               even.next = odd.next;
               even = even.next;
          }
          odd.next = head;
          return temp;
     }

     public static void main(String[] args) {

     }

}

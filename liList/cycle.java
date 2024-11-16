package liList;

public class cycle {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public static Node head;
     public static Node tail;

     // cycle
     public boolean iscycle() {
          Node slow = head;
          Node fast = head;
          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
               if (slow == fast) {
                    return true;
               }
          }
          return false;
     }

     public static void main(String[] args) {
          head = new Node(1);
          head.next = new Node(2);
          head.next.next = new Node(4);
          head.next.next.next = new Node(7);
          head.next.next.next.next = head;
          System.out.println();
     }
}

public class nth {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     static Node head;

     public static void print() {
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data + "->");
               temp = temp.next;
          }
          System.out.println("null");

     }

     public static void removeNthFirstEnd(Node head, int n) {
          Node slow = head;
          Node fast = head;
          for (int i = 1; i <= n; i++) {
               fast = fast.next;
          }
          while (fast.next != null) {
               slow = slow.next;
               fast = fast.next;
          }
          slow.next = slow.next.next;
     }

     public static void main(String args[]) {
          Node a = new Node(10);
          Node b = new Node(15);
          Node c = new Node(20);
          Node d = new Node(25);
          Node e = new Node(30);
          Node f = new Node(35);

          a.next = b;
          b.next = c;
          c.next = d;
          d.next = e;
          e.next = f;
          print();

     }
}
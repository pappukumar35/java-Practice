package pwd;

public class basic {
     public static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = next;
          }
     }

     public static void main(String[] args) {
          Node a = new Node(4);
          Node b = new Node(3);
          Node c = new Node(5);
          Node d = new Node(8);
          a.next = b;
          System.out.println(a.next.data);
          b.next = c;
          System.out.println(b.data);
          c.next = d;
          System.out.println(c.data);
          d.next = d;
          System.out.println(d.data);
     }
}

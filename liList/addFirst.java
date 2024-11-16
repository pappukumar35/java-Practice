import java.util.LinkedList.*;
import java.util.*;

public class addFirst {
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

     public void addFirst(int data) {
          Node newNode = new Node(data);
          if (head == null) {
               head = tail = newNode;
               return;

          }
          newNode.next = newNode;
          head = newNode;
     }

     /// print or display for all value

     public void print() {
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data + "");
               temp = temp.next;
          }
          System.out.println();
     }

     public static void main(String[] args) {
          LinkedList ll = new LinkedList<>();
          ll.addfirst(1);
          ll.addsecond(2);
          ll.addthird(5);
          ll.addforth(8);
          ll.addfifth(6);
          print(ll);

     }
}

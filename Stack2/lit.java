package Stack2;

import java.util.*;

public class lit {
     static class Node {
          int data;
          Node next;

          Node(int data) {
               this.data = data;
               this.next = null;
          }
     }

     public static Node head;

     static class Stack {
          public static boolean isEmpty() {
               return head == null;
          }

          // push
          public static void push(int data) {
               Node newNode = new Node(data);
               if (isEmpty()) {
                    return;
               }
               newNode.next = head;
               head = newNode;
          }

          // pop
          public static int pop() {
               if (isEmpty()) {
                    return -1;
               }
               int top = head.data;
               head = head.next;
               return top;
          }

          // peek
          public static int peek() {
               if (isEmpty()) {
                    return -1;
               }
               return head.data;
          }
     }

     public static void main(String[] args) {
          Stack st = new Stack();
          st.push(12);
          st.push(14);
          st.push(16);
          st.push(18);
          st.push(20);
          st.push(22);
          while (!st.isEmpty()) {
               System.out.println(st.peek());
               st.pop();
          }

     }
}

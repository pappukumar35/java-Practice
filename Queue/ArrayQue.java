package Queue;

import java.util.*;

public class ArrayQue {
     static class Queue {
          static int arr[];
          static int size;
          static int rear;

          Queue(int n) {
               arr = new int[n];
               size = n;
               rear = -1;
          }

          public static boolean isEmpty() {
               return rear == -1;
          }

          // add
          public static void add(int adta) {
               if (rear == Size(-1)) {
                    System.out.println("queue is full");
                    return;

               }
               rear = rear + 1;

          }

          // remove
          public static int remove() {
               if (isEmpty()) {
                    System.out.println("queue is empty");
                    return -1;
               }
               int front = arr[0];
               for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i + 1];

               }
               rear = rear - 1;
               return front;
          }

          // peek
          public static int peek() {
               if (isEmpty()) {
                    System.out.println("queue is empty");
                    return -1;
               }
               return arr[0];
          }

     }

     public static void main(String[] args) {
          Queue q = new Queue(5);
          // Queue q=new Queue(10);
          q.add(2);
          q.add(3);
          q.add(4);
          q.add(5);

          while (!q.isEmpty()) {
               System.out.println(q.peek());

               q.remove();
          }
     }
}

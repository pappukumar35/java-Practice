package Stack2;

import java.util.*;
import java.util.*;

public class nextGreater {
     public static void main(String[] args) {
          Stack<Integer> s = new Stack<>();
          int arr[] = { 6, 8, 0, 1, 3 };
          int nextGreater[] = new int[arr.length];
          for (int i = arr.length - 1; i >= 0; i--) {
               while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                    s.pop();
               }
               if (s.isEmpty()) {
                    nextGreater[i] = -1;
               } else {
                    nextGreater[i] = arr[s.peek()];
               }
               s.push(i);
          }
          for (int i = 0; i < arr.length; i++) {
               System.out.print(nextGreater[i] + " ");
          }
          System.out.println();

     }

}

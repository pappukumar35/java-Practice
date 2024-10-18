package Stack;

import java.util.*;

public class nextSmallestElement {
     public int[] nextSmallestElement(int[] arr, int n) {
          Stack<Integer> stack = new Stack<>();
          for (int i = n - 1; i >= 0; i--) {
               while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                    stack.pop();
               }
               if (stack.isEmpty()) {
                    arr[i] = -1;
               } else {
                    arr[i] = stack.peek();

               }
               stack.push(arr[i]);
          }
          return arr;
     }

     public static void main(String[] args) {

     }
}

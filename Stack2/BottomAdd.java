package Stack2;

import java.util.*;
import java.util.*;

public class BottomAdd {
     public static void pushAtBottom(Stack<Integer> st, int data) {
          if (st.isEmpty()) {
               st.push(data);
               return;
          }
          int top = st.pop();
          pushAtBottom(st, data);
          st.push(top);
     }

     public static void main(String[] args) {
          Stack<Integer> st = new Stack<>();
          st.push(5);
          st.push(10);
          st.push(15);
          st.push(20);
          st.push(25);
          st.push(30);

          pushAtBottom(st, 0);
          // loop
          while (!st.isEmpty()) {
               System.out.println(st.pop());
          }

     }
}

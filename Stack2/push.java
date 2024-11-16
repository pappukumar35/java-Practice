package Stack2;

import java.util.Stack;
import java.util.*;

public class push {
     public static void main(String[] args) {
          Stack<Integer> st = new Stack<>();
          st.push(12);
          st.push(14);
          st.push(16);
          st.push(18);
          st.push(20);
          st.push(22);
          st.push(24);
          System.out.println(st.peek());
          System.out.println(st);
          st.pop();
          System.out.println(st);
          System.out.println("size is:" + st.size());
          while (st.size() > 1) {
               st.pop();

          }
          System.out.println(st.peek());

     }
}

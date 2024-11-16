package Stack2;

import java.util.Stack;
import java.util.*;

public class insert {
     public static void main(String[] args) {
          Stack<Integer> st = new Stack<>();
          st.push(2);
          st.push(4);
          st.push(6);
          st.push(8);
          st.push(10);
          st.push(12);
          st.push(14);
          System.out.println(st);
          int idx = 8;
          int x = 20;
          Stack<Integer> temp = new Stack<>();
          while (st.size() > idx) {
               temp.push(st.pop());
          }
          st.push(x);
          while (temp.size() > 0) {
               st.push(temp.pop());
          }
          System.out.print(st);

     }
}

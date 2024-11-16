package Stack2;

import java.util.Stack;
import java.util.*;

public class copy {
     public static void main(String[] args) {
          Stack<Integer> st = new Stack<>();
          st.push(2);
          st.push(4);
          st.push(6);
          st.push(8);
          st.push(10);
          st.push(12);
          st.push(14);
          st.push(16);
          st.push(18);
          System.out.println(st);

          Stack<Integer> gt = new Stack<>();
          while (st.size() > 0) {
               gt.push(st.pop());
          }
          Stack<Integer> rt = new Stack<>();
          while (gt.size() > 0) {
               rt.push(st.pop());
          }
          System.out.println(rt);

     }
}
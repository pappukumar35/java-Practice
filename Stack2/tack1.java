package Stack2;

import java.util.*;

public class tack1 {
     static class Stack {
          static ArrayList<Integer> list = new ArrayList<>();

          public static boolean isempty() {
               return list.size() == 0;
          }

          // push
          public static void push(int data) {
               list.add(data);
          }

          // pop
          public static int pop() {
               int top = list.get(list.size() - 1);
               list.remove(list.size() - 1);
               return top;
          }

          // peek
          public static int peek() {
               return list.get(list.size() - 1);
          }
     }

     public static void main(String[] args) {
          Stack st = new Stack();
          st.push(2);
          st.push(4);
          st.push(6);
          st.push(8);
          st.push(10);
          while (!st.isempty()) {
               System.out.println(st.peek());
               st.pop();
          }

     }
}
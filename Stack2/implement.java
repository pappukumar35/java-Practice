package Stack2;

import java.util.*;
import java.util.*;

public class implement {
     public static void main(String[] args) {
          Stack<Integer> s = new Stack<>();
          s.push(2);
          s.push(4);
          s.push(6);
          s.push(8);
          s.push(10);
          while (!s.isEmpty()) {
               System.out.println(s.peek());
               s.pop();
          }
     }
}

package operator;

import java.util.*;

public class unary {
     public static void main(String[] args) {
          int n = 10, m = 15;
          System.out.println(n);
          System.out.println(n++);
          System.out.println(m);
          System.out.println(n--);
          System.out.println(--n);
          System.out.println(--m);
          System.out.println(n);
          System.out.println(m);

          int x = n++;
          int y = m++;
          int x1 = --n;
          int y2 = --m;
          System.out.println(x);
          System.out.println(--x);
          System.out.println(x++);
          System.out.println(y);
          System.out.println(--y);
          System.out.println(y++);

     }
}

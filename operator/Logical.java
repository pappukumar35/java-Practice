package operator;

import java.util.*;

public class Logical {
     public static void main(String[] args) {
          int p = 10, q = 15, r = 20;
          System.out.println((p > q) && (p > r));
          System.out.println((p > q) && (p < r));
          System.out.println((r < q) || p < q);
          System.out.println((p > q) || (p < q));
          System.out.println(!(p == q));
     }
}
